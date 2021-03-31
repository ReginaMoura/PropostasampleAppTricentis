package io.cucumber.proposta.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.proposta.Servicos.Configuracao;

public class VehiclePage extends Configuracao {

    public static WebElement dropdownMake (WebDriver browser) {
        return browser.findElement(By.cssSelector("#make>option:nth-child(14)"));
    }

    public static WebElement dropdownModel (WebDriver browser) {
        return browser.findElement(By.cssSelector("#model>option:nth-child(2)"));
    }

    public static WebElement campoCylender (WebDriver browser) {
        return browser.findElement(By.cssSelector("#cylindercapacity"));
    }

    public static WebElement campoEngine (WebDriver browser) {
        return browser.findElement(By.cssSelector("#engineperformance"));
    }

    public static WebElement botaoCalendario (WebDriver browser) {
        return browser.findElement(By.cssSelector("button#opendateofmanufacturecalender"));
    }

    public static WebElement dataCalendario (WebDriver browser) {
        return browser.findElement(By.cssSelector(".ui-state-default.ui-state-hover"));
    }

    public static WebElement opcoesSeats (WebDriver browser) {
        return browser.findElement(By.cssSelector("select#numberofseats > option[value='4']"));
    }

    public static WebElement rightHandDrive (WebDriver browser) {
        return browser.findElement(By.cssSelector("input[id*='yes']"));
    }

    public static WebElement opcoesSeatsMotorcycle (WebDriver browser) {
        return browser.findElement(By.cssSelector("#numberofseatsmotorcycle > option[value='3']"));
    }

    public static WebElement opcoesFuel (WebDriver browser) {
        return browser.findElement(By.cssSelector("#fuel option:nth-child(4)"));
    }
    
    public static WebElement campoPayload (WebDriver browser) {
        return browser.findElement(By.cssSelector("#payload"));
    }

    public static WebElement campoWeight (WebDriver browser) {
        return browser.findElement(By.cssSelector("#totalweight"));
    }

    public static WebElement campoPrice (WebDriver browser) {
        return browser.findElement(By.cssSelector("#listprice"));
    }

    public static WebElement campoLicense (WebDriver browser) {
        return browser.findElement(By.cssSelector("#licenseplatenumber"));
    }
    
    public static WebElement campoMileage (WebDriver browser) {
        return browser.findElement(By.cssSelector("#annualmileage"));
    } 

    public static WebElement botaoNext (WebDriver browser) {
        return browser.findElement(By.cssSelector(".next"));
    }


}
