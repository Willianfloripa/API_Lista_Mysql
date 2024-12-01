# ToDo List API

Uma API desenvolvida com **Spring Boot** para gerenciar tarefas (ToDo List), utilizando um banco de dados relacional **MySQL**. O projeto foi projetado para permitir futuras integrações com frontend.

---

## 📋 Funcionalidades

- **Criar Tarefa**: Adiciona uma nova tarefa ao banco de dados.
- **Listar Tarefas**: Retorna todas as tarefas cadastradas.
- **Buscar Tarefa por ID**: Recupera uma tarefa específica pelo ID.
- **Atualizar Tarefa**: Altera os dados de uma tarefa existente.
- **Excluir Tarefa**: Remove uma tarefa pelo ID.

---

## 🛠️ Tecnologias Utilizadas

- **Java 21**
- **Spring Boot**:
  - Spring Web
  - Spring Data JPA
  - Spring Boot DevTools
- **MySQL**
- **Lombok**
- **Maven**

---

## 🚀 Como Executar o Projeto

### Pré-requisitos

- [Java 21+](https://www.oracle.com/java/technologies/javase-jdk21-downloads.html)
- [Maven](https://maven.apache.org/)
- [MySQL Server](https://dev.mysql.com/downloads/mysql/)
- [Postman](https://www.postman.com/) ou similar para testar a API

### Passo a Passo

1. **Clone o repositório**:
  No terminal execute:
   git clone https://github.com/Willianfloripa/ToDoList_API.git

   cd ToDoList_API

3. **Configure o banco de dados**:

  Crie um banco de dados MySQL chamado todolist_db.
  Atualize o arquivo application.properties com suas credenciais:
  
  spring.datasource.url=jdbc:mysql://localhost:3306/todolist_db
  spring.datasource.username=developer
  spring.datasource.password=1234567
  spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

  spring.jpa.hibernate.ddl-auto=update
  spring.jpa.show-sql=true
  spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect


3. **Compile e execute o projeto**:
  mvn spring-boot:run


4. **Teste os endpoints**:
  Utilize ferramentas como Postman ou Insomnia para interagir com a API.
Exemplo:
{
  "titulo": "Exemplo de Tarefa",
  "completo": false
}
![image](https://github.com/user-attachments/assets/17e4b870-bb21-4b16-b7de-02de4cfc0c1d)


### 🧩 Estrutura do Projeto

  ![image](https://github.com/user-attachments/assets/13d6214f-dc71-4dea-91fb-16ecb3831052)


### 📝 Melhorias Futuras

  - Implementar autenticação e autorização (Spring Security).
  - Conectar um frontend (Angular).
  - Adicionar testes unitários e de integração.

### ✨ Autor
William Tonel de Melo

