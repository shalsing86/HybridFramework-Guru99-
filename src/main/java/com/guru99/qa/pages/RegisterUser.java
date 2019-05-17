package com.guru99.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99.qa.base.TestBase;

public class RegisterUser extends TestBase{

	@FindBy(xpath="//input[@id='firstname']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@id='lastname']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@id='email_address']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='confirmation']")
	WebElement confirmPassword;
	
	
	@FindBy(xpath="//span[text()='Register']")
	WebElement registerButton;
	
	@FindBy(xpath="//a[text()='TV']")
	WebElement clickTV;
	
	
	public RegisterUser() {
		PageFactory.initElements(driver, this);
	}
	
    public void RegisterUsers(String fname, String lname, String mail, String pass, String confPass) {
		
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		email.sendKeys(mail);
		password.sendKeys(pass);
		confirmPassword.sendKeys(confPass);
		registerButton.click();
	}
    
    public TVPage clickTV() {
    	clickTV.click();
    	return new TVPage();
    }
    

    

}
