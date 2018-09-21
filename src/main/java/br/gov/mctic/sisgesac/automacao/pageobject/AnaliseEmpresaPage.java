package br.gov.mctic.sisgesac.automacao.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.gov.mctic.sisgesac.automacao.core.AbstractPageObject;

public class AnaliseEmpresaPage extends AbstractPageObject {

    @FindBy(xpath = "//span[text()='Exportar PDF']")
    private WebElement botaoExportarPDF;

    public void exportarPDF() {
        botaoExportarPDF.click();
    }

}
