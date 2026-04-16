📚 Sistema de Gerenciamento de Livraria
Este é um projeto full-stack de uma Biblioteca Pessoal, desenvolvido para facilitar o registo e a organização de coleções de livros. O sistema permite adicionar, listar, atualizar e remover obras, integrando um backend robusto em Java com um frontend dinâmico.

🚀 Tecnologias Utilizadas
Backend
Java 17

Spring Boot 3

Spring Data JPA: Para persistência de dados

H2 Database: Banco de dados em memória para desenvolvimento rápido.

Maven: Gestor de dependências.

Frontend
HTML5: Estrutura da interface

CSS3: Design responsivo com Flexbox

JavaScript (ES6+): Consumo de API assíncrona com fetch

📋 Funcionalidades
Registo de Livros: Interface para inserir título, autor, género e ano de publicação.

Listagem em Tempo Real: Exibição automática dos livros cadastrados assim que a página é carregada.

Arquitetura CRUD Completa:

POST: Adicionar novos títulos.

GET: Listar todos os livros.

PUT: Atualizar informações de livros existentes.

DELETE: Remover livros da base de dados.

Persistência: Utilização de JPA para mapeamento objeto-relacional (ORM).

🔧 Estrutura do Projeto
O projeto segue o padrão de camadas para melhor manutenção:

Model (Livros.java): Define a entidade e os campos do banco de dados.

Repository (LivrosRepository.java): Interface que herda o JpaRepository para operações de banco.

Service (LivrosService.java): Contém a lógica de negócio e validações.

Controller (LivroController.java): Expõe os endpoints REST para o frontend.

Frontend (script.js): Classe encapsulada para chamadas à API e manipulação do DOM.

🛠️ Como Executar o Projeto
Pré-requisitos: Ter o Java 17+ e o Maven instalados.

Executar o Backend:

Bash
mvn spring-boot:run
A API estará disponível em http://localhost:8080/livros.

Executar o Frontend:

Basta abrir o ficheiro index.html no seu navegador de preferência.

📈 Próximos Passos (Roadmap)
[ ] Implementar a lógica de busca por filtro (Título/Autor) no frontend.

[ ] Adicionar campo de "Status" (Lido/Não lido).

[ ] Implementar sistema de notas de 1 a 5 para livros lidos.

[ ] Adicionar confirmação visual ao eliminar um registo.

👤 Autor
Agenor Silva Rodrigues

Este projeto foi desenvolvido com fins didáticos para praticar a integração entre Spring Boot e JavaScript puro.
