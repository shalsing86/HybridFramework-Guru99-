package com.guru99.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99.qa.base.TestBase;

public class MyWishList extends TestBase{

	
	@FindBy(xpath="//span[text()='Share Wishlist']")
	WebElement shareWishButton;
	
	public MyWishList() {
		PageFactory.initElements(driver, this);
	}
	
	public ShareWishlistPage shareList() {
		shareWishButton.click();
		return new ShareWishlistPage();
	}
}
