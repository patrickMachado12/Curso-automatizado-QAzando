package support;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

import java.security.SecureRandom;
import java.util.Random;

public class Utils extends RunCucumberTest {

    public static void waitElementBePresent(By element, Integer tempo) {
        WebDriverWait wait = new WebDriverWait(getDriver(), tempo);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static String getRandomNome(){
        String nome_init = "patrick_";
        String nome_final = "teste";

        Random random = new Random();
        int minimo = 1;
        int maximo = 999999999;
        int resultado = random.nextInt(maximo-minimo) + minimo;

        return nome_init + resultado + nome_final;
    }

    public static String getRandomEmail(){
        String email_init = "patrickTeste_";
        String email_final = "@gmail.com.br";

        Random random = new Random();
        int minimo = 1;
        int maximo = 999999999;
        int resultado = random.nextInt(maximo-minimo) + minimo;

        return email_init + resultado + email_final;
    }

    public static String generateRandomPassword(Integer len){
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < len; i++)
        {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }

        return sb.toString();
    }
}