#language:pt

 @acessar_varios_componentes_html
Funcionalidade: Acessar componentes

  Contexto:
    Dado que o usuário digitar Maruan no campo textfield
    E que o usuário digitar no campo textarea Moussa
    E que o usuário clicar no radio button no campo Masculino
    E que o usuário selecionar a checkbox comida com o valor Frango
    E que o usuário clicar na combo box escolaridade para escolher a escolaridade Superior
    E que o usuário clicar no elementosForm esportes para escolher o esporte natacao

    Cenário: Cadastrar novo usuário
      Quando o usuario clicar no botao cadastrar
      Então o usuario deve ser cadastrado com sucesso

    Cenário: validar o campo nome obrigatorio
      Quando o usuario deixar o campo textfield vazio
      Então quando clicar em cadastrar, deve aparecer a mensagem o campo nome deve ser preenchido


  Cenário: validar o campo sobrenome obrigatorio
    Quando o usuario deixar o campo textarea vazio
    Então quando clicar em cadastrar, deve aparecer o campo sobrenome é obrigatório


  Cenario: validar campo sexo obrigatorio
      Quando o usuario não clicar no radio button no campo sexo
    Então quando clicar em cadastrar, deve aparecer a mensagem sexo é obrigatório
