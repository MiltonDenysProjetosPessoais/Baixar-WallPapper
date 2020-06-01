package pacote.test
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import io.cucumber.datatable.DataTable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By.ByXPath

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When




class CepCorreios{

	@Given("estou na pagina principal dos correios")
	def abrirPaginaCorreiosSalvarEvidencia(DataTable data) {
		funcionalidadeTeste.CepCorreioFuncionalidade.abrirPaginaCorreiosSalvarEvidencia(data)
	}

	@When("preencho o campo com um 'cep' valido")
	def preencherCampoCep() {
		funcionalidadeTeste.CepCorreioFuncionalidade.escreverCamposInputId("acesso-busca", "06210070")
	}

	@And("clico no botao de pesquisa")
	def clicarCampoPesquisa() {
		commands.AutoComandos.commandCLICK("//*[@id='conteudo-inicial']/div/div[2]/div/form[2]/div[2]/button")
	}

	@Then("um novo browser é aberto com a resposta")
	def validarRespostaCorretaNovoBrowser() {
		commands.AutoComandos.retornaValorDeElementoDaTelaDeNovaJanela("/html/body/div[1]/div[3]/div[2]/div/div/div[2]/div[2]/div[2]/table/tbody/tr[2]/td[1]", 1)
		
	}

	@And("browser finaliza")
	def finalizarBrowser() {
		commands.AutoComandos.finalizar()
	}
}

