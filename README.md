# CRUD de Clientes com Spring Boot

Este projeto é uma **API simples** para gerenciar um CRUD de clientes usando **Spring Boot** e listas em memória. O objetivo é praticar o uso de métodos HTTP (GET, POST, PUT, DELETE) e o desenvolvimento de **APIs RESTful**.

## Funcionalidades

- **GET** `/clientes`: Retorna todos os clientes adicionados à lista.
- **POST** `/clientes`: Adiciona um novo cliente à lista.
- **PUT** `/clientes/{id}`: Atualiza os dados de um cliente específico pelo ID.
- **DELETE** `/clientes/{id}`: Remove um cliente da lista pelo ID.
- **GET** `/clientes/{id}`: Retorna um cliente específico pelo ID.
- **GET** `/clientes?idade={idade}`: Retorna todos os clientes que possuem a idade especificada.

## Estrutura do Cliente

Um cliente é representado pelo seguinte modelo:

| Campo     | Tipo    | Descrição                          |
|-----------|---------|------------------------------------|
| `id`      | Long    | Identificador único do cliente.    |
| `nome`    | String  | Nome do cliente.                   |
| `idade`   | Integer | Idade do cliente.                  |
| `profissao` | String | Profissão do cliente.              |

## Executando o Projeto

1. Clone o repositório para sua máquina local.
2. Importe o projeto em sua IDE.
3. Execute a aplicação Spring Boot.
4. Utilize uma ferramenta como Postman ou Insomnia para testar os endpoints.
