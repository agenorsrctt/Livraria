# 📚 Sistema de Gerenciamento de Livraria

Este é um projeto **Full-Stack** desenvolvido para a gestão de uma biblioteca pessoal. O sistema permite o registo de livros, listagem dinâmica e oferece uma interface intuitiva para organizar a sua coleção de leituras.

---

## 🚀 Tecnologias Utilizadas

### Backend
- **Java 17**: Linguagem base do servidor.
- **Spring Boot 3**: Framework para criação da API REST.
- **Spring Data JPA**: Para abstração da camada de dados.
- **H2 Database**: Banco de dados em memória utilizado para persistência local.

### Frontend
- **HTML5**: Estrutura semântica da aplicação.
- **CSS3**: Estilização moderna utilizando Flexbox e design responsivo.
- **JavaScript (ES6+)**: Lógica de consumo de API assíncrona e manipulação do DOM.

---

## 📋 Funcionalidades

- **Registo de Livros**: Formulário para adicionar Título, Autor, Género e Ano de Publicação.
- **Listagem Dinâmica**: Os livros são carregados automaticamente da API e exibidos em cartões estilizados.
- **CRUD Completo**:
  - `POST`: Adiciona novos livros à base de dados.
  - `GET`: Recupera a lista de todos os livros cadastrados.
  - `PUT`: Permite a atualização de informações de livros existentes.
  - `DELETE`: Remove livros do sistema.

---

## 📂 Estrutura de Pastas

O projeto está organizado seguindo as melhores práticas de separação de responsabilidades:

- **Model**: Entidade `Livros.java` que mapeia a tabela no banco de dados.
- **Repository**: Interface para operações de persistência.
- **Service**: Camada de lógica de negócio.
- **Controller**: Endpoints que comunicam o frontend com o backend.
- **Frontend**: Ficheiros estáticos (`index.html`, `style.css`, `script.js`) para a interface do utilizador.

---

## 🛠️ Como Executar

1.  **Backend**:
    - Importe o projeto na sua IDE (IntelliJ, Eclipse ou VS Code).
    - Certifique-se de ter o Java 17 instalado.
    - Execute a classe `LivrariaApplication.java`.
    - O servidor iniciará em `http://localhost:8080`.

2.  **Frontend**:
    - Abra o ficheiro `index.html` diretamente em qualquer navegador moderno.

---

## 👤 Autor

Desenvolvido por **Agenor Silva Rodrigues**.