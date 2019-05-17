package com.guru99.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99.qa.base.TestBase;

public class DefaultPage extends TestBase{
	
	//Page Factory - OR
	@FindBy(xpath="//h2[contains(text(),'This is demo')]")
	WebElement pagetitle;
	
	@FindBy(xpath="//a[contains(text(),'Mobile')]")
	WebElement mobilelink;
	
	@FindBy(xpath="//a[contains(text(),'TV')]")
	WebElement tvlink;
	
	@FindBy(xpath="//span[text()='Account']")
	WebElement accountLink;
	
	@FindBy(xpath="//a[text()='My Account']")
	WebElement myaccountLink;
	
	
	
	public DefaultPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyDefaultPageTitle() {
		return pagetitle.getText();
	}
	
	public MobilePage clickMobile() {
		mobilelink.click();
		return new MobilePage();
			}
	
	public void clickAccountLink() {

		accountLink.click();
	
	}
	
	public CreateAccountPage clickMyAccountLink() {
		myaccountLink.click();
		return new CreateAccountPage();
	}

}
