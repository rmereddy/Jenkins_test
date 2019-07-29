package com.cucumberFramework.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;

import static org.testng.Assert.assertTrue;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.AdminClientsPage;
import com.cucumberFramework.pageObjects.EmailVerification;
import com.cucumberFramework.pageObjects.HomePage;
import com.cucumberFramework.pageObjects.NetAndMultiOrderPage;
import com.cucumberFramework.pageObjects.OpsDashObjects;
import com.cucumberFramework.pageObjects.UserPage;
import com.cucumberFramework.pageObjects.adminChefPage;
import com.cucumberFramework.pageObjects.adminLoginPage;
import com.cucumberFramework.pageObjects.adminSalesPage;
import com.cucumberFramework.pageObjects.checkoutPage;
import com.cucumberFramework.pageObjects.chooseMenuPage;
import com.cucumberFramework.pageObjects.customizeMenuPage;
import com.cucumberFramework.pageObjects.loginPage;
import com.cucumberFramework.testBase.TestBase;
import com.cucumberFramework.pageObjects.ChefDashPageObjects;

public class ChefDash extends TestBase {
	
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
    ChefDashPageObjects chefdash = new ChefDashPageObjects(driver);
    
    OpsDashObjects ops = new OpsDashObjects(driver);
    
    String order;
    String orderM;
    Actions mouse = new Actions(driver);
    
    JavascriptExecutor jse = (JavascriptExecutor)driver;
	

  
  

    @Given("^i navigate to the chef dashboard login page$")
    public void i_navigate_to_the_chef_dashboard_login_page() throws Throwable {
        
    	driver.navigate().to(chefDash);
    	
    	
    }

    @Given("^i am on the chef dash default view$")
    public void i_am_on_the_chef_dash_default_view() throws Throwable {
    	Thread.sleep(12000);
        assert(chefdash.logOut().isDisplayed());
    }

    @Given("^i am on order view page$")
    public void i_am_on_order_view_page() throws Throwable {
    	//Thread.sleep(12000);
    	waitHelper.WaitForElement(chefdash.orderDetailsMealTypeHeader(), 600);
    	assert(chefdash.orderDetailsMealTypeHeader().isDisplayed());    	
    	
    }

    @When("^i enter the username$")
    public void i_enter_the_username() throws Throwable {
    	
    	if(driver.getCurrentUrl().contains("staging")) {
        	chefdash.username().sendKeys("hungryemail@protonmail.com");

    	}else {
        	chefdash.username().sendKeys("hungryemailfortest@gmail.com");

    	}
    }

    @When("^i click on the view button$")
    public void i_click_on_the_view_button() throws Throwable {
    	

    	try {
        	chefdash.viewButton().click();

		} catch (Exception e) {
			Thread.sleep(6000);
	    	chefdash.viewButton().click();
	    	
		}

    
    }
    



    @When("^i move my mouse over the captains name$")
    public void i_move_my_mouse_over_the_captains_name() throws Throwable {
    	mouse.moveToElement(chefdash.captainName()).perform();
    	mouse.moveToElement(chefdash.captainName()).pause(time);
    	
    	assert(chefdash.repName().isDisplayed());

    }

    @When("^i click the log out button$")
    public void i_click_the_log_out_button() throws Throwable {
        chefdash.logOut().click();
    }

    @When("^i navigate to a future date and click the hungry logo$")
    public void i_navigate_to_a_future_date_and_click_the_hungry_logo() throws Throwable {
    	chefdash.dateField().sendKeys("08/03/19");
    	Thread.sleep(time1);
    	chefdash.hungryLogo().click();

    	
    	
    }

    @When("^i enter a date$")
    public void i_enter_a_date() throws Throwable {
    	
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

        //get current date time with Date()
        Date date = new Date();

        // Now format the date
        String date1= dateFormat.format(date);
        
        System.out.println(date1);
        
    	chefdash.dateField().sendKeys(date1);
    	chefdash.dateField().sendKeys(Keys.TAB.TAB.TAB);
    }

    @When("^i click the calendar$")
    public void i_click_the_calendar() throws Throwable {
    	chefdash.dateField().click();
    }

    @When("^i click the x$")
    public void i_click_the_x() throws Throwable {
    	Thread.sleep(time);

    	chefdash.dateField().clear();    
    }

    @When("^i click the browser back button$")
    public void i_click_the_browser_back_button() throws Throwable {
    	driver.navigate().back();
    }

    @When("^i get the number of orders on default view$")
    public void i_get_the_number_of_orders_on_default_view() throws Throwable {
    	chefdash.orderNumber().getText();    
	}

    @Then("^i should successfully login to the chef dashboard$")
    public void i_should_successfully_login_to_the_chef_dashboard() throws Throwable {
    	waitHelper.WaitForElement(chefdash.logOut(), 10);
    	assertTrue (chefdash.logOut().isDisplayed());
    }

    @Then("^the order details should be displayed in a pdf$")
    public void the_order_details_should_be_displayed_in_a_pdf() throws Throwable {
    	waitHelper.WaitForElement(chefdash.orderDetailsPDFbutton(), 10);
	   	 ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	   	 assertTrue(tabs2.size()==2);
    }

    @Then("^the dates of orders are in chronological order$")
    public void the_dates_of_orders_are_in_chronological_order() throws Throwable {
    	//
    }

    @Then("^the reps contact number should be displayed$")
    public void the_reps_contact_number_should_be_displayed() throws Throwable {
   // 	assertTrue(chefdash.repPhoneNumber().isDisplayed());
    }

    @Then("^the captains contact info should be displayed$")
    public void the_captains_contact_info_should_be_displayed() throws Throwable {
    //	assertTrue(chefdash.CaptainPhoneNumber().isDisplayed());
    }

    
    @When("^i move my mouse over the reps contact name$")
    public void i_move_my_mouse_over_the_reps_contact_name() throws Throwable {
    	Thread.sleep(time1);
    	mouse.moveToElement(chefdash.repName()).perform();
    	mouse.moveToElement(chefdash.repName()).pause(time);
    	

    	assert(chefdash.repName().isDisplayed());
    }
    
    
    @Then("^i should succesfully log out of the application$")
    public void i_should_succesfully_log_out_of_the_application() throws Throwable {
    	assertTrue(chefdash.loginButton().isDisplayed());
    }

    @Then("^i should navigate to the default screen$")
    public void i_should_navigate_to_the_default_screen() throws Throwable {

    	Thread.sleep(6000);

    	assertTrue(chefdash.viewButton().isDisplayed());
    }

    @Then("^the orders displayed should be for that date$")
    public void the_orders_displayed_should_be_for_that_date() throws Throwable {

        DateFormat dateFormat = new SimpleDateFormat("dd");

        //get current date time with Date()
        Date date = new Date();

        // Now format the date
        String date1= dateFormat.format(date);
        
        
    	String date2 = chefdash.orderDate().getText();
    	System.out.println(date1);
    	assert(date2.contains(date1));
    }

    @Then("^past orders should be displayed$")
    public void past_orders_should_be_displayed() throws Throwable {
    	//assertTrue(chefdash.orderDate()==);
    }

    @Then("^future orders should be displayed$")
    public void future_orders_should_be_displayed() throws Throwable {
    	Thread.sleep(time);

    }

    @Then("^i should return back to the default page$")
    public void i_should_return_back_to_the_default_page() throws Throwable {
    	Thread.sleep(6000);
    	
    	DateFormat dateFormat = new SimpleDateFormat("dd");

        //get current date time with Date()
        Date date = new Date();

        // Now format the date
        String date1= dateFormat.format(date);
        
        
    	String date2 = chefdash.orderDate().getText();
    	System.out.println(date1);
    	assert(date2.contains(date1));
    }

    @Then("^all orders are displayed$")
    public void all_orders_are_displayed() throws Throwable {
    	//
    }

    @And("^i enter the password$")
    public void i_enter_the_password() throws Throwable {
    	chefdash.password().sendKeys("hungry");
    }

    @And("^i click on login button$")
    public void i_click_on_login_button() throws Throwable {
    	chefdash.loginButton().click();
    }

    @And("^i click on the view pdf button$")
    public void i_click_on_the_view_pdf_button() throws Throwable {
    	
    	chefdash.orderDetailsPDFbutton().click();
    	
    	
    }

    @And("^i should get the order number$")
    public void i_should_get_the_order_number() throws Throwable {
    	Thread.sleep(8000);
    	order = chefdash.orderNumber().getText();
    }

    @And("^i should verify that the number is the same from marketplace$")
    public void i_should_verify_that_the_number_is_the_same_from_marketplace() throws Throwable {
    	
        assert(orderM.contains(order));
    }
    @And("^i should get the order number from marketplace$")
    public void i_should_get_the_order_number_from_marketplace() throws Throwable {
    	orderM = checkout.confirmationPageOrderNumber().getText();
    }

    
    @And("^i navigate to a past date and click the hungry logo$")
    public void i_navigate_to_a_past_date_and_click_the_hungry_logo() throws Throwable {
    	
    	chefdash.dateField().sendKeys("02/01/19");
    	chefdash.hungryLogo().click();
    	
  
    }

    @And("^i select a past date \"([^\"]*)\"$")
    public void i_select_a_past_date_something(String strArg1) throws Throwable {
    	chefdash.dateField().sendKeys("02/01/19");
    }

    @And("^i select a future date \"([^\"]*)\"$")
    public void i_select_a_future_date_something(String strArg1) throws Throwable {
    	
    	Thread.sleep(time);
    	chefdash.dateField().sendKeys("08/03/19");
    	chefdash.dateField().sendKeys(Keys.TAB.TAB.TAB);
    }

    @When("^i clicked on the order with changes$")
    public void i_clicked_on_the_order_with_changes() throws Throwable {
    	chefdash.viewButton().click();
    }

    @When("^i click on the accept changes button$")
    public void i_click_on_the_accept_changes_button() throws Throwable {
    	chefdash.acceptChangesButton().click();
    }

    @Then("^i should see changes made to my order on the default view \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void i_should_see_changes_made_to_my_order_on_the_default_view_something_something_something_something(String strArg1, String strArg2, String strArg3, String strArg4, String strArg5) throws Throwable {
    
    	System.out.println(chefdash.changes().get(0).getText());
    	System.out.println(chefdash.changes().get(1).getText());
    	System.out.println(chefdash.changes().get(2).getText());
    	System.out.println(chefdash.changes().get(3).getText());
    	System.out.println(chefdash.specialInstructions().getText());

    	assertTrue(chefdash.changes().get(0).getText().equals(strArg1));
    	assertTrue(chefdash.changes().get(1).getText().equals(strArg2));
    	assertTrue(chefdash.changes().get(2).getText().equals(strArg3));
    	assertTrue(chefdash.changes().get(3).getText().equals(strArg4));
    	assertTrue(chefdash.specialInstructions().getText().equals(strArg5));


    }

    @Then("^i should see changes made to my order on the order details view \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void i_should_see_changes_made_to_my_order_on_the_order_details_view_something_something_something_something(String strArg1, String strArg2, String strArg3, String strArg4, String strArg5) throws Throwable {
     	
    	System.out.println(chefdash.changes().get(0).getText());
    	System.out.println(chefdash.changes().get(1).getText());
    	
    	
    	
    	assertTrue(chefdash.changes().get(0).isDisplayed());
    	assertTrue(chefdash.changes().get(1).isDisplayed());
    	
    }

    
    @Then("^the order details should be displayed$")
    public void the_order_details_should_be_displayed() throws Throwable {
        
       	waitHelper.WaitForElement(chefdash.orderDetailsMealTypeHeader(), 600);
    	assert(chefdash.orderDetailsMealTypeHeader().isDisplayed());    
    	
    	
    }
    
    
    
    @Then("^the changes highlighted should disappear$")
    public void the_changes_highlighted_should_disappear() throws Throwable {
    	Thread.sleep(time1);
    	assertTrue(chefdash.lightFonts().get(0).getText().equalsIgnoreCase("dessert"));
    	assertTrue(chefdash.lightFonts().get(1).getText().equalsIgnoreCase("300"));
    	assertTrue(chefdash.specialInstructions().getText().equals("testing chef notes for changes"));

    	

    }

    @Then("^i should see the changes highlighted on the order details view with accept button$")
    public void i_should_see_the_changes_highlighted_on_the_order_default_view_with_accept_button() throws Throwable {
    	System.out.println("checkpoint");
    	
    	Thread.sleep(5000);
    	waitHelper.WaitForElement(chefdash.acceptChangesButton(), 100);
    	System.out.println(chefdash.acceptChangesButton().isDisplayed());
    	assertTrue(chefdash.acceptChangesButton().isEnabled());
    }    
    @Then("^i should validate canceled order on chef dash and clear it from my orders$")
    public void i_should_validate_canceled_order_on_chef_dash_and_clear_it_from_my_orders() throws Throwable {
    	Thread.sleep(7000);
    	System.out.println("checkpoint1");
    	assertTrue(chefdash.confirmCancelOrderButton().isDisplayed());
    	System.out.println("checkpoint2");
    	chefdash.confirmCancelOrderButton().click();
    	System.out.println("checkpoint3");
    }
}