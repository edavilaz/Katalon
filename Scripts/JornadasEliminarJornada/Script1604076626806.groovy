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

WebUI.click(findTestObject('Object Repository/JornadasEliminarJornada/Page_Inicio Digiturno 5/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/JornadasEliminarJornada/Page_Configuracin Digiturno 5/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/JornadasEliminarJornada/Page_Jornadas de Atencin Digiturno 5/a_Seleccionar'))

WebUI.setText(findTestObject('Object Repository/JornadasEliminarJornada/Page_Jornadas de Atencin Digiturno 5/input_Formato incorrecto_ctl00cPHPriAgenda1_f0a61d'), 
    '0')

WebUI.setText(findTestObject('Object Repository/JornadasEliminarJornada/Page_Jornadas de Atencin Digiturno 5/input_HH_ctl00cPHPriAgenda1FechaYHora_Fecha_c72d57'), 
    '0')

WebUI.setText(findTestObject('Object Repository/JornadasEliminarJornada/Page_Jornadas de Atencin Digiturno 5/input_MM_ctl00cPHPriAgenda1FechaYHora_Fecha_1f130d'), 
    '0')

WebUI.setText(findTestObject('Object Repository/JornadasEliminarJornada/Page_Jornadas de Atencin Digiturno 5/input_Formato incorrecto_ctl00cPHPriAgenda1_7cee3e'), 
    '0')

WebUI.setText(findTestObject('Object Repository/JornadasEliminarJornada/Page_Jornadas de Atencin Digiturno 5/input_HH_ctl00cPHPriAgenda1FechaYHora_Fecha_22b4fc'), 
    '0')

WebUI.setText(findTestObject('Object Repository/JornadasEliminarJornada/Page_Jornadas de Atencin Digiturno 5/input_MM_ctl00cPHPriAgenda1FechaYHora_Fecha_e9b840'), 
    '0')

WebUI.setText(findTestObject('Object Repository/JornadasEliminarJornada/Page_Jornadas de Atencin Digiturno 5/input_Opciones_ctl00cPHPriAgenda1gvIntersec_a44097'), 
    '0')

WebUI.setText(findTestObject('Object Repository/JornadasEliminarJornada/Page_Jornadas de Atencin Digiturno 5/input_HH_ctl00cPHPriAgenda1gvIntersecciones_60003f'), 
    '0')

WebUI.setText(findTestObject('Object Repository/JornadasEliminarJornada/Page_Jornadas de Atencin Digiturno 5/input_MM_ctl00cPHPriAgenda1gvIntersecciones_e2dac5'), 
    '0')

WebUI.setText(findTestObject('Object Repository/JornadasEliminarJornada/Page_Jornadas de Atencin Digiturno 5/input_SS_ctl00cPHPriAgenda1gvIntersecciones_7f4644'), 
    '0')

WebUI.setText(findTestObject('Object Repository/JornadasEliminarJornada/Page_Jornadas de Atencin Digiturno 5/input_HH_ctl00cPHPriAgenda1gvIntersecciones_695b27'), 
    '0')

WebUI.setText(findTestObject('Object Repository/JornadasEliminarJornada/Page_Jornadas de Atencin Digiturno 5/input_MM_ctl00cPHPriAgenda1gvIntersecciones_22d421'), 
    '0')

WebUI.executeJavaScript('return document.getElementById(\'cPHPri_Jornadas1_GridView\').click()', [])

WebUI.setText(findTestObject('Object Repository/JornadasEliminarJornada/Page_Jornadas de Atencin Digiturno 5/input_Formato incorrecto_ctl00cPHPriAgenda1_f0a61d'), 
    '0')

WebUI.setText(findTestObject('Object Repository/JornadasEliminarJornada/Page_Jornadas de Atencin Digiturno 5/input_HH_ctl00cPHPriAgenda1FechaYHora_Fecha_c72d57'), 
    '0')

WebUI.setText(findTestObject('Object Repository/JornadasEliminarJornada/Page_Jornadas de Atencin Digiturno 5/input_MM_ctl00cPHPriAgenda1FechaYHora_Fecha_1f130d'), 
    '0')

WebUI.setText(findTestObject('Object Repository/JornadasEliminarJornada/Page_Jornadas de Atencin Digiturno 5/input_Opciones_ctl00cPHPriAgenda1gvIntersec_a44097'), 
    '0')

WebUI.setText(findTestObject('Object Repository/JornadasEliminarJornada/Page_Jornadas de Atencin Digiturno 5/input_HH_ctl00cPHPriAgenda1gvIntersecciones_60003f'), 
    '0')

WebUI.setText(findTestObject('Object Repository/JornadasEliminarJornada/Page_Jornadas de Atencin Digiturno 5/input_MM_ctl00cPHPriAgenda1gvIntersecciones_e2dac5'), 
    '0')

WebUI.setText(findTestObject('Object Repository/JornadasEliminarJornada/Page_Jornadas de Atencin Digiturno 5/input_SS_ctl00cPHPriAgenda1gvIntersecciones_7f4644'), 
    '0')

WebUI.setText(findTestObject('Object Repository/JornadasEliminarJornada/Page_Jornadas de Atencin Digiturno 5/input_HH_ctl00cPHPriAgenda1gvIntersecciones_695b27'), 
    '0')

WebUI.setText(findTestObject('Object Repository/JornadasEliminarJornada/Page_Jornadas de Atencin Digiturno 5/input_MM_ctl00cPHPriAgenda1gvIntersecciones_22d421'), 
    '0')

WebUI.executeJavaScript('return document.getElementById(\'cPHPri_MenuEdicionEditar_lkbEliminar\').click()', [])

WebUI.delay(5)

