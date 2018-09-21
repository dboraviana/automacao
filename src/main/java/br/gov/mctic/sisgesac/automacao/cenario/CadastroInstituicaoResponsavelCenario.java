package br.gov.mctic.sisgesac.automacao.cenario;

import java.awt.AWTException;

import org.junit.Test;

import br.gov.mctic.sisgesac.automacao.core.AbstractCenario;
import br.gov.mctic.sisgesac.automacao.pageobject.CadastroInstituicaoResponsavelPage;

public class CadastroInstituicaoResponsavelCenario extends AbstractCenario {

    @Test
    public void cadastrarInstituicaoResponsavel() throws AWTException {
    	acessarMenu("Articulação", "Instituição Responsável");
        acessarFuncionalidade("Cadastrar");	
        Em(CadastroInstituicaoResponsavelPage.class).informarCpnj("59573030000130");
        Em(CadastroInstituicaoResponsavelPage.class).informarNumProcesso("26555");
        Em(CadastroInstituicaoResponsavelPage.class).preencherCampoData("dataPublicacaoDOU", "30082018");
        Em(CadastroInstituicaoResponsavelPage.class).preencherCampoData("dateTermoCooperacao", "30082018");
        Em(CadastroInstituicaoResponsavelPage.class).mesmoEndereco();
        Em(CadastroInstituicaoResponsavelPage.class).informarCPF("70033574103");
        Em(CadastroInstituicaoResponsavelPage.class).informarCargo("Testadora de Software");
        Em(CadastroInstituicaoResponsavelPage.class).campoEmail("debora.barbosa@mctic.gov.br");
        Em(CadastroInstituicaoResponsavelPage.class).informarTelefone("61991032835");
        Em(CadastroInstituicaoResponsavelPage.class).preencherCampoData("dataIncio", "30082018");
        solicitarProximo();
        Em(CadastroInstituicaoResponsavelPage.class).informarCPFContato("70033574103");
        Em(CadastroInstituicaoResponsavelPage.class).informarCargoContato("Testadora de Software");
        Em(CadastroInstituicaoResponsavelPage.class).campoEmailContato("debora.barbosa@mctic.gov.br");
        Em(CadastroInstituicaoResponsavelPage.class).informarTelefoneContato("61991032835");
//        Em(CadastroInstituicaoResponsavelPage.class).situacaoAtivo();
        botaoAdicionar();
        aguardarCarregamento();
        Em(CadastroInstituicaoResponsavelPage.class).botaoSalvar();
        exibeMensagem("Cadastro realizado com sucesso!");
        
    }
    
    @Test
    public void ConsultarInstituicaoCadastrada()throws AWTException {
    	Em(CadastroInstituicaoResponsavelPage.class).validarInstituicaoResponsavel("Fundacao Itau Social");
    }

}
