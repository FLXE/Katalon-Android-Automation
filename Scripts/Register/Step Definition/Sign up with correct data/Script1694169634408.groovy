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

WebUI.callTestCase(findTestCase('Login/Step Definition/001 User open apps'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Login/Step Definition/002 User click btn akun'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Login/Step Definition/003 User click btn masuk pageAkunsaya'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Register/Page/001 User Click label daftar'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Register/Page/002 User input nama'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Register/Page/003 User input email'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Register/Page/004 User input password'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Register/Page/005 User input noHP'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Register/Page/006 User input kota'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Register/Page/007 User input alamat'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Register/Page/008 User click btn Daftar success'), [:], FailureHandling.STOP_ON_FAILURE)

