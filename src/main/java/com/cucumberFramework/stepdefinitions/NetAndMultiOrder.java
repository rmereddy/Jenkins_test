package com.cucumberFramework.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.AdminClientsPage;
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
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NetAndMultiOrder extends TestBase{

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
    
    
    String order;


    
    
    Actions mouse = new Actions(driver);
    
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    

	
	
	 @Given("^i navigate to the netmulti order page$")
	    public void i_navigate_to_the_netmulti_order_page() throws Throwable {

		 waitHelper.WaitForElement(net.multinetOrderLink(), 10);
		 net.multinetOrderLink().click();
	    }

	    @When("^i search for the net client \"([^\"]*)\"$")
	    public void i_search_for_the_net_client_something(String strArg1) throws Throwable {
	      Thread.sleep(time1);
	    	net.searchOrder().sendKeys(strArg1);
	    }

	    @Then("^i should verify that the net order is created$")
	    public void i_should_verify_that_the_net_order_is_created() throws Throwable {
	    	waitHelper.WaitForElement(net.pageTitle(), 10);
	        assert(net.clientName().getText().equals("NewClient TestingTesting"));
	        
	    }

	    @Then("^i should successfully save the net order$")
	    public void i_should_successfully_save_the_net_order() throws Throwable {
	    	waitHelper.WaitForElement(net.pageTitle(), 10);

	        assert(net.clientName().getText().equals("NewClient TestingTesting") || net.clientName().getText().equals("Test Company Tahiru"));
	        
	       
	    }

	    @Then("^i should succesfully delete the order$")
	    public void i_should_succesfully_delete_the_order() throws Throwable {
	    	Thread.sleep(time);
	      assert( net.pageTitle().getText().equals("Multi Orders"));
	    }

	    @And("^i select recurring payment period \"([^\"]*)\"$")
	    public void i_select_recurring_payment_period_something(String strArg1) throws Throwable {
	        Select select = new Select(clients.recurringPaymentPeriodSelect());
	        select.selectByVisibleText(strArg1);
	    }

	    @And("^i enter payment period length \"([^\"]*)\"$")
	    public void i_enter_payment_period_length_something(String strArg1) throws Throwable {
	    	clients.paymentPeriodLenght().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
	    	clients.paymentPeriodLenght().sendKeys(strArg1);
	    }

	    @And("^i enter net days \"([^\"]*)\"$")
	    public void i_enter_net_days_something(String strArg1) throws Throwable {
	    	clients.net().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
	    	clients.net().sendKeys(strArg1);
	    }

	    @And("^i click on the auto net order created \"([^\"]*)\"$")
	    public void i_click_on_the_auto_net_order_created_something(String strArg1) throws Throwable {
	    	
	    	net.firstOrder().click();
	    	waitHelper.WaitForElement(net.clientName(), 5);
	    	assert(net.clientName().getText().contains(strArg1));
	    	
	    }

	    @And("^i enter a PO reference \"([^\"]*)\"$")
	    public void i_enter_a_po_reference_something(String strArg1) throws Throwable {
	        net.POreferenceInputBox().sendKeys(strArg1);
	    }

	    @And("^i select the order to save in the net order$")
	    public void i_select_the_order_to_save_in_the_net_order() throws Throwable {
	        net.plusSign().get(0).click();
	        net.plusSign().get(1).click();
	        net.plusSign().get(2).click();
	    }

	    @And("^i click the save order button$")
	    public void i_click_the_save_order_button() throws Throwable {
	        net.saveButton().click();
	    }

	    @And("^i click on the order created \"([^\"]*)\"$")
	    public void i_click_on_the_order_created_something(String strArg1) throws Throwable {
	    	net.firstOrder().click();
	    	waitHelper.WaitForElement(net.clientName(), 5);
	    	System.out.println(net.clientName().getText());
	    //	System.out.println(net.salesRepName().getText());
	    	assert(net.clientName().getText().equals(strArg1));
	    	
	    //	assert(net.salesRepName().getText().contains("Tahiru"));
	    }
	    
	    
	    @When("^i click on the add new multi order button$")
	    public void i_click_on_the_add_new_multi_order_button() throws Throwable {
	        net.addNewMultiNetOrder().click();
	    }

	    @And("^i select the customer account \"([^\"]*)\"$")
	    public void i_select_the_customer_account_something(String strArg1) throws Throwable {
	  
	    	net.customerAccountDropDown().sendKeys(strArg1);
	    	net.customerAccountFirstSelect().click();
	    }

	    @And("^i set the start and end date$")
	    public void i_set_the_start_and_end_date() throws Throwable {
	    	net.startDate().click();

	    	
	    	mouse.moveToElement(driver.findElement(By.cssSelector("body > div:nth-child(4) > div > div.fade.in.modal > div > div > div.modal-body > div:nth-child(3) > div > div:nth-child(1) > div > div:nth-child(2) > div > div > div > div.flatpickr-month > span.flatpickr-next-month > svg"))).click().perform();
			Thread.sleep(time1);
	    	driver.findElement(By.className("flatpickr-next-month")).click();
			

	    	
	  
	    	net.day6().click();
	    	
	    }
	    
	    
	    
	    @And("^i click on edit order$")
	    public void i_click_on_edit_order() throws Throwable {

	    	net.editButton().click();
	    }
	    
	    @And("^i click on the delete order button$")
	    public void i_click_on_the_delete_order_button() throws Throwable {
	    	net.deleteButton().click();
	    
	    }

	    @And("^i enter the net offset \"([^\"]*)\"$")
	    public void i_enter_the_net_offset_something(String strArg1) throws Throwable {
	    	
	    	net.endDate().click();
	    	
	    	mouse.moveToElement(driver.findElement(By.cssSelector("body > div:nth-child(4) > div > div.fade.in.modal > div > div > div.modal-body > div:nth-child(3) > div > div:nth-child(1) > div > div:nth-child(2) > div > div > div > div.flatpickr-month > span.flatpickr-next-month > svg"))).click().perform();
				Thread.sleep(time1);
				try {
					driver.findElement(By.cssSelector("body > div:nth-child(4) > div > div.fade.in.modal > div > div > div.modal-body > div:nth-child(3) > div > div:nth-child(1) > div > div:nth-child(2) > div > div > div > div.flatpickr-month > span.flatpickr-next-month")).click();
				} catch (Exception e) {
				    driver.findElement(By.cssSelector("body > div:nth-child(4) > div > div.fade.in.modal > div > div > div.modal-body > div:nth-child(3) > div > div:nth-child(1) > div > div:nth-child(2) > div > div > div > div.flatpickr-month > span.flatpickr-next-month")).click();
				}
				
	    	net.endDay28().click();
	    }
	    
	    
	    
	    @Given("^i click on the multi order charge client panel$")
	    public void i_click_on_the_multi_order_charge_client_panel() throws Throwable {
	    	try {
	    		net.chargeClientPanel().click();
	    	} catch (Exception e) {
	    		net.chargeClientPanel2().click();
	    	}
	    }

	    @Then("^i should successfully process the batch payment$")
	    public void i_should_successfully_process_the_batch_payment() throws Throwable {
	    	waitHelper.WaitForElement(net.paymentConfirmation(), 10);
	        assert(net.paymentConfirmation().isDisplayed());
	    }

	    @And("^i click on the charge client button in the charge client panel$")
	    public void i_click_on_the_charge_client_button_in_the_charge_client_panel() throws Throwable {
	       net.chargeClientButton().click();
	    }

	    
	    @And("^i select the net30 payment method$")
	    public void i_select_the_net30_payment_method() throws Throwable {
	       Select select = new Select( net.choosePaymentDropDown());
	       select.selectByIndex(1);
	    }

	    
	    
	    @Given("^i click on the send invoice panel$")
	    public void i_click_on_the_send_invoice_panel() throws Throwable {

	    	Thread.sleep(time);
	    	try {
	        	net.sendInvoiceProposalPanel().click();
			} catch (Exception e) {
				net.sendInvoiceProposalPanel2().click();
			}
	    }

	    @When("^i select the multi order ext payment source$")
	    public void i_select_the_multi_order_ext_payment_source() throws Throwable {
	        Select select = new Select(net.ExtPaymentDropDown());
	        select.selectByIndex(1);
	    }

	    @And("^i click pay via external payment source$")
	    public void i_click_pay_via_external_payment_source() throws Throwable {
	        net.payViaExtButton().click();
	    }

	/*    @And("^i click on the delete button$")
	    public void i_click_on_the_delete_button() throws Throwable {
	        net.deleteButton().click();
	    }*/

}
