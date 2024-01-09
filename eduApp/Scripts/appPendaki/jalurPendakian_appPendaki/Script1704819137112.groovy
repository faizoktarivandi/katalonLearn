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

Mobile.startApplication('C:\\Users\\Lenovo\\Downloads\\Study\\Eduwork\\katalonApps\\eduApp\\APK\\app-pendaki.apk', true)

Mobile.tap(findTestObject('Object Repository/appPendaki/android.widget.ImageButton (1)'), 0)

Mobile.tap(findTestObject('Object Repository/appPendaki/android.widget.CheckedTextView - Informasi Pendakian'), 0)

Mobile.scrollToText('Gunung Wilis')

Mobile.tap(findTestObject('Object Repository/appPendaki/android.widget.TextView - Pendakian Gunung Wilis'), 0)

Mobile.tap(findTestObject('Object Repository/appPendaki/android.widget.Button - Jalur Kare'), 0)

Mobile.tap(findTestObject('Object Repository/appPendaki/android.widget.Button - Jalur Penampihan'), 0)

Mobile.pressBack()

Mobile.scrollToText('arjuno')

Mobile.tap(findTestObject('Object Repository/appPendaki/android.widget.TextView - Pendakian Gunung Arjuno'), 0)

Mobile.tap(findTestObject('Object Repository/appPendaki/android.widget.Button - Jalur Tretes'), 0)

Mobile.tap(findTestObject('Object Repository/appPendaki/android.widget.Button - Jalur Lawang'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/appPendaki/android.widget.ImageButton (1)'), 0)

Mobile.closeApplication()

