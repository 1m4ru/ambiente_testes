#language:pt

 @acessar_varios_componentes_html
Funcionalidade: Acessar componentes

  Contexto:
    Dado que o usuário está no campo de treinameto

    Cenário: Cadastrar novo usuário
      Dado que o usuário digitar Maruan no campo textfield
      E que o usuário digitar no campo textarea Moussa
      E que o usuário clicar no radio button no campo Masculino
      E que o usuário selecionar a checkbox comida com o valor Frango
      E que o usuário clicar na combo box escolaridade para escolher a escolaridade Superior
      E que o usuário clicar no elementosForm esportes para escolher o esporte natacao
      Quando o usuario clicar no botao cadastrar
      Então o usuario deve ser cadastrado com sucesso

    Cenário: validar o campo nome obrigatorio
      Dado o usuario deixar o campo textfield vazio
      Quando  clicar em cadastrar
      Então deve aparecer a mensagem o campo nome deve ser preenchido


  Cenário: validar o campo sobrenome obrigatorio
    Dado o usuario deixar o campo textarea vazio
    Quando  clicar em cadastrar
    Então deve aparecer o campo sobrenome é obrigatório


  Cenario: validar campo sexo obrigatorio
    Dado que o usuario nao clicar no radio button no campo sexo
    Quando clicar em cadastrar
      Então deve aparecer a mensagem sexo é obrigatório
