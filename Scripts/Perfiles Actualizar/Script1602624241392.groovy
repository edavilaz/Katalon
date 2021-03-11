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

WebUI.click(findTestObject('Object Repository/Perfiles Actualizar/Page_Inicio Digiturno 5/img'))

WebUI.click(findTestObject('Object Repository/Perfiles Actualizar/Page_Configuracin Digiturno 5/img'))

WebUI.click(findTestObject('Object Repository/Perfiles Actualizar/Page_Seguridad Digiturno 5/img'))

WebUI.click(findTestObject('Object Repository/Perfiles Actualizar/Page_Usuarios Digiturno 5/img'))

WebUI.click(findTestObject('Object Repository/Perfiles Actualizar/Page_Perfiles Digiturno 5/a_Seleccione'))

WebUI.setText(findTestObject('Object Repository/Perfiles Actualizar/Page_Perfiles Digiturno 5/input_Prioridad_ctl00cPHPritxtPrioridad'), 
    '0')

WebUI.setText(findTestObject('Object Repository/Perfiles Actualizar/Page_Perfiles Digiturno 5/textarea_Nuevo'), 'Actualizado')

WebUI.click(findTestObject('Object Repository/Perfiles Actualizar/Page_Perfiles Digiturno 5/img_Nuevo_cPHPri_MenuEdicion1_imgActualizar'))

WebUI.doubleClick(findTestObject('Object Repository/Perfiles Actualizar/Page_Perfiles Digiturno 5/img_Nuevo_cPHPri_MenuEdicion1_imgActualizar'))

WebUI.setText(findTestObject('Object Repository/Perfiles Actualizar/Page_Perfiles Digiturno 5/input_Prioridad_ctl00cPHPritxtPrioridad'), 
    '0')

