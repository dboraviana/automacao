package br.gov.mctic.sisgesac.automacao.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import br.gov.mctic.sisgesac.automacao.core.AbstractPageObject;
import br.gov.mctic.sisgesac.automacao.core.WDS;


public class IncluirDeclaracaoPage extends AbstractPageObject {
	
	// Identificação
	@FindBy(name = "cnpj")
	private WebElement campoCnpj;	
	
	// Endereço da Unidade de produção
	@FindBy(name = "enderecoUnidadeProducao")
	private WebElement campoEnderecoUnidadeProducao;
	
	@FindBy(name = "cidadeUnidadeProducao")
	private WebElement campoCidadeUnidadeProducao;
	
	@FindBy(name = "uf-unidade-producao")
	private WebElement campoUfUnidadeProducao;	
	
	@FindBy(id = "::input-cep-unidade-producao")
	private WebElement campoCepUnidadeProducao;
	
	@FindBy(name = "telefone-unidade-producao")
	private WebElement campoTelefoneUnidadeProducao;
	
	@FindBy(name = "fax-unidade-producao")
	private WebElement campoFaxUnidadeProducao;
	
	
	// Identificação da matriz/controladora/proprietário
	@FindBy(name = "nomeMatriz")
	private WebElement campoNomeMatriz;
	
	@FindBy(name = "enderecoMatriz")
	private WebElement campoEnderecoMatriz;
	
	@FindBy(name = "cidadeMatriz")
	private WebElement campoCidadeMatriz;
	
	@FindBy(name = "uf-matriz")
	private WebElement campoUfMatriz;
	
	@FindBy(id = "::input-cep-matriz")
	private WebElement campoCepMatriz;
	
	@FindBy(name = "telefone-matriz")
	private WebElement campoTelefoneMatriz;
	
	@FindBy(name = "fax-matriz")
	private WebElement campoFaxMatriz;
	
	
	// Responsável pelo preenchimento deste Formulário
	@FindBy(name = "nome-responsavel")
	private WebElement campoNomeResponsavel;
	
	@FindBy(name = "cargo-responsavel")
	private WebElement campoCargoResponsavel;
	
	@FindBy(name = "email-responsavel")
	private WebElement campoEmailResponsavel;
	
	@FindBy(name = "rg-responsavel")
	private WebElement campoRgResponsavel;
	
	@FindBy(name = "orgao-emissor-responsavel")
	private WebElement campoOrgaoEmissorResponsavel;
	
	@FindBy(name = "telefone-responsavel")
	private WebElement campoTelefoneResponsavel;
	
	@FindBy(name = "fax-responsavel")
	private WebElement campoFaxResponsavel;
	
	
	// Pessoa de contato na unidade de produçãp
	@FindBy(name = "nome-contato")
	private WebElement campoNomeContato;
	
	@FindBy(name = "cargo-contato")
	private WebElement campoCargoContato;
	
	@FindBy(name = "email-contato")
	private WebElement campoEmailContato;
	
	@FindBy(name = "rg-contato")
	private WebElement campoRgContato;
	
	@FindBy(name = "orgao-emissor-contato")
	private WebElement campoOrgaoEmissorContato;
	
	@FindBy(name = "telefone-contato")
	private WebElement campoTelefoneContato;
	
	@FindBy(name = "fax-contato")
	private WebElement campoFaxContato;
	
	
	// Observação
	@FindBy(name = "observacao")
	private WebElement campoObservacao;
	
	// Cadastro de plantas	
	@FindBy(name = "identificacao-planta")
	private WebElement campoIdentificacaoPlanta;
	
	
	@FindBy(name = "configuracao")
	private WebElement campoConfiguracao;
	
	@FindBy(name = "tipos-plantas")
	private WebElement campoTiposPlantas;
	
	@FindBy(name = "capacidade-nominal")
	private WebElement campoCapacidadeNominal;	
	
	@FindBy(name = "localizacao-planta")
	private WebElement campolocalizacaoPlanta;
	
	@FindBy(xpath = "//md-dialog[@aria-label='Lucky day']//button[text()='Sim']")
	private WebElement botaoConfirmarRemocao;
	
	
	@FindBy(name = "substancia")
	private WebElement campoMaterialQuimicoUnidadeProducao;
	
	@FindBy(name = "numeroCas")
	private WebElement campoNumeroCasUnidadeProducao;
	
	@FindBy(xpath = "//span[contains(text(),'Produção')]")
	private List<WebElement> checkboxesProducao;
	
	@FindBy(xpath = "//span[contains(text(),'Consumo')]")
	private List<WebElement> checkboxesConsumo;
	
	@FindBy(xpath = "//input[@type='search'][@name='substancia']")
	private WebElement campoMaterialQuimicoTabela2;
	
	@FindBy(xpath = "//span[contains(text(),'Processamento')]")
	private WebElement checkboxProcessamento;
	
	@FindBy(xpath = "//span[contains(text(),'Importação')]")
	private WebElement checkboxImportacao;	
	
	@FindBy(xpath = "//span[contains(text(),'Exportação')]")
	private WebElement checkboxExportacao;
	
	@FindBy(xpath = "//span[contains(text(),'Compra no mercado interno')]")
	private WebElement checkboxCompraNoMercadoInterno;	
	
	@FindBy(xpath = "//span[contains(text(),'Venda ou Transferência')]")
	private WebElement checkboxVendaOuTransferencia;		
		
		
	@FindBy(xpath = "//tr[@md-row='']")
	private List<WebElement> linhaMaterialQuimico;
	
	@FindBy(xpath = "//span[@ng-show='!item.listaNomePaises']")
	private WebElement campoAdicionarPaises;	
	
	@FindBy(xpath = "//span[.='Enviar para Análise']")
	private WebElement botaoEnviarParaAnalise;		
	
	// METODOS		
	// Identificação
	public void informarCNPJ(String cnpj) {
		campoCnpj.sendKeys(cnpj);
		campoCnpj.sendKeys(Keys.TAB);		
	}	
	
	
	// Endereço da Unidade de produção
	public void informarEnderecoUnidadeProducao(String endereco) {
		campoEnderecoUnidadeProducao.sendKeys(endereco);
	}

	public void informarCidadeUnidadeProducao(String cidade) {
		campoCidadeUnidadeProducao.sendKeys(cidade);		
	}

	public void selecionarUfUnidadeProducao(String uf) {
		campoUfUnidadeProducao.click();
		WDS.get().findElement(By.xpath(
				"//div[@class='md-select-menu-container md-active md-clickable']//md-option[@ng-if='$ctrl.opcoes']/div[.='" + uf +"']"))
		.click();
		
	}

	public void informarCepUnidadeProducao(String cep) {
		WDS.delay(500);
		campoCepUnidadeProducao.sendKeys(cep);	
	}

	public void informarTelefoneUnidadeProducao(String telefone) {
		campoTelefoneUnidadeProducao.sendKeys(telefone);	
	}

	public void informarFaxUnidadeProducao(String fax) {
		campoFaxUnidadeProducao.sendKeys(fax);		
	}
	
	
	// Identificação da matriz/controladora/proprietário
	public void informarNomeMatriz(String nome) {
		campoNomeMatriz.sendKeys(nome);		
	}

	public void informarEnderecoMatriz(String endereco) {
		campoEnderecoMatriz.sendKeys(endereco);		
	}

	public void informarCidadeMatriz(String cidade) {
		campoCidadeMatriz.sendKeys(cidade);		
	}

	public void selecionarUfMatriz(String uf) {
		campoUfMatriz.click();
		WDS.get().findElement(By.xpath(
				"//div[@class='md-select-menu-container md-active md-clickable']//md-option[@ng-if='$ctrl.opcoes']/div[.='" + uf +"']"))
		.click();		
	}

	public void informarCepMatriz(String cep) {
		WDS.delay(500);
		campoCepMatriz.sendKeys(cep);
	}

	public void informarTelefoneMatriz(String telefone) {
		campoTelefoneMatriz.sendKeys(telefone);		
	}

	public void informarFaxMatriz(String fax) {
		campoFaxMatriz.sendKeys(fax);		
	}
	
	
	// Responsável pelo preenchimento deste Formulário
	public void informarNomeResponsavel(String nome) {
		campoNomeResponsavel.sendKeys(nome);		
	}

	public void informarCargoResponsavel(String cargo) {
		campoCargoResponsavel.sendKeys(cargo);		
	}

	public void informarEmailResponsavel(String email) {
		campoEmailResponsavel.sendKeys(email);		
	}

	public void informarRgResponsavel(String rg) {
		campoRgResponsavel.sendKeys(rg);		
	}

	public void informarOrgaoEmissorResponsavel(String orgaoEmissor) {
		campoOrgaoEmissorResponsavel.sendKeys(orgaoEmissor);		
	}

	public void informarTelefoneResponsavel(String telefone) {
		campoTelefoneResponsavel.sendKeys(telefone);	
	}

	public void informarFaxResponsavel(String fax) {
		campoFaxResponsavel.sendKeys(fax);		
	}
	
	
	// Pessoa de contato na unidade de produçãp
	public void informarNomeContato(String nome) {
		campoNomeContato.sendKeys(nome);		
	}

	public void informarCargoContato(String cargo) {
		campoCargoContato.sendKeys(cargo);		
	}

	public void informarEmailContato(String email) {
		campoEmailContato.sendKeys(email);		
	}

	public void informarRGContato(String rg) {
		campoRgContato.sendKeys(rg);		
	}

	public void informarOrgaoEmissorContato(String orgaoEmissor) {
		campoOrgaoEmissorContato.sendKeys(orgaoEmissor);		
	}

	public void informarTelefoneContato(String telefone) {
		campoTelefoneContato.sendKeys(telefone);		
	}

	public void informarFaxContato(String fax) {
		campoFaxContato.sendKeys(fax);		
	}	

	
	// Observação
	public void informarObservacao(String observacao) {
		campoObservacao.sendKeys(observacao);
		
	}	
	
	@Override
	public void solicitarSalvar() {
		super.solicitarSalvar();
	}
	
	@Override
	public void exibeMensagem(String mensagemEsperada) {
		super.exibeMensagem(mensagemEsperada);
	}	
	
	@Override
	public void solicitarProximo() {
		super.solicitarProximo();
	}

	// Cadastro de Plantas
	public void informarIdentificacaoPlanta(String identificacaoPlanta) {
		campoIdentificacaoPlanta.sendKeys(identificacaoPlanta);		
	}


	public void informarConfiguracao(String configuracaoPlanta) {
		campoConfiguracao.click();
		WDS.delay(500);
		WDS.get().findElement(By.xpath("//md-option[@ng-if='$ctrl.opcoes']//div[.='" + configuracaoPlanta +"']")).click();
	}


	public void informarTipoPlantas(String tipoPlantas, String CapacidadeProducao) {
		campoTiposPlantas.click();				
		WDS.delay(500);
		WDS.get().findElement(By.xpath("//md-option[@ng-if='$ctrl.opcoes']//div[.='" + tipoPlantas +"']")).click();
		WebElement iconeInformacao = WDS.get().findElement(By.xpath("//i[.='info']"));
		new Actions(WDS.get()).moveToElement(iconeInformacao).click().build().perform();		
		WDS.delay(1000);
		if(tipoPlantas=="Tabela 2") {
			// Campo capacidade de produção
			WDS.get().findElement(By.xpath("//div[text()='" + CapacidadeProducao + "']/../div[@md-ink-ripple-checkbox='']")).click();
		}
	}


	public void informarCapacidadeNominalPlanta(String capacidadeNominalPlanta) {
		campoCapacidadeNominal.sendKeys(capacidadeNominalPlanta);		
	}


	public void informarLocalizaçãoPlanta(String localizaçãoPlanta) {
		campolocalizacaoPlanta.sendKeys(localizaçãoPlanta);	
	}
	
//
//	@Override
//	public void solicitarAdicionar() {
//		super.solicitarAdicionar();
//	}


	public void solicitarRemover(String identificacaoPlanta) {
		WDS.get().findElement(By.xpath("//tr//span[text()='" + identificacaoPlanta + "']/../../td[5]")).click();
		WDS.delay(500);
		WDS.get().findElement(By.xpath(
				"//div[@class='_md md-open-menu-container md-whiteframe-z2 md-active md-clickable']//md-menu-content/md-menu-item/button"))
		.click();
	}
	
	
	public void solicitarConfirmarRemocao() {
		WDS.delay(1000);
		botaoConfirmarRemocao.click();
	}


	public void informarMaterialQuimico(String materialQuimico) {
		campoMaterialQuimicoUnidadeProducao.sendKeys(materialQuimico);		
	}


	public void informarNumeroCas(String numeroCas) {
		campoNumeroCasUnidadeProducao.sendKeys(numeroCas);		
	}


	public void solicitarProducao() {
		WDS.delay(500);
		for (WebElement checkboxProducao : checkboxesProducao) {
			if (checkboxProducao.isDisplayed()) {
				checkboxProducao.click();	
				break;
			}
		}	
	}


	public void solicitarConsumo() {
		WDS.delay(500);
		for (WebElement checkboxConsumo : checkboxesConsumo) {
			if (checkboxConsumo.isDisplayed()) {
				checkboxConsumo.click();	
				break;
			}
		}	
	}


	public void solicitarAdicionarQuantidade(String nomeMaterialQuimico, String quantidade) {
		WDS.delay(500);
		for (WebElement botaoAdicionarQuantidade : linhaMaterialQuimico) {
			if (botaoAdicionarQuantidade.isDisplayed()) {
				botaoAdicionarQuantidade.findElement(By.xpath(
						"//tr[@md-row='']/td[.='" + nomeMaterialQuimico + "']/..//td[text()='Adicione']"))
				.click();
				WDS.get().findElement(By.xpath("//input[@placeholder='Adicione ']")).sendKeys(quantidade, Keys.ENTER);	
				break;
			}
		}		
	}


	public void selecionarAdicionarTipoProcesso(String nomeMaterialQuimico, String tipoProcesso) {
		WDS.delay(500);
		for (WebElement botaoAdicionarTipoProcesso : linhaMaterialQuimico) {
			if (botaoAdicionarTipoProcesso.isDisplayed()) {
				botaoAdicionarTipoProcesso.findElement(By.xpath(
						"//tr[@md-row='']/td[.='" + nomeMaterialQuimico + "']/..//md-select[@ng-model='item.tipoProcesso.id']"))
				.click();
				WDS.get().findElement(By.xpath(
						"//div[@class='md-select-menu-container md-table-select md-active md-clickable']//div[.='" + tipoProcesso +"']"))
				.click();
				break;
			}
		}	
					
	}


	public void selecionarAdicionarIdPlanta(String nomeMaterialQuimico, String idPlanta) {
		WDS.delay(500);
		for (WebElement botaoAdicionarIdPlanta : linhaMaterialQuimico) {
			if (botaoAdicionarIdPlanta.isDisplayed()) {
				botaoAdicionarIdPlanta.findElement(By.xpath(
						"//tr[@md-row='']/td[.='" + nomeMaterialQuimico + "']/..//md-select[@ng-model='item.idPlanta']"))
				.click();
				WDS.get().findElement(By.xpath(
						"//div[@class='md-select-menu-container md-table-select md-active md-clickable']//div[.='" + idPlanta + "']"))
				.click();
				break;
			}
		}					
	}


	public void selecionarAdicionarCodPaq(String nomeMaterialQuimico, String codCpaq) {
		WDS.delay(500);
		for (WebElement botaoAdicionarCodPaq : linhaMaterialQuimico) {
			if (botaoAdicionarCodPaq.isDisplayed()) {
				botaoAdicionarCodPaq.findElement(By.xpath(
						"//tr[@md-row='']/td[.='" + nomeMaterialQuimico + "']/..//md-select[@ng-model='item.cpaq.id']"))
				.click();
				WDS.delay(500);
				WDS.get().findElement(By.xpath(
						"//div[@class='md-select-menu-container md-table-select md-active md-clickable']//div[.='" + codCpaq + "']"))
				.click();
				break;
			}
		}
	}
	
	public void solicitarAdicionarFinalidade(String nomeMaterialQuimico, String finalidade) {
		WDS.delay(500);
		for (WebElement botaoAdicionarFinalidade : linhaMaterialQuimico) {
			if (botaoAdicionarFinalidade.isDisplayed()) {
				botaoAdicionarFinalidade.findElement(By.xpath(
						"//tr[@md-row='']/td[.='" + nomeMaterialQuimico + "']/..//md-select[@ng-model='item.tipoFinalidade.id']"))
				.click();
				WDS.delay(500);
				WDS.get().findElement(By.xpath(
						"//div[@class='md-select-menu-container md-table-select md-active md-clickable']//div[.='" + finalidade + "']"))
				.click();
				break;
			}
		}
	}


	public void solicitarRemoverAtividade(String nomeMaterialQuimico) {
		WDS.delay(500);
		for (WebElement botaoRemoverAtividade : linhaMaterialQuimico) {
			if (botaoRemoverAtividade.isDisplayed()) {
				botaoRemoverAtividade.findElement(By.xpath(
						"//tr[@md-row='']/td[.='"  + nomeMaterialQuimico +  "']/..//button[@name='remover']"))
				.click();
				break;
			}
		}
	}
	
	public void solicitarTabela2() {
		WebElement tabela2 = WDS.get().findElement(By.xpath("//md-tab-item[text()='Sub. Química de Tabela 2']"));
		new Actions(WDS.get()).moveToElement(tabela2).click().build().perform();
	}


	public void informarMaterialQuimicoTab2(String materialQuimico) {
		campoMaterialQuimicoTabela2.sendKeys(materialQuimico);
		WDS.delay(1000);
		WDS.get().findElement(By.xpath("//span[.='2(4.144) Sal sódico do metilfosfonotiolato de O-metila ']")).click();
	}


	public void solicitarProcessamento() {
		checkboxProcessamento.click();		
	}


	public void solicitarImportacao() {
		checkboxImportacao.click();		
	}


	public void solicitarCompraMercadoInterno() {
		checkboxCompraNoMercadoInterno.click();
	}


	public void solicitarVendaOuTransferencia() {
		checkboxVendaOuTransferencia.click();		
	}	
	
	public void solicitarAdicionarPaises(String quantidade) {
		campoAdicionarPaises.click();	
		WDS.get().findElement(By.name("quantidade")).sendKeys(quantidade);
		WDS.get().findElement(By.xpath("//button[text()='Concluir ']")).click();
	}


	public void solicitarEnviarParaAnalise() {
		WDS.delay(500);
		botaoEnviarParaAnalise.click();
		
	}
	

}