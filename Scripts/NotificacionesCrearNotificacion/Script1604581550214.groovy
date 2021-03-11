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

WebUI.click(findTestObject('Object Repository/NotificacionesCrearNotificacion/Page_Inicio Digiturno 5/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/NotificacionesCrearNotificacion/Page_Configuracin Digiturno 5/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/NotificacionesCrearNotificacion/Page_Notificaciones Digiturno 5/span_Notificaciones'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/NotificacionesCrearNotificacion/Page_Notificaciones Digiturno 5/input_Nombre notificacin_ctl00cPHPriTabCont_77ce95'), 
    'turno')

WebUI.setText(findTestObject('Object Repository/NotificacionesCrearNotificacion/Page_Notificaciones Digiturno 5/input_Descripcin notificaciones_ctl00cPHPri_3e2263'), 
    'Para indicar un turno')

WebUI.click(findTestObject('Object Repository/NotificacionesCrearNotificacion/Page_Notificaciones Digiturno 5/img_Notificaciones_cPHPri_TabContainer1_Tab_0f36ee'))

WebUI.delay(2)

