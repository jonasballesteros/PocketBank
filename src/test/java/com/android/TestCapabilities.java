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

public class TestCapabilities {

//	public static final String USERNAME = "jonasballesteros_i5wYOf";
//	public static final String AUTOMATE_KEY = "gBtapnNFu3CLsyHZB8wr";
//  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	
	String userName = System.getenv("jonasballesteros_i5wYOf");
	String accessKey = System.getenv("gBtapnNFu3CLsyHZB8wr");
	String browserstackLocal = System.getenv("BROWSERSTACK_LOCAL");
	String buildName = System.getenv("BROWSERSTACK_BUILD_NAME");
	String browserstackLocalIdentifier = System.getenv("BROWSERSTACK_LOCAL_IDENTIFIER");
	String app = System.getenv("bs://af404ff14b669777708144228eec0fca2365f0b6");
	public String URL = "https://" + userName + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub";
	
	AndroidDriver driver;
	@BeforeTest
	public void setup() throws MalformedURLException {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("os_version", "9.0");
		capabilities.setCapability("device", "Google Pixel 3");
		capabilities.setCapability("app", app);
		capabilities.setCapability("project", "ApiDemos");
		capabilities.setCapability("build", "Jonas");
		capabilities.setCapability("name", "Test");
		capabilities.setCapability("browserstack.networkLogs", "true");
		capabilities.setCapability("browserstack.gpsLocation", "14.599512,120.984222");
		capabilities.setCapability("browserstack.timezone", "Manila");
		capabilities.setCapability("deviceOrientation", "landscape");
	    
	    driver = new AndroidDriver(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), capabilities);
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
