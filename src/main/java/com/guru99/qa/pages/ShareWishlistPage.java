package com.guru99.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99.qa.base.TestBase;

public class ShareWishlistPage extends TestBase{
	
	@FindBy(xpath="//textarea[@name='emails']")
	WebElement emailAdd;
	
	@FindBy(xpath="//textarea[@id='message']")
	WebElement message;
	
	@FindBy(xpath="//span[text()='Share Wishlist']")
	WebElement finalShareButton;
	
	public ShareWishlistPage() {
		PageFactory.initElements(driver, this);
	}

    public String shareWishlist() {
    	emailAdd.sendKeys(prop.getProperty("username"));
    	message.sendKeys(prop.getProperty("message"));
    	finalShareButton.click();
    	return driver.getTitle();
    	
    }
}
