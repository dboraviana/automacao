package br.gov.mctic.sisgesac.automacao.cenario;

import br.gov.mctic.sisgesac.automacao.core.AbstractCenario;
import br.gov.mctic.sisgesac.automacao.core.PropriedadeUtils;
import br.gov.mctic.sisgesac.automacao.pageobject.LoginPage;

public class LoginCenario extends AbstractCenario {

    public void realizarLogin() {
    	Em(LoginPage.class).paginaInicial();
        Em(LoginPage.class).informarUsuario(PropriedadeUtils.get("usuario"));
        Em(LoginPage.class).informarSenha(PropriedadeUtils.get("senha"));
        Em(LoginPage.class).solicitarLogin();
    }

}
