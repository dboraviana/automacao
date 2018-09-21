package br.gov.mctic.sisgesac.automacao.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.gov.mctic.sisgesac.automacao.core.AbstractPageObject;
import br.gov.mctic.sisgesac.automacao.core.WDS;

public class CadastrarSolicitacaoDePontoDePresencaPage extends AbstractPageObject {
	
	
	public void campoObrigatorio(String campo) {
		WebElement validarMensagem = WDS.get().findElement(By.xpath("//div[@input-name='+'campo+']"));
		
		
			
	}

}
