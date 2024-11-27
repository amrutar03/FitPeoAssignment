package com.Fitpeo.pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionUtilPage {
	 WebDriver driver;
	 private WebDriverWait wait;
	    // Define elements using @FindBy
	    @FindBy(xpath = "//h4[normalize-space()='Medicare Eligible Patients']") 
	    private WebElement exampleDomainHeader;

	    
	    @FindBy(xpath ="//span[@class='MuiSlider-root MuiSlider-colorPrimary MuiSlider-sizeMedium css-16i48op']//following::input[contains(@type,'range')]")
	    private WebElement slider;
	    
	    @FindBy(xpath = "//*[contains(@class,'MuiBox-root css-j7qwjs')]//following::input[contains(@aria-invalid,'false')]") 
	    private WebElement sliderTextInput;//slider
//
	    //  //h4[normalize-space()='Medicare Eligible Patients']//following::input[contains(@aria-invalid,'false')]
	    // Constructor to initialize elements
	    public ActionUtilPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	 // Getter for exampleDomainHeader
	    public WebElement getExampleDomainHeader() {
	        return exampleDomainHeader;
	    } 
	    // Getter for slider
	    public WebElement getSliderInput() {
	        return sliderTextInput;
	    }
	    
	    // real code
	    // Scroll to a specific element
	    public void scrollToElement(WebElement element) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.visibilityOf(element));
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	    }

	    // Adjust slider by entering a value
	    public void adjustSliderByTextValue(int targetValue) {
	    	
	        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	sliderTextInput.clear();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        sliderTextInput.sendKeys(String.valueOf(targetValue));
	     
	    }
	    
	    
	  
		/*
		 * // Method to adjust the slider to a target value public void adjustSlider(int
		 * targetValue) { // Wait for the slider input to be visible
		 * wait.until(ExpectedConditions.visibilityOf(slider));
		 * 
		 * // Get the min and max values of the slider int min =
		 * Integer.parseInt(slider.getAttribute("min")); int max =
		 * Integer.parseInt(slider.getAttribute("max"));
		 * 
		 * if (targetValue < min || targetValue > max) { throw new
		 * IllegalArgumentException("Target value is out of range"); }
		 * 
		 * // Calculate the percentage of the slider to move double percentage =
		 * (targetValue - min) * 1.0 / (max - min);
		 * 
		 * // Get the width of the slider to calculate the x offset int sliderWidth =
		 * slider.getSize().getWidth(); int xOffset = (int) (sliderWidth * percentage);
		 * 
		 * // Use Actions to drag the slider to the target value Actions actions = new
		 * Actions(driver); actions.clickAndHold(slider).moveByOffset(xOffset,
		 * 0).release().perform(); }
		 * 
		 * // Method to get the current value of the text field public String
		 * getTextFieldValue() { return sliderTextInput.getAttribute("value"); }
		 */
}
