# 🚗 GTA IV – Desafio

## 📌 Sobre o projeto

Este projeto foi desenvolvido como parte de um desafio prático de programação, utilizando Java e Spring Boot.

A aplicação tem como objetivo colocar em prática conceitos de desenvolvimento de APIs REST, organização de código, persistência de dados e integração com banco de dados.

O projeto foi desenvolvido com foco no aprendizado e na aplicação dos conceitos trabalhados durante os estudos.

## 🛠️ Tecnologias utilizadas

- **Java 25** – Linguagem de programação.
- **Spring Boot** – Framework para desenvolvimento da aplicação.
- **Spring Data JPA** – Persistência e gerenciamento de dados.
- **MySQL** – Banco de dados relacional.
- **Maven** – Gerenciamento de dependências e construção do projeto.

## 📂 Estrutura do projeto

O projeto segue a estrutura padrão de uma aplicação Spring Boot:

```text
GTA-IV-Desafio/
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   └── test/
├── .mvn/
├── mvnw
├── mvnw.cmd
└── pom.xml
```

## ⚙️ Como executar o projeto

### 1. Pré-requisitos

Antes de começar, você precisa ter instalado:

- Java JDK 25.
- MySQL.
- Uma IDE de sua preferência (IntelliJ IDEA, Eclipse ou VS Code).

### 2. Clone o repositório

```bash
git clone https://github.com/nick120q/GTA-IV-Desafio.git
```

### 3. Entre na pasta do projeto

```bash
cd GTA-IV-Desafio
```

### 4. Configure o banco de dados

Configure as informações de conexão com o MySQL no arquivo `application.properties`, localizado em:

```text
src/main/resources/application.properties
```

Ajuste o endereço do banco, nome do banco de dados, usuário e senha conforme sua configuração local.

### 5. Execute a aplicação

No Windows:

```bash
.\mvnw.cmd spring-boot:run
```

No Linux ou macOS:

```bash
./mvnw spring-boot:run
```

## 🎯 Objetivos do desafio

- Praticar o desenvolvimento com Java e Spring Boot.
- Trabalhar com APIs REST.
- Aplicar conceitos de persistência utilizando Spring Data JPA.
- Integrar a aplicação com MySQL.
- Organizar e estruturar um projeto utilizando boas práticas de desenvolvimento.

## 👨‍💻 Autor

**Nicollas Silva Barbosa**

GitHub: [@nick120q](https://github.com/nick120q)

---

Desenvolvido como parte de um desafio prático de programação. 🚀