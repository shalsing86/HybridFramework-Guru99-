package com.guru99.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class test {
	
	public WebDriver driver;
	@Test
	public void medhod1() throws InterruptedException {
	
		for (int i=0;i<=30;i++) {
			

			System.setProperty("webdriver.chrome.driver", "C:\\Testing\\Automation\\chromedriver.exe");
			 driver = new ChromeDriver();
	//driver.manage().window().setPosition(new Point(-2000, 0));
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	driver.get("https://www.amazon.in/JIVISHA-CREATIONS-Womens-Accessories-Combo/dp/B01N34JLMN/ref=sr_1_14?crid=3GKENW2JO1DNL&keywords=jivisha+creations&qid=1554310455&s=gateway&sprefix=jivisha+cre%2Caps%2C308&sr=8-14");
	Thread.sleep(1000);
	driver.get("https://www.amazon.in/Jivisha-Creations-Beige-Lunch-Unisex/dp/B06XGBM9H1/ref=sr_1_1?crid=3GKENW2JO1DNL&keywords=jivisha+creations&qid=1554310455&s=gateway&sprefix=jivisha+cre%2Caps%2C308&sr=8-1");
	Thread.sleep(1000);
	driver.get("https://www.amazon.in/JIVISHA-CREATIONS-Girls-Jute-Lunch/dp/B06XFY976K/ref=sr_1_2?crid=3GKENW2JO1DNL&keywords=jivisha+creations&qid=1554310455&s=gateway&sprefix=jivisha+cre%2Caps%2C308&sr=8-2");
	Thread.sleep(1000);
	driver.get("https://www.amazon.in/Jivisha-Creations-Multicolour-Clips-Women/dp/B078HCDVPC/ref=sr_1_3?crid=3GKENW2JO1DNL&keywords=jivisha+creations&qid=1554310455&s=gateway&sprefix=jivisha+cre%2Caps%2C308&sr=8-3");
	Thread.sleep(1000);
	driver.get("https://www.amazon.in/quality-Bobby-Clips-Slide-Hairpins/dp/B06XKH2VMZ/ref=sr_1_4?crid=3GKENW2JO1DNL&keywords=jivisha+creations&qid=1554310455&s=gateway&sprefix=jivisha+cre%2Caps%2C308&sr=8-4");
	Thread.sleep(1100);
	driver.get("https://www.amazon.in/JIVISHA-CREATIONS-Unisex-Orange-Lunch/dp/B06XPDL6XC/ref=sr_1_5?crid=3GKENW2JO1DNL&keywords=jivisha+creations&qid=1554310455&s=gateway&sprefix=jivisha+cre%2Caps%2C308&sr=8-5");
	Thread.sleep(1000);
	//driver.get("https://www.amazon.in/Jivisha-Creations-Unisex-Double-HairBand/dp/B01MZ9LZWP/ref=sr_1_6?crid=3GKENW2JO1DNL&keywords=jivisha+creations&qid=1554310455&s=gateway&sprefix=jivisha+cre%2Caps%2C308&sr=8-6");
	//Thread.sleep(1200);
	driver.get("https://www.amazon.in/JIVISHA-CREATIONS-Jute-Green-Lunch/dp/B01M9CZCF4/ref=sr_1_7?crid=3GKENW2JO1DNL&keywords=jivisha+creations&qid=1554310455&s=gateway&sprefix=jivisha+cre%2Caps%2C308&sr=8-7");
	
	driver.get("https://www.amazon.in/JIVISHA-CREATIONS-Womens-Jute-Multicolour/dp/B01M2Z7QLX/ref=sr_1_8?crid=3GKENW2JO1DNL&keywords=jivisha+creations&qid=1554310455&s=gateway&sprefix=jivisha+cre%2Caps%2C308&sr=8-8");
	Thread.sleep(2000);
	driver.get("https://www.amazon.in/Pearls-Studded-Designer-travel-valentine/dp/B06XCPRN7N/ref=sr_1_9?crid=3GKENW2JO1DNL&keywords=jivisha+creations&qid=1554310455&s=gateway&sprefix=jivisha+cre%2Caps%2C308&sr=8-9");
	Thread.sleep(1500);
	driver.get("https://www.amazon.in/JIVISHA-CREATIONS-Womes-Shopping-Green/dp/B01NBKI7YU/ref=sr_1_10?crid=3GKENW2JO1DNL&keywords=jivisha+creations&qid=1554310455&s=gateway&sprefix=jivisha+cre%2Caps%2C308&sr=8-10");
	Thread.sleep(1100);
	driver.get("https://www.amazon.in/Black-Bobby-original-carbon-steel/dp/B07BBTJF46/ref=sr_1_11?crid=3GKENW2JO1DNL&keywords=jivisha+creations&qid=1554310455&s=gateway&sprefix=jivisha+cre%2Caps%2C308&sr=8-11");
	Thread.sleep(1500);
	driver.get("https://www.amazon.in/Jivisha-Creations-hessian-shopping-valentine/dp/B01MA5RYQA/ref=sr_1_12?crid=3GKENW2JO1DNL&keywords=jivisha+creations&qid=1554310455&s=gateway&sprefix=jivisha+cre%2Caps%2C308&sr=8-12");
	driver.quit();
	
	
		}
		
	}
}
