package com.guru99.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.guru99.qa.base.TestBase;
import com.guru99.qa.pages.DefaultPage;
import com.guru99.qa.pages.MobilePage;

public class Day2 extends TestBase {
	DefaultPage dp;
	MobilePage mp;
	
	
	public Day2() {
		super();
	}

	@BeforeMethod
	public void setUp() {
    	initialization();
    	dp = new DefaultPage();
    	mp = dp.clickMobile();	  	
    }
	
	@Test(priority = 1 )
	public void SonyXperiaPriceMatchTest() throws Exception {
	String price1 = mp.getSonyXperiaPriceMobilePage();
	String price2 = mp.getSonyXperiaPriceDetailPAge();
	Assert.assertEquals(price1, price2, "Prices do not match");
	System.out.println("Price Matched");
	
	}
	
	//quit the application
		@AfterMethod
		public void close() {
			driver.quit();
		}
	
}
