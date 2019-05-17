package com.guru99.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99.qa.base.TestBase;

public class CreateAccountPage extends TestBase {
	
	@FindBy(xpath="//a[@title='Create an Account']")
	WebElement createAccountButton;
	

	public CreateAccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	public RegisterUser clickCreateAccount() {
		createAccountButton.click();
		return new RegisterUser();
		
		
	}
	
	
}
