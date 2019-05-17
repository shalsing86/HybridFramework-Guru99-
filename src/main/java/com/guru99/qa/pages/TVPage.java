package com.guru99.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99.qa.base.TestBase;

public class TVPage extends TestBase{
	
	@FindBy(xpath="//a[text()='Add to Wishlist']")
	WebElement addToWishList;
	
	public TVPage() {
		PageFactory.initElements(driver, this);
	}

    public LoginPage prodAddtoWishList() {
    	addToWishList.click();
    	return new LoginPage();
    }
}
