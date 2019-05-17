package com.guru99.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.guru99.qa.utils.WebEventListener;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
    public static WebEventListener eventListener;
	
	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\shalu.singh\\eclipse-workspace\\Guru99Test\\src\\main"
					 +"\\java\\com\\guru99\\qa\\config\\config.properties");
			prop.load(ip);
		}
		
		
	catch (FileNotFoundException e) {
		e.printStackTrace();
	}catch (IOException e) {
		e.printStackTrace();
	}
	}

	
	public static void initialization()
	{ 
		
		 String browsername = prop.getProperty("browser");
		 int pageload_time_out = Integer.parseInt(prop.getProperty("page_load_timeout"));
		 int implicit_wait = Integer.parseInt(prop.getProperty("implicit_wait"));
		 
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Testing\\Automation\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browsername.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Testing\\Automation\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		e_driver = new EventFiringWebDriver(driver);

		// Now create object of EventListerHandler to register it with EventFiringWebDriver

		eventListener = new WebEventListener();

		e_driver.register(eventListener);

		driver = e_driver;

		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(pageload_time_out, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(implicit_wait, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}

}
