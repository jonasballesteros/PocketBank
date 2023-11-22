package com.capstone;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class PocketBank extends AppiumTest {
	
	@Test
	

	
	// PB_01 will create new account and perform adding account into the transaction history and verify if the account is created
		public void PB_01_NewAccount() throws MalformedURLException {
		
		driver.findElement(AppiumBy.id("com.example.proiectmobilebanking:id/register_button")).click();
		driver.findElement(AppiumBy.id("com.example.proiectmobilebanking:id/et_firstName")).sendKeys("Jona");
		
		

}
}