package io.cucumber.proposta.Steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.pt.*;
import io.cucumber.proposta.Pages.PriceOptionPage;
import io.cucumber.proposta.Servicos.Configuracao;

public class PriceOptionSteps extends Configuracao{
    
    @Quando("escolhe uma opcao")
    public void escolhe_uma_opcao() {
        WebElement element = PriceOptionPage.opcaoSeguro(browser);
		Actions actions = new Actions(browser);
		actions.moveToElement(element).click().perform();
        PriceOptionPage.opcaoSeguro(browser).isEnabled();
    }
    
    @Entao("clico em Next para receber orcamento")
    public void clico_em_Next_para_receber_orcamento() throws InterruptedException {
        Thread.sleep(2000);
        PriceOptionPage.botaoNext(browser).click();
    }    
}
