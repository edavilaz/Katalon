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

WebUI.click(findTestObject('GruposActualizarGrupo/Page_Inicio Digiturno 5/img'))

WebUI.click(findTestObject('GruposActualizarGrupo/Page_Configuracin Digiturno 5/img'))

WebUI.delay(2)

WebUI.click(findTestObject('GruposActualizarGrupo/Page_Distribucin geogrfica Digiturno 5/img'))

WebUI.delay(2)

WebUI.click(findTestObject('GruposActualizarGrupo/Page_Grupos Digiturno 5/a_Seleccionar'))

WebUI.delay(2)

WebUI.click(findTestObject('GruposActualizarGrupo/Page_Grupos Digiturno 5/a_Seleccionar_1'))

WebUI.delay(2)

WebUI.setText(findTestObject('GruposActualizarGrupo/Page_Grupos Digiturno 5/input_Nombre_ctl00cPHPritxtNombre'), 'Grupo Actualizado')

WebUI.setText(findTestObject('GruposActualizarGrupo/Page_Grupos Digiturno 5/textarea_Grupo Nuevo'), 'Grupo Actualizado')

WebUI.click(findTestObject('GruposActualizarGrupo/Page_Grupos Digiturno 5/img_Nuevo_cPHPri_MenuEdicion1_imgActualizar'))

