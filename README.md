# Api SpringBoot-RestFull

API RESTful desenvolvida no bootcamp santander week, realizado na plataforma DIO( digital innovation one).

A ideia principal do projeto é desenvolver uma api utilizando o Spring Boot para realizar o cadastro de clientes, buscando em uma API externa os dados de endereço de acordo com o CEP informado no cadastro do cliente.

## Funcionalidades

- Cadastro de clientes
- Consulta de clientes cadastrados
- Excluir clientes
- Atualizar clientes
- Consulta de dados de CEP através de uma API externa

## Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Data JPA
- RESTful APIs
- Maven

## Instalação e Execução

### Pré-requisitos

- Java 11 ou superior
- Maven

# Endpoints de CRUD 

### GET: /clientes 

Descrição: Consultar todos os clientes

Response Body:
```json
[
    {
        "id": 2,
        "nome": "João Silva",
        "endereco": {
            "cep": "01001-000",
            "logradouro": "Praça da Sé",
            "complemento": "lado ímpar",
            "bairro": "Sé",
            "localidade": "São Paulo",
            "uf": "SP",
            "ibge": "3550308",
            "gia": "1004",
            "ddd": "11",
            "siafi": "7107"
        }
    }
]
```

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

Response Body:
```json
  {
    "id": 2,
    "nome": "João Silva",
    "endereco": {
        "cep": "01001-000",
        "logradouro": "Praça da Sé",
        "complemento": "lado ímpar",
        "bairro": "Sé",
        "localidade": "São Paulo",
        "uf": "SP",
        "ibge": "3550308",
        "gia": "1004",
        "ddd": "11",
        "siafi": "7107"
    }
  }
````

### PUT: /clientes/{id}

Descrição: Atualizar um cliente pelo id

 Request Body:
```json
  {
    "id":2,
    "nome":"João Silva",
    "endereco":{"cep":"01001000"}
  }
````
Response Body:
```json
  {
    "id": 2,
    "nome": "João Silva",
    "endereco": {
        "cep": "01001-000",
        "logradouro": "Praça da Sé",
        "complemento": "lado ímpar",
        "bairro": "Sé",
        "localidade": "São Paulo",
        "uf": "SP",
        "ibge": "3550308",
        "gia": "1004",
        "ddd": "11",
        "siafi": "7107"
    }
}
````

### DELETE: /clientes/{id}

Descrição: Excluir um cliente pelo id

Response Body:
```json
  {
    "mensagem":"Cliente deletado com sucesso"
  }
````

