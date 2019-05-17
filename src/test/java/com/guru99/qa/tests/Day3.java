package com.guru99.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.guru99.qa.base.TestBase;
import com.guru99.qa.pages.DefaultPage;
import com.guru99.qa.pages.MobilePage;
import com.guru99.qa.pages.ShoppingCartPage;

public class Day3 extends TestBase {
	DefaultPage dp;
	MobilePage mp;	
	ShoppingCartPage scp;
	
	@BeforeMethod
	public void setUp() {
    	initialization();
    	dp = new DefaultPage();
    	mp = dp.clickMobile();	  	
    }
	
	@Test
	public void addtoCartTest() {
		scp = mp.addToCartSony();
	}
	
	//quit the application
			@AfterMethod
			public void close() {
				driver.quit();
			}
		

}
