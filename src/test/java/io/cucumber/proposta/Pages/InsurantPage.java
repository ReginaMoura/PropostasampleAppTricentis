package io.cucumber.proposta.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.proposta.Servicos.Configuracao;

public class InsurantPage extends Configuracao{
    
    public static WebElement campoFirstName (WebDriver browser) {
        return browser.findElement(By.cssSelector("#firstname"));
    }

    public static WebElement campoLastName (WebDriver browser) {
        return browser.findElement(By.cssSelector("#lastname"));
    }

    public static WebElement dataBirth (WebDriver browser) {
        return browser.findElement(By.cssSelector("#birthdate"));
    }

    public static WebElement campoGender (WebDriver browser) {
        return browser.findElement(By.cssSelector("#gendermale"));
    }

    public static WebElement campoAddress (WebDriver browser) {
        return browser.findElement(By.cssSelector("#streetaddress"));
    }

    public static WebElement opcoesCountry (WebDriver browser) {
        return browser.findElement(By.cssSelector("#country option:nth-child(32)"));
    }

    public static WebElement campoZipecode (WebDriver browser) {
        return browser.findElement(By.cssSelector("#zipcode"));
    }

    public static WebElement campoCity (WebDriver browser) {
        return browser.findElement(By.cssSelector("#city"));
    }

    public static WebElement opcoesOccupation (WebDriver browser) {
        return browser.findElement(By.cssSelector("#occupation option:nth-child(5)"));
    }

    public static WebElement campoHobbies (WebDriver browser) {
        return browser.findElement(By.cssSelector("#speeding"));
    }

    public static WebElement campoWebsite (WebDriver browser) {
        return browser.findElement(By.cssSelector("#website"));
    } 

    public static WebElement botaoNext (WebDriver browser) {
        return browser.findElement(By.cssSelector("#nextenterproductdata"));
    }
    
}
