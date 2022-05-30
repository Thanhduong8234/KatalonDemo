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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.callTestCase(findTestCase('Olivia_Default/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Olivia_Default_ObjectPage/Page_Inbox  Candidate Experience Manager/div_Menu'))

WebUI.click(findTestObject('Object Repository/Olivia_Default_ObjectPage/Page_Inbox  Candidate Experience Manager/i_Menu_icon icon-settings'))

WebUI.click(findTestObject('Object Repository/Olivia_Default_ObjectPage/Page_Inbox  Candidate Experience Manager/div_Users'))

WebUI.click(findTestObject('Object Repository/Olivia_Default_ObjectPage/Page_Users  Candidate Experience Manager/i_Users_icon-plus'))

WebUI.click(findTestObject('Object Repository/Olivia_Default_ObjectPage/Page_Users  Candidate Experience Manager/strong_Full User'))

WebUI.click(findTestObject('Object Repository/Olivia_Default_ObjectPage/Page_Users  Candidate Experience Manager/button_Continue'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Olivia_Default_ObjectPage/Page_Users  Candidate Experience Manager/select_Company Admin  Full User - Edit Ever_daeaff'), 
    role, true)

if (WebUI.waitForElementVisible(findTestObject('Olivia_Default_ObjectPage/Page_Users  Candidate Experience Manager/input_Job title_job_title'), 
    3)) {
    WebUI.setText(findTestObject('Olivia_Default_ObjectPage/Page_Users  Candidate Experience Manager/input_Job title_job_title'), 
        job_title)
}

WebUI.setText(findTestObject('Object Repository/Olivia_Default_ObjectPage/Page_Users  Candidate Experience Manager/input_First name_fname'), 
    firstname)

WebUI.setText(findTestObject('Object Repository/Olivia_Default_ObjectPage/Page_Users  Candidate Experience Manager/input_Last name_lname'), 
    lastname)

WebUI.setText(findTestObject('Object Repository/Olivia_Default_ObjectPage/Page_Users  Candidate Experience Manager/input_Email_email'), 
    email)

WebUI.selectOptionByValue(findTestObject('Object Repository/Olivia_Default_ObjectPage/Page_Users  Candidate Experience Manager/select_Select a country  United States  Can_7bdac2'), 
    country, true)

WebUI.click(findTestObject('Object Repository/Olivia_Default_ObjectPage/Page_Users  Candidate Experience Manager/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Olivia_Default_ObjectPage/Page_Users  Candidate Experience Manager/strong_Selected card'), 
    fullname)

WebUI.verifyOptionSelectedByValue(findTestObject('Object Repository/Olivia_Default_ObjectPage/Page_Users  Candidate Experience Manager/select_Company Admin  Full User - Edit Ever_daeaff'), 
    role, true, 10)

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Olivia_Default_ObjectPage/Page_Users  Candidate Experience Manager/input_First name_fname'), 
    'value', firstname, 0)

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Olivia_Default_ObjectPage/Page_Users  Candidate Experience Manager/input_Last name_lname'), 
    'value', lastname, 0)

WebUI.callTestCase(findTestCase('Olivia_Default/Delete User'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

