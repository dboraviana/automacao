package br.gov.mctic.sisgesac.automacao.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.gov.mctic.sisgesac.automacao.core.AbstractPageObject;
import br.gov.mctic.sisgesac.automacao.core.PropriedadeUtils;
import br.gov.mctic.sisgesac.automacao.core.WDS;

public class LoginPage extends AbstractPageObject {

    @FindBy(id = "username")
    private WebElement campoUsuario;

    @FindBy(id = "password")
    private WebElement campoSenha;

    @FindBy(name = "efetuar-login")
    private WebElement botaoEntrar;

    public void informarUsuario(String usuario) {
        campoUsuario.sendKeys(usuario);
    }

    public void informarSenha(String senha) {
        campoSenha.sendKeys(senha);
    }

    public void solicitarLogin() {
        botaoEntrar.click();
    }
    
   public void paginaInicial() {
	   WDS.get().get(PropriedadeUtils.get("pagina_inicial"));
   }

}
