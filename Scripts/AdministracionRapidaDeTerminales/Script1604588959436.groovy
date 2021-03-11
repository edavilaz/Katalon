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

WebUI.setText(findTestObject('Object Repository/AdministracionRapidaDeTerminales/Page_Autenticacin Digiturno 5/input__ctl00cPHPritxtUsuario'), 
    'ciel')

WebUI.setEncryptedText(findTestObject('Object Repository/AdministracionRapidaDeTerminales/Page_Autenticacin Digiturno 5/input__ctl00cPHPritxtClave'), 
    'HLC/kl1cJBvGH0sbr8u0hg==')

WebUI.click(findTestObject('Object Repository/AdministracionRapidaDeTerminales/Page_Autenticacin Digiturno 5/input_Aplicacin_ctl00cPHPribtnIniciarSesion'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AdministracionRapidaDeTerminales/Page_Inicio Digiturno 5/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AdministracionRapidaDeTerminales/Page_Configuracin Digiturno 5/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AdministracionRapidaDeTerminales/Page_Modelo de atencin Digiturno 5/img'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/AdministracionRapidaDeTerminales/Page_Administracin rpida de terminales Digiturno 5/select_Seleccione grupo...Grupo InformacinG_56f3aa'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/AdministracionRapidaDeTerminales/Page_Administracin rpida de terminales Digiturno 5/a_select'))

WebUI.click(findTestObject('Object Repository/AdministracionRapidaDeTerminales/Page_Administracin rpida de terminales Digiturno 5/input_1 A01_rcbCheckBox'))

WebUI.setText(findTestObject('Object Repository/AdministracionRapidaDeTerminales/Page_Administracin rpida de terminales Digiturno 5/input_Terminal_ctl00cPHPriddlTerminales'), 
    '[1] A01')

WebUI.click(findTestObject('Object Repository/AdministracionRapidaDeTerminales/Page_Administracin rpida de terminales Digiturno 5/a_select_1'))

WebUI.click(findTestObject('Object Repository/AdministracionRapidaDeTerminales/Page_Administracin rpida de terminales Digiturno 5/input_1 A01_rcbCheckBox'))

WebUI.setText(findTestObject('Object Repository/AdministracionRapidaDeTerminales/Page_Administracin rpida de terminales Digiturno 5/input_Cola_ctl00cPHPriddlColas'), 
    '[8] 4 - Area General - Preferencial (P) - Informacion')

WebUI.click(findTestObject('Object Repository/AdministracionRapidaDeTerminales/Page_Administracin rpida de terminales Digiturno 5/input_select_ctl00cPHPribtnCargarTabla'))

WebUI.click(findTestObject('Object Repository/AdministracionRapidaDeTerminales/Page_Administracin rpida de terminales Digiturno 5/input_Jornada_ctl00cPHPribtnAplica'))

