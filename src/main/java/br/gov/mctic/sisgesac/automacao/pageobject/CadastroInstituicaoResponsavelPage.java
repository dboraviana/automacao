package br.gov.mctic.sisgesac.automacao.pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import br.gov.mctic.sisgesac.automacao.core.AbstractPageObject;
import br.gov.mctic.sisgesac.automacao.core.WDS;

public class CadastroInstituicaoResponsavelPage extends AbstractPageObject {


	
	public void informarCpnj(String cnpj) {
		WebElement campoCnpj = WDS.get().findElement(By.xpath("//ngc-campo-cnpj//ngc-campo-texto//md-input-container//input"));
		campoCnpj.sendKeys(cnpj);
		campoCnpj.sendKeys(Keys.TAB);
	}
	
	public void informarNumProcesso(String numeroProcesso) {
		WebElement numProcesso = WDS.get().findElement(By.xpath("//ngc-campo-texto//input[@name='numeroProcesso']"));
		numProcesso.sendKeys(numeroProcesso);
	}
	
		
	public void preencherCampoData (String nameCampo, String data) {
    	WebElement campo = WDS.get().findElement(By.xpath("//md-datepicker[@name='"+ nameCampo +"']//input"));;
    	campo.sendKeys(data);
    	
    }
	
	public void mesmoEndereco() {
		WDS.delay(500);
		WDS.get().findElement(By.xpath("//*[@id=\"dados\"]/ngc-acordeon[3]/ngc-acordeon-painel/"
				+ "ngc-acordeon-conteudo/div/ngc-checkbox/md-input-container/md-checkbox/div[1]")).click();
		
	}
	
	public void informarCPF(String cpf) {
		WebElement campoCPF = WDS.get().findElement(By.name("cpf"));
		campoCPF.sendKeys(cpf);
		campoCPF.sendKeys(Keys.TAB);
	}
	
	public void informarCargo(String cargo) {
		WDS.get().findElement(By.xpath("//ngc-campo-texto[@label=\"Cargo\"]//input[@name=\"cargo\"]")).sendKeys(cargo);
	}
	
	public void campoEmail(String email) {
		WDS.get().findElement(By.name("emailAcesso")).sendKeys(email);
		WDS.get().findElement(By.name("confirmarEmail")).sendKeys(email);
	}
	
	public void informarTelefone(String telefone) {
		WDS.get().findElement(By.name("primeiroTelefone")).sendKeys(telefone);
	}
	
	public void informarCPFContato(String cpf) {
		WebElement campoCPF = WDS.get().findElement(By.name("cpfContato"));
		campoCPF.sendKeys(cpf);
		campoCPF.sendKeys(Keys.TAB);
	}
	
	public void informarCargoContato(String contato) {
		WebElement campoCargoContato = WDS.get().findElement(By.name("cargoContato"));
		campoCargoContato.sendKeys(contato);
		
	}
	
	public void campoEmailContato(String email) {
		WDS.get().findElement(By.xpath("//ngc-formulario[@nome=\"vm.contatoForm\"]//input[@type='email']")).sendKeys(email);
		WDS.get().findElement(By.xpath("//ngc-formulario[@nome=\"vm.contatoForm\"]//input[@name=\"confirmarEmail\"]")).sendKeys(email);
		
		
	}
	
	
	public void informarTelefoneContato(String telefone) {
		WDS.get().findElement(By.xpath("//ngc-formulario[@nome=\"vm.contatoForm\"]//input[@name=\"primeiroTelefone\"]")).sendKeys(telefone);
	}
	
	
	public void situacaoInativo() {
		
		
		WebElement select = WDS.get().findElement(By.xpath("//ngc-combobox[@label='Situação']"));
		WebElement inativo = WDS.get().findElement(By.xpath("//*[@id=\"select_option_67\"]"));
		
		select.click();
		inativo.click();
		
				
	}
	
	public void situacaoAtivo() {
		WDS.delay(500);
		
		WebElement select = WDS.get().findElement(By.xpath("//ngc-combobox[@label='Situação']"));
		
		WebElement ativo = WDS.get().findElement(By.xpath("//*[@id=\"select_option_66\"]"));
		
		select.click();
		
		ativo.click();
	
		

	}
	
	
	public void botaoSalvar() {
		WebElement salvar = WDS.get().findElement(By.xpath("//button[@ng-click=\"vm.salvar()\"]"));
		salvar.click();

	}
	
	public void acessarFiltro() {
		WebElement search = WDS.get().findElement(By.id("abre-filtro"));
		search.click();
		
	}
	
	public void validarInstituicaoResponsavel(String instituicao) {
		WebElement instituicaoResposavel = WDS.get().findElement(By.xpath("//tbody//tr//td[2]"));	
		WDS.delay(500);
		Assert.assertEquals(instituicao, instituicaoResposavel.getText());
		System.out.println("Cadastro Realizado com sucesso");
	}

}
