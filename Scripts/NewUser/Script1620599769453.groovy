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

WebUI.navigateToUrl('https://www.intrepidtravel.com/ca')

WebUI.click(findTestObject('Object Repository/Page_Small Group Tours  Travel, Big Adventu_109af6/span_Wishlist'))

WebUI.click(findTestObject('Object Repository/Page_My Wishlist  Intrepid Travel/a_Sign up'))

WebUI.setText(findTestObject('Object Repository/Page_Intrepid Travel/input_Create an account to save the trips y_63467a'), 
    'David')

WebUI.setText(findTestObject('Object Repository/Page_Intrepid Travel/input_Create an account to save the trips y_908a90'), 
    'Hampster')

WebUI.click(findTestObject('Object Repository/Page_Intrepid Travel/button_Next'))

WebUI.setText(findTestObject('Object Repository/Page_Intrepid Travel/input_Almost done, David_email'), 'dave.hamp21@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Intrepid Travel/input_Almost done, David_password'), 'J23og2yDVL+opgV55mgr5A==')

WebUI.click(findTestObject('Object Repository/Page_Intrepid Travel/input_I accept the Intrepid Travel_termsand_5266e8'))

WebUI.click(findTestObject('Object Repository/Page_Intrepid Travel/input_Send me travel deals and inspiration _b37aeb'))

WebUI.click(findTestObject('Object Repository/Page_Intrepid Travel/button_Create Account'))

WebUI.click(findTestObject('Object Repository/Page_Intrepid Travel/button_Complete log in'))

WebUI.closeBrowser()

