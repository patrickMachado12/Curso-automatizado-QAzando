package pages;

import org.openqa.selenium.By;
import runner.RunCucumberTest;
import support.Utils;

public class LoginPage extends RunCucumberTest {

    private By create_nome_field = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]");
    private By create_email_field = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]");
    private By create_email_button = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button");

    public void acessarTelaLogin(){
        getDriver().get("https://automationexercise.com/login");
        Utils.waitElementBePresent(create_nome_field, 20);
    }

    public void preencherCampoEmail(){
        getDriver().findElement(create_nome_field).sendKeys(Utils.getRandomNome());
        getDriver().findElement(create_email_field).sendKeys(Utils.getRandomEmail());
    }

    public void clicarCriarContaBotao(){
        getDriver().findElement(create_email_button).click();
    }

}
