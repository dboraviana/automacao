package br.gov.mctic.sisgesac.automacao.pageobject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.gov.mctic.sisgesac.automacao.core.AbstractPageObject;
import br.gov.mctic.sisgesac.automacao.core.WDS;

public class CadastroEmpresaPage extends AbstractPageObject {

	@FindBy(id = "::input-cnpj")
	private WebElement campoCnpj;

	@FindBy(xpath = "//span[text()='Próximo']")
	private List<WebElement> botoesProximo;

	@FindBy(id = "alterar")
	private WebElement botaoAlterar;
	
	@FindBy(name = "produto")
	private WebElement campoProduto;
	
	@FindBy(xpath = "//ngc-combobox[@id='caso']")
	private WebElement campoSubstancia;
	
	@FindBy(xpath = "//span[.='Adicionar Produto']")
	private WebElement botaoAdicionarProduto;
	
	@FindBy(name = "nome-arquivo")
	private WebElement campoNomeArquivo;
	
	@FindBy(xpath = "//ngc-combobox[@id='tipo-documento']")
	private WebElement boxTipoDocumento;
	
	@FindBy(xpath = "//ngc-cartao-acoes[@layout='row']//span[.='Adicionar']")
	private WebElement botaoAdicionarAnexo;
	
	@FindBy(xpath = "//span[.='Salvar']")
	private WebElement botaoSalvar;

	
	
	public void informarCpnj(String cnpj) {
		campoCnpj.sendKeys(cnpj);
		campoCnpj.sendKeys(Keys.TAB);
	}

	public void solicitarProximo() {
		WDS.delay(500);
		for (WebElement botaoProximo : botoesProximo) {
			if (botaoProximo.isDisplayed()) {
				botaoProximo.click();
				break;
			}
		}
	}

	public void solicitarEdicaoRepresentante(String cpfRepresentante) {
		WDS.get().findElement(By.xpath("//tr/td[text()='" + cpfRepresentante + "']/../td[7]/md-menu/button")).click();
		WDS.delay(500);
		WDS.get().findElement(By.xpath(
				"//div[@class='_md md-open-menu-container md-whiteframe-z2 md-active md-clickable']/md-menu-content/md-menu-item[1]/button"))
				.click();
	}

	public void informarEmailRepresentante(String emailRepresentante) {
		WebElement quadro = WDS.get().findElement(By.xpath("//ngc-dialogo[@aria-label='Editar Representante']"));
		WebElement campoEmailRepresentante = quadro.findElement(By.id("::input-email"));
		campoEmailRepresentante.sendKeys(emailRepresentante);
	}

	public void solicitarAlterar() {
		botaoAlterar.click();
	}

	public void informarProduto(String produto) {
		campoProduto.sendKeys(produto);
		WDS.delay(1000);
		WDS.get().findElement(By.xpath(
				"//li[1][@md-virtual-repeat='item in $mdAutocompleteCtrl.matches']"))
				.click();
	}
	
	public void informarSubstancia() {
		WDS.delay(1000);
		campoSubstancia.click();		
		WDS.get().findElement(By.xpath(
				"//div[text()='458-71-9 | 1(1.1) Metilfosfonofluoridrato de 2-etilhexila']"))
				.click();
	}
	
	public void solicitarAdicionarProduto() {
		botaoAdicionarProduto.click();
	}
	
	
	// Aba Anexos
	//Informar nome do arquivo
	public void informarCampoNomeArquivo(String nomeArquivo) {
		campoNomeArquivo.sendKeys(nomeArquivo);
	}
	
	public void solicitarTipoDocumento(String tipoDocumento) {
		boxTipoDocumento.click();
		WDS.delay(1000);
		WDS.get().findElement(By.xpath("//div[@class='md-select-menu-container md-active md-clickable']//div[.='" + tipoDocumento + ("']"))).click();
	}
	
	
	//Metodo para importar um arquivo da maquina para anexar
	public void informarArquivo(String anexo) throws AWTException {
		
		WDS.get().findElement(By.xpath("//input[@type='file']")).click();
		
		StringSelection ss = new StringSelection(anexo);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		Robot robot = new Robot();
		robot.delay(1000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(1000);
	}
	
	// Clicar no botão para adicionar o anexo
	public void solicitarAdicionarAnexo() {
		botaoAdicionarAnexo.click();
		//Limpar o campo nome do arquivo para anexar outro arquivo
		campoNomeArquivo.clear();
	}
	
	// Engranagem ações
	public void solicitarDownload(String nomeArquivo) {
		WDS.get().findElement(By.xpath("//tr/td/span[text()='" + nomeArquivo +"']/../../td[4]//i[.='settings']")).click();
		WDS.delay(500);
		WDS.get().findElement(By.xpath(
				"//div[@class='_md md-open-menu-container md-whiteframe-z2 md-active md-clickable']//md-menu-content/md-menu-item[1]/button"))
		.click();
		WDS.delay(1000);
		WDS.fecharUltimaAba();
	}
	
	public void solicitarRemover(String nomeArquivo) {
		WDS.get().findElement(By.xpath("//tr/td/span[text()='" + nomeArquivo +"']/../../td[4]//i[.='settings']")).click();
		WDS.delay(500);
		WDS.get().findElement(By.xpath(
				"//div[@class='_md md-open-menu-container md-whiteframe-z2 md-active md-clickable']//md-menu-content/md-menu-item[2]/button"))
		.click();
	}
	
	public void solicitarSalvar() {
		botaoSalvar.click();
	}
	
	
	
	
	

}
