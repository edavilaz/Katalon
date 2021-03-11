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

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/NotificacionesCrearDestinos/Page_Inicio Digiturno 5/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/NotificacionesCrearDestinos/Page_Configuracin Digiturno 5/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/NotificacionesCrearDestinos/Page_Notificaciones Digiturno 5/span_Destinos'))

WebUI.click(findTestObject('Object Repository/NotificacionesCrearDestinos/Page_Notificaciones Digiturno 5/a_select'))

WebUI.click(findTestObject('Object Repository/NotificacionesCrearDestinos/Page_Notificaciones Digiturno 5/input_Bogota - CIEL_rcbCheckBox'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/NotificacionesCrearDestinos/Page_Notificaciones Digiturno 5/input_Oficina_ctl00cPHPriTabContainer1TabPa_30b429'), 
    'Bogota - CIEL')

WebUI.executeJavaScript('return document.getElementById(\'form1\').click()', [])

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/NotificacionesCrearDestinos/Page_Notificaciones Digiturno 5/input_Nombre configuracin destino_ctl00cPHP_ce4d0b'), 
    'pendiente2')

WebUI.click(findTestObject('Object Repository/NotificacionesCrearDestinos/Page_Notificaciones Digiturno 5/input_Llamado terminal_ctl00cPHPriTabContai_2f9c81'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/NotificacionesCrearDestinos/Page_Notificaciones Digiturno 5/input_nueva1_ctl00cPHPriTabContainer1TabPan_361ff6'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/NotificacionesCrearDestinos/Page_Notificaciones Digiturno 5/img_Configuracin destinos_cPHPri_TabContain_1ea7b0'))

WebUI.delay(2)

