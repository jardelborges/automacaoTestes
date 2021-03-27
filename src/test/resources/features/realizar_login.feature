#language: pt
Funcionalidade: Realizar login
  Como um usuário
  Eu quero realizar login na aplicação
  Para ter acesso as suas funcionalidades

  Cenário: Efetuar login com sucesso
    Dado que tenho um email cadastrado
    E uma senha válida
    Quando clicar em Entrar
    Então recebo a mensagem "Bem vindo,"

  Cenário: Email inválido
    Dado que insiro um email não cadastrado
    E uma senha qualquer
    Quando clicar em Entrar
    Então recebo a mensagem "Problemas com o login do usuário"
