# CHECKPOINT 1 - Projeto de Análise de Crédito 

## Nome do Integrante

- Lorenzo Nascimento
- Haniel Botelho

## Descrição do Projeto

Desenvolvimento de um microsserviço em Java utilizando Maven e Spring para o gerenciamento de propostas de análise de crédito. 
O projeto envolve a criação de APIs RESTful para a gestão de dados de propostas, integrando funcionalidades de validação e avaliação
de crédito, com foco na escalabilidade e eficiência do processamento de transações.

## Funcionalidades

- **Cadastro de Usuários:** Permite a criação de novos usuários com informações como nome, sobrenome, CPF, telefone e renda.
- **Cadastro de Propostas:** Permite o registro de propostas de crédito com valores solicitados, prazo para pagamento e associações ao usuário.
- **CRUD Completo para Usuários e Propostas:** Criação, leitura, atualização e exclusão de dados de usuários e propostas.
- **Consulta de Propostas:** Busca de propostas por ID e listagem de todas as propostas disponíveis.

## Stack Utilizada

- **Java 17**: Linguagem de programação utilizada.
- **Spring Boot**: Framework principal para construção da aplicação.
- **Spring Data JPA**: Facilita a interação com o banco de dados.
- **Hibernate**: Implementação do JPA para mapeamento objeto-relacional.
- **ModelMapper**: Biblioteca para mapeamento de objetos DTO e entidades.
- **Postman**: Ferramenta para testes de API REST.
- **H2 Database**: Banco de dados em memória para desenvolvimento e testes.
- **Maven**: Gerenciador de dependências e build.


## Endpoints da API

### Usuário (User)

- **GET /users**: Lista todos os usuários.
- **GET /users/{id}**: Retorna detalhes de um usuário específico.
- **POST /users**: Cria um novo usuário.
- **PUT /users/{id}**: Atualiza informações de um usuário existente.
- **DELETE /users/{id}**: Exclui um usuário.

### Proposta (Proposta)

- **GET /propostas**: Lista todas as propostas.
- **GET /propostas/{id}**: Retorna detalhes de uma proposta específica.
- **POST /propostas**: Cria uma nova proposta.
- **PUT /propostas/{id}**: Atualiza informações de uma proposta existente.
- **DELETE /propostas/{id}**: Exclui uma proposta.

## Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/lorenzo-nascimento/MS-Proposta-Spring.git
