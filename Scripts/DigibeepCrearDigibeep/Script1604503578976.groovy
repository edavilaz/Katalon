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

WebUI.click(findTestObject('Object Repository/DigibeepCrearDigibeep/Page_Inicio Digiturno 5/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/DigibeepCrearDigibeep/Page_Configuracin Digiturno 5/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/DigibeepCrearDigibeep/Page_Elementos del sistema Digiturno 5/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/DigibeepCrearDigibeep/Page_Administracin DigiBeep Digiturno 5/input_WorkFlow - Oficina WorkFlow_ctl00cPHP_7d7c39'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/DigibeepCrearDigibeep/Page_Administracin DigiBeep Digiturno 5/a_Seleccionar'))

WebUI.delay(3)

WebUI.setText(findTestObject('DigibeepCrearDigibeep/Page_Administracin DigiBeep Digiturno 5/input_Nombre_ctl00cPHPriTabContainer1TabEdi_dc04d6'), 
    'digi1')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/DigibeepCrearDigibeep/Page_Administracin DigiBeep Digiturno 5/input_Direccin_ctl00cPHPriTabContainer1TabE_d4e06a'), 
    '1')

WebUI.delay(2)

WebUI.executeJavaScript('return document.getElementById(\'cPHPri_TabContainer1_TabEdicion_btnRed\').click()', [])

WebUI.delay(2)

WebUI.executeJavaScript('return document.getElementById(\'cPHPri_TabContainer1_TabEdicion_ddlBaudios\').value=\'Baudios1200\'', 
    [], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.executeJavaScript('return document.getElementById(\'cPHPri_TabContainer1_TabEdicion_ddlTipoTransmision\').value=\'1\'', 
    [], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.executeJavaScript('return document.getElementById(\'cPHPri_TabContainer1_TabEdicion_MenuEdicionEditar_imgNuevo\').click()', 
    [])

WebUI.delay(3)

