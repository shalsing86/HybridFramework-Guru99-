package com.guru99.qa.tests;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.guru99.qa.base.TestBase;
import com.guru99.qa.pages.CreateAccountPage;
import com.guru99.qa.pages.DefaultPage;
import com.guru99.qa.pages.LoginPage;
import com.guru99.qa.pages.MobilePage;
import com.guru99.qa.pages.MyWishList;
import com.guru99.qa.pages.RegisterUser;
import com.guru99.qa.pages.ShareWishlistPage;
import com.guru99.qa.pages.ShoppingCartPage;
import com.guru99.qa.pages.TVPage;
import com.guru99.qa.utils.CommonUtilities;

public class Day5 extends TestBase {
	
	private static final String String = null;
	DefaultPage dp;
	MobilePage mp;	
	ShoppingCartPage scp;
	CreateAccountPage cp;
	RegisterUser ru;
	TVPage tv;
	ShareWishlistPage wp;
	LoginPage lp;
	MyWishList mwl;
	
	@BeforeMethod
	public void setUp() {
    	initialization();
    	dp = new DefaultPage();
    	dp.clickAccountLink();
    	cp = dp.clickMyAccountLink();
        ru = cp.clickCreateAccount();
	    
    }
	
	@DataProvider
	public Object[][] getRegisterData() {
		Object data [][]  = CommonUtilities.getTestData("sheet1");
		return data;
		
	}
	
	
	
	@Test(dataProvider= "getRegisterData")
	public void createAccount(String fname, String lname, String mail, String pass, String confPass){
		
		ru.RegisterUsers(fname, lname, mail, pass, confPass);
		
		tv = ru.clickTV();
		lp = tv.prodAddtoWishList();
		mwl = lp.Login();
		wp = mwl.shareList();
		String title = wp.shareWishlist();
		System.out.println(title);
		//Assert.assertEquals(, expected);
		
	}
	
//	//quit the application
//			@AfterMethod
//			public void close() {
//				driver.quit();
//			}

}
