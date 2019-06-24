package com.cucumberFramework.stepdefinitions;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.HomePage;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class homepageLinks extends TestBase{

	HomePage homepage = new HomePage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
	
    @Given("^i am on the tryhungry homepage$")
    public void i_am_on_the_tryhungry_homepage() throws Throwable {
        
    }

    @When("^i count the number of buttons and links on the homepage$")
    public void i_count_the_number_of_buttons_and_links_on_the_homepage() throws Throwable {
        
    }

    @Then("^i should see that there are more than 20 buttons and links on the homepage$")
    public void i_should_see_that_there_are_more_than_20_buttons_and_links_on_the_homepage() throws Throwable {
        assert(homepage.links().size() > 25);
    }

	

}
