## 📦 Produtos API | CRUD de Produtos

[![Java](https://img.shields.io/badge/Java-17-%23ED8B00?logo=openjdk)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.2.0-%236DB33F?logo=spring)](https://spring.io/projects/spring-boot)
[![License](https://img.shields.io/badge/License-MIT-%2300ADD8)](LICENSE)

# 🛠️ Mini-Desafio Prático (Java + Spring Boot)
Objetivo: Criar um endpoint simples, mas seguindo boas práticas (como se já estivesse na empresa).

Task:

Endpoint: GET /api/produtos

Deve retornar uma lista de produtos (id, nome, preço) paginada.

## Filtros opcionais:

nome (busca por parte do nome, ignore case).

precoMin e precoMax (faixa de preço).

## ⚙️ Funcionalidades

- **CRUD Completo** dos produtos
- **Documentação Automatizada** via PostMan
- **Banco de Dados MySQL** (Banco de Dados)
- **InteliJ** (ambiente de desenvolvimento)
- **Testes Unitários** (JUnit 5 + Mockito)

🔗 **Endpoints Principais**:
POST /api/produtos → Cadastra novo produto   
GET /api/produtos → Lista todos os produtos
GET /api/produtos/{id} → Busca por ID
PUT /api/produtos/{id} → Atualiza registro
DELETE /api/produtos/{id} → Remove registro

## 🚀 Tecnologias

<div style="display: flex; gap: 10px; flex-wrap: wrap;">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" width="50" title="Java 17"/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" width="50" title="Spring Boot 3.2"/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/hibernate/hibernate-original.svg" width="50" title="Hibernate"/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/mysql/mysql-original.svg" width="50" title="MySQL"/>
 </div>

## 📦 Pré-requisitos

- Java 17+
- Maven 3.8+
- Docker (opcional para MySQL)

## ⚡ Executando Localmente

1. **Clone o repositório**:

git clone https://github.com/anaraquel00/produtos.git

# MySQL Config
spring.datasource.url==jdbc:mysql://localhost:3306/produtos_db?useSSL=false&serverTimezone=UTC

spring.datasource.username=seu_usuario

spring.datasource.password=sua_senha

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# Dialeto do Hibernate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

mvn spring-boot:run
Acesse a documentação:

http://localhost:8080/api/produtos.html
🧪 Testando a API pelo Postman
Cadastro de Produtos:

curl -X POST 'http://localhost:8080/api/produtos' \
-H 'Content-Type: application/json' \
-d '{"nome": "Notebook Dell", "preco": 5000.00}'
