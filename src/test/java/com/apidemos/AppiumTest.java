package com.apidemos;

import java.net.URL;


import org.openqa.selenium.MutableCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.apidemos.AndroidActions;
import com.apidemos.appObjects;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;




public class AppiumTest {
	
	
	
    public AndroidDriver driver;
    public appObjects appobjects;
	public AndroidActions AndroidActions;
 
    @BeforeMethod(alwaysRun=true) 
    
    public void setUp() throws Exception {
        MutableCapabilities capabilities = new UiAutomator2Options();
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
    }

    @AfterMethod(alwaysRun=true)
    public void tearDown() throws Exception {
        driver.quit();
    }
}
