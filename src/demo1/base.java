package demo1;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class base {

	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		// AndroidDriver<AndroidElement> driver;

		// TODO Auto-generated method stub
		/*
		 * File appDir = new File("src"); File app = new File(appDir,
		 * "D:/AppiumSetupSoft/A1Config/AppiumTutorial1/AppiumDemo/ApiDemos-debug.apk");
		 */
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		/*{
			  "platformName": "Android",
			  "deviceName": "Android Emulator",
			  "app": "D:\\AppiumSetupSoft\\A1Config\\AppiumTutorial1\\AppiumDemo\\ApiDemos-debug.apk"
			}*/

		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		/*capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "25");
*/
		capabilities.setCapability(MobileCapabilityType.APP,
				"D:\\AppiumSetupSoft\\A1Config\\AppiumTutorial1\\AppiumDemo\\ApiDemos-debug.apk");
		//capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "emulator");

		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),
				capabilities);
		/*capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.appium.android.apis.ApiDemos");*/

		return driver;
	}

}
