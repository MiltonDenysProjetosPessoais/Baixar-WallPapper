package funcionalidadeTeste

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.webui.driver.DriverFactory
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
import internal.GlobalVariable
import io.cucumber.datatable.DataTable
import javax.servlet.http.HttpServletRequest
import org.openqa.selenium.WebDriver
import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.remote.SessionId

public class WallpapperFuncionalidades extends AutoComandos{




	public static selecionaCategoria(){

		try{
			String xpath = "/html/body/div[1]/div[1]/div[4]"
			String tag ="a"
			selecionaListaDeElementos(xpath,tag)

			for(int i = 0;i<listOfElements.size();i++){
				if(listOfElements[i].getText().contains(issue_info.get(0).get("Categorias"))){
					listOfElements[i].click()
					break
				}
			}
		}catch(Exception e){

			println 'Falha ao tentar selecionar ' + issue_info.get(0).get("Categorias")
		}
		finally{
			println issue_info.get(0).get("Categorias")
		}
	}


	public static clicarImg(){
		pegarUrl()
	}

	public static String pegarUrl() {
		WebDriver driver = DriverFactory.getWebDriver()
		String url = driver.getCurrentUrl()

		println url

		return url
	}

	public static abrirPaginaWallPaper(DataTable data){
		issue_info =  data.asMaps(String.class, String.class);
		def ct = issue_info.get(0).get("CT");
		try{
			commands.Login.homePage(retornaURL(url));
		} catch (Exception e ){
			finalizar();
		}
	}



	/**
	 * @author T_DCDias
	 * Fecha a instância do Selenium WebDriver e todas os navegadores associados.
	 * @return
	 */
	public static finalizar(){
		WebUI.delay(2);
		try{
			WebDriver driver = DriverFactory.getWebDriver()
			SessionId session = ((RemoteWebDriver)driver).getSessionId();

			if( session.toString()!=null){
				WebUI.delay(5)
				WebUI.closeBrowser()
				driver.quit()
			}
		} catch (Exception e){
			WebUI.closeBrowser()

			System.err.println("-[Aplicação finalizada]-")
		}
	}
}
