# Açaí do Banha: Sistema de Gerenciamento de Pedidos

Este projeto é um sistema de gerenciamento de pedidos e clientes para a franquia "Açaí do Banha". Ele foi desenvolvido como um backend em Java, utilizando o framework Spring Boot, com o objetivo de fornecer uma API RESTful para gerenciar as operações diárias da empresa.

---

### Funcionalidades

O sistema atualmente oferece as seguintes funcionalidades, acessíveis através de endpoints REST:

* **Gerenciamento de Clientes (CRUD):**
    * `POST /api/clientes`: Cria um novo cliente.
    * `GET /api/clientes/{id}`: Busca um cliente pelo ID.
    * `GET /api/clientes`: Lista todos os clientes.
    * `PUT /api/clientes/{id}`: Atualiza os dados de um cliente.
    * `DELETE /api/clientes/{id}`: Deleta um cliente.

* **Gerenciamento de Pedidos (CRUD):**
    * `POST /api/pedidos`: Cria um novo pedido, associando-o a um cliente existente.
    * `GET /api/pedidos/{id}`: Busca um pedido pelo ID.
    * `GET /api/pedidos/cliente/{clienteId}`: Lista todos os pedidos de um cliente específico.
    * `PUT /api/pedidos/{id}`: Atualiza os dados de um pedido.
    * `DELETE /api/pedidos/{id}`: Deleta um pedido.

---

### Tecnologias Utilizadas

* **Linguagem:** Java
* **Framework:** Spring Boot
* **Persistência:** Spring Data JPA
* **Banco de Dados:** H2 (banco de dados em memória para desenvolvimento)
* **Utilitários:** Lombok
* **Testes:** JUnit 5 e Mockito
* **Mapeamento de Objetos:** ModelMapper ou MapStruct (opcional)

---

### Como Executar o Projeto

Para rodar o projeto localmente, siga os passos abaixo:

1.  **Pré-requisitos:** Certifique-se de ter o **JDK 17** (ou versão superior) e o **Maven** instalados em sua máquina.
2.  **Clone o Repositório:**
    ```bash
    git clone [https://github.com/seu-usuario/acai-do-banha.git](https://github.com/seu-usuario/acai-do-banha.git)
    cd acai-do-banha
    ```
3.  **Execute a Aplicação:**
    * Você pode usar a sua IDE (IntelliJ, VS Code, etc.) e executar a classe principal `Application.java`.
    * Alternativamente, use o Maven para compilar e rodar a aplicação via linha de comando:
        ```bash
        mvn clean install
        mvn spring-boot:run
        ```
    A aplicação estará acessível em `http://localhost:8080`.

---

### Estrutura das Entidades e Banco de Dados

O projeto utiliza duas entidades principais com um relacionamento de "um-para-muitos" (`OneToMany`):

* **`Cliente`**: Representa um cliente da franquia.
* **`Pedido`**: Representa um pedido de açaí, que está associado a um `Cliente`.

O script `data.sql` na pasta `src/main/resources` contém a estrutura das tabelas e alguns dados de exemplo para facilitar os testes iniciais.

---

### Testes

O projeto inclui testes de unidade e de integração para garantir a estabilidade do código. Você pode executá-los com o seguinte comando:

```bash
mvn test
