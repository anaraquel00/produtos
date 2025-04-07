package com.ana.produtos.repository;

import com.ana.produtos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findByPrecoGreaterThan(Double precoMin);
}
