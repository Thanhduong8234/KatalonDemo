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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://olivia.paradox.ai/login')

WebUI.click(findTestObject('Object Repository/Olivia_Default_ObjectPage/Page_Olivia By Paradox - CEM/i_Paradox_el-dialog__close el-icon el-icon-close'))

WebUI.setText(findTestObject('Object Repository/Olivia_Default_ObjectPage/Page_Login/input_Phone number, email, or Employee ID_l_2fc3e1'), 
    user)

WebUI.click(findTestObject('Object Repository/Olivia_Default_ObjectPage/Page_Login/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/Olivia_Default_ObjectPage/Page_Login/input_Enter Password_el-input__inner'), 
    password)

WebUI.click(findTestObject('Object Repository/Olivia_Default_ObjectPage/Page_Login/button_Sign in'))

