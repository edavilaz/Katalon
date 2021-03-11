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

WebUI.click(findTestObject('Object Repository/SistemasAlarmas/Page_Inicio Digiturno 5/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/SistemasAlarmas/Page_Configuracin Digiturno 5/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/SistemasAlarmas/Page_Sistema Digiturno 5/img'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/SistemasAlarmas/Page_Pginas Digiturno 5/input__ctl00cPHPriTablaHerramientas1txtText_5dd6d2'), 
    '36')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/SistemasAlarmas/Page_Pginas Digiturno 5/input_imgiconosSeccionesAlarma_2.png_ctl00c_466858'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/SistemasAlarmas/Page_Pginas Digiturno 5/input__ctl00cPHPrigvMenuctl22chkEsVisible'))

WebUI.click(findTestObject('Object Repository/SistemasAlarmas/Page_Pginas Digiturno 5/input_imgiconosSeccionesAlarma_2.png_ctl00c_d650e9'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/SistemasAlarmas/Page_Pginas Digiturno 5/img_(BD 1.0.60) - SqlServer - Digiturno5_ImageLogo'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/SistemasAlarmas/Page_Inicio Digiturno 5/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/SistemasAlarmas/Page_Configuracin Digiturno 5/img_1'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/SistemasAlarmas/Page_Alarmas Digiturno 5/select_TerminalSelectorUsuarioMovilCorreoTablero'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/SistemasAlarmas/Page_Alarmas Digiturno 5/select_Excede tiempo mximo de esperaExcede _888abd'), 
    '5', true)

WebUI.click(findTestObject('Object Repository/SistemasAlarmas/Page_Alarmas Digiturno 5/img_Tipo de Alarmas_cPHPri_MenuTipoAlarmas__3758fa'))

WebUI.delay(3)

