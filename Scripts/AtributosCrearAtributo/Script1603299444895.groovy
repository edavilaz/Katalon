import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8810/WebLogin.aspx?ReturnUrl=%2f')

WebUI.setText(findTestObject('Object Repository/AtributosCrearAtributo/Page_Autenticacin Digiturno 5/input__ctl00cPHPritxtUsuario'), 
    'ciel')

WebUI.setEncryptedText(findTestObject('Object Repository/AtributosCrearAtributo/Page_Autenticacin Digiturno 5/input__ctl00cPHPritxtClave'), 
    'HLC/kl1cJBvGH0sbr8u0hg==')

WebUI.click(findTestObject('Object Repository/AtributosCrearAtributo/Page_Autenticacin Digiturno 5/input_Aplicacin_ctl00cPHPribtnIniciarSesion'))

WebUI.click(findTestObject('Object Repository/AtributosCrearAtributo/Page_Inicio Digiturno 5/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AtributosCrearAtributo/Page_Configuracin Digiturno 5/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AtributosCrearAtributo/Page_Seguridad Digiturno 5/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AtributosCrearAtributo/Page_Usuarios Digiturno 5/img'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/AtributosCrearAtributo/Page_Atributos Digiturno 5/input_Nombre_ctl00cPHPritxtNivelNombre'), 
    'Alias1')

WebUI.setText(findTestObject('Object Repository/AtributosCrearAtributo/Page_Atributos Digiturno 5/textarea_Descripcin_ctl00cPHPritxtNivelDescripcion'), 
    'Se puede insertar un alias')

WebUI.click(findTestObject('Object Repository/AtributosCrearAtributo/Page_Atributos Digiturno 5/img_Edicin de nivel_cPHPri_ucMenuEdicionNiv_ef2c0d'))

WebUI.delay(3)

