package br.gov.mctic.sisgesac.automacao.cenario;

import java.awt.AWTException;

import org.junit.Test;

import br.gov.mctic.sisgesac.automacao.core.AbstractCenario;

public class CadastrarSolicitacaoDePontoDePresenca extends AbstractCenario {
	
	
//	@Test
//	public void validarCamposObrigatorios() throws AWTException {
//   	acessarMenu("Articulação", "Solicitação P.P");
//   	acessarFuncionalidade("Cadastrar");
//   	solicitarProximo();
//	}
	
	@Test
	 public void cadastrarSolicitacaoDePontoDePresenca() throws AWTException {
    	acessarMenu("Articulação", "Solicitação P.P");
    	acessarFuncionalidade("Cadastrar");
    	solicitarProximo();
	}
}
