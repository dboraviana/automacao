package br.gov.mctic.sisgesac.automacao.cenario;

import java.awt.AWTException;

import org.junit.Test;

import br.gov.mctic.sisgesac.automacao.core.AbstractCenario;
import br.gov.mctic.sisgesac.automacao.pageobject.CadastrarSolicitacaoDePontoDePresencaPage;

public class CadastrarSolicitacaoDePontoDePresenca extends AbstractCenario {
	
	
	@Test
	public void validarCamposObrigatorios() throws AWTException {
		acessarMenu("Articulação", "Solicitação P.P");
		acessarFuncionalidade("Cadastrar");
//		Em(CadastrarSolicitacaoDePontoDePresencaPage.class).campoObrigatorioInputNameBeneficiario();
		Em(CadastrarSolicitacaoDePontoDePresencaPage.class).campoObrigatorioRadioButton();
	
//		Em(CadastrarSolicitacaoDePontoDePresencaPage.class).campoObrigatorio("cep");

	}

//	@Test
//	public void cadastrarSolicitacaoPontoPresenca() throws AWTException {
//		acessarMenu("Articulação", "Solicitação P.P");
//		acessarFuncionalidade("Cadastrar");
//		Em(CadastrarSolicitacaoDePontoDePresencaPage.class).preencherCampo("nomeEstabelecimento",
//				"Enseg Engenharia De Seguros");
//		Em(CadastrarSolicitacaoDePontoDePresencaPage.class).preencherCampo("computadoresEstabelecimento", "10");
//		Em(CadastrarSolicitacaoDePontoDePresencaPage.class).tipologia("   Biblioteca");
//		Em(CadastrarSolicitacaoDePontoDePresencaPage.class).estabelecimentoAbertoPublico("Sim");
//		Em(CadastrarSolicitacaoDePontoDePresencaPage.class).possuiOutraConexaoInternet("Não");
//		Em(CadastrarSolicitacaoDePontoDePresencaPage.class).area("Urbana");
//		Em(CadastrarSolicitacaoDePontoDePresencaPage.class).preencherCampoCep("cep", "41.230-035");
//		Em(CadastrarSolicitacaoDePontoDePresencaPage.class).numeroEndereco();
//		solicitarProximo();
//		Em(CadastrarSolicitacaoDePontoDePresencaPage.class).preencherCampo("nomeBeneficiario", "Débora Viana");
//		Em(CadastrarSolicitacaoDePontoDePresencaPage.class).situacao("ativo");
//		Em(CadastrarSolicitacaoDePontoDePresencaPage.class).preencherCampo("telefoneUm", "61991032835");
//		solicitarAdicionar();
////	Em(CadastrarSolicitacaoDePontoDePresencaPage.class).preencherCampo("justificativaSolicitacao", "Teste Automatizado");
//		Em(CadastrarSolicitacaoDePontoDePresencaPage.class).salvar();
//	}

}
