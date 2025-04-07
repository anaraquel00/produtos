package com.ana.produtos.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;

@Entity
@Data
@NoArgsConstructor
@Table(name = "produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, length = 255)
    private String nome;
    @Column(unique = true, length = 255)
    private Double preco;

    // Construtor para POST (sem ID)
    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}
