# language: pt

  @cadastro
  Funcionalidade: Cadastro de usuários

    @cadastro-sucesso
    Cenario: Registrar novo usuário com sucesso
      Dado que estou na tela de login
      E acesso o cadastro de usuário
      Quando eu preencho o formulário de cadastro
      E clico em registrar
      Então vejo a mensagem de cadastro realizado com sucesso