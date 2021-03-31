package io.cucumber.proposta.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PriceOptionPage {

    public static WebElement opcaoSeguro (WebDriver browser) {
        return browser.findElement(By.cssSelector("#selectultimate"));
    }

    public static WebElement botaoNext (WebDriver browser) {
        return browser.findElement(By.cssSelector("#nextsendquote"));
    }
    
}
