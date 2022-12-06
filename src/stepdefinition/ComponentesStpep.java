package stepdefinition;


import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import util.Componentes;

public class ComponentesStpep {

    Componentes componentes = new Componentes();

    @Dado("que o usuário digitar Maruan no campo textfield")
    public void que_o_usuário_digitar_Maruan_no_campo_textfield() {
        componentes.testeTextField();
    }

    @Dado("que o usuário digitar no campo textarea Moussa")
    public void digitar_no_campo_textarea_Moussa() {
        componentes.testeTextArea();
    }

    @Dado("que o usuário Clicar no radio button no campo Masculino")
    public void clicar_no_radio_button_no_campo_Masculino() {
       componentes.clicarElementoRadioButton();
    }

    @Dado("que o usuário selecionar a checkbox comida com o valor Frango")
    public void selecionar_a_checkbox_comida_com_o_valor_Frango() {
        componentes.clicarElementoCheckBox();
    }

    @Dado("que o usuário clicar na combo box escolaridade para escolher a escolaridade Superior")
    public void clicar_na_combo_box_escolaridade_para_escolher_a_escolaridade_Superior() {
        componentes.selecionarValorCombo();

    }

    @Dado("que o usuario clicar no elementosForm esportes para escolher o esporte natacao")
    public void clicar_no_elementosForm_esportes_para_escolher_o_esporte_natacao() {
        componentes.selecionarCombobox();
    }

    @Quando("usuario clicar no botao cadastrar")
    public void o_usuario_clicar_no_botao_cadastrar() {
        componentes.selecionarBotaoCadastrar();
    }

    @Então("o usuario deve ser cadastrado com sucesso")
    public void o_usuario_deve_ser_cadastrado_com_sucesso() {
        componentes.validaTextField();
        componentes.validaTextArea();
        componentes.validaElementoRadioButton();
        componentes.validaElementoCheckbox();
        componentes.validaValorCombo();
        componentes.validarQuantidadeCombobox();
        componentes.validaBotaoCadastrar();
        componentes.fecharNavegador();

    }

    @Quando("o usuario deixar o campo textfield vazio")
    public void o_usuario_deixar_o_campo_textfield_vazio() {
        componentes.testarCampoNomeObrigatorio();
    }

    @Então("quando clicar em cadastrar, deve aparecer a mensagem o campo nome deve ser preenchido")
    public void quando_clicar_em_cadastrar_deve_aparecer_a_mensagem_o_campo_nome_deve_ser_preenchido() {
        componentes.validaCampoNomeObrigatorio();
        componentes.fecharNavegador();
    }

    @Quando("o usuario deixar o campo textarea vazio")
    public void o_usuario_deixar_o_campo_textarea_vazio() {
        componentes.testarSobrenomeObrigatorio();
    }

    @Então("quando clicar em cadastrar, deve aparecer o campo sobrenome é obrigatório")
    public void quando_clicar_em_cadastrar_deve_aparecer_o_campo_sobrenome_é_obrigatório() {
        componentes.validaSobrenomeObrigatorio();
        componentes.fecharNavegador();
    }

    @Quando("o usuario não clicar no radio button no campo sexo")
    public void o_usuario_não_clicar_no_radio_button_no_campo_sexo() {
        componentes.testarSexoObrigatório();
    }

    @Então("quando clicar em cadastrar, deve aparecer a mensagem sexo é obrigatório")
    public void quando_clicar_em_cadastrar_deve_aparecer_a_mensagem_sexo_é_obrigatório() {
        componentes.validaCampoSexoObrigatorio();
        componentes.fecharNavegador();
    }









}