package com.apidemos;

import java.net.MalformedURLException;
import org.testng.annotations.Test;

import com.apidemos.*;

import io.appium.java_client.AppiumBy;

public class LaunchApplication extends AppiumTest {
	
	
	
	@Test
	public void launchApp() throws MalformedURLException {
		
		// Clicking menus
		driver.findElement(AppiumBy.accessibilityId("Access'ibility")).click();
		driver.findElement(AppiumBy.accessibilityId("Accessibility Node Provider")).click();
		driver.findElement(AppiumBy.className("android.widget.LinearLayout"));
		driver.navigate().back();
		driver.findElement(AppiumBy.accessibilityId("Accessibility Node Querying")).click();
		
		driver.navigate().back();
		driver.findElement(AppiumBy.accessibilityId("Accessibility Service")).click();
		driver.navigate().back();
		driver.findElement(AppiumBy.accessibilityId("Custom View")).click();
		driver.navigate().back();
		driver.navigate().back();
		
		
		
		driver.findElement(AppiumBy.accessibilityId("Accessibility")).click();
		driver.navigate().back();
		driver.findElement(AppiumBy.accessibilityId("Animation")).click();
		driver.navigate().back();
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.navigate().back();
		driver.findElement(AppiumBy.accessibilityId("Content")).click();
		driver.navigate().back();
		driver.findElement(AppiumBy.accessibilityId("Graphics")).click();
		driver.navigate().back();
		driver.findElement(AppiumBy.accessibilityId("Media")).click();
		driver.navigate().back();
		driver.findElement(AppiumBy.accessibilityId("NFC")).click();
		driver.navigate().back();
		driver.findElement(AppiumBy.accessibilityId("OS")).click();
		driver.navigate().back();
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.navigate().back();
		driver.findElement(AppiumBy.accessibilityId("Text")).click();
		driver.navigate().back();
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.navigate().back();
		
		
		//Clicking of items inside preference
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"1. Preferences from XML\"]")).click();	
		driver.navigate().back();		
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"2. Launching preferences\"]")).click();
		driver.navigate().back();	
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
		driver.navigate().back();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"4. Default values\"]")).click();
		driver.navigate().back();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"5. Preferences from code\"]")).click();
		driver.navigate().back();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"6. Advanced preferences\"]")).click();
		driver.navigate().back();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"7. Fragment\"]")).click();
		driver.navigate().back();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"8. Headers\"]")).click();
		driver.navigate().back();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"9. Switch\"]")).click();
		driver.navigate().back();
		driver.navigate().back();
				
		//Clicking preference
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		//Clicking Preference dependencies
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
		driver.findElement(AppiumBy.id("android:id/checkbox")).click();
		//Clicking Wifi Settings
		driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout")).click();
				
		//Inputting Wifi data
		driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys("Jonas123!");
		driver.findElement(AppiumBy.id("android:id/button1")).click();
		
	
		
		
	}
}
