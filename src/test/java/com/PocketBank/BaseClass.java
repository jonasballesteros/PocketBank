package com.PocketBank;

import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.MutableCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;



public class BaseClass {
	
	public AndroidDriver driver;
	public appObjects appobjects;
	public AndroidActions AndroidActions;
	
	
	String userName = System.getenv("jonasballesteros_i5wYOf");
	String accessKey = System.getenv ("gBtapnNFu3CLsyHZB8wr");
	String browserstackLocal = System.getenv("BROWSERSTACK_LOCAL");
	String buildName = System.getenv("BROWSERSTACK_BUILD_NAME");
	String browserstackLocalIdentifier = System.getenv("BROWSERSTACK_LOCAL_IDENTIFIER");
	String app = System.getenv("bs://f7c9b6de7ab21b94085a649a501359b0ff17370e");
	public String URL = "https://" + userName + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub";
	
	
	
	

    @BeforeMethod(alwaysRun=true)
    public void setUp() throws Exception {
    	
        MutableCapabilities capabilities = new UiAutomator2Options();
        
        HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
        browserstackOptions.put("appiumVersion", "2.0.2");
        
        capabilities.setCapability("deviceName", "Samsung Galaxy S21");
        capabilities.setCapability("os_version", "12.0");
		capabilities.setCapability("app", app);
		capabilities.setCapability("build", "Jonas");
		capabilities.setCapability("name", "Test");
        driver = new AndroidDriver(new URL(URL),capabilities);
        
        appobjects = new appObjects(driver);
    }

    @AfterMethod(alwaysRun=true)
    public void tearDown() throws Exception {
        driver.quit();
    }

}
