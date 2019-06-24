package com.cucumberFramework.stepdefinitions;

import org.testng.Assert;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.HomePage;
import com.cucumberFramework.pageObjects.contactUsPage;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class contactUs extends TestBase{

	HomePage homepage = new HomePage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);

	contactUsPage contact = new contactUsPage(driver);
	
	

    @When("^i click the contact us button$")
    public void i_click_the_contact_us_button() throws Throwable {
    
    	homepage.contactUsButton().click();
    	Thread.sleep(time);

    }

    @When("^i click the get quote button$")
    public void i_click_the_get_quote_button() throws Throwable {

    	homepage.callMeNowLink().click();
    	Thread.sleep(time);


    }
    
    @Then("^I should see a confirmation page that says a hungry rep will contact me$")
    public void i_should_see_a_confirmation_page_that_says_a_hungry_rep_will_contact_me() throws Throwable {
      String actual = contact.confirmation().getText();

    	assert(actual.startsWith("Thank you"));
     	Thread.sleep(time);

    }

    @Then("^i should see error messages$")
    public void i_should_see_error_messages() throws Throwable {

    	assert(contact.errorMessage().isDisplayed());
     	Thread.sleep(time);

    
    }

    @And("^i enter my name$")
    public void i_enter_my_name() throws Throwable {
       contact.fullName().sendKeys("Tahiru Nasuru");
    	Thread.sleep(time);

    }

    @And("^my company name$")
    public void my_company_name() throws Throwable {
        contact.company().sendKeys("Test Company");
        
    }

    @And("^my email$")
    public void my_email() throws Throwable {
        contact.email().sendKeys("hungrytestemail@gmail.com");
    }

    @And("^my phone number$")
    public void my_phone_number() throws Throwable {
        contact.phoneNumber().sendKeys("1111111111");
     	Thread.sleep(time);

    }

    @And("^i click submit$")
    public void i_click_submit() throws Throwable {
        contact.submit().click();
    }
}
