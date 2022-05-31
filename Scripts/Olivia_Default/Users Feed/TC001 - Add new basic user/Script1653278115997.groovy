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
    'thanh.duong+automation@paradox.ai')

WebUI.click(findTestObject('Object Repository/Olivia_Default_ObjectPage/Page_Login/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/Olivia_Default_ObjectPage/Page_Login/input_Enter Password_el-input__inner'), 
    '4nvbrPglk7k=')

WebUI.click(findTestObject('Object Repository/Olivia_Default_ObjectPage/Page_Login/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Olivia_Default_ObjectPage/Page_Inbox  Candidate Experience Manager/div_Menu'))

WebUI.click(findTestObject('Object Repository/Olivia_Default_ObjectPage/Page_Inbox  Candidate Experience Manager/i_Menu_icon icon-settings'))

WebUI.click(findTestObject('Object Repository/Olivia_Default_ObjectPage/Page_Inbox  Candidate Experience Manager/div_Users'))

WebUI.click(findTestObject('Object Repository/Olivia_Default_ObjectPage/Page_Users  Candidate Experience Manager/i_Users_icon-plus'))

WebUI.click(findTestObject('Object Repository/Olivia_Default_ObjectPage/Page_Users  Candidate Experience Manager/strong_Basic User'))

WebUI.click(findTestObject('Object Repository/Olivia_Default_ObjectPage/Page_Users  Candidate Experience Manager/button_Continue'))

WebUI.setText(findTestObject('Object Repository/Olivia_Default_ObjectPage/Page_Users  Candidate Experience Manager/input_First name_fname'), 
    fname)

WebUI.setText(findTestObject('Object Repository/Olivia_Default_ObjectPage/Page_Users  Candidate Experience Manager/input_Last name_lname'), 
    lname)

WebUI.concatenate((([]) as String))

WebUI.setText(findTestObject('Object Repository/Olivia_Default_ObjectPage/Page_Users  Candidate Experience Manager/input_Email_email'), 
    'thanh.duong+AutoB@paradox.ai')

WebUI.selectOptionByValue(findTestObject('Object Repository/Olivia_Default_ObjectPage/Page_Users  Candidate Experience Manager/select_Select a country  United States  Can_7bdac2'), 
    'US', true)

WebUI.click(findTestObject('Object Repository/Olivia_Default_ObjectPage/Page_Users  Candidate Experience Manager/button_Save'))

WebUI.verifyElementText(findTestObject('Olivia_Default_ObjectPage/Page_Users  Candidate Experience Manager/strong_Selected_Card'), 
    'Basic Automation')

WebUI.click(findTestObject('Object Repository/Olivia_Default_ObjectPage/Page_Users  Candidate Experience Manager/div_BA                                     _ce1a85'))

WebUI.verifyOptionSelectedByValue(findTestObject('Olivia_Default_ObjectPage/Page_Users  Candidate Experience Manager/select_Company Admin  Full User - Edit Ever_daeaff'), 
    '99', false, 0)

WebUI.verifyElementAttributeValue(findTestObject('Olivia_Default_ObjectPage/Page_Users  Candidate Experience Manager/input_First name_fname'), 
    'value', 'Basic', 0)

WebUI.verifyElementAttributeValue(findTestObject('Olivia_Default_ObjectPage/Page_Users  Candidate Experience Manager/input_Last name_lname'), 
    'value', 'Automation', 0)

WebUI.click(findTestObject('Object Repository/Olivia_Default_ObjectPage/Page_Users  Candidate Experience Manager/button_Delete user'))

WebUI.click(findTestObject('Olivia_Default_ObjectPage/Page_Users  Candidate Experience Manager/button_Yes'))

WebUI.closeBrowser()

