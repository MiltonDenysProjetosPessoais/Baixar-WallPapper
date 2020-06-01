package funcionalidadeTeste

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import commands.AutoComandos
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable
import io.cucumber.datatable.DataTable

public class CepCorreioFuncionalidade extends AutoComandos{

	public static abrirPaginaCorreiosSalvarEvidencia(DataTable data){
		issue_info =  data.asMaps(String.class, String.class);
		def ct = issue_info.get(0).get("CT");
		criaDocumentoPDF(ct);
		try{
			commands.Login.homePage(retornaURL(url));
			salvarEvidencia(ct," Sucesso ao executar o teste", "PASSED" );
		} catch (Exception e ){
			salvarEvidencia(ct," Falha ao executar o teste", "FAIL" );
			finalizar();
		}
	}
	public static criaDocumentoPDF(String ct){
		createDiretory(createDiretorypath+issue_info.get(0).get("topico"));
		createDocument(ct, pathEvidences+issue_info.get(0).get("topico"));
		createTitlePage();
	}
	public static escreverCamposInputId(String id, String value){
		try{
			WebDriver driver = DriverFactory.getWebDriver()
			WebElement Element = driver.findElement(By.id(id));
			Element.sendKeys(value)
		} catch (Exception e) {
			salvarEvidencia(issue_info.get(0).get("CT"),"Não foi possível escrever no campos Input","FAIL")
			finalizar()
		}
	}
}
