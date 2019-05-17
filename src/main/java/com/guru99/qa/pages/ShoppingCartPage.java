package com.guru99.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage {

	@FindBy(xpath="//input[@title='Qty']")
	WebElement product;
	
}
