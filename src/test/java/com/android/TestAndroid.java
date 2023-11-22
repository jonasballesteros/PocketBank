package com.android;

import io.appium.java_client.android.options.UiAutomator2Options;
import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.android.AndroidDriver;

public class TestAndroid {
	
	public static void main(String[] args){ 
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setUdid("R58N35CS4LK");
		
		options.setCapability("appium:appPackage", "io.appium.android.apis");
		options.setCapability("appium:appActivity", "io.appium.android.apis.ApiDemos");
		options.setCapability("platformName", "Android");
		options.setCapability("appium:platformVersion", "13");
		options.setCapability("appium:automationName", "uiautomator2");
		
		try {
			AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		}
		catch (MalformedURLException e) {
			e.printStackTrace();
			
			
		}
		
	}

}
