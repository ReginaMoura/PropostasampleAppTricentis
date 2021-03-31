package io.cucumber.proposta.Steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.pt.*;
import io.cucumber.proposta.Pages.ProductPage;
import io.cucumber.proposta.Servicos.Configuracao;

public class ProductSteps extends Configuracao{

    @Quando("seleciono uma data Start Date")
    public void seleciono_uma_data_Start_Date() {
        ProductPage.campoCalendar(browser).sendKeys("05/05/2021");;
    }
    
    @Quando("seleciono um valor de seguro Insurance Sum")
    public void seleciono_um_valor_de_seguro_Insurance_Sum() {
        ProductPage.campoInsurance(browser).click();
    }
    
    @Quando("escolho uma nota Merit Rating")
    public void escolho_uma_nota_Merit_Rating() {
        ProductPage.campoMerit(browser).click();
    }
    
    @Quando("escolho uma cobertura Damage Insurance")
    public void escolho_uma_cobertura_Damage_Insurance() {
        ProductPage.campoDamage(browser).click();
    }
    
    @Quando("seleciono opcionais Optional Products")
    public void seleciono_opcionais_Optional_Products() {
        WebElement element = ProductPage.campoOptional(browser);
		Actions actions = new Actions(browser);
		actions.moveToElement(element).click().perform();
    }
    
    @Quando("seleciono uma cortesia Courtesy Car")
    public void seleciono_uma_cortesia_Courtesy_Car() {
        ProductPage.campoCourtesy(browser).click();
    }
    
    @Entao("clico em next para ver a tabela de precos")
    public void clico_em_next_para_ver_a_tabela_de_precos() {
        ProductPage.botaoNext(browser).click();
    }    
    
}
