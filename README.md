# Api SpringBoot-RestFull

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



