package com.android;

import java.net.MalformedURLException;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy.ByAccessibilityId;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import java.net.URL;

public class TestApp {

	public static final String USERNAME = "jonasballesteros_i5wYOf";
	public static final String AUTOMATE_KEY = "gBtapnNFu3CLsyHZB8wr";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	AndroidDriver driver;
	@BeforeTest
	public void setup() throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("deviceName", "Samsung Galaxy S21");
	    caps.setCapability("os_version", "12.0");
	    caps.setCapability("Project", "API demo app automation");
	    caps.setCapability("build", "ANDROID");
	    caps.setCapability("name", "Sample Test");
	    caps.setCapability("app", "bs://f7c9b6de7ab21b94085a649a501359b0ff17370e");
	    driver =new AndroidDriver(new URL(URL), caps);
	}
	@Test
	
	public void clickOnPreference() {
		driver.findElement(ByAccessibilityId.accessibilityId("Preference")).click();
		driver.pressKey(new KeyEvent (AndroidKey.BACK));
		driver.findElement(ByAccessibilityId.accessibilityId("Views")).click();
		
	}
	
	@AfterTest
	public void quit() {
		
		driver.quit();
	}
	
	
}
