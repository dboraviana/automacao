package br.gov.mctic.sisgesac.automacao.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.gov.mctic.sisgesac.automacao.core.AbstractPageObject;
import br.gov.mctic.sisgesac.automacao.core.WDS;

public class AnalisarPage extends AbstractPageObject {
	
	@FindBy(xpath = "//h2[.='Consultar Declaração de Atividade']")
	private WebElement abaPesquisa;
	
	@FindBy(name = "cnpj")
	private WebElement campoCnpj;
	
	@FindBy(name = "tipoDeclaracao")
	private WebElement campoTipoDeclaracao;
	
	@FindBy(xpath = "//md-checkbox[@aria-label='Select All']")
	private WebElement checkBoxTodos;
	
	
	
	@FindBy(xpath = "//span[.='Pesquisar']")
	private WebElement botaoPesquisar;
	
	@FindBy(xpath = "//tr[@md-select-id='idFormulario']")
	private List<WebElement> linhasDeclaracao;	
	
	@FindBy(xpath = "//md-radio-button[@aria-label=\"Processada\"]")
	private WebElement radioProcessada;
	
	@FindBy(xpath = "//button[@aria-label='Concluir']")
	private WebElement botaoConcluir;
	
	
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

	public void solicitarPesquisar() {
		botaoPesquisar.click();		
		WDS.delay(500);
	}

	public void solicitarAnalisar(String tipoDeclaracao, String cnpj) {
		for (WebElement botaoAcao : linhasDeclaracao) {
			if (botaoAcao.isDisplayed()) {
				botaoAcao.findElement(By.xpath(
						"//tr[@md-select-id='idFormulario']//span[.='" + tipoDeclaracao + "']/../..//span[.='" + cnpj + "']/../../td[7]//i[.='settings']"))
				.click();
				WDS.delay(500);
				WDS.get().findElement(By.xpath("//button[text()='                    Analisar']")).click();
				WDS.delay(1000);
				WDS.get().findElement(By.xpath("//button[.='Sim']")).click();
				break;
			}
		}		
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

	public void solicitarProcessada() {
		radioProcessada.click();		
	}

	public void solicitarConcluir() {
		botaoConcluir.click();		
	}
	
	@Override
	public void exibeMensagem(String mensagemEsperada) {
		super.exibeMensagem(mensagemEsperada);
	}

	public void solicitarMarcarTodos() {
		checkBoxTodos.click();		
	}
	
	@Override
	public void solicitarExportarExcel() {
		super.solicitarExportarExcel();
	}
	
	@Override
	public void solicitarExportarPDF() {
		super.solicitarExportarPDF();
	}
	
	@Override
	public void solicitarSalvar() {
		super.solicitarSalvar();
	}

}
