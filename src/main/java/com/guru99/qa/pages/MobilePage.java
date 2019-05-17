package com.guru99.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import com.guru99.qa.base.TestBase;

public class MobilePage extends TestBase {
	
	//Page Factory - OR
	
	@FindBy(xpath="//select[@title='Sort By']")
     WebElement SortByDropdown;
	
	@FindBy(xpath ="//img[contains(@id,'product-collection-image-1')]")
	WebElement detailsonyXperiaLink;
	
	@FindBy(xpath="//span[contains(@class,'price')]")
	WebElement detailsonyPrice;
	
	
	@FindBy(xpath="//span[contains(@id,'price')]")
	WebElement sonyPrice;
	
	@FindBy(xpath = "//span[text()='Add to Cart']")
	WebElement addToCartSonybutton;
	
	@FindBy(xpath = "//a[@href='http://live.guru99.com/index.php/catalog/product_compare/add/product/1/uenc/aHR0cDovL2xpdmUuZ3VydTk5LmNvbS9pbmRleC5waHAvbW9iaWxlLmh0bWw,/form_key/4pJFRY3TWBdEkfTF/']")
	WebElement sonyAddtoCart;
	
	@FindBy(xpath = "//a[@href='http://live.guru99.com/index.php/catalog/product_compare/add/product/2/uenc/aHR0cDovL2xpdmUuZ3VydTk5LmNvbS9pbmRleC5waHAvbW9iaWxlLmh0bWw,/form_key/4pJFRY3TWBdEkfTF/']")
	WebElement iPhoneAddtoCart;
	
	@FindBy(xpath = "//span[text()='Compare']")
	WebElement compareButton;
	
    public MobilePage() {
    	PageFactory.initElements(driver, this);
    }
    
    public String verifyMobilePageTitle() {
    	return driver.getTitle();
    }
	
     
    public void selectDropdownByName() {
    	Select drop = new Select(SortByDropdown);
    	drop.selectByIndex(1);
    }
    
    public String getSonyXperiaPriceMobilePage() {
    	
    	return sonyPrice.getText();
    }
    
    public String getSonyXperiaPriceDetailPAge() {
    	detailsonyXperiaLink.click();
    	return detailsonyPrice.getText();
    }
    
    public ShoppingCartPage addToCartSony() {
    	 addToCartSonybutton.click();
    	 return new ShoppingCartPage();
   
    }
    
    public void addtoCompare() {
    	sonyAddtoCart.click();
    	
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("windows.scroll(0,600)");
    	iPhoneAddtoCart.click();
    	
    	compareButton.click();
    	
    	
    }
//    public void Sorted() {
// 
//        LinkedList<String> pn=new LinkedList<String>();    
//        for(int i=0;i<li.size();i++)    
//        {    
//             //just displaying the product names    
//            System.out.println(li.get(i).getText());    
//            pn.add(li.get(i).getText());    
//        }    
//        boolean result = comp_order(pn);   
//        System.out.println(result);
//        
//        if(result==true)
//        {
//        	System.out.println("Sorted");
//        	
//        }
//        else
//        {
//        	System.out.println("Unsorted");
//        }
//        driver.close();
//        
//        	
//    	}
//    
//    
////alphabetical order checking  
//	public static boolean comp_order(LinkedList<String> pn)    
//	{           
//	    String prev=""; // empty string    
//	    for (final String cur: pn)    
//	    {    
//	        if (cur.compareTo(prev) < 0)    
//	        {    
//	        	System.out.println(cur.compareTo(prev));
//	            return false;     
//	        }  
//	        System.out.println(cur.compareTo(prev));
//	        prev=cur;    
//	    }  	
//	    return true; 
//	    
//	    }
    }
	


