# CadastroDeNinjas

Projeto simples para gerenciar o cadastro de ninjas, incluindo funcionalidades de CRUD (Criar, Ler, Atualizar e Deletar), utilizando boas práticas de arquitetura, versionamento e persistência de dados.

---

## Estudos

Este projeto aborda os seguintes conceitos:

- Spring Boot e APIs REST
- JPA, Hibernate e Flyway
- Arquitetura em camadas
- SQL básico
- Git, Pull Request e Commits Convencionais
- Boas práticas de resposta HTTP com ResponseEntity

---

## Tecnologias Utilizadas

- Spring Boot
- Maven (pom.xml)
- JPA (Java Persistence API)
- Hibernate (ORM)
- Flyway (Migrations)
- H2 Database
- Lombok

---

## Flyway e Migrations

### O que é Flyway
Flyway é uma ferramenta de versionamento de banco de dados que controla a evolução do schema por meio de scripts SQL versionados.

### Estrutura
- src/main/resources/db/migration

### Padrão de nomenclatura
- V1__create_table_ninja.sql
- V2__add_column_rank.sql

### Benefícios
- Versionamento do banco
- Padronização entre ambientes
- Controle de alterações estruturais

---

## Hibernate

Hibernate é a implementação mais utilizada da JPA e é responsável por:

- Mapear entidades Java para tabelas SQL
- Gerenciar persistência de dados
- Executar SQL automaticamente
- Controlar o ciclo de vida das entidades

---

## Arquitetura em Camadas

### Camadas

- Controller  
  Responsável por receber requisições HTTP

- Service  
  Contém a lógica de negócio

- Repository  
  Acesso ao banco de dados

- DTO  
  Transporte de dados entre camadas

- Mapper  
  Conversão entre Entity e DTO

### Por que usar camadas de abstração

- Separação de responsabilidades
- Código mais organizado
- Facilidade de manutenção
- Melhor testabilidade
- Escalabilidade

---

## Annotations Importantes

### JPA / Hibernate

- @Entity
- @Table(name = "ninjas", uniqueConstraints = {...})
- @Id
- @GeneratedValue(strategy = GenerationType.IDENTITY)
- @Column(nullable = false, unique = true)
- @JoinColumn(name = "missao_id")

### Spring

- @RestController
- @RequestMapping
- @Autowired
- @Service
- @Repository
- @Component

### Mapper

- @Mapper  
  Utilizado com MapStruct para conversão automática

---

## Chaves e Relacionamentos

- PK (Primary Key): Identificador único
- FK (Foreign Key): Referência a outra tabela

Relacionamentos:
- OneToMany
- ManyToOne
- ManyToMany

---

## ResponseEntity

### O que é ResponseEntity
ResponseEntity é uma classe do Spring que representa a resposta HTTP completa, permitindo controlar:

- Status HTTP
- Corpo da resposta
- Headers

### Por que usar ResponseEntity

- Padroniza respostas da API
- Permite retornar status corretos
- Facilita tratamento de erros
- Torna a API mais profissional

### Exemplos de uso

- Retornar sucesso  
  ResponseEntity.ok(objeto)

- Criar recurso  
  ResponseEntity.status(201).body(objeto)

- Sem conteúdo  
  ResponseEntity.noContent().build()

- Recurso não encontrado  
  ResponseEntity.notFound().build()

- Erro de requisição  
  ResponseEntity.badRequest().body(mensagem)

---

## Endpoints REST (CRUD)

### Ninja

- POST /ninjas  
  Cria um ninja

- GET /ninjas  
  Lista todos os ninjas

- GET /ninjas/{id}  
  Busca por ID

- PUT /ninjas/{id}  
  Atualiza um ninja

- DELETE /ninjas/{id}  
  Remove um ninja

---

## SQL Básico — CRUD

### Insert
INSERT INTO ninjas (nome, rank) VALUES ('Naruto', 'Genin');

### Select
SELECT * FROM ninjas;
SELECT * FROM ninjas WHERE id = 1;

### Update
UPDATE ninjas SET rank = 'Hokage' WHERE id = 1;

### Delete
DELETE FROM ninjas WHERE id = 1;

---

## Comandos SQL Estruturais

### Criar Tabela
CREATE TABLE ninjas (
id BIGINT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(100) NOT NULL,
rank VARCHAR(50)
);

### Alterar Tabela
ALTER TABLE ninjas ADD COLUMN vila VARCHAR(50);

### Remover Tabela
DROP TABLE ninjas;

---

## Git — Pull Request

### O que é
Pull Request é uma solicitação para mesclar alterações de uma branch em outra, permitindo revisão de código.

### Fluxo

- Criar branch de feature
- Desenvolver a funcionalidade
- Realizar commits
- Enviar branch para o repositório remoto
- Abrir Pull Request
- Revisar e realizar merge

---

## Commits Convencionais

- feat: Nova funcionalidade
- fix: Correção de bug
- docs: Documentação
- refactor: Refatoração
- test: Testes
- chore: Manutenção

Exemplo:
feat: adiciona ResponseEntity nos controllers

---
