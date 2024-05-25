<h1>Descrição do Projeto:</h1> 

Gestor de Estoque em Java com Spring Boot

<h2>Visão Geral

O projeto "Gestor de Estoque" é uma aplicação web desenvolvida em Java com Spring Boot. O objetivo é gerenciar o estoque de produtos de uma empresa, permitindo adição, remoção, atualização e consulta de produtos. A aplicação utiliza PostgreSQL para armazenamento de dados e Postman para testes e validação das APIs RESTful.

<h1>Funcionalidades</h1>
<h2>Cadastro de Produtos:</h>

Adicionar novos produtos com nome, descrição, quantidade e preço.

<h2>Atualização de Produtos:</h2>

Editar informações de produtos existentes.

<h2>Remoção de Produtos:</h2>

Remover produtos pelo identificador único.

<h2>Consulta de Produtos:</h2>

Buscar produtos ou listar todos, com filtragem por preço ou quantidade.

<h2>Relatórios de Estoque:</h2>>

Gerar relatórios sobre o estado atual do estoque.

<h2>Tecnologias Utilizadas</h2>

Java 11
Spring Boot 2.6.x
PostgreSQL
Postman

<h1>Estrutura do Projeto</h1>

<h2>Controllers:</h2>
Responsáveis por receber requisições HTTP e enviar respostas.
Exemplo: ProdutoController.

<h2>Services:</h2>
Contêm a lógica de negócios.
Exemplo: ProdutoService.

<h2>Repositories:</h2>
Comunicação com o banco de dados.
Exemplo: ProdutoRepository.

<h2>Models:</h2>
Definem as entidades do banco de dados.
Exemplo: Produto.
Implementação e Testes

<h2>Configuração do Banco de Dados:</h2>
Configurar PostgreSQL e definir propriedades no application.properties.
Criação de Endpoints RESTful:

<h2>Implementar endpoints para CRUD de produtos.
Exemplo: POST /produtos, GET /produtos/{id}, PUT /produtos/{id}, DELETE /produtos/{id}.

<h2>Testes com Postman:</h2>
Criar coleções de requisições para testar endpoints.
Validar funcionamento das APIs com testes unitários e de integração.
<h1>Conclusão</h1>
O "Gestor de Estoque" oferece uma solução eficiente para gerenciamento de estoques, facilitando controle e operação de produtos. Utilizando Java, Spring Boot, PostgreSQL e Postman, a aplicação garante performance, segurança e facilidade de manutenção.
