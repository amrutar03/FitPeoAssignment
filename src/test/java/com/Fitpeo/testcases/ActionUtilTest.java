package com.Fitpeo.testcases;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Fitbeo.base.BaseClass;
import com.Fitpeo.pageobjects.ActionUtilPage;

import com.Fitpeo.pageobjects.HomePage1;

public class ActionUtilTest extends BaseClass {
	ActionUtilPage actionUtils;
	HomePage1 homePage;
      @Test
    public void testAdjustSliderByTextValue() {
        // Initialize the ActionUtilPage
        actionUtils = new ActionUtilPage(driver);
        homePage = new HomePage1(driver);

        // Navigate to Revenue Calculator Page
        homePage.clickOnRevenue();
        System.out.println("Navigated to Revenue Calculator Page");
      // Initialize the ActionUtilPage
      actionUtils = new ActionUtilPage(driver);
   // Scroll to the element
      actionUtils.scrollToElement(actionUtils.getExampleDomainHeader());
      Reporter.log("Scrolled to the specified element");

        // Navigate to a test page with a slider
        Reporter.log("Navigated to the slider test page");
		  // Adjust the slider value
			  actionUtils.adjustSliderByTextValue(820);
			  Reporter.log("Adjusted the slider value to 820");
			  // Verify if the slider value is updated 
			  String actualValue=actionUtils.getSliderInput().getAttribute("value");
			  Assert.assertEquals(actualValue, "820",
			  "Slider value did not update correctly");
			  Reporter.log("Verified that the slider value is set to 820");
			 
      }
}
			  
			  /////////////////////////////////
			
	          
	
				/*
				 * @Test public void testSliderAdjuestmentTest() {
				 * 
				 * // Initialize the ActionUtilPage actionUtils = new ActionUtilPage(driver);
				 * homePage = new HomePage1(driver);
				 * 
				 * // Navigate to Revenue Calculator Page homePage.clickOnRevenue();
				 * System.out.println("Navigated to Revenue Calculator Page"); // Initialize the
				 * ActionUtilPage actionUtils = new ActionUtilPage(driver); // Scroll to the
				 * element actionUtils.scrollToElement(actionUtils.getExampleDomainHeader());
				 * Reporter.log("Scrolled to the specified element");
				 * 
				 * // Adjust the slider to 820 actionUtils.adjustSlider(820);
				 * 
				 * // Verify the text field value is updated to 820 String updatedValue =
				 * actionUtils.getTextFieldValue(); Assert.assertEquals(updatedValue, "820",
				 * "Slider did not adjust correctly to 820."); }
				 */
			  
			  
    
			  
			  
			  
			  
			  
			  
			/*
			 * // Perform the action to adjust the slider (this might vary based on your UI)
			 * Actions actions = new Actions(driver);
			 * 
			 * // Adjust the slider (example: drag and drop) int targetValue = 820; //
			 * Assuming slider operates on a drag-and-drop principle
			 * actions.dragAndDropBy(actionUtils.getExampleDomainHeader(), targetValue,
			 * 0).perform();
			 * 
			 * // Wait for the value to update WebDriverWait wait = new
			 * WebDriverWait(driver, Duration.ofSeconds(10));
			 * wait.until(ExpectedConditions.textToBePresentInElement(actionUtils.
			 * getExampleDomainHeader(), String.valueOf(targetValue)));
			 * 
			 * // Verify the slider value String actualSliderValue =
			 * actionUtils.getExampleDomainHeader().getText();
			 * System.out.println("Actual Slider Value: " + actualSliderValue); // Optional
			 * logging
			 */
      
   
