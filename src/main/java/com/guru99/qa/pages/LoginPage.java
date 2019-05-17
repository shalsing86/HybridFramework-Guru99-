package com.guru99.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(xpath="//input[@type='email']")
	WebElement loginemail;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement loginPassword;
	
	
	@FindBy(xpath="//button[@title='Login']")
	WebElement loginButton;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public MyWishList Login() {
		loginemail.sendKeys(prop.getProperty("username"));
		loginPassword.sendKeys(prop.getProperty("password"));
		loginButton.click();
		return new MyWishList();
	}


}
