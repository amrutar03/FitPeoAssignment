package com.Fitpeo.testcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Fitbeo.base.BaseClass;
import com.Fitpeo.pageobjects.HomePage1;

public class HomePageTest1 extends BaseClass {
	HomePage1 home;

    @Test
    public void homepageToApplication() {
        home = new HomePage1(driver);

        // Navigate to the revenue calculator page
        home.clickOnRevenue();
        Reporter.log("Clicked on Revenue Calculator");
}
}