package com.cucumberFramework.stepdefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.HomePage;
import com.cucumberFramework.pageObjects.checkoutPage;
import com.cucumberFramework.pageObjects.chooseMenuPage;
import com.cucumberFramework.pageObjects.customizeMenuPage;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class checkOutSmoke extends TestBase{
	 

			HomePage homepage = new HomePage(driver);
			WaitHelper waitHelper = new WaitHelper(driver);
			
		    chooseMenuPage menu = new chooseMenuPage(driver);
		    customizeMenuPage cus = new customizeMenuPage(driver);
		    checkoutPage checkout = new checkoutPage(driver);
		  
		    
		    Actions mouse = new Actions(driver);
		    
		    JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	
	
	   @Given("^i am on the checkout page$")
	    public void i_am_on_the_checkout_page() throws Throwable {
	       System.out.println(checkout.checkoutHeader().getText());
	       String actual = checkout.checkoutHeader().getText();
	        
	         
	         assert(actual.startsWith("CHECKOUT"));
	      //Assert.assertTrue(checkout.checkoutHeader().getText().equalsIgnoreCase("CHECKOUT DETAILS"));
	    }

	    @When("^i enter the first name$")
	    public void i_enter_the_first_name() throws Throwable {
	        checkout.firstName().sendKeys("Tahiru");
	    }

	    @Then("^i should succesfully place my order$")
	    public void i_should_succesfully_place_my_order() throws Throwable {

	    	waitHelper.WaitForElement(checkout.orderConfirmation(), 30);
	    	String actual = checkout.orderConfirmation().getText();
	    	
	         assert(actual.startsWith("Your Order"));
	    }
	    
	    @Then("^i should not be able to checkout$")
	    public void i_should_not_be_able_to_checkout() throws Throwable {
	    	
	    	String actual = checkout.checkoutHeader().getText();
	         assert(actual.startsWith("CHECKOUT"));
	    	 Thread.sleep(time);
	    	 }


	    @And("^i enter the last name$")
	    public void i_enter_the_last_name() throws Throwable {
	    	checkout.lastName().sendKeys("Nasuru");
	    }

	    @And("^i enter the a phone number$")
	    public void i_enter_the_a_phone_number() throws Throwable {
	        checkout.phoneNumber().sendKeys("2023779676");

	    }

	    @And("^i enter my email address$")
	    public void i_enter_my_email_address() throws Throwable {
	        checkout.emailAddress().sendKeys("hungrytestemail@gmail.com");

	    }

	    @And("^i enter my company name$")
	    public void i_enter_my_company_name() throws Throwable {
	        checkout.companyName().sendKeys("Test Company");

	    }

	    @And("^i enter my company address$")
	    public void i_enter_my_company_address() throws Throwable {
	        checkout.address().sendKeys("1330 test address");

	    }

	    @And("^i enter my company suite$")
	    public void i_enter_my_company_suite() throws Throwable {
	        checkout.suite().sendKeys("311");

	    }

	    @And("^i enter my city$")
	    public void i_enter_my_city() throws Throwable {
	        checkout.city().sendKeys("test city");

	    }

	    @And("^i enter my state$")
	    public void i_enter_my_state() throws Throwable {
	        checkout.state().sendKeys("DC");

	    }

	    @And("^i enter the zip code$")
	    public void i_enter_my_zip_code() throws Throwable {
	    	checkout.zipCode().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
	        checkout.zipCode().sendKeys("20001");

	    }

	    @And("^i enter delivery instructions$")
	    public void i_enter_delivery_instructions() throws Throwable {
	    	
	    	checkout.deliveryInstructions().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));

	        checkout.deliveryInstructions().sendKeys("testing service instructions");
	        jse.executeScript("window.scrollBy(0,350)", "");

	    }

	    @And("^i choose the building point of access$")
	    public void i_choose_the_building_point_of_access() throws Throwable {
	       checkout.frontDoorAccess().click();

	    }

	    @And("^i specify security checkin$")
	    public void i_specify_security_checkin() throws Throwable {
	        checkout.yesSecurityCheckIn().click();

	    }

	    @And("^i enter my credit card name$")
	    public void i_enter_my_credit_card_name() throws Throwable {


	    	checkout.nameOnCard().sendKeys("Test Card");
	      
	    }

	    @And("^i enter my credit card number$")
	    public void i_enter_my_credit_card_number() throws Throwable {
	    	driver.switchTo().frame(driver.findElement(By.id("braintree-hosted-field-number")));

	        checkout.ccNumber().sendKeys("4111111111111111");
	        driver.switchTo().defaultContent();
	        

	    }

	    @And("^i enter my credit card expiration date$")
	    public void i_enter_my_credit_card_expiration_date() throws Throwable {
	    	driver.switchTo().frame(driver.findElement(By.id("braintree-hosted-field-expirationDate")));

	        checkout.ccExpDate().sendKeys("1119");
	        driver.switchTo().defaultContent();

	    }

	    @And("^i enter my credit card cvv$")
	    public void i_enter_my_credit_card_cvv() throws Throwable {
	    	driver.switchTo().frame(driver.findElement(By.id("braintree-hosted-field-cvv")));

	        checkout.ccCvv().sendKeys("211");
	        
	        driver.switchTo().defaultContent();

	    }

	    @And("^i enter to save my card on file$")
	    public void i_enter_to_save_my_card_on_file() throws Throwable {
	        checkout.saveCardOnFile().click();

	    }

	    @And("^i click place order$")
	    public void i_click_place_order() throws Throwable {
	    	
	    
	        checkout.placeOrder().click();
	      
	        

	    }

	    


}
