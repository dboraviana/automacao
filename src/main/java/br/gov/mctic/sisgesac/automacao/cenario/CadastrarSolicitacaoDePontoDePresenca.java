package br.gov.mctic.sisgesac.automacao.cenario;

import java.awt.AWTException;

import org.junit.Test;

import br.gov.mctic.sisgesac.automacao.core.AbstractCenario;
import br.gov.mctic.sisgesac.automacao.pageobject.CadastrarSolicitacaoDePontoDePresencaPage;

public class CadastrarSolicitacaoDePontoDePresenca extends AbstractCenario {
	
	
	@Test
	public void cadastrarSolicitacaoPontoPresenca() throws AWTException {
   	acessarMenu("Articula��o", "Solicita��o P.P");
   	acessarFuncionalidade("Cadastrar");
   	Em(CadastrarSolicitacaoDePontoDePresencaPage.class).preencherCampo("nomeEstabelecimento", "Enseg Engenharia De Seguros");
   	Em(CadastrarSolicitacaoDePontoDePresencaPage.class).preencherCampo("computadoresEstabelecimento", "10");
   	Em(CadastrarSolicitacaoDePontoDePresencaPage.class).tipologia("   Biblioteca");
   	Em(CadastrarSolicitacaoDePontoDePresencaPage.class).estabelecimentoAbertoPublico("Sim");
   	Em(CadastrarSolicitacaoDePontoDePresencaPage.class).possuiOutraConexaoInternet("N�o");
   	Em(CadastrarSolicitacaoDePontoDePresencaPage.class).area("Urbana");
   	Em(CadastrarSolicitacaoDePontoDePresencaPage.class).preencherCampoCep("cep", "41.230-035");
   	Em(CadastrarSolicitacaoDePontoDePresencaPage.class).numeroEndereco();
   	solicitarProximo();
   	Em(CadastrarSolicitacaoDePontoDePresencaPage.class).preencherCampo("nomeBeneficiario", "D�bora Viana");
   	Em(CadastrarSolicitacaoDePontoDePresencaPage.class).situacao("ativo");
   	Em(CadastrarSolicitacaoDePontoDePresencaPage.class).preencherCampo("telefoneUm", "61991032835");
	}
	
//	@Test
//	 public void validarCamposObrigatorios() throws AWTException {
//    	acessarMenu("Articula��o", "Solicita��o P.P");
//    	acessarFuncionalidade("Cadastrar");
//    	solicitarProximo();
//    	Em(CadastrarSolicitacaoDePontoDePresencaPage.class).campoObrigatorio("Nome do Estabelecimento");
//    	Em(CadastrarSolicitacaoDePontoDePresencaPage.class).campoObrigatorio("cep");
//
//	}
}

