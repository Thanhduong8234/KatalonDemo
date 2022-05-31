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

WebUI.callTestCase(findTestCase('Olivia_Dynamic/General/Login as PA'), [('user') : 'viewonly.prod@paradox.ai\n', ('password') : 'lOlmy8ueJlY='], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Olivia_Default_ObjectPage/Page_Olivia By Paradox - CEM/div_Barksters Linke Hire Test'))

WebUI.setMaskedText(findTestObject('Page_All Candidates  Candidate Experience Manager/input_Schedule_el-input__inner'), 
    companyName)

WebUI.click(findTestObject('Object Repository/Olivia_Default_ObjectPage/Page_Olivia By Paradox - CEM/div_Paradox VN - ThanhDuong Job'))

WebUI.navigateToUrl('https://olivia.paradox.ai/candidates/all-candidates')

WebUI.verifyElementText(findTestObject('Page_All Candidates  Candidate Experience Manager/span_Paradox VN - ThanhDuong Job'), 
    companyName)

