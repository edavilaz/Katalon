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

WebUI.setText(findTestObject('Object Repository/AgregarUsuario/Page_Autenticacin Digiturno 5/input__ctl00cPHPritxtUsuario'), 
    'ciel')

WebUI.setEncryptedText(findTestObject('Object Repository/AgregarUsuario/Page_Autenticacin Digiturno 5/input__ctl00cPHPritxtClave'), 
    'HLC/kl1cJBvGH0sbr8u0hg==')

WebUI.click(findTestObject('Object Repository/AgregarUsuario/Page_Autenticacin Digiturno 5/input_Aplicacin_ctl00cPHPribtnIniciarSesion'))

WebUI.click(findTestObject('Object Repository/AgregarUsuario/Page_Inicio Digiturno 5/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AgregarUsuario/Page_Configuracin Digiturno 5/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AgregarUsuario/Page_Seguridad Digiturno 5/img'))

WebUI.delay(2)

WebUI.click(findTestObject('AgregarUsuario/Page_Usuarios Digiturno 5/img'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/AgregarUsuario/Page_Agregar Usuarios Digiturno 5/input_Usuario_ctl00cPHPritxtUsuario'), 
    'nuevo')

WebUI.setText(findTestObject('Object Repository/AgregarUsuario/Page_Agregar Usuarios Digiturno 5/input_Nombre a mostrar_ctl00cPHPritxtNombre'), 
    'nuevo')

WebUI.setText(findTestObject('Object Repository/AgregarUsuario/Page_Agregar Usuarios Digiturno 5/input_Correo electrnico_ctl00cPHPritxtCorreo'), 
    'edavilaz@gmail.com')

WebUI.setText(findTestObject('Object Repository/AgregarUsuario/Page_Agregar Usuarios Digiturno 5/input_Nmero de celular_ctl00cPHPritxtNumeroCelular'), 
    '3194159302')

WebUI.selectOptionByValue(findTestObject('Object Repository/AgregarUsuario/Page_Agregar Usuarios Digiturno 5/select_- Seleccione -Colombia'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AgregarUsuario/Page_Agregar Usuarios Digiturno 5/select_- Seleccione -CundinamarcaValle Del _7d921b'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AgregarUsuario/Page_Agregar Usuarios Digiturno 5/select_- Seleccione -Bogota'), 
    '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AgregarUsuario/Page_Agregar Usuarios Digiturno 5/select_- Seleccione -Bogota - CIEL'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/AgregarUsuario/Page_Agregar Usuarios Digiturno 5/img_Informacin principal_cPHPri_MenuEdicion_1f2d64'))

