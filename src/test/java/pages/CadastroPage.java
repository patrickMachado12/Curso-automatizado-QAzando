package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import runner.RunCucumberTest;
import support.Utils;

public class CadastroPage extends RunCucumberTest {

    private By titleM = By.id("id_gender1");
    private By titleF = By.id("id_gender2");
    private By first_name_field = By.id("first_name");
    private By last_name_field = By.id("last_name");
    private By password_field = By.id("password");

    private By select_day_field = By.id("days");
    private By select_months_field = By.id("months");
    private By select_years_field = By.id("years");

    private By eddress_field = By.id("address1");
    private By city_field = By.id("city");
    private By state_field = By.id("state");
    private By postalcode_field = By.id("zipcode");
    private By mobile_number_field = By.id("mobile_number");

    private By subbmit_button = By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button");

    public void selectTitle(Integer type){
        Utils.waitElementBePresent(titleM, 20);

        if(type == 1){
            getDriver().findElement(titleM).click();
        }else if(type == 2){
            getDriver().findElement(titleF).click();
        }
    }

    public void preencheNome(String name){
        getDriver().findElement(first_name_field).sendKeys(name);
    }

    public void preencheSobrenome(String sobrenome){
        getDriver().findElement(last_name_field).sendKeys(sobrenome);
    }

    public void preenchePassword(String generateRandomPassword){
        getDriver().findElement(password_field).sendKeys(generateRandomPassword);
    }

    public void selecionaAniversario(Integer day, String months, String year){
        Select select_day = new Select(getDriver().findElement(select_day_field));
        select_day.selectByIndex(day);

        Select select_month = new Select(getDriver().findElement(select_months_field));
        select_month.selectByValue(months);

        Select select_year = new Select(getDriver().findElement(select_years_field));
        select_year.selectByValue(year);
    }

    public void preencheAddress(String address){
        getDriver().findElement(eddress_field).sendKeys(address);
    }

    public void preencheCity(String city){
        getDriver().findElement(city_field).sendKeys(city);
    }

    public void preencheState(String state){
        getDriver().findElement(state_field).sendKeys(state);
    }

    public void preenchePostalCode(String postalCode){
        getDriver().findElement(postalcode_field).sendKeys(postalCode);
    }

    public void preencheMobilePhone(String phone){
        getDriver().findElement(mobile_number_field).sendKeys(phone);
    }

    public void clickRegister(){
        getDriver().findElement(subbmit_button).click();
    }

    public void valida_cadastro(String nome){
        Utils.waitElementBePresent(By.xpath("//*[@id=\"form\"]/div/div/div/div/a"), 20);
        String resultado_atual = getDriver().findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b")).getText();
        Assert.assertEquals("ACCOUNT CREATED!", resultado_atual);
    }

}
