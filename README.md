# Cliente API

Uma API RESTful desenvolvida com Spring Boot para o cadastro de clientes. Ao cadastrar um cliente, a API faz uma busca em outra API web para obter os dados do CEP informado.

## Funcionalidades

- Cadastro de clientes
- Consulta de dados de CEP através de uma API externa

## Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- RESTful APIs
- Maven

## Instalação e Execução

### Pré-requisitos

- Java 11 ou superior
- Maven

## Endpoints

### POST: /clientes

Descrição: Cadastro de um novo cliente

Request Body:
```json
  {
    "nome": "João Silva",
    "endereco":{
      "cep": "01001000"
    }
  }
```
### GET: /clientes 

Descrição: Consultar todos os clientes


