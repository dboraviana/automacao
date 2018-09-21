package br.gov.mctic.sisgesac.automacao.cenario;

import org.junit.Test;

import br.gov.mctic.sisgesac.automacao.core.AbstractCenario;
import br.gov.mctic.sisgesac.automacao.pageobject.AnaliseEmpresaPage;

public class AnaliseEmpresaCenario extends AbstractCenario {

    @Test
    public void acessarAnaliseEmpresa() {
        acessarMenu("Empresa", "Analisar");
        Em(AnaliseEmpresaPage.class).exportarPDF();
    }
}
