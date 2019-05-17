package com.guru99.qa.tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid {
	//WebDriver driver;

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		
//		ChromeOptions option = new ChromeOptions();
//		option.merge(cap);
		
		String huburl = "http://192.168.1.17:4443/wd/hub";
		
		WebDriver driver = new RemoteWebDriver(new URL(huburl),cap);
		
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
