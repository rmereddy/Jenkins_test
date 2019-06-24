package com.cucumberFramework.stepdefinitions;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.HomePage;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class homepageButtonsAndLinks extends TestBase{

	HomePage homepage = new HomePage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	Actions action = new Actions(driver);
	
	int wait = 4000;

	
	  @Given("^i should verify that the home button is clickable$")
	    public void i_should_verify_that_the_home_button_is_clickable() throws Throwable {
	        
	      
	    
	      try {
		      homepage.homeButton().click();

			
		} catch (Exception e) {

			homepage.openMenuIcon().click();

		}
	      
	      Thread.sleep(time1);
	      
	    }

	    @Given("^i should verify that the washington dc link is clickable$")
	    public void i_should_verify_that_the_washington_dc_link_is_clickable() throws Throwable {
	      
	        
	        try {
	        	  homepage.menusButton().click();
	  	        Thread.sleep(time2);
	  	        
	  	        
	  	        homepage.menusDC().click();
			} catch (Exception e) {
				
				homepage.openMenuIcon().click();
				homepage.openMenuDCMenus().click();
		
				
			}
	        
  	        Thread.sleep(time2);

	       // driver.navigate().back();
	        
	    }

	    @Given("^i should verify that the philladelphia link is clickable$")
	    public void i_should_verify_that_the_philladelphia_link_is_clickable() throws Throwable {
	    	
		        
		        try {
		        	 homepage.menusButton().click();
				        Thread.sleep(time2);
			    	
			    	homepage.menusPA().click();
					
				} catch (Exception e) {
					homepage.openMenuIcon().click();
					homepage.openMenuPAMenus().click();
				}
		        
		        Thread.sleep(time2);

		      //  driver.navigate().back();
		        
		        
		        
	    }

	    @And("^i should verify that the mission button is clickable$")
	    public void i_should_verify_that_the_mission_button_is_clickable() throws Throwable {
	        
	        try {
	        	homepage.aboutUs().click();
	        	homepage.missionButton().click();
			} catch (Exception e) {
				homepage.openMenuIcon().click();


				homepage.openMenusMission().click();
			}
	        Thread.sleep(time2);

	    }

	    @And("^i should verify that the media button is clickable$")
	    public void i_should_verify_that_the_media_button_is_clickable() throws Throwable {
	       
	        try {
	        	homepage.aboutUs().click();

	        	 homepage.mediaButton().click();
			} catch (Exception e) {
				homepage.openMenuIcon().click();

				homepage.openMenuPress().click();
			}
 	        Thread.sleep(time2);

	    }

	    @And("^i should verify that the FAQ button is clickable$")
	    public void i_should_verify_that_the_faq_button_is_clickable() throws Throwable {
	    
	        
	        try {
	        	homepage.aboutUs().click();

	            homepage.faqButton().click();
			} catch (Exception e) {
				homepage.openMenuIcon().click();
				homepage.openMenuFAQS().click();
			}
	        Thread.sleep(time2);

	    }

	    @And("^i should verify that the testimonials button is clickable$")
	    public void i_should_verify_that_the_testimonials_button_is_clickable() throws Throwable {
	     
	    	try {
	        	homepage.aboutUs().click();

		    	homepage.testimonialsButton().click();

				
			} catch (Exception e) {
				homepage.openMenuIcon().click();
				homepage.openMenuTestimonials().click();
			}
	       
	       Thread.sleep(time2);
	    }

	    @And("^i should verify that the call us button is clickable$")
	    public void i_should_verify_that_the_call_us_button_is_clickable() throws Throwable {
	    	try {
		    	homepage.callUsButton().click();

			} catch (Exception e) {
				homepage.openMenuIcon().click();
				homepage.openMenuContactNumber().click();
			}
	    	
	    	Thread.sleep(time2);
	    }

	    @And("^i should verify that the login button is clickable$")
	    public void i_should_verify_that_the_loginsignup_button_is_clickable() throws Throwable {
	        try {
		        homepage.loginSignUpButton().click();

			} catch (Exception e) {
				homepage.openMenuIcon().click();
				homepage.openMenuLogin().click();
			}
	        Thread.sleep(time2);
	    }

	    @And("^i should verify that the see menus button is clickable$")
	    public void i_should_verify_that_the_see_menus_button_is_clickable() throws Throwable {
	        homepage.orderInDC().click();
	        Thread.sleep(wait);
	    }

	    @And("^i should verify that the get quote button is clickable$")
	    public void i_should_verify_that_the_get_quote_button_is_clickable() throws Throwable {
	       homepage.callMeNowLink().click();
	       Thread.sleep(wait);
	    }

	    @And("^i should verify that the chef network displays are clickable$")
	    public void i_should_verify_that_the_chef_network_displays_are_clickable() throws Throwable {
	       homepage.chef1().click();
	       Thread.sleep(wait);
	       driver.navigate().back();
	       
	       homepage.chef2().click();
	       Thread.sleep(wait);
	       driver.navigate().back();
	       
	       homepage.chef3().click();
	       Thread.sleep(wait);
	       driver.navigate().back();
	       
	       homepage.chef4().click();
	       Thread.sleep(wait);
	       driver.navigate().back();
	       
	       homepage.chef4().click();
	       Thread.sleep(wait);
	       driver.navigate().back();
	       
	       homepage.chef5().click();
	       Thread.sleep(wait);
	       driver.navigate().back();
	       
	       homepage.chef6().click();
	       Thread.sleep(wait);
	       driver.navigate().back();
	    }

	    @And("^i should verify that the contact us button is clickable$")
	    public void i_should_verify_that_the_contact_us_button_is_clickable() throws Throwable {
	        homepage.contactUsButton();
	        Thread.sleep(wait);
	    }

	    @And("^i should verify that the second contact us button is clickable$")
	    public void i_should_verify_that_the_second_contact_us_button_is_clickable() throws Throwable {
	        homepage.contactUsButton().click();
	        Thread.sleep(wait);
	    }

	    @And("^i should verify that the subscribe link text is clickable$")
	    public void i_should_verify_that_the_subscribe_link_text_is_clickable() throws Throwable {
	        homepage.subscribeLink();
	        Thread.sleep(wait);
	    }

	    @And("^i should verify that the terms of use link text is clickable$")
	    public void i_should_verify_that_the_terms_of_use_link_text_is_clickable() throws Throwable {
	        homepage.termsOfUseLink().click();
	        Thread.sleep(wait);
	    }

	    @And("^i should verify that the tryhungry email link text is clickable$")
	    public void i_should_verify_that_the_tryhungry_email_link_text_is_clickable() throws Throwable {
	      Thread.sleep(wait);
	    	
	    	homepage.emailLink().isDisplayed();
	    	
	    	action.moveToElement(homepage.emailLink()).perform();
	    	
	    	homepage.emailLink().click();
	       Thread.sleep(wait);
	       
	     
	    }
	    


	    @When("^i read the tryhungry email$")
	    public void i_read_the_tryhungry_email() throws Throwable {
	       
	    }

	    @Then("^i should see that the email link is correctly spelled as \"([^\"]*)\"$")
	    public void i_should_see_that_it_is_correct_spelled_as_something(String strArg1) throws Throwable {
	      String actual = homepage.emailLink().getText();
	    	assert(actual.equals(strArg1))	;
	    }


}
