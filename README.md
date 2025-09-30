# springboot-microservices-architecture
Projeto de microsserviços em Java com Spring Boot, integrando comunicação síncrona via REST e assíncrona via RabbitMQ entre os serviços de armazém e vitrine. Aplicação prática de arquitetura distribuída, mensageria e boas práticas de desenvolvimento.

## Sobre o Projeto

Este projeto foi desenvolvido como parte de um desafio da [DIO](https://www.dio.me/) com o objetivo de aplicar os conhecimentos adquiridos em arquitetura de microsserviços utilizando Java e Spring Boot. A proposta é construir dois microsserviços principais — **warehouse** (armazém) e **storefront** (vitrine) — que se comunicam de forma **síncrona** (HTTP REST) e **assíncrona** (RabbitMQ).

---

## Entendendo o Desafio

A missão é ir além do código apresentado pelo instrutor. Isso envolve:

- Criar os microsserviços do zero ou com base no repositório-base.
- Integrar ferramentas de mensageria (RabbitMQ).
- Aplicar boas práticas de desenvolvimento e arquitetura.
- Documentar decisões técnicas e raciocínio de forma clara.

---

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3**
- **Spring Web**
- **Spring Data JPA**
- **RabbitMQ**
- **Docker & Docker Compose**
- **PostgreSQL**
- **Lombok**
- **OpenAPI / Swagger**
- **Git & GitHub**

---

## Estrutura dos Microsserviços

### Warehouse Service

Responsável pelo gerenciamento de estoque. Funcionalidades:

- Cadastro e atualização de produtos.
- Consulta de disponibilidade.
- Comunicação assíncrona com o storefront via RabbitMQ.

### Storefront Service

Responsável pela vitrine e pedidos. Funcionalidades:

- Listagem de produtos disponíveis.
- Realização de pedidos.
- Comunicação síncrona com o warehouse via REST.
- Comunicação assíncrona para atualização de estoque.

---

## Comunicação entre Serviços

| Tipo         | Tecnologia | Descrição                                                                 |
|--------------|------------|---------------------------------------------------------------------------|
| Síncrona     | HTTP REST  | O storefront consulta o warehouse para verificar disponibilidade de produtos. |
| Assíncrona   | RabbitMQ   | O warehouse envia eventos de atualização de estoque para o storefront.       |

---


Decisões Técnicas
Utilização de RabbitMQ para desacoplamento entre serviços.

Separação clara de responsabilidades entre microsserviços.

Uso de Docker para facilitar o ambiente de desenvolvimento.

Documentação automática com Swagger.

Autor
Marcio Henrique F. Gonçalves
