package com.guru99.qa.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.guru99.qa.base.TestBase;
import com.guru99.qa.pages.DefaultPage;
import com.guru99.qa.pages.MobilePage;
import com.guru99.qa.pages.ShoppingCartPage;

public class Day4 extends TestBase {
	
	//TestCase: compare two products
	DefaultPage dp;
	MobilePage mp;	
	ShoppingCartPage scp;
	
	@BeforeMethod
	public void setUp() {
    	initialization();
    	dp = new DefaultPage();
    	mp = dp.clickMobile();
    	JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
    }
	
	@Test
	public void comparePhoneTest() {
		mp.addtoCompare();
	}
	
	//quit the application
			@AfterMethod
			public void close() {
				driver.quit();
			}
		

}
