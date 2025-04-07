package com.ana.produtos.controller;

import com.ana.produtos.model.Produto;
import com.ana.produtos.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutosController {

    @Autowired
    private ProdutoRepository repository;

    // GET Todos os produtos
    @GetMapping
    public List<Produto> listarTodos() {
        return repository.findAll();
    }

    // GET por ID
    @GetMapping("/{id}")
    public Produto buscarPorId(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado!"));
    }

    // POST Criar novo
    @PostMapping
    public Produto criar(@RequestBody Produto produto) {
        return repository.save(produto);
    }

    // PUT Atualizar
    @PutMapping("/{id}")
    public Produto atualizar(@PathVariable Long id, @RequestBody Produto produto) {
        produto.setId(id); // Garante que o ID seja o mesmo da URL
        return repository.save(produto);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}