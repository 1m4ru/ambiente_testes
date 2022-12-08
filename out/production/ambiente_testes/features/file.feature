#language:pt
Funcionalidade: Acessar site Senac Faculdade Palhoça
  Contexto: Dado que o usuário está com o navegador aberto

  Cenário: Acessar página do google
    Quando acessar a url www.google.com
    Então a página do google deve ser apresentada
  Cenário: Acessar site da Faculdade Senac
    Dado que o usuário acessou a url www.google.com
    E pesquisou por Faculdade Senac
    Quando clicar no link Senac Santa Catarina
    Então o site da Faculdade Senac deve ser aberto

