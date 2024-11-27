package com.Fitbeo.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.Fitbeo.dataprovider.ConfigReader;
import com.Fitpeo.browserfactory.BrowserFactory;

public class BaseClass {

	public WebDriver driver;
	@BeforeMethod
     public void startupBrowser()
     {
		System.out.println("LOG-INFO:: Starting Browser...");
        driver = BrowserFactory.startBrowser(ConfigReader.getProperty("browser"), ConfigReader.getProperty("url"));
        System.out.println("LOG-INFO:: Application is up and running.");
     }

		
		  @AfterMethod
		  public void closeBrowser() 
		  {
		  System.out.println("LOG-INFO:: Close Browser"); 
		  driver.quit();
		  }
		 


}
