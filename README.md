# DummyJson Product Microservice

Este projeto é um microserviço desenvolvido em Java que consome a API pública [DummyJson](https://dummyjson.com/products) para consultar uma lista de produtos. O objetivo é demonstrar como integrar um microserviço com uma API externa e expor os dados por meio de endpoints REST.

## Tecnologias Utilizadas

- **Java**: Linguagem principal para desenvolvimento do microserviço.
- **Spring Boot**: Framework para construção de aplicações Java baseadas em microserviços.
- **RestTemplate**: Cliente HTTP para consumir a API externa.
- **Maven**: Gerenciador de dependências.
- **Git**: Controle de versão.

## Funcionalidades

- Consulta a lista de produtos da API `DummyJson`.
- Retorna os dados no formato JSON através de um endpoint REST.

## Estrutura do Projeto

- **Controller**: Camada responsável por receber as requisições HTTP e retornar as respostas.
- **Model**: Representa os dados do produto.
- **Service (Business)**: Contém a lógica de consumo da API externa.
- **Repository**: Não aplicável, pois este microserviço não usa um banco de dados local.

## Como Executar o Projeto

### Pré-requisitos

- Java 17+ instalado.
- Maven configurado.
- Git instalado.

### Passos para execução

1. **Clone o Repositório**:
   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
   cd nome-do-repositorio
