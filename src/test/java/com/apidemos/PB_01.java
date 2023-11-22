package com.apidemos;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import com.apidemos.appObjects;
import com.apidemos.AppiumTest;
import com.apidemos.*;

public class PB_01 extends AppiumTest {
	
	@Test
	
	public void PB_01_NewAccount() throws MalformedURLException {
		
		appobjects = new appObjects(driver);
		AndroidActions = new AndroidActions(driver);
		
	//	appobjects.clickOnElement(appobjects.registerbtn);
		appobjects.clickOnElement(appobjects.registerbtn);
		appobjects.firstname.sendKeys("jonas");
		appobjects.lastname.sendKeys("ballesteros");
		appobjects.email.sendKeys("test1@gmail.com");
		appobjects.iban.sendKeys("test");
		appobjects.password.sendKeys("test");
		appobjects.confirmpassword.sendKeys("test");
		appobjects.clickOnElement(appobjects.male);
		appobjects.clickOnElement(appobjects.registerbtn1);
		appobjects.username.sendKeys("test1@gmail.com");
		appobjects.password1.sendKeys("test");
		appobjects.clickOnElement(appobjects.loginbtn);
		
		appobjects.clickOnElement(appobjects.transactionhistory);
		appobjects.clickOnElement(appobjects.addbtn);
		appobjects.beneficiaryname.sendKeys("jonas");
		appobjects.accountnumber.sendKeys("12345");
		appobjects.amount.sendKeys("1000");
		appobjects.clickOnElement(appobjects.sendmoneybtn);
		
	}
	
	public void PB_02_ViewRaport() throws MalformedURLException {
		
		appobjects.username.sendKeys("test1@gmail.com");
		appobjects.password1.sendKeys("test");
		appobjects.clickOnElement(appobjects.loginbtn);
		
		appobjects.clickOnElement(appobjects.transactionhistory);
		appobjects.clickOnElement(appobjects.addbtn);
		appobjects.beneficiaryname.sendKeys("jonas");
		appobjects.accountnumber.sendKeys("12345");
		appobjects.amount.sendKeys("1000");
		appobjects.clickOnElement(appobjects.sendmoneybtn);
		
		appobjects.navigateBack();
		
		appobjects.clickOnElement(appobjects.raports);		
		appobjects.clickOnElement(appobjects.alltransactionbyamount);
		appobjects.raportamount.sendKeys("5000");
		appobjects.clickOnElement(appobjects.viewreport);
		
	}
	public void PB_04_DeleteAccount() throws MalformedURLException {
		
		appobjects.username.sendKeys("test1@gmail.com");
		appobjects.password1.sendKeys("test");
		appobjects.clickOnElement(appobjects.loginbtn);
		appobjects.clickOnElement(appobjects.deleteaccount);
		
		
		
		
	}

}
