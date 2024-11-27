package com.Fitpeo.browserfactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	 static WebDriver driver;

	    public static WebDriver getBrowserInstance() {
	        return driver;
	    }

	    public static WebDriver startBrowser(String browserName, String ApplicationURL) {
			/*
			 * if (browserName.equalsIgnoreCase("chrome")) {
			 * WebDriverManager.chromedriver().browserVersion("131").setup(); // Ensures
			 * ChromeDriver matches the browser version ChromeOptions options = new
			 * ChromeOptions(); options.addArguments("--remote-allow-origins=*"); driver =
			 * new ChromeDriver(options); } else if
			 * (browserName.equalsIgnoreCase("firefox")) {
			 * WebDriverManager.firefoxdriver().setup(); FirefoxOptions options = new
			 * FirefoxOptions(); driver = new FirefoxDriver(options); } else if
			 * (browserName.equalsIgnoreCase("safari")) { driver = new SafariDriver(); }
			 * else { throw new IllegalArgumentException("Browser not supported: " +
			 * browserName); }
			 */
			/*
			 * System.setProperty("webdriver.chrome.driver",
			 * "C://ChromeDriver//chromedriver.exe"); WebDriver driver = new ChromeDriver();
			 */
			
			  if (browserName.equalsIgnoreCase("chrome")) {
			  WebDriverManager.chromedriver().browserVersion("131").setup(); // Match your
		      ChromeOptions options = new ChromeOptions();
			  options.addArguments("--remote-allow-origins=*"); driver = new
			  ChromeDriver(options); } else { throw new
			  IllegalArgumentException("Browser not supported: " + browserName); }
			 
	        
	        driver.manage().window().maximize();
	        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(20));
	        driver.get(ApplicationURL);
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        return driver;
	    }
	}



