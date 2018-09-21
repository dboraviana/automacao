package br.gov.mctic.sisgesac.automacao.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.gov.mctic.sisgesac.automacao.core.AbstractPageObject;
import br.gov.mctic.sisgesac.automacao.core.WDS;

public class ConsultarDeclaracaoPage extends AbstractPageObject {
	
	// BOTÕES
	@FindBy(xpath = "//h2[.='Consultar Declaração']")
	private WebElement abaPesquisa;
	
	@FindBy(name = "cnpj")
	private WebElement campoCnpj;
	
	@FindBy(name = "tipoDeclaracao")
	private WebElement campoTipoDeclaracao;
	
	@FindBy(xpath = "//tr[@md-select-id='idFormulario']")
	private List<WebElement> linhasDeclaracao;
	
	@FindBy(xpath = "//button[text()='Incluir Realizada']")
	private WebElement botaoIncluirRealizada;	
	
	@FindBy(xpath = "//button[text()='Incluir Futura']")
	private WebElement botaoIncluirFutura;	
	
	
	// METODOS
	public void solicitarConsulta() {
		abaPesquisa.click();		
	}
	
	public void informarCnpj(String cnpj) {
		campoCnpj.sendKeys(cnpj);		
	}
	
	public void selecionarTipoDeclaracao(String tipoDeclaracao) {
		campoTipoDeclaracao.click();
		WDS.delay(500);
		WDS.get().findElement(By.xpath("//md-option[@ng-if='$ctrl.opcoes']//div[.='" + tipoDeclaracao + "']")).click();
	}
	
	
	public void solicitarIncluirRealizada() {
		botaoIncluirRealizada.click();
	}
	
	public void solicitarIncluirFutura() {
		botaoIncluirFutura.click();
	}
	
	public void solicitarDetalhar(String tipoDeclaracao, String cnpj) {
		for (WebElement botaoAcao : linhasDeclaracao) {
			if (botaoAcao.isDisplayed()) {
				botaoAcao.findElement(By.xpath(
						"//tr[@md-select-id='idFormulario']//span[.='" + tipoDeclaracao + "']/../..//span[.='" + cnpj + "']/../../td[7]//i[.='settings']"))
				.click();
				WDS.delay(500);
				WDS.get().findElement(By.xpath("//button[text()='                    Detalhar']")).click();
				WDS.delay(1000);
				WDS.get().findElement(By.xpath("//button[.='Sim']")).click();
				break;
			}
		}		
	}
		
}
