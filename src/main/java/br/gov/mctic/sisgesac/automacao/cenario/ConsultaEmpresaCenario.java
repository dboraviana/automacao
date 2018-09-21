package br.gov.mctic.sisgesac.automacao.cenario;

import org.junit.Test;

import br.gov.mctic.sisgesac.automacao.core.AbstractCenario;

public class ConsultaEmpresaCenario extends AbstractCenario {

    @Test
    public void acessarConsultaEmpresas() {
        acessarMenu("Empresa", "Consultar");
    }
}
