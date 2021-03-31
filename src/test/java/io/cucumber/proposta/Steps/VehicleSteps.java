package io.cucumber.proposta.Steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.pt.*;
import io.cucumber.proposta.Pages.VehiclePage;
import io.cucumber.proposta.Servicos.Configuracao;

public class VehicleSteps extends Configuracao{

	@Quando("estou no site SampleApp Tricentis")
	public void estou_no_site_SampleApp_Tricentis() {
		Configuracao.open("http://sampleapp.tricentis.com/101/app.php");
	}

	@Quando("seleciono uma opcao Make")
	public void seleciono_uma_opcao_Make() {
		VehiclePage.dropdownMake(browser).click();
	}

	@Quando("seleciono o Model")
	public void seleciono_o_Model() {
		VehiclePage.dropdownModel(browser).click();
	}

	@Quando("digito o {} Capacity")
	public void digito_o_Capacity(String string) {
		VehiclePage.campoCylender(browser).sendKeys(string);
	}	

	@Quando("digito no campo {} Performance")
	public void digito_no_campo_Engine_Performance(String string) {
		VehiclePage.campoEngine(browser).sendKeys(string);
	}	

	@Quando("seleciono Date of Manufacture")
	public void seleciono_Date_of_Manufacture() throws InterruptedException {
		VehiclePage.botaoCalendario(browser).click();
		Thread.sleep(2000);
		VehiclePage.dataCalendario(browser).click();
	}
	
	@Quando("seleciono Number of Seats")
	public void seleciono_Number_of_Seats() {
		VehiclePage.opcoesSeats(browser).click();
	}

	@Quando("seleciono Right Hand Drive")
	public void seleciono_Right_Hand_Drive() throws InterruptedException {
		WebElement element = VehiclePage.rightHandDrive(browser);
		Actions actions = new Actions(browser);
		actions.moveToElement(element).click().perform();
	}	

	@Quando("seleciono Number of Seats motorcycle")
	public void seleciono_Number_of_Seats_motorcycle() {
		VehiclePage.opcoesSeatsMotorcycle(browser).click();
	}

	@Quando("seleciono Fuel Type")
	public void seleciono_Fuel_Type() {
		VehiclePage.opcoesFuel(browser).click();
	}

	@Quando("digito campo {} [kg]")
	public void digito_campo_kg(String string) {
		VehiclePage.campoPayload(browser).sendKeys(string);
	}
	
	@Quando("digito Total {} [kg]")
	public void digito_Total_kg(String string) {
		VehiclePage.campoWeight(browser).sendKeys(string);
	}	
		
	@Quando("digito List {}")
	public void digito_List(String string) {
		VehiclePage.campoPrice(browser).sendKeys(string);
	}

	@Quando("digito {} Plate Number")
	public void digito_Plate_Number(String string) {
		VehiclePage.campoLicense(browser).sendKeys(string);
	}

	@Quando("digito Annual {}")
	public void digito_Annual(String string) {
		VehiclePage.campoMileage(browser).sendKeys(string);
	}

	@Entao("clico next para Insurant")
	public void clico_next_para_insurant() {
		VehiclePage.botaoNext(browser).click();
	}

}