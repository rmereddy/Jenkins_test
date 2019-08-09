package com.cucumberFramework.stepdefinitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.AdminClientsPage;
import com.cucumberFramework.pageObjects.ChefDashPageObjects;
import com.cucumberFramework.pageObjects.ClientPortalTooltipObjects;
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

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ClientPortalTooltip extends TestBase {
	
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
    ClientPortalTooltipObjects tooltip = new ClientPortalTooltipObjects(driver);
    
    
    OpsDashObjects ops = new OpsDashObjects(driver);
    
    String orderNumber;
    String toolTipOrderMessage;
    Actions mouse = new Actions(driver);
    String oldCount;
    String updatedCount;
    
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    
    
    
    
        @Given("^i am on the marketplace homepage$")
        public void i_am_on_the_marketplace_homepage() throws Throwable {
            
        
        	assert(login.myAccount().isDisplayed());
        	
        }

        @When("^i should see that the tooltip is displayed$")
        public void i_should_see_that_the_tooltip_is_displayed() throws Throwable {
            assert(tooltip.welcomeMessage().isDisplayed());
        }

        @When("^i click on the tooltip edit profile link$")
        public void i_click_on_the_tooltip_edit_profile_link() throws Throwable {
            tooltip.editProfileLink().click();
        }

        @When("^i see that the tooltip is displayed$")
        public void i_see_that_the_tooltip_is_displayed() throws Throwable {
            assert(tooltip.welcomeMessage().isDisplayed());
        }

        @When("^i get the text in place of edit order link$")
        public void i_get_the_text_in_place_of_edit_order_link() throws Throwable {
        	toolTipOrderMessage = tooltip.customOrderMessage().getText();
        }

        @When("^i navigate to the past orders tab in tooltip$")
        public void i_navigate_to_the_past_orders_tab_in_tooltip() throws Throwable {
            tooltip.pastOrders().click();
        }

        @When("^i click on the tooltip order again link$")
        public void i_click_on_the_tooltip_order_again_link() throws Throwable {
            tooltip.orderAgainLink().click();
        }

        @When("^i get the text in place of order again link$")
        public void i_get_the_text_in_place_of_order_again_link() throws Throwable {
            tooltip.customOrderMessage().getText();
        }

        @When("^i click on the tooltip password link$")
        public void i_click_on_the_tooltip_password_link() throws Throwable {
            tooltip.password().click();
        }

        @When("^i click on the tooltip upcoming orders link$")
        public void i_click_on_the_tooltip_upcoming_orders_link() throws Throwable {
            tooltip.upcomingOrders().click();
        }

        @Then("^i should see my current orders displayed in the current orders tab$")
        public void i_should_see_my_current_orders_displayed_in_the_current_orders_tab() throws Throwable {
            tooltip.currentOrders().click();
        }

        @Then("^i should see that the meals count is correctly calculated and included my recent orders$")
        public void i_should_see_that_the_meals_count_is_correctly_calculated_and_included_my_recent_orders() throws Throwable {
           String newCount = tooltip.donatedMealsCounter().getText();
           int presentCount = Integer.parseInt(newCount);
           int pastCount = Integer.parseInt(oldCount);
           
           System.out.println(presentCount);
           System.out.println(pastCount);

           assert(presentCount == (pastCount + 15));
           
           
            
        }

        @Then("^i should navigate to the edit profile page in my account$")
        public void i_should_navigate_to_the_edit_profile_page_in_my_account() throws Throwable {
           tooltip.profileHeader().getText().equals("Profile Information");
        }

        @Then("^i should navigate to the customize page$")
        public void i_should_navigate_to_the_customize_page() throws Throwable {
            cus.customizeMenuHeader().getText().equalsIgnoreCase("CUSTOMIZE MENU");
        }

        @Then("^i should see that the text in place of edit order link equals \"([^\"]*)\"$")
        public void i_should_see_that_the_text_in_place_of_edit_order_link_equals_something(String strArg1) throws Throwable {
            tooltip.customOrderMessage().getText().equalsIgnoreCase(strArg1);
        }

        @Then("^i should see that the text in place of order again link equals \"([^\"]*)\"$")
        public void i_should_see_that_the_text_in_place_of_order_again_link_equals_something(String strArg1) throws Throwable {
            tooltip.customOrderMessage().getText().equalsIgnoreCase(strArg1);
        }

        @Then("^i should navigate to the password page in my account$")
        public void i_should_navigate_to_the_password_page_in_my_account() throws Throwable {
        	tooltip.profileHeader().getText().equalsIgnoreCase("Change Password");
        }

        @Then("^i should see my past orders displayed in the past orders tab$")
        public void i_should_see_my_past_orders_displayed_in_the_past_orders_tab() throws Throwable {
           assert(tooltip.pastOrders().isDisplayed());
        }

        @Then("^i should navigate to the upcoming orders page in my account$")
        public void i_should_navigate_to_the_upcoming_orders_page_in_my_account() throws Throwable {
            tooltip.profileHeader().getText().equalsIgnoreCase("Welcome back, Tahiru");
        }

        @Then("^i should see the welcome message displayed \"([^\"]*)\"$")
        public void i_should_see_the_welcome_message_displayed_something(String strArg1) throws Throwable {
            tooltip.profileHeader().getText().equalsIgnoreCase("Welcome back, Tahiru");
        }

        @And("^i should see that the current orders tab is displayed$")
        public void i_should_see_that_the_current_orders_tab_is_displayed() throws Throwable {
            assert(tooltip.currentOrders().isDisplayed());
        }

        @And("^i should see that the headcount is displayed$")
        public void i_should_see_that_the_headcount_is_displayed() throws Throwable {
            assert(tooltip.donatedMealsCounter().isDisplayed());

        }

        @And("^i get the current headcount$")
        public void i_get_the_current_headcount() throws Throwable {
            oldCount = tooltip.donatedMealsCounter().getText();
            System.out.println("current headcount is " + oldCount);
        }

        @And("^i get the updated headcount$")
        public void i_get_the_updated_headcount() throws Throwable {
            updatedCount = tooltip.donatedMealsCounter().getText();
        }

        @And("^i should see that the edit profile link is displayed$")
        public void i_should_see_that_the_edit_profile_link_is_displayed() throws Throwable {
            assert(tooltip.editProfileLink().isDisplayed());
        }

        @And("^i see that the order again link is displayed$")
        public void i_see_that_the_order_again_link_is_displayed() throws Throwable {
            assert(tooltip.orderAgainLink().isDisplayed());
        }

        @And("^i should see that the password link is displayed$")
        public void i_should_see_that_the_password_link_is_displayed() throws Throwable {
            assert(tooltip.password().isDisplayed());

        }

        @And("^i see that the past orders tab is displayed$")
        public void i_see_that_the_past_orders_tab_is_displayed() throws Throwable {
            assert(tooltip.pastOrders().isDisplayed());

        }

        @And("^i should see that the upcoming orders link is displayed$")
        public void i_should_see_that_the_upcoming_orders_link_is_displayed() throws Throwable {
            assert(tooltip.upcomingOrders().isDisplayed());

        }

        @And("^i should see the welcome message name displayed \"([^\"]*)\"$")
        public void i_should_see_the_welcome_message_name_displayed_something(String strArg1) throws Throwable {
            assert(tooltip.welcomeMessageName().isDisplayed());
            assert(tooltip.welcomeMessageName().equals(strArg1));

        }
    
    

}
