package com.cucumberFramework.stepdefinitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.AdminClientsPage;
import com.cucumberFramework.pageObjects.ClientPortal;
import com.cucumberFramework.pageObjects.EmailVerification;
import com.cucumberFramework.pageObjects.HomePage;
import com.cucumberFramework.pageObjects.NetAndMultiOrderPage;
import com.cucumberFramework.pageObjects.UserPage;
import com.cucumberFramework.pageObjects.adminChefPage;
import com.cucumberFramework.pageObjects.adminLoginPage;
import com.cucumberFramework.pageObjects.adminSalesPage;
import com.cucumberFramework.pageObjects.checkoutPage;
import com.cucumberFramework.pageObjects.chooseMenuPage;
import com.cucumberFramework.pageObjects.customizeMenuPage;
import com.cucumberFramework.pageObjects.loginPage;
import com.cucumberFramework.pageObjects.signUpPage;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ClientPortal_MyAccount extends TestBase{

	HomePage homepage = new HomePage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
    chooseMenuPage menu = new chooseMenuPage(driver);
    customizeMenuPage cus = new customizeMenuPage(driver);
    checkoutPage checkout = new checkoutPage(driver);
    loginPage login=new loginPage(driver);
    adminLoginPage admin = new adminLoginPage(driver);
    adminChefPage chef = new adminChefPage(driver);
    adminSalesPage sales = new adminSalesPage(driver);
    AdminClientsPage clients = new AdminClientsPage(driver);  
    UserPage users = new UserPage(driver);
    NetAndMultiOrderPage net = new NetAndMultiOrderPage(driver);
    EmailVerification email = new EmailVerification(driver);
    ClientPortal account = new ClientPortal(driver);
    signUpPage create = new signUpPage (driver);
    
    
    
    String order;


    
    
    Actions mouse = new Actions(driver);
    
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    
    
    @When("^i click on the forgot password link$")
    public void i_click_on_the_forgot_password_link() throws Throwable {
         account.forgotPassword().click();
    }

    @When("^i click on create your hungry account$")
    public void i_click_on_create_your_hungry_account() throws Throwable {
        create.createNewAccount().click();
    }

    @Then("^i should successfully update my account profile \"([^\"]*)\"$")
    public void i_should_successfully_update_my_account_profile_something(String strArg1) throws Throwable {
        
    	waitHelper.WaitForElement(account.saveProfileConfirmation(), 10);
    	System.out.println(account.saveProfileConfirmation().getText());

    	assert(account.saveProfileConfirmation().getText().equals(strArg1));
    	

    }

    @Then("^i should navigate to customize menu page$")
    public void i_should_navigate_to_customize_menu_page() throws Throwable {
        assert(cus.customizeMenuHeader().isDisplayed());
    }

    @Then("^i should succesfully change my password \"([^\"]*)\"$")
    public void i_should_succesfully_change_my_password_something(String strArg1) throws Throwable {
        waitHelper.WaitForElement(account.saveProfileConfirmation(), 10);
        assert(account.saveProfileConfirmation().getText().equals(strArg1));
        
    }

    @Then("^i get the temp password requested and be able to use it to login$")
    public void i_get_the_temp_password_requested_and_be_able_to_use_it_to_login() throws Throwable {

    	
    
    
    }

    @Then("^i should successfully request a temp password$")
    public void i_should_successfully_request_a_temp_password() throws Throwable {
        throw new PendingException();
    }

    @Then("^i should successfully create an account \"([^\"]*)\"$")
    public void i_should_successfully_create_an_account_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @Then("^i should successfully save the credit card \"([^\"]*)\"$")
    public void i_should_successfully_save_the_credit_card_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @Then("^i should successfully delete the credit card$")
    public void i_should_successfully_delete_the_credit_card() throws Throwable {
        throw new PendingException();
    }

    @And("^i navigate to my account profile$")
    public void i_navigate_to_my_account_profile() throws Throwable {
    	account.myAccount().click();
    	waitHelper.WaitForElement(account.editProfile(), 10);
        account.editProfile().click();
    }

    @And("^i enter my new company name \"([^\"]*)\"$")
    public void i_enter_my_new_company_name_something(String strArg1) throws Throwable {
       account.company().sendKeys(Keys.chord(Keys.COMMAND,"a",Keys.DELETE));
       account.company().sendKeys(strArg1);
    }

    @And("^i enter my new address \"([^\"]*)\"$")
    public void i_enter_my_new_address_something(String strArg1) throws Throwable {

    	account.address().sendKeys(Keys.chord(Keys.COMMAND,"a",Keys.DELETE));

    	account.address().sendKeys(strArg1);
    
    }

    @And("^i click the save button to update the profile details$")
    public void i_click_the_save_button_to_update_the_profile_details() throws Throwable {

        
    	account.save().click();
    	

    }

    @And("^i navigate to my orders$")
    public void i_navigate_to_my_orders() throws Throwable {
    	
    	waitHelper.WaitForElement(account.myOrders(), 10);
    	account.myOrders().click();
        
    }

    @And("^i locate order and click on customize order link$")
    public void i_locate_order_and_click_on_customize_order_link() throws Throwable {
        
    	account.customizeLink().click();
    }

    @And("^i should be able to edit and update my order$")
    public void i_should_be_able_to_edit_and_update_my_order() throws Throwable {
       // edit head count
    	cus.howMany().sendKeys(Keys.chord(Keys.COMMAND,"a",Keys.DELETE));
        cus.howMany().sendKeys(Keys.chord(Keys.COMMAND,"a",Keys.DELETE));

        cus.howMany().sendKeys("14");
        
        //edit zip code
        cus.zipCode().sendKeys(Keys.chord(Keys.COMMAND,"a",Keys.DELETE));
        cus.zipCode().sendKeys("20904");
        
        //edit date
        cus.date().click();
	 	 cus.dayFifteen().click();
	 	 Thread.sleep(time);
	        
	        //edit first entree
	    	cus.entreeQTY().get(1).sendKeys(Keys.chord(Keys.COMMAND,"a",Keys.DELETE));
	        cus.entreeQTY().get(1).sendKeys(Keys.chord(Keys.COMMAND,"a",Keys.DELETE));
	        cus.entreeQTY().get(1).sendKeys("10");
	        
	        
	        //apply promo code
	        cus.promoCode().sendKeys("MIDDLE2");
	        cus.applyPromo().click();
	        
	        
	        //navigate to check out
	        
	        cus.confirmOrderContinueButton().click();
	        
	    
	        checkout.placeOrder().click();
	        Thread.sleep(10000);
	  
	        

	        try {
	        	
	        	waitHelper.WaitForElement(checkout.orderConfirmation(), 10);
	        	assert(checkout.orderConfirmation().isDisplayed());
	        	  
			} catch (Exception e) {
				 if(checkout.placeOrder().isDisplayed())
		   	        {
		   		        checkout.placeOrder().click();
		   		        waitHelper.WaitForElement(checkout.orderConfirmation(), 10);
		   	        	assert(checkout.orderConfirmation().isDisplayed());

		   	        }
			}
	        
	        	
	        
	        
	        
	        

    }

    @And("^i click on the password tab$")
    public void i_click_on_the_password_tab() throws Throwable {
        throw new PendingException();
    }

    @And("^i enter my current password \"([^\"]*)\"$")
    public void i_enter_my_current_password_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^i enter my new password \"([^\"]*)\"$")
    public void i_enter_my_new_password_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^i click on the save button to save my new password$")
    public void i_click_on_the_save_button_to_save_my_new_password() throws Throwable {
        throw new PendingException();
    }

    @And("^i enter my email address \"([^\"]*)\"$")
    public void i_enter_my_email_address_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^i click retrieve password$")
    public void i_click_retrieve_password() throws Throwable {
        throw new PendingException();
    }

    @And("^i navigate to my past orders$")
    public void i_navigate_to_my_past_orders() throws Throwable {
        throw new PendingException();
    }

    @And("^i locate order and click on order again link$")
    public void i_locate_order_and_click_on_order_again_link() throws Throwable {
        waitHelper.WaitForElement(account.orderAgainLink(), 10);
        account.orderAgainLink().click();
        
        waitHelper.WaitForElement(cus.customizeMenuHeader(), 10);
    }

    @And("^i should be able to order again$")
    public void i_should_be_able_to_order_again() throws Throwable {
   
	        
	        //navigate to check out
	        
	        cus.confirmOrderContinueButton().click();
	        
	    
	        checkout.placeOrder().click();
	        Thread.sleep(10000);
	  
	        

	        try {
	        	
	        	waitHelper.WaitForElement(checkout.orderConfirmation(), 10);
	        	assert(checkout.orderConfirmation().isDisplayed());
	        	  
			} catch (Exception e) {
				 if(checkout.placeOrder().isDisplayed())
		   	        {
		   		        checkout.placeOrder().click();
		   		        waitHelper.WaitForElement(checkout.orderConfirmation(), 10);
		   	        	assert(checkout.orderConfirmation().isDisplayed());

		   	        }
			}
	        
	        	
	        
	        
	        
    }



    @And("^i enter my first name \"([^\"]*)\"$")
    public void i_enter_my_first_name_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^i enter my last name \"([^\"]*)\"$")
    public void i_enter_my_last_name_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^i enter my temp test email address$")
    public void i_enter_my_temp_test_email_address() throws Throwable {
        throw new PendingException();
    }

    @And("^i enter a test password \"([^\"]*)\"$")
    public void i_enter_a_test_password_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^i re enter the test password \"([^\"]*)\"$")
    public void i_re_enter_the_test_password_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^i click the create button$")
    public void i_click_the_create_button() throws Throwable {
        throw new PendingException();
    }

    @And("^i click on the add new card button$")
    public void i_click_on_the_add_new_card_button() throws Throwable {
        throw new PendingException();
    }

    @And("^i enter the required credit card details and save$")
    public void i_enter_the_required_credit_card_details_and_save() throws Throwable {
        throw new PendingException();
    }

    @And("^i locate credit card and click delete$")
    public void i_locate_credit_card_and_click_delete() throws Throwable {
        throw new PendingException();
    }


}
