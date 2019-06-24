package com.cucumberFramework.stepdefinitions;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.HomePage;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class seeMenusButton extends TestBase{

	HomePage homepage = new HomePage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);

    @When("^i click on the see menus button$")
    public void i_click_on_the_see_menus_button() throws Throwable {
        homepage.orderInDC().click();
    }

  

    
    
}
