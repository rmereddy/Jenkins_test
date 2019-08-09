package com.cucumberFramework.stepdefinitions;

import org.openqa.selenium.By;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.HomePage;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class homepageChatFeature extends TestBase{

	HomePage homepage = new HomePage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
	
	   @When("^i click the chat feature in the botton left of the homepage$")
	    public void i_click_the_chat_feature_in_the_botton_left_of_the_homepage() throws Throwable {
	        
		   Thread.sleep(time1);
		     driver.switchTo().frame(1);
		     try {
		    	    Thread.sleep(time2);
					if (homepage.chatFeature().isDisplayed())
					{
						homepage.chatFeature().click();
					}
				
			} catch (Exception e) {
				assert(driver.getCurrentUrl().equals("https://staging.tryhungry.com/"));
			}
		 
			
	    }

	    @Then("^the chat window should pop up on the homepage$")
	    public void the_chat_window_should_pop_up_on_the_homepage() throws Throwable {
	    	
	    	String title = driver.findElement(By.xpath("//div[text() = 'Welcome to Hungry']")).getText();
	    	
	    	
	    	System.out.println(title);
	       
	    }

}
