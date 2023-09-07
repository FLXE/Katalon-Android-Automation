import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.time.Duration as Duration
import com.kms.katalon.core.appium.driver.SwipeableAndroidDriver as SwipeableAndroidDriver
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.touch.WaitOptions as WaitOptions
import io.appium.java_client.touch.offset.PointOption as PointOption

Mobile.verifyElementVisible(findTestObject('Categories/btnSemuaKategori'), 5)

SwipeableAndroidDriver driver = MobileDriverFactory.getDriver()

// Get screen dimensions
def screenSize = driver.manage().window().size

def screenWidth = screenSize.width

def screenHeight = screenSize.height

// Calculate the start and end points for the swipe
def startX = screenWidth * 0.8 // 80% from the right edge

def endX = screenWidth * 0.2 // 20% from the left edge

def startY = screenHeight / 2 // Middle of the screen

// Define the duration for the swipe action
def duration = Duration.ofMillis(1000 // 1000 milliseconds (1 second)
    )

// Perform the swipe action
driver.swipe()

Mobile.verifyElementVisible(findTestObject('Categories/btnCategory'), 10)

Mobile.tap(findTestObject('Categories/btnCategory'), 5)

Mobile.tap(findTestObject('Categories/btnSelectedProductbyCategory'), 5)

