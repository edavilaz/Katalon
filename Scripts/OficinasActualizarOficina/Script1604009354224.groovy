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

WebUI.click(findTestObject('Object Repository/OficinasActualizarOficina/Page_Inicio Digiturno 5/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OficinasActualizarOficina/Page_Configuracin Digiturno 5/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OficinasActualizarOficina/Page_Distribucin geogrfica Digiturno 5/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OficinasActualizarOficina/Page_Oficinas Digiturno 5/a_Seleccionar'))

WebUI.setText(findTestObject('Object Repository/OficinasActualizarOficina/Page_Oficinas Digiturno 5/input_Mximo de turnos por cliente_ctl00cPHP_54cc05'), 
    '0')

WebUI.setText(findTestObject('Object Repository/OficinasActualizarOficina/Page_Oficinas Digiturno 5/input_Tiempo de clculo nivel de servicio_ct_5e60a9'), 
    '0')

WebUI.setText(findTestObject('Object Repository/OficinasActualizarOficina/Page_Oficinas Digiturno 5/input_HH_ctl00cPHPriTiempoCalculoNstxtMinuto'), 
    '0')

WebUI.setText(findTestObject('Object Repository/OficinasActualizarOficina/Page_Oficinas Digiturno 5/input_Nombre_ctl00cPHPritxtNombre'), 
    'Nueva2')

WebUI.executeJavaScript('return document.getElementById(\'cPHPri_MenuEdicion1_imgActualizar\').click()', [])

WebUI.setText(findTestObject('Object Repository/OficinasActualizarOficina/Page_Oficinas Digiturno 5/input_Mximo de turnos por cliente_ctl00cPHP_54cc05'), 
    '0')

WebUI.setText(findTestObject('Object Repository/OficinasActualizarOficina/Page_Oficinas Digiturno 5/input_Tiempo de clculo nivel de servicio_ct_5e60a9'), 
    '0')

WebUI.setText(findTestObject('Object Repository/OficinasActualizarOficina/Page_Oficinas Digiturno 5/input_HH_ctl00cPHPriTiempoCalculoNstxtMinuto'), 
    '0')

