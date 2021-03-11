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

WebUI.click(findTestObject('Object Repository/OficinasCrearOficina/Page_Inicio Digiturno 5/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OficinasCrearOficina/Page_Configuracin Digiturno 5/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OficinasCrearOficina/Page_Distribucin geogrfica Digiturno 5/img'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/OficinasCrearOficina/Page_Oficinas Digiturno 5/select_- Seleccione -Colombia'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OficinasCrearOficina/Page_Oficinas Digiturno 5/select_- Seleccione -CundinamarcaValle Del _7d921b'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OficinasCrearOficina/Page_Oficinas Digiturno 5/select_- Seleccione -Bogota'), 
    '4', true)

WebUI.delay(2)

WebUI.setText(findTestObject('OficinasCrearOficina/Page_Oficinas Digiturno 5/input_Nombre_ctl00cPHPritxtNombre'), 'nueva1')

WebUI.setText(findTestObject('Object Repository/OficinasCrearOficina/Page_Oficinas Digiturno 5/input_Nivel de servicio de espera_ctl00cPHP_fdb8b5'), 
    '0')

WebUI.setText(findTestObject('OficinasCrearOficina/Page_Oficinas Digiturno 5/input_Nombre a mostrar_ctl00cPHPritxtNombre_de3195'), 
    'nueva1')

WebUI.setText(findTestObject('Object Repository/OficinasCrearOficina/Page_Oficinas Digiturno 5/input_Direccin_ctl00cPHPritxtDireccion'), 
    'carrera')

WebUI.setText(findTestObject('Object Repository/OficinasCrearOficina/Page_Oficinas Digiturno 5/input_Nmero de telfono_ctl00cPHPritxtTelefono'), 
    '2370000')

WebUI.setText(findTestObject('Object Repository/OficinasCrearOficina/Page_Oficinas Digiturno 5/input_Distancia mnima creacin turnos (m)_ct_1ab4e3'), 
    '100')

WebUI.setText(findTestObject('Object Repository/OficinasCrearOficina/Page_Oficinas Digiturno 5/input_Cantidad de turnos para prellamado_ct_8b0396'), 
    '2')

WebUI.setText(findTestObject('Object Repository/OficinasCrearOficina/Page_Oficinas Digiturno 5/input_Longitud_ctl00cPHPriuCCoordenadaGeogr_3050d0'), 
    '0.0000000000')

WebUI.setText(findTestObject('Object Repository/OficinasCrearOficina/Page_Oficinas Digiturno 5/input_Latitud_ctl00cPHPriuCCoordenadaGeogra_0ceaf1'), 
    '0.0000000000')

WebUI.executeJavaScript('return document.getElementById(\'cPHPri_MenuEdicion1_lkbNuevo\').click()', [])

WebUI.delay(2)

