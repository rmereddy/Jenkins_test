package com.cucumberFramework.stepdefinitions;

import org.testng.annotations.Test;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.HomePage;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Homepage extends TestBase{

	HomePage homepage = new HomePage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	

@Given("^i am on the try hungry homepage I should see that the page title is \"([^\"]*)\"$")
public void i_am_on_the_try_hungry_homepage_I_should_see_that_the_page_title_is(String arg1) throws Throwable {
	        
	        
	        String actual = driver.getTitle();
	        
	         
	         assert(actual.equals(arg1));
	         
	    }

    
    
	
}