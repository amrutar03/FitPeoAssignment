package com.Fitpeo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage1 {
	 WebDriver driver;

	    @FindBy(xpath = "//div[contains(text(),'Revenue Calculator')]")
	    WebElement revenueCalculatorBtn;

	    public HomePage1(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void clickOnRevenue() {
	        revenueCalculatorBtn.click();
	        
	    }
}
