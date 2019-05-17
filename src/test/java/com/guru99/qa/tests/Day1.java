package com.guru99.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.guru99.qa.base.TestBase;
import com.guru99.qa.pages.DefaultPage;
import com.guru99.qa.pages.MobilePage;

public class Day1 extends TestBase {
	DefaultPage dp;
	MobilePage mp;
	
	public Day1() {
		super();
	}

	//initialize browser and launch the url
	@BeforeMethod
    public void setUp() {
    	initialization();
    	dp = new DefaultPage();
    	
    	
    }
	
	//validate default page title
	@Test(priority =1 )
	public void getPageTitle() {
		String title = dp.verifyDefaultPageTitle();
		System.out.println(title);
		Assert.assertEquals("THIS IS DEMO SITE FOR   ", title, "Page Title do not match");		
	}
	
	//validate clicking on Mobile link and sorting the mobile with name
	@Test(priority =2 )
	public void clickMobile() throws Exception {
	 mp = dp.clickMobile();	
	 String title= mp.verifyMobilePageTitle();
	 Assert.assertEquals(title, "Mobile", "Mobile Page Title do not match");
	 System.out.println("Mobile Page Title matches");
	 mp.selectDropdownByName();
	 Thread.sleep(5000);
	 
	}
	
	
	//quit the application
	@AfterMethod
	public void close() {
		driver.quit();
	}
}
