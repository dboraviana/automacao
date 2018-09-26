package br.gov.mctic.sisgesac.automacao.core;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AbstractPageObject {


    @FindBy(xpath="//div[@class='toast-message']")
    private WebElement campoMensagem;
    
    protected void exibeMensagem(String mensagemEsperada) {
    	WDS.delay(500);
        Assert.assertEquals(mensagemEsperada, campoMensagem.getText());
        System.out.println(campoMensagem.getText());
    }
	
    public void solicitarProximo() {
    	List<WebElement> botoesProximo = WDS.get().findElements(By.xpath("//span[text()='Próximo']"));
    	
    	WDS.delay(500);

    	for (WebElement botaoProximo : botoesProximo) {
    		if(botaoProximo.isDisplayed()) {
    			botaoProximo.click();
    			break;
    		}
    	}
				
	}
    
    
    public void solicitarAdicionar() {
    	List<WebElement> botoesAdicionar = WDS.get().findElements(By.xpath("//ngc-cartao-acoes//button[text()='Adicionar']"));
    	
    	WDS.delay(500);

    	for (WebElement botaoAdicionar : botoesAdicionar) {
    		if(botaoAdicionar.isDisplayed()) {
    			botaoAdicionar.click();
    			break;
    		}
    	}
			WDS.delay(500);	
	}
    
    
	@FindBy(xpath = "//button[@ng-click=\"vm.salvar()\"]")
	public List<WebElement> botoesSalvar;
    
    protected void solicitarSalvar() {
		WDS.delay(500);
		for (WebElement botaoSalvar : botoesSalvar) {
			if (botaoSalvar.isDisplayed()) {
				botaoSalvar.click();
				break;
			}
		}
	}
    
    
        
    
    @FindBy(xpath = "//span[.='Exportar Excel']")
	private WebElement botaoExportarExcel;	
    
    protected void solicitarExportarExcel() {
		botaoExportarExcel.click();		
	}	
    
    @FindBy(xpath = "//span[.='Exportar PDF']")
	private WebElement botaoExportarPdf;
	
	
	
    protected void solicitarExportarPDF() {
		botaoExportarPdf.click();		
	}	
    
    public void acessarFuncionalidade(String funcionalidade) {
		 WebElement botao = WDS.get().findElement(By.xpath("//ngc-botao//button[@aria-label='"+funcionalidade+"']"));
		 botao.click();
	}
    
    public void esc() throws AWTException {

    	Robot r = new Robot();
    	r.keyPress(KeyEvent.VK_ESCAPE);
    	r.keyRelease(KeyEvent.VK_ESCAPE);
	}
}
