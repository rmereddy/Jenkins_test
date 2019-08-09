package com.cucumberFramework.stepdefinitions;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.HomePage;
import com.cucumberFramework.pageObjects.ProposalsPage;
import com.cucumberFramework.pageObjects.adminChefPage;
import com.cucumberFramework.pageObjects.adminLoginPage;
import com.cucumberFramework.pageObjects.adminSalesPage;
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

public class proposals extends TestBase{

	HomePage homepage = new HomePage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
    chooseMenuPage menu = new chooseMenuPage(driver);
    customizeMenuPage cus = new customizeMenuPage(driver);
    checkoutPage checkout = new checkoutPage(driver);
    loginPage login=new loginPage(driver);
    adminLoginPage admin = new adminLoginPage(driver);
    adminChefPage chef = new adminChefPage(driver);
    adminSalesPage sales = new adminSalesPage(driver);
    ProposalsPage prop = new ProposalsPage(driver);
    
    JavascriptExecutor jse = (JavascriptExecutor)driver;

    
    @Given("^i am on the proposals page$")
    public void i_am_on_the_proposals_page() throws Throwable {
    	assert(sales.pageTitle().getText().equals("Proposals"));
    
    	
    }

    @When("^i click on the proposals link$")
    public void i_click_on_the_proposals_link() throws Throwable {
        prop.proposalsLink().click();
    }

    

    @When("^i search for the proposal$")
    public void i_search_for_the_proposal() throws Throwable {
    	 sales.orderSearchField().sendKeys("Jest Shef");
         Thread.sleep(time1);
         
  
 			sales.orderList1().click();

//             while(!sales.orderOverviewClientName().getText().contains("Tahiru"))
//             {
//     			sales.salesPagePrepopulatedOrder1().click();
 //
//             	
//             }			
         /*   
 			System.out.println(sales.orderOverviewClientName().getText());
 			System.out.println(sales.orderOverviewClientName1().getText());
 			System.out.println(sales.orderDetailsChefName().getText());
 			assert(sales.orderOverviewServiceInstructions().getText().contains("testing"));
 	        assert(sales.orderOverviewClientName().getText().contains("Tahiru") || sales.orderOverviewClientName1().getText().contains("Tahiru"));
 	        assert(sales.orderDetailsChefName().getText().equals("Jest Shef"));*/
 			
 			
 			try {
 				 System.out.println(prop.clientName().getText());
	 	 			assert(prop.clientName().getText().contains("Tahiru")||prop.clientName().getText().contains("NewClient TestingTesting"));

 	 			try {
 	 	 			System.out.println(prop.chefName().getText());
 	 	 	        assert(prop.chefName().getText().equals("Jest Shef"));

					
				} catch (Exception e) {
					System.out.println(prop.chefName1().getText());
 	 	 	        assert(prop.chefName1().getText().equals("Jest Shef"));
				}
			} catch (Exception e) {
				 System.out.println(prop.clientName1().getText());
	 	 			assert(prop.clientName1().getText().contains("Tahiru")||prop.clientName1().getText().contains("NewClient TestingTesting"));
	 	 			try {
	 	 	 			System.out.println(prop.chefName().getText());
	 	 	 	        assert(prop.chefName().getText().equals("Jest Shef"));

						
					} catch (Exception e1) {
						System.out.println(prop.chefName1().getText());
	 	 	 	        assert(prop.chefName1().getText().equals("Jest Shef"));
					}
			}
    }

    @Then("^i should successfully add the proposal$")
    public void i_should_successfully_add_the_proposal() throws Throwable {
    	System.out.println(sales.pageTitle().getText());
        assert(sales.pageTitle().getText().startsWith("Proposal"));
    }

    @Then("^i should successfully delete the proposals$")
    public void i_should_successfully_delete_the_proposals() throws Throwable {
    	waitHelper.WaitForElement(sales.pageTitle(), 5);
    	assert(sales.pageTitle().getText().equals("Proposals"));
    }

    @And("^i click save proposal$")
    public void i_click_save_proposal() throws Throwable {
    	
	 	   jse.executeScript("arguments[0].scrollIntoView(true);", sales.orderSaveButton());

    	
    	 sales.orderSaveButton().click();
         
         waitHelper.WaitForElement(sales.pageTitle(), 15);
    }
    
    
    @Given("^i am on an proposal overview page$")
    public void i_am_on_an_proposal_overview_page() throws Throwable {
    	System.out.println(sales.pageTitle().getText());
        assert(sales.pageTitle().getText().startsWith("Proposal"));
    }

    @Then("^i should successfully edit my proposal$")
    public void i_should_successfully_edit_my_proposal() throws Throwable {
    	System.out.println(sales.pageTitle().getText());
        assert(sales.pageTitle().getText().startsWith("Proposal"));
    }
    
    
    @And("^i click on create order$")
    public void i_click_on_create_order() throws Throwable {
       prop.createOrderButton().click();
       Thread.sleep(time1);
    }

    @And("^i should be able to click on the status panel$")
    public void i_should_be_able_to_click_on_the_status_panel() throws Throwable {

    	prop.proposalstatuspanel().click();
    	

    }

    @And("^i should be able to click and navigate to the invoice link$")
    public void i_should_be_able_to_click_and_navigate_to_the_invoice_link() throws Throwable {
       prop.proposalInvoiceLink().click();
       ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
       Thread.sleep(time);

      System.out.println(driver.getWindowHandles().size());
       driver.switchTo().window(tabs2.get(0));
       driver.switchTo().window(tabs2.get(1));
       Thread.sleep(time);

    }

    @And("^i should be able to send the invoice to client$")
    public void i_should_be_able_to_send_the_invoice_to_client() throws Throwable {
        prop.sendProposalsInvoiceButton().click();
        sales.okButton().click();
    }
    
}