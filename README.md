# CadastroDeNinjas

Projeto simples para gerenciar o cadastro de ninjas, incluindo funcionalidades de **CRUD** (Criar, Ler, Atualizar e Deletar).

---

## Estudos

Este projeto foi desenvolvido com foco em:

- Organização de projetos Java com Spring Boot
- Boas práticas de versionamento com Git
- Uso de banco de dados em memória
- Arquitetura de software em camadas
- Padrões de commits convencionais

---

## Git

### Navegação no Terminal
- cd: Navega entre pastas
- mkdir NOME_DA_PASTA: Cria uma nova pasta
- pwd: Exibe o caminho da pasta atual
- clear: Limpa o terminal

### Versionamento
- git init: Inicializa um repositório Git
- git add .: Adiciona todos os arquivos ao staging
- git commit -m "feat: Initial commit - Configuração do projeto e estrutura básica criada.": Cria um commit
- git branch -M main: Renomeia a branch atual para main
- git remote add origin URL_DO_REPOSITORIO: Adiciona repositório remoto
- git push origin main: Envia commits para o repositório remoto
- git push origin NOME_DA_BRANCH: Envia commits de uma branch específica
- git pull origin main: Atualiza o repositório local
- git clone URL_DO_REPOSITORIO: Clona um repositório remoto

### Branches
- git branch: Lista branches locais
- git branch -b NOME_DA_BRANCH: Cria e muda para uma nova branch
- git checkout NOME_DA_BRANCH: Muda de branch
- git merge NOME_DA_BRANCH: Mescla uma branch na atual

---

## Commits Convencionais

Commits convencionais seguem um padrão para manter o histórico de alterações claro, organizado e automatizável.

### Estrutura
- feat: Nova funcionalidade
- fix: Correção de bug
- docs: Alterações na documentação
- style: Ajustes de formatação (sem alterar lógica)
- refactor: Refatoração de código
- test: Criação ou alteração de testes
- chore: Tarefas de manutenção

### Exemplos
- feat: cadastro de ninjas implementado
- fix: correção na validação de campos
- docs: atualização do README

---

## Tecnologias Utilizadas

- Spring Boot  
  Framework para criação de aplicações Java e APIs REST

- Maven (pom.xml)  
  Gerenciamento de dependências e build do projeto

- H2 Database  
  Banco de dados em memória para desenvolvimento e testes

- JPA (Java Persistence API)  
  Persistência de dados relacionais

- Lombok  
  Redução de código boilerplate (getters, setters, construtores etc.)

---

## Relações entre Entidades

- OneToMany  
  Uma entidade relacionada a várias outras  
  Exemplo: um ninja pode ter várias missões

- ManyToOne  
  Muitas entidades relacionadas a uma única  
  Exemplo: várias missões pertencem a um ninja

- ManyToMany  
  Muitas entidades relacionadas entre si  
  Exemplo: vários ninjas participam de várias missões

---

## Anotações (Annotations)

### JPA
- @Entity: Define uma entidade do banco
- @Id: Define a chave primária
- @GeneratedValue: Geração automática do ID

### Spring
- @RestController: Controlador REST
- @RequestMapping: Mapeamento de rotas
- @Autowired: Injeção de dependência
- @Service: Camada de serviço
- @Repository: Camada de acesso a dados

### Lombok
- @Data: Getters, setters, equals, hashCode e toString
- @NoArgsConstructor: Construtor sem argumentos
- @AllArgsConstructor: Construtor com todos os atributos

---

## Arquitetura de Software

### O que é
Arquitetura de software define a estrutura do sistema, seus componentes, suas responsabilidades e como eles se comunicam ao longo do tempo.

---

### Importância

- Facilita a comunicação entre desenvolvedores
- Garante requisitos funcionais e não funcionais
- Torna o sistema mais manutenível e escalável

Exemplo: organização clara de pastas e responsabilidades.

---

### Componentes Comuns

- Controllers  
  Responsáveis por lidar com requisições HTTP

- Models (Entidades)  
  Representam os dados e regras do domínio

- Services  
  Contêm a lógica de negócio

- Repositories  
  Comunicação com o banco de dados

- DTOs (Data Transfer Objects)  
  Transferência de dados entre camadas

- Mappers  
  Convertem entidades em DTOs e vice-versa

### Exemplo Prático
- NinjaController: recebe requisições HTTP
- NinjaService: processa regras de negócio
- NinjaRepository: acessa o banco de dados
- NinjaDTO: transporta dados
- NinjaMapper: converte dados

---

## Padrões Arquiteturais

- MVC (Model-View-Controller)  
  Separação clara de responsabilidades

- Monolítica  
  Aplicação única, simples de iniciar

- Microservices  
  Serviços independentes e escaláveis

---
