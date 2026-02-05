# CadastroDeNinjas
Projeto simples para gerenciar o cadastro de ninjas, incluindo funcionalidades para criar, ler, atualizar e deletar registros de ninjas.

---

## Estudos

---

## Commits convencionais

Os commits convencionais são uma convenção para escrever mensagens de commit de forma padronizada e estruturada. Eles ajudam a manter um histórico de mudanças claro e compreensível, facilitando a colaboração entre desenvolvedores e a automação de processos, como geração de changelogs e versionamento semântico.

### Estrutura dos Commits Convencionais
A estrutura básica de um commit convencional é a seguinte:

feat: Adiciona uma nova funcionalidade ao projeto.
fix: Corrige um bug existente no código.
docs: Atualiza a documentação do projeto.
style: Modifica o estilo do código (formatação, espaços em branco, etc.) sem
alterar a funcionalidade.
refactor: Refatora o código sem adicionar novas funcionalidades ou corrigir bugs.
test: Adiciona ou modifica testes no projeto.
chore: Realiza tarefas de manutenção no projeto, como atualizações de dependências.

---


## Tecnologias Utilizadas:
pom.xml: Arquivo de configuração do Maven que gerencia as dependências e o build do projeto Java.

h2 database: Banco de dados em memória usado para desenvolvimento e testes.

jpa: Java Persistence API, uma especificação para gerenciamento de dados relacionais em aplicações Java.

spring boot: Framework para desenvolvimento de aplicações Java, facilitando a criação de aplicações web e serviços
RESTful.

lombok: Biblioteca que reduz o boilerplate code em Java, gerando automaticamente getters,
setters, construtores e outros métodos comuns.

---

## Relações entre Entidades:

OneToMany: Representa uma relação onde uma entidade está associada a muitas outras entidades. Exemplo: Um ninja pode ter muitas missões.

ManyToOne: Representa uma relação onde muitas entidades estão associadas a uma única entidade. Exemplo: Muitas missões podem ser atribuídas a um único ninja.

ManyToMany: Representa uma relação onde muitas entidades estão associadas a muitas outras entidades.

Exemplo: Muitos ninjas podem participar de muitas missões.


---

## Anottations:

@Entity: Indica que a classe é uma entidade JPA e será mapeada para uma
tabela no banco de dados.

@Id: Marca o campo como a chave primária da entidade.

@GeneratedValue: Especifica que o valor da chave primária será gerado automaticamente.

@RestController: Indica que a classe é um controlador REST, capaz de lidar com requisições HTTP.

@RequestMapping: Define o mapeamento de URLs para os métodos do controlador.

@Autowired: Injeta automaticamente as dependências necessárias na classe.

@Service: Indica que a classe é um serviço, responsável pela lógica de negócios.

@Repository: Indica que a classe é um repositório, responsável pela interação com o banco de dados.

@Data: Anotação do Lombok que gera automaticamente getters, setters, toString, equals e hashCode para a classe.

@NoArgsConstructor: Anotação do Lombok que gera um construtor sem argumentos para a classe.

@AllArgsConstructor: Anotação do Lombok que gera um construtor com todos os argumentos para a classe.


## Arquitetura de Software


### O que é?
Arquitetura de Software refere-se à estrutura organizacional fundamental de um sistema de software, incluindo seus componentes, suas relações e os princípios e diretrizes que governam seu design e evolução ao longo do tempo. Ela serve como um plano para o desenvolvimento do software, ajudando a garantir que o sistema atenda aos requisitos funcionais e não funcionais, como desempenho, escalabilidade, segurança e manutenibilidade.

---

### Importância

A arquitetura de software é crucial porque: 

1. Fornece uma visão geral do sistema, facilitando a comunicação entre os membros da equipe de desenvolvimento.
2. Ajuda a garantir que o sistema atenda aos requisitos funcionais e não funcionais
3. Facilita a manutenção e evolução do sistema ao longo do tempo.

Exemplo: pastas e arquivos organizados de forma lógica facilitam a navegação e manutenção do projeto.

---

### Componentes Comuns

Controllers: Responsáveis por gerenciar a lógica de negócios e interagir com os modelos e as views.

Models: Representam os dados e a lógica de negócios do aplicativo.

Views: Responsáveis pela apresentação dos dados ao usuário. Define a estrutura do sistema, facilitando a comunicação entre os membros da equipe de desenvolvimento.

Services: Componentes que encapsulam a lógica de negócios específica e podem ser reutilizados em diferentes partes do aplicativo.
Facilita a comunicação entre os membros da equipe de desenvolvimento.

Repositories: Camada responsável pela interação com o banco de dados, abstraindo as operações de persistência de dados.
Ajuda a garantir que o sistema atenda aos requisitos funcionais e não funcionais, como

DTOs (Data Transfer Objects): Objetos usados para transferir dados entre diferentes camadas do aplicativo, especialmente entre o cliente e o servidor.
Facilita a manutenção e evolução do sistema ao longo do tempo.

Mapper: Componentes que convertem dados entre diferentes formatos ou estruturas, como entre entidades de banco de dados e DTOs.


Exemplo: 
NinjaService: Um serviço que gerencia todas as operações relacionadas aos ninjas, como criação, atualização e exclusão.
NinjaController: Um controlador que lida com as requisições HTTP relacionadas aos ninjas, utilizando o NinjaService para processar os dados.
NinjaRepository: Um repositório que interage com o banco de dados para armazenar e recuperar informações sobre os ninjas.
NinjaDTO: Um objeto de transferência de dados que encapsula as informações dos ninjas para serem enviadas entre o cliente e o servidor.
NinjaMapper: Um componente que converte entre entidades de banco de dados e NinjaDTOs.

---

### Padrões Comuns

MVC (Model-View-Controller): Separa a aplicação em três componentes principais, facilitando
a manutenção e a escalabilidade.

Microservices: Arquitetura que divide a aplicação em serviços pequenos e independentes, cada um responsável por uma funcionalidade específica.

Monolítica: Uma única aplicação onde todos os componentes estão interligados, mais simples de
desenvolver inicialmente, mas pode ser difícil de escalar e manter com o tempo.

---

