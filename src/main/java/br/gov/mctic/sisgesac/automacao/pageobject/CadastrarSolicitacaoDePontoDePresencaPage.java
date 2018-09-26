package br.gov.mctic.sisgesac.automacao.pageobject;

import java.awt.AWTException;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.gov.mctic.sisgesac.automacao.core.AbstractPageObject;
import br.gov.mctic.sisgesac.automacao.core.WDS;

public class CadastrarSolicitacaoDePontoDePresencaPage extends AbstractPageObject {

	public void campoObrigatorioInputNameBeneficiario() {
		String[] campoInput = { "nomeEstabelecimento", "computadoresEstabelecimento", "cep", "uf", "municipio",
				"logradouro", "numero", "bairro" };
		WDS.delay(500);
		solicitarProximo();
		for (int i = 0; i < campoInput.length; i++) {
			WebElement validarMensagem = WDS.get()
					.findElement(By.xpath("//md-input-container//div[@input-name='" + campoInput[i] + "']"));
			Assert.assertEquals("Campo de preenchimento obrigatório.", validarMensagem.getText());
		}

	}
	
	@FindBy(xpath = "//div[@class='radio-invalido ng-binding ng-scope']")
	public List<WebElement> radios;
	
	public void campoObrigatorioRadioButton() {
		for (int i = 0; i < radios.size(); i++) {
			WebElement radio = radios.get(i);
			System.out.println(radios);
		}

	}

	public void preencherCampo(String nome, String texto) {
		WebElement campo = WDS.get().findElement(By.name(nome));
		campo.sendKeys(texto);

	}

	public void preencherCampoCep(String nome, String texto) {
		WebElement campo = WDS.get().findElement(By.name(nome));
		campo.sendKeys(texto);
		campo.sendKeys(Keys.TAB);
		WDS.delay(1000);

	}

	public void numeroEndereco() {
		WDS.delay(500);
		String campoVazio = WDS.get().findElement(By.name("numero")).getText();
		WebElement campoNumero = WDS.get().findElement(By.name("numero"));

		if (campoVazio.isEmpty()) {
			campoNumero.sendKeys("10");
		}

	}

	public void tipologia(String tipologia) throws AWTException {
		WebElement select = WDS.get().findElement(By.name("tipologia"));
		select.click();
		WebElement opcao = WDS.get()
				.findElement(By.xpath("//md-select-menu//md-option//span[text()='" + tipologia + "']"));
		opcao.click();
		esc();
		WDS.delay(500);
	}

	public void estabelecimentoAbertoPublico(String opcao) {
		WebElement radio = WDS.get().findElement(By.xpath(
				"//ngc-acordeon-conteudo//div//div//md-radio-group[@name=\"abertoPublico\"]//md-radio-button[@aria-label='"
						+ opcao + "']"));
		radio.click();

	}

	public void possuiOutraConexaoInternet(String opcao) {

		WebElement radio = WDS.get().findElement(By.xpath(
				"//ngc-acordeon-conteudo//div//div//md-radio-group[@name=\"possuiOutraConexao\"]//md-radio-button[@aria-label='"
						+ opcao + "']"));
		radio.click();

		if (opcao == "Sim") {

			WebElement observacao = WDS.get().findElement(By.name("observacao"));
			observacao.sendKeys("Teste Automatizado Com Selenium Web Driver");

		}
	}

	public void area(String opcao) {
		WebElement radio = WDS.get().findElement(By.xpath(
				"//ngc-acordeon-conteudo//div//div//md-radio-group[@name=\"areaUrbana\"]//md-radio-button[@aria-label='"
						+ opcao + "']"));
		radio.click();
	}

	public void situacao(String string) {
		WebElement select = WDS.get().findElement(By.name("ativo"));
		WebElement opcao = WDS.get().findElement(By.xpath("//md-option//div[text()='" + string.toUpperCase() + "']"));
		select.click();
		opcao.click();
		WDS.delay(500);

	}

	public void salvar() {
		WebElement salvar = WDS.get().findElement(By.xpath("//ngc-botao//button[@aria-label=\"Salvar\"]"));
		salvar.click();

	}

}