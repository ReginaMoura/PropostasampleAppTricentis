package io.cucumber.proposta.Steps;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.pt.*;
import io.cucumber.proposta.Pages.SendQuotePage;
import io.cucumber.proposta.Servicos.Configuracao;

public class SendQuoteSteps extends Configuracao {

    @Dado("preencho o email {string}")
    public void preencho_o_email(String string) {
        SendQuotePage.campoEmail(browser).sendKeys(string);
    }
    
    @Dado("digito um telefone {string}")
    public void digito_um_telefone(String string) {
        SendQuotePage.campoPhone(browser).sendKeys(string);
    }
    
    @Dado("escolho um nome de usuario {string}")
    public void escolho_um_nome_de_usuario(String string) {
        SendQuotePage.campoUsername(browser).sendKeys(string);
    }
    
    @Dado("escolho uma senha {string}")
    public void escolho_uma_senha(String string) {
        SendQuotePage.campoPassword(browser).sendKeys(string);
    }
    
    @Dado("confirmo a senha Confirm {string}")
    public void confirmo_a_senha_Confirm(String string) {
        SendQuotePage.campoConfirmPassword(browser).sendKeys(string);
    }
    
    @Quando("clico em Send")
    public void clico_em_Send() {
        SendQuotePage.botaoSend(browser).click();
    }
    
    @Entao("Verifico a mensagem {string}")
    public void verifico_a_mensagem(String string) throws InterruptedException {
        Thread.sleep(12000);
		assertEquals(string, SendQuotePage.menssagemSucesso(browser).getText());
    }    

    @Quando("clico no botao Ok")
    public void clico_no_botao_Ok() {
        SendQuotePage.botaoOk(browser).click();
        browser.close();
    }

    
}
