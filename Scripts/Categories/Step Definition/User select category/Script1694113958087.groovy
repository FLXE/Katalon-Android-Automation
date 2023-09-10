import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.time.Duration as Duration
import com.kms.katalon.core.appium.driver.SwipeableAndroidDriver as SwipeableAndroidDriver
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.touch.WaitOptions as WaitOptions
import io.appium.java_client.touch.offset.PointOption as PointOption

Mobile.verifyElementVisible(findTestObject('Categories/btnSemuaKategori'), 5)

Mobile.swipe(500, 100, 100, 100)

Mobile.verifyElementVisible(findTestObject('Categories/btnCategory'), 10)

Mobile.tap(findTestObject('Categories/btnCategory'), 5)

Mobile.tap(findTestObject('Categories/btnSelectedProductbyCategory'), 5)

