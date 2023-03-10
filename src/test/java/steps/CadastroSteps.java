package steps;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.CadastroPage;
import runner.RunCucumberTest;
import support.Utils;

public class CadastroSteps extends RunCucumberTest {

    CadastroPage cadastroPage = new CadastroPage();

    @Quando("^eu preencho o formulário de cadastro$")
    public void eu_preencho_o_formulário_de_cadastro(){

        cadastroPage.selectTitle(1);
        cadastroPage.preencheNome("Patrick");
        cadastroPage.preencheSobrenome("Teste");
        cadastroPage.preenchePassword(Utils.generateRandomPassword(10));
        cadastroPage.selecionaAniversario(23,"1","1993");
        cadastroPage.preencheAddress("Rua da casa usuário teste, 1234");
        cadastroPage.preencheState("Colorado");
        cadastroPage.preencheCity("Florida");
        cadastroPage.preenchePostalCode("8888800");
        cadastroPage.preencheMobilePhone("+55021999999999");
    }

    @Quando("^clico em registrar$")
    public void clico_em_registrar(){
        cadastroPage.clickRegister();
    }

    @Então("^vejo a mensagem de cadastro realizado com sucesso$")
    public void vejo_a_mensagem_de_cadastro_realizado_com_sucesso(){
        cadastroPage.valida_cadastro("Account Created!");
    }

}
