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

Mobile.startApplication('D:\\Training\\Challenge\\Mobile Automation\\secondhandapps\\Apk\\secondhand-24082023.apk', true)

Mobile.waitForElementPresent(findTestObject('Product/Login/Beranda'), 3)

Mobile.tap(findTestObject('Product/Login/Beranda'), 0)

Mobile.tap(findTestObject('Product/UpdateProduct/btnakun'), 0)

Mobile.waitForElementPresent(findTestObject('Product/Login/BtnMasukAkun'), 3)

Mobile.tap(findTestObject('Product/Login/BtnMasukAkun'), 0)

Mobile.tap(findTestObject('Product/Login/fieldemail'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Product/Login/fieldemail'), 'salim@gmail.com', 2)

Mobile.tap(findTestObject('Product/Login/fieldpassword'), 0)

Mobile.setText(findTestObject('Product/Login/fieldpassword'), 'asdfgh', 0)

Mobile.tap(findTestObject('Product/Login/BtnMasukApp'), 0)
