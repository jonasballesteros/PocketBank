package com.PocketBank;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import com.PocketBank.*;

public class appObjects extends AndroidActions {
	
	AndroidDriver driver;

	public appObjects(AndroidDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/register_button")
	public WebElement registerbtn;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/et_firstName")
	public WebElement firstname;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/et_lastName")
	public WebElement lastname;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/et_email")
	public WebElement email;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/et_iban")
	public WebElement iban;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/et_password")
	public WebElement password;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/et_confirmPassword")
	public WebElement confirmpassword;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/rb_male")
	public WebElement male;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/bt_register")
	public WebElement registerbtn1;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/tv_username")
	public WebElement username;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/tv_password")
	public WebElement password1;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/login_button")
	public WebElement loginbtn;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/imgHistory")
	public WebElement transactionhistory;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/fabAdd")
	public WebElement addbtn;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/et_beneficiary2")
	public WebElement beneficiaryname;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/et_accountNumber2")
	public WebElement accountnumber;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/et_amount2")
	public WebElement amount;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/btn_send2")
	public WebElement sendmoneybtn;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/btnRaport")
	public WebElement raports;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/btnRaportAmount")
	public WebElement alltransactionbyamount;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/btnRaportAmount")
	public WebElement raportamount;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/btnViewRaportAmount")
	public WebElement viewreport;
	
	@AndroidFindBy(id="com.example.proiectmobilebanking:id/btnDeleteAccount")
	public WebElement deleteaccount;
	
	
	
	 
	
	public void clickOnElement(WebElement ele) {
		ele.click();
	}
	
	public void sendKeys(WebElement ele) {
		ele.sendKeys("");
	}	
	
	public void navigateBack() {
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	public String getText(WebElement ele) {
		return ele.getText();
	}
	
	public void validateIfDisplayedTrue(WebElement ele) {
		Assert.assertTrue(ele.isDisplayed());
		System.out.println("Element is displayed");
	}
	public void validateIfDisplayedFalse(WebElement ele) {
		Assert.assertFalse(ele.isDisplayed());
		System.out.println("Element is not displayed");
	}
	

}
