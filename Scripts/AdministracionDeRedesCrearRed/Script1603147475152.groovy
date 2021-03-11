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

WebUI.callTestCase(findTestCase('Inicio'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/AdministracionDeRedesCrearRed/Page_Inicio Digiturno 5/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AdministracionDeRedesCrearRed/Page_Configuracin Digiturno 5/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AdministracionDeRedesCrearRed/Page_Elementos del sistema Digiturno 5/img'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/AdministracionDeRedesCrearRed/Page_Administracin Redes Digiturno 5/input_Nombre _ctl00cPHPrictl00TabAdministra_de162e'), 
    'ARL BOGOTA')

WebUI.setText(findTestObject('Object Repository/AdministracionDeRedesCrearRed/Page_Administracin Redes Digiturno 5/textarea_Descripcin _ctl00cPHPrictl00TabAdm_03357e'), 
    'ARL BOGOTA')

WebUI.click(findTestObject('Object Repository/AdministracionDeRedesCrearRed/Page_Administracin Redes Digiturno 5/img_Edicin Administrador Recursos Locales_c_e29987'))

