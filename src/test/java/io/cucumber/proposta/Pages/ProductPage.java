package io.cucumber.proposta.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.proposta.Servicos.Configuracao;

public class ProductPage extends Configuracao{

    public static WebElement campoCalendar (WebDriver browser) {
        return browser.findElement(By.cssSelector("#startdate"));
    }

    public static WebElement campoInsurance (WebDriver browser) {
        return browser.findElement(By.cssSelector("#insurancesum option:nth-child(5)"));
    }

    public static WebElement campoMerit (WebDriver browser) {
        return browser.findElement(By.cssSelector("#meritrating option:nth-child(5)"));
    }

    public static WebElement campoDamage (WebDriver browser) {
        return browser.findElement(By.cssSelector("#damageinsurance option:nth-child(2)"));
    } 

    public static WebElement campoOptional (WebDriver browser) {
        return browser.findElement(By.cssSelector("#EuroProtection"));
    }

    public static WebElement campoCourtesy (WebDriver browser) {
        return browser.findElement(By.cssSelector("#courtesycar option:nth-child(2)"));
    }

    public static WebElement botaoNext (WebDriver browser) {
        return browser.findElement(By.cssSelector("#nextselectpriceoption"));
    }
    
}
