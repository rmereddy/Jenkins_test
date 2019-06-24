package com.cucumberFramework.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.HomePage;
import com.cucumberFramework.pageObjects.checkoutPage;
import com.cucumberFramework.pageObjects.chooseMenuPage;
import com.cucumberFramework.pageObjects.customizeMenuPage;
import com.cucumberFramework.pageObjects.loginPage;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login extends TestBase{

	HomePage homepage = new HomePage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
    chooseMenuPage menu = new chooseMenuPage(driver);
    customizeMenuPage cus = new customizeMenuPage(driver);
    checkoutPage checkout = new checkoutPage(driver);
    loginPage login=new loginPage(driver);
    

    
    Actions mouse = new Actions(driver);
    
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    

    @Given("^i am on the login page$")
    public void i_am_on_the_login_page() throws Throwable {
    	

		    homepage.loginSignUpButton().click();

		
    	

    	
      assert(login.signInHeader().getText().startsWith("Sign"));
       
        
    }

    @When("^i enter my email$")
    public void i_enter_my_email() throws Throwable {
        login.email().sendKeys("tahiru@tryhungry.com");
        
    }

    @When("^i click on the sign in button$")
    public void i_click_on_the_sign_in_button() throws Throwable {
       checkout.login().click();
    }

    @Then("^i should successfully sign into my user account and profile$")
    public void i_should_successfully_sign_into_my_user_account_and_profile() throws Throwable {
      try {
    	  if (login.myAccount().isDisplayed())
    	  {
    		  assert(login.myAccount().isDisplayed());
    	  }
		
	} catch (Exception e) {
		assert(driver.findElement(By.cssSelector("#app > div > div.homepage-container > header > div > a")).isDisplayed());
		
	} 
       
    }

    @Then("^I should sign in and my profile information should prefill my checkout page$")
    public void i_should_sign_in_and_my_profile_information_should_prefill_my_checkout_page() throws Throwable {
        assert(checkout.myAccount().isDisplayed());
    }

    @And("^i enter my password$")
    public void i_enter_my_password() throws Throwable {
        login.password().sendKeys("gotmoney");
    }

    @And("^i click the sign in button$")
    public void i_click_the_sign_in_button() throws Throwable {
        login.signIn().click();
    }

    @When("^i enter an invalid email \"([^\"]*)\"$")
    public void i_enter_an_invalid_email_something(String strArg1) throws Throwable {
        login.email().sendKeys(strArg1);
    }
    
    @And("^i enter an invalid password \"([^\"]*)\"$")
    public void i_enter_an_invalid_password_something(String strArg1) throws Throwable {
        login.password().sendKeys(strArg1);
    }

    @Then("^i should not be able to sign into my user account and profile$")
    public void i_should_not_be_able_to_sign_into_my_user_account_and_profile() throws Throwable {
        assert(login.signInHeader().getText().startsWith("Sign"));

    }

	    @Given("^i am on the mobile view login page$")
	    public void i_am_on_the_mobile_view_login_page() throws Throwable {
	    	
	    	try {
	    		if (driver.findElement(By.cssSelector("#app > div > div.homepage-container > header > div > a")).isDisplayed())
	    		{
	    		 	driver.findElement(By.cssSelector("#app > div > div.homepage-container > header > div > a")).click();
	    	   		Thread.sleep(time);  
	    	   		driver.findElement(By.cssSelector(".nav-container-hamburger__inner-link-container > div:nth-child(9) > a:nth-child(1)")).click();
	    	   		
	    		}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
	    	
	    	
	    
	    }

	    @Then("^i should successfully sign into my mobile view user account and profile$")
	    public void i_should_successfully_sign_into_my_mobile_view_user_account_and_profile() throws Throwable {

	    	assert(driver.findElement(By.cssSelector("#app > div > div.homepage-container > header > div > a")).isDisplayed());

	    }
	



}
