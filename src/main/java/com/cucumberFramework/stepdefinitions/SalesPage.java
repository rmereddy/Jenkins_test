package com.cucumberFramework.stepdefinitions;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Calendar;

import org.apache.http.impl.conn.tsccm.WaitingThreadAborter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.HomePage;
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

public class SalesPage extends TestBase{

	HomePage homepage = new HomePage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
    chooseMenuPage menu = new chooseMenuPage(driver);
    customizeMenuPage cus = new customizeMenuPage(driver);
    checkoutPage checkout = new checkoutPage(driver);
    loginPage login=new loginPage(driver);
    adminLoginPage admin = new adminLoginPage(driver);
    adminChefPage chef = new adminChefPage(driver);
    adminSalesPage sales = new adminSalesPage(driver);
    
    
    
    String order;


    Calendar calendar = Calendar.getInstance();
    int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK); 
    
    Actions mouse = new Actions(driver);
    
    JavascriptExecutor jse = (JavascriptExecutor)driver;
	

    @Given("^i am on the sales page$")
    public void i_am_on_the_sales_page() throws Throwable {
    	waitHelper.WaitForElement(sales.pageTitle(), 10);
    	
       assertTrue( sales.pageTitle().getText().equalsIgnoreCase("Sales"));
    }

    @Given("^i am on an order overview page$")
    public void i_am_on_an_order_overview_page() throws Throwable {
        assertTrue( sales.pageTitle().getText().startsWith("Order"));
    }


    @When("^i click on the sales link$")
    public void i_click_on_the_sales_link() throws Throwable {
    		
    		waitHelper.WaitForElement(sales.salesLink(), 10);
    	   	sales.salesLink().click();
    }

    @When("^i click on the add new order button$")
    public void i_click_on_the_add_new_order_button() throws Throwable {
        sales.addNewOrderButton().click();
    }

    @When("^i click the edit button$")
    public void i_click_the_edit_button() throws Throwable {

    	sales.orderOverviewEditButton().click();
    }

    @When("^i search for the order$")
    public void i_search_for_the_order() throws Throwable {
        sales.orderSearchField().sendKeys("Jest");
        Thread.sleep(time1);
        sales.orderSearchField().sendKeys(" ");
        sales.orderSearchField().sendKeys("Shef");
        
        Thread.sleep(time1);
        
  

        try {
			sales.orderList1().click();

//            while(!sales.orderOverviewClientName().getText().contains("Tahiru"))
//            {
//    			sales.salesPagePrepopulatedOrder1().click();
//
//            	
//            }			
            System.out.println(sales.orderOverviewServiceInstructions().getText());
            System.out.println(sales.orderDetailsChefInstructions().getText().contains("testing"));
			System.out.println(sales.orderOverviewClientName().getText());
			System.out.println(sales.orderOverviewClientName1().getText());
			System.out.println(sales.orderDetailsChefName().getText());
		//	assert(sales.orderOverviewServiceInstructions().getText().contains("testing")||sales.orderDetailsChefInstructions().getText().contains("testing"));
	        assert(sales.orderOverviewClientName().getText().contains("Tahiru") || sales.orderOverviewClientName1().getText().contains("Tahiru")||sales.orderOverviewClientName().getText().contains("NewClient TestingTesting") || sales.orderOverviewClientName1().getText().contains("NewClient TestingTesting"));
	        assert(sales.orderDetailsChefName().getText().equals("Jest Shef"));
		} catch (Exception e) {

			sales.orderList1().click();
			assert(sales.orderOverviewServiceInstructions().getText().contains("testing"));
	        assert(sales.orderOverviewClientName().getText().contains("Tahiru"));
	        assert(sales.orderDetailsChefName().getText().equals("Jest Shef"));
			
		}


    }


    @When("^i search for the marketplace order$")
    public void i_search_for_the_marketplace_order() throws Throwable {
        sales.orderSearchField().sendKeys("Jest Shef");
        Thread.sleep(time1);
        
  

        try {
			sales.orderList1().click();

//            while(!sales.orderOverviewClientName().getText().contains("Tahiru"))
//            {
//    			sales.salesPagePrepopulatedOrder1().click();
//
//            	
//            }			
			System.out.println(sales.orderOverviewClientName().getText());
			System.out.println(sales.orderOverviewClientName1().getText());
			System.out.println(sales.orderDetailsChefName().getText());
	        assert(sales.orderOverviewClientName().getText().contains("Tahiru") || sales.orderOverviewClientName1().getText().contains("Tahiru"));
	        assert(sales.orderDetailsChefName().getText().equals("Jest Shef"));
		} catch (Exception e) {

			sales.orderList1().click();
	        assert(sales.orderOverviewClientName().getText().contains("Tahiru"));
	        assert(sales.orderDetailsChefName().getText().equals("Jest Shef"));
			
		}


    }


    @Then("^i should successfuly navigate to the sales page$")
    public void i_should_successfuly_navigate_to_the_sales_page() throws Throwable {
       assertTrue (sales.pageTitle().getText().equalsIgnoreCase("Sales"));
    }

    @Then("^i should successfully place my order with a percentage discount applied$")
    public void i_should_successfully_place_my_order_with_a_percentage_discount_applied() throws Throwable {
  
    	waitHelper.WaitForElement(sales.pageTitle(), 10);
    	assertTrue (sales.pageTitle().getText().startsWith("Order"));
    }


		
	
	@Then("^i should successfully edit my order with a flat discount applied$")
    public void i_should_successfully_edit_my_order_with_a_flat_discount_applied() throws Throwable {
       waitHelper.WaitForElement(sales.pageTitle(), 10);
		assertTrue (sales.pageTitle().getText().startsWith("Order"));
    }

    @Then("^i should successfully place my order with a flat tip applied$")
    public void i_should_successfully_place_my_order_with_a_flat_tip_applied() throws Throwable {
    	waitHelper.WaitForElement(sales.pageTitle(), 10);
		assertTrue (sales.pageTitle().getText().startsWith("Order"));
		
    }

    @Then("^i should successfully edit my order with a tip percentage applied$")
    public void i_should_successfully_edit_my_order_with_a_tip_percentage_applied() throws Throwable {
     	waitHelper.WaitForElement(sales.pageTitle(), 10);
    		assertTrue (sales.pageTitle().getText().startsWith("Order"));
    		
        
    }

    @Then("^i should successfuly charge client from the charge client panel \"([^\"]*)\"$")
    public void i_should_successfuly_charge_client_from_the_charge_client_panel_something(String strArg1) throws Throwable {
     	waitHelper.WaitForElement(sales.chargeClientPanelPaymentConfirmation(), 10);
     	System.out.println(strArg1);
    		assertTrue (sales.chargeClientPanelPaymentConfirmation().getText().equals(strArg1));
  
        
    
    }

    @Then("^i should successfully copy the order$")
    public void i_should_successfully_copy_the_order() throws Throwable {
     	waitHelper.WaitForElement(sales.pageTitle(), 10);
    		assertTrue (sales.pageTitle().getText().startsWith("Order"));
    		
            }

    @Then("^i should successfully delete the order$")
    public void i_should_successfully_delete_the_order() throws Throwable {
    	Thread.sleep(time);
    	try {
    		assertTrue (sales.pageTitle().getText().startsWith("Sales"));

		} catch (Exception e) {
    		assertTrue (sales.pageTitle().getText().startsWith("Sales"));
		}
            
    }

    @Then("^i should successfully edit the order$")
    public void i_should_successfully_edit_the_order() throws Throwable {
     	waitHelper.WaitForElement(sales.pageTitle(), 10);
    		assertTrue (sales.pageTitle().getText().startsWith("Order"));
    		
            }

    @Then("^i should successfully place my order with free delivery applied$")
    public void i_should_successfully_place_my_order_with_free_delivery_applied() throws Throwable {
     	waitHelper.WaitForElement(sales.pageTitle(), 10);
    		assertTrue (sales.pageTitle().getText().startsWith("Order"));
    		
            }

    @Then("^i should successfully edit my order with a delivery fee added to the total$")
    public void i_should_successfully_edit_my_order_with_a_delivery_fee_added_to_the_total() throws Throwable {
     	waitHelper.WaitForElement(sales.pageTitle(), 10);
    		assertTrue (sales.pageTitle().getText().startsWith("Order"));
    		
            }

    @Then("^i should be able to navigate to the invoice pdf$")
    public void i_should_be_able_to_navigate_to_the_invoice_pdf() throws Throwable {
    	
    	
    	 ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
         driver.switchTo().window(tabs2.get(1));
         driver.close();
         driver.switchTo().window(tabs2.get(0));
    }

    @Then("^i should be able to navigate to the invoice link page$")
    public void i_should_be_able_to_navigate_to_the_invoice_link_page() throws Throwable {
    	 ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
         driver.switchTo().window(tabs2.get(1));
        
    }

    @Then("^i should be able to successfully send an invoice email$")
    public void i_should_be_able_to_successfully_send_an_invoice_email() throws Throwable {
        sales.okButton().click();
    }

    @Then("^i should be able to successfully send a final invoice email$")
    public void i_should_be_able_to_successfully_send_a_final_invoice_email() throws Throwable {
        sales.okButton().click();
    }

    @Then("^my payment should be successfuly processed \"([^\"]*)\"$")
    public void my_payment_should_be_successfuly_processed_something(String strArg1) throws Throwable {
    	Thread.sleep(time);
       waitHelper.WaitForElement(sales.invoiceLinkPaidInvoiceConfirmationMessage(), 10);
       System.out.println(sales.invoiceLinkPaidInvoiceConfirmationMessage().getText());
    	assertTrue(sales.invoiceLinkPaidInvoiceConfirmationMessage().getText().equals(strArg1));
    }


    @Then("^i should be able to verify that the order from marketplace showed up on the invoice page$")
    public void i_should_be_able_to_verify_that_the_order_from_marketplace_showed_up_on_the_invoice_page() throws Throwable {
    	// get total and place order from marketplace
    	String checkoutTotal = checkout.total().getText();
    	checkout.placeOrder().click();
    	
    	// navigate to admin sales page and verify order
    	driver.navigate().to(adminStaging);
    	 admin.email().sendKeys("tahiru@tryhungry.com");
    	 admin.password().sendKeys("tahiru123");
    	 Select select = new Select(driver.findElement(By.cssSelector(".form-control")));
         select.selectByVisibleText("Rosslyn, VA");
         admin.loginButton().click();
         
         sales.salesLink().click();
         sales.orderSearchField().sendKeys("Jest Shef");
         sales.orderList1().click();
         String adminTotal;
         try {

              adminTotal = sales.orderOverviewTotal().getText();
		} catch (Exception e) {
             adminTotal = sales.orderOverviewTotal().getAttribute("textContent");

		}
			System.out.println(sales.orderOverviewClientName1().getText());
			System.out.println(sales.orderDetailsChefName().getText());
	        assert(sales.orderOverviewClientName1().getText().equals("Test Company Tahiru"));
	        assert(sales.orderDetailsChefName().getText().equals("Jest Shef"));
         System.out.println(adminTotal);
         System.out.println(checkoutTotal);
         
         assertTrue(adminTotal.equals(checkoutTotal));
         
         
         
    }

    @Then("^i should successfuly pay via external method button \"([^\"]*)\"$")
    public void i_should_successfuly_pay_via_external_method_button_something(String strArg1) throws Throwable {

    	try {
    	 	   jse.executeScript("arguments[0].scrollIntoView(true);", sales.orderDetailsOrangeChargeClientPanel1());

        	sales.orderDetailsOrangeChargeClientPanel1().click();

		} catch (Exception e) {
		 	   jse.executeScript("arguments[0].scrollIntoView(true);", sales.orderDetailsOrangeChargeClientPanel());

	    	sales.orderDetailsOrangeChargeClientPanel().click();

		}
    	
  	   jse.executeScript("arguments[0].scrollIntoView(true);", sales.chargeClientPanelPaymentConfirmation());

    	System.out.println(sales.chargeClientPanelPaymentConfirmation().getAttribute("textContent"));
        assertTrue (sales.chargeClientPanelPaymentConfirmation().getAttribute("textContent").contains(strArg1));

    	
    }

    @Then("^i should verify that the scheduled charge was processed at 11pm \"([^\"]*)\"$")
    public void i_should_verify_that_the_scheduled_charge_was_processed_at_11pm(String strArg1) throws Throwable {

    	try {
    	 	   jse.executeScript("arguments[0].scrollIntoView(true);", sales.orderDetailsOrangeChargeClientPanel1());

        	sales.orderDetailsOrangeChargeClientPanel1().click();

		} catch (Exception e) {
		 	   jse.executeScript("arguments[0].scrollIntoView(true);", sales.orderDetailsOrangeChargeClientPanel());

	    	sales.orderDetailsOrangeChargeClientPanel().click();

		}
    	
  	   jse.executeScript("arguments[0].scrollIntoView(true);", sales.chargeClientPanelPaymentConfirmation());

    	System.out.println(sales.chargeClientPanelPaymentConfirmation().getAttribute("textContent"));
        assertTrue (sales.chargeClientPanelPaymentConfirmation().getAttribute("textContent").contains(strArg1));

    	
    }
    
    
    @Then("^i should verify that a payment method was not attached to this order \"([^\"]*)\"$")
    public void i_should_verify_that_a_payment_method_was_not_attached_to_this_order_something(String strArg1) throws Throwable {
    	try {
 	 	   jse.executeScript("arguments[0].scrollIntoView(true);", sales.orderDetailsOrangeChargeClientPanel1());

     	sales.orderDetailsOrangeChargeClientPanel1().click();

		} catch (Exception e) {
		 	   jse.executeScript("arguments[0].scrollIntoView(true);", sales.orderDetailsOrangeChargeClientPanel());

	    	sales.orderDetailsOrangeChargeClientPanel().click();

		}
 	
	   jse.executeScript("arguments[0].scrollIntoView(true);", sales.chargeClientPanelNoPaymentMethodText());

 	System.out.println(sales.chargeClientPanelNoPaymentMethodText().getAttribute("textContent"));
     assertTrue (sales.chargeClientPanelNoPaymentMethodText().getAttribute("textContent").contains(strArg1));

    }
    
    
    
    
    
    @Then("^i should successfully place my order$")
    public void i_should_successfully_place_my_order() throws Throwable {
    	 //  waitHelper.WaitForElement(sales.pageTitle(), 10);
   		assertTrue (sales.pageTitle().getText().startsWith("Order")); 
    }

    @Then("^validate Thursday orders as well$")
    public void validate_thursday_orders_as_well() throws Throwable {
        
	       if(dayOfWeek == calendar.THURSDAY) {
    	Thread.sleep(time);
	    	   sales.orderOverviewCopyButton().click();
	    	   waitHelper.WaitForElement(sales.orderDeliveryDateDropdown(), 10);
	    	   sales.orderDeliveryDateDropdown().click();
	    	   String today = sales.deliveryDayToday().getText();
	    	   int dateOfToday = Integer.parseInt(today);
	    	   
	          sales.deliveryDays().get(dateOfToday + 1).click();
	          
	          sales.orderSaveButton().click();
	          
	          
	    	   waitHelper.WaitForElement(sales.orderOverviewCopyButton(), 10);

	    	   sales.orderOverviewCopyButton().click();
	    	   waitHelper.WaitForElement(sales.orderDeliveryDateDropdown(), 10);
	    	   sales.orderDeliveryDateDropdown().click();
	    	    today = sales.deliveryDayToday().getText();
	    	    dateOfToday = Integer.parseInt(today);
	    	   
	          sales.deliveryDays().get(dateOfToday + 2).click();
	          
	          sales.orderSaveButton().click();
	          
	          
	      }
    }
    
    
    @Then("^i should navigate to the sales page and be able to search for orders by \"([^\"]*)\"$")
    public void i_should_navigate_to_the_sales_page_and_be_able_to_search_for_orders_by_something(String strArg1) throws Throwable {
        sales.orderSearchField().sendKeys(strArg1);

    }

    @Then("^i should be able to send order details$")
    public void i_should_be_able_to_send_order_details() throws Throwable {
        sales.okButton().click();
    }

    @Then("^i should be able to send service details succesfully$")
    public void i_should_be_able_to_send_service_details_succesfully() throws Throwable {
    	waitHelper.WaitForElement(sales.okButton(), 10);
        sales.okButton().click();
    }

    @Then("^i should be able to send order survey successfully$")
    public void i_should_be_able_to_send_order_survey_successfully() throws Throwable {

    }

    @Then("^i should navigate to the sales page and be able to sort orders by \"([^\"]*)\"$")
    public void i_should_navigate_to_the_sales_page_and_be_able_to_sort_orders_by_something(String strArg1) throws Throwable {
       sales.orderSearchField().sendKeys(strArg1);
    }



    @And("^i select the sales rep \"([^\"]*)\" \"([^\"]*)\"$")
    public void i_select_the_sales_rep_something_something(String strArg1, String strArg2) throws Throwable {
    	Thread.sleep(time1);
		 sales.orderSalesRepDropdown().sendKeys(strArg1, " ", strArg2);
       Thread.sleep(time);
     
           sales.orderSalesRepDropdownFirstSelection().click(); 
		
       
    }

    
    @And("^i select the sales rep \"([^\"]*)\"$")
    public void i_select_the_sales_rep_something_something(String strArg1) throws Throwable {
    	Thread.sleep(time1);
		 sales.orderSalesRepDropdown().sendKeys(strArg1 + "   ");
       Thread.sleep(time);
     
           sales.orderSalesRepDropdownFirstSelection().click(); 
		
       
    }
    
    
    
    @And("^i select customer account \"([^\"]*)\"$")
    public void i_select_customer_account_something(String strArg1) throws Throwable {
		 Thread.sleep(time1);
		 sales.orderCustomerAccountDropdown().sendKeys(strArg1);
        Thread.sleep(time1);
      
            sales.orderCustomerAccountDropdownFirstSelection().click();
       
    } 

    
    @And("^i change customer account to \"([^\"]*)\"$")
    public void i_change_customer_account_to_something(String strArg1) throws Throwable {
    	
    	Thread.sleep(time1);
		 sales.orderCustomerAccountDropdown().click();
		 waitHelper.WaitForElement(sales.orderCustomerAccountDropdownFirstSelection(), 5);
		 sales.orderCustomerAccountDropdown().sendKeys(strArg1);
       Thread.sleep(time1);
     
           sales.orderCustomerAccountDropdownFirstSelection().click();
    }
    
    
    
    
    @And("^i select customer delivery address$")
    public void i_select_customer_delivery_address() throws Throwable {
        
        Select select = new Select(sales.orderDeliveryAddressDropdownSelect());
        select.selectByIndex(1);
    }

    @And("^i select catering poc$")
    public void i_select_catering_poc() throws Throwable {
    	Select select = new Select(sales.orderCateringPOCselect());
        select.selectByIndex(1);
    }

    @And("^i select invoice poc$")
    public void i_select_invoice_poc() throws Throwable {
    	Select select = new Select(sales.orderInvoicePOCselect());
        select.selectByIndex(1);
    }

    @And("^i select receipt poc$")
    public void i_select_receipt_poc() throws Throwable {
    	Select select = new Select(sales.orderReceiptPOC());
        select.selectByIndex(1);
    }

    @And("^i choose a payment method$")
    public void i_choose_a_payment_method() throws Throwable {
    	
    	Select select = new Select(sales.orderChoosePayment());
        select.selectByIndex(1);

    	
    }

    @And("^i set the delivery month \"([^\"]*)\"$")
    public void i_set_the_delivery_month_something(String strArg1) throws Throwable {

      

    	sales.orderDeliveryDateDropdown().click();
        sales.nextMonthArrow().get(0).click();
        	/*
       	 JavascriptExecutor jse = (JavascriptExecutor)driver;
	       jse.executeScript("window.scrollBy(0,2000)", "");*/
    }

    @And("^i set the delivery day \"([^\"]*)\"$")
    public void i_set_the_delivery_day_something(String strArg1) throws Throwable {
        sales.deliveryDayToday().click();
    }

    
    @And("^i set the delivery month as this month$")
    public void i_set_the_delivery_month_as_this_month() throws Throwable {
        sales.orderDeliveryDateDropdown().click();
    }

    @And("^i set the delivery day as today$")
    public void i_set_the_delivery_day_as_today() throws Throwable {
        sales.deliveryDayToday().click();

        
    }
    
    
    
    @And("^i set the delivery day as the next day$")
    public void i_set_the_delivery_day_as_the_next_day() throws Throwable {
    	
    	try {
    	 try {
    		 String date = sales.deliveryDayToday().getText();
 	    	while(date == "")
 	    	{
 	    		date = sales.deliveryDayToday().getText();
 	    	}
 	       
 	        System.out.println("Date of today is " + date);
 	        
 	        int today = Integer.parseInt(date);
 	        
 	        System.out.println(today);
 	        
 	        int tomorrow = today - 1;
 	        
 	        System.out.println(tomorrow);
 	        
 	        
 	        sales.deliveryDays().get(tomorrow).click();
		} catch (Exception e) {
			
			 String date = sales.deliveryDayToday().getText();
 	    	while(date == "")
 	    	{
 	    		date = sales.deliveryDayToday().getText();
 	    	}
 	       
 	        System.out.println("Date of today is " + date);
 	        
 	        int today = Integer.parseInt(date);
 	        
 	        System.out.println(today);
 	        
 	        int tomorrow = today - 1;
 	        
 	        System.out.println(tomorrow);
 	        
 	        
 	        sales.deliveryDays().get(tomorrow).click();
		}
    	        
    	        
		} catch (Exception e) {
		 	 
		        
		        int tomorrow = 0;
		        
		        System.out.println(tomorrow);
		        
		        
		        sales.nextMonthDays().get(tomorrow).click();
		}
    }
    
    
    @And("^i set the delivery day as the two days$")
    public void i_set_the_delivery_day_as_the_two_days() throws Throwable {
      try {
    	try {
    		 String date = sales.deliveryDayToday().getText();
 	     	while(date == "")
 	     	{
 	     		date = sales.deliveryDayToday().getText();
 	     	}
 	        
 	        System.out.println("Date of today is " + date);
 	        
 	        int today = Integer.parseInt(date);
 	        
 	        System.out.println(today);
 	        
 	       if(dayOfWeek == calendar.FRIDAY) {
  	          sales.deliveryDays().get(today + 2).click();
 	       }else {
  	          sales.deliveryDays().get(today).click();

 	       }
 	          
 	          
 	          
 	          
		} catch (Exception e) {
			 String date = sales.deliveryDayToday().getText();
 	     	while(date == "")
 	     	{
 	     		date = sales.deliveryDayToday().getText();
 	     	}
 	        
 	        System.out.println("Date of today is " + date);
 	        
 	        int today = Integer.parseInt(date);
 	        
 	        System.out.println(today);
 	          
 	          
 	       if(dayOfWeek == calendar.FRIDAY) {
   	          sales.deliveryDays().get(today + 2).click();
  	       }else {
   	          sales.deliveryDays().get(today).click();

  	       }
 	       
		}
    	          
    	          
	} catch (Exception e) {
		
	        
	        int twoDays = 1;
	        
	        System.out.println(twoDays);
	          
	        if(dayOfWeek == calendar.FRIDAY) {
		          sales.nextMonthDays().get(twoDays).click();
	 	       }else {
	 	          sales.nextMonthDays().get(twoDays + 2).click();

	 	       }
	}
    }
    
    
    @And("^i edit the order date to a past date$")
    public void i_edit_the_order_date_to_a_past_date() throws Throwable {
       sales.orderDeliveryDateDropdown().click();
       try {
		sales.prevMonthDays().get(0).click();
	} catch (Exception e) {
		sales.prevMonthDays().get(1).click();
	}
       
     
	       
	   sales.orderChargeDate().get(2).click();

 

       sales.nextMonthArrow().get(1).click();
       sales.nextMonthArrow().get(1).click();
       sales.deliveryDayToday().click();
       
       
       
    }
    
    
    
    @And("^i set the delivery time as \"([^\"]*)\"$")
    public void i_set_the_delivery_time_as_something(String strArg1) throws Throwable {
    	sales.orderSetupCompleteBy().click();
    	sales.orderSetupCompleteByHours().click();
    	sales.orderSetupCompleteByHours().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
   		sales.orderSetupCompleteByHours().sendKeys(strArg1);
   	
    }
    
    
    
    @And("^i enter the number of people \"([^\"]*)\"$")
    public void i_enter_the_number_of_people_something(String strArg1) throws Throwable {
        sales.orderNumberOfPeople().sendKeys(strArg1);
    }

    @And("^i enter service instructions \"([^\"]*)\"$")
    public void i_enter_service_instructions_something(String strArg1) throws Throwable {
        sales.orderServiceInstructions().sendKeys(strArg1);
    }

    @And("^i change the first entree quantity \"([^\"]*)\"$")
    public void i_change_the_first_entree_quantity(String strArg1) throws Throwable {
    	sales.orderFirstItemQTY().sendKeys(Keys.BACK_SPACE);
        sales.orderFirstItemQTY().sendKeys(strArg1);
    }
    
    @And("^i change the second entree quantity \"([^\"]*)\"$")
    public void i_change_the_second_entree_quantity(String strArg1) throws Throwable {
    	sales.orderSecondItemQTY().sendKeys(Keys.BACK_SPACE);

        sales.orderSecondItemQTY().sendKeys(strArg1);
    }

    
    @And("^i select the chef \"([^\"]*)\"$")
    public void i_select_the_chef_something(String strArg1) throws Throwable {
        try {
        	sales.orderSelectPrimaryChef().click();

        	sales.orderSelectPrimaryChef().sendKeys(strArg1);
            sales.orderSelectPrimaryChefFirstSelection().click();
		} catch (Exception e) {
			sales.orderSelectPrimaryChef().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));

			sales.orderSelectPrimaryChef().sendKeys(strArg1);
	        sales.orderSelectPrimaryChefFirstSelection().click();
		}
    }

    @And("^i click the first entree item$")
    public void i_click_the_first_entree_item() throws Throwable {
        sales.orderFirstEntree().click();
    }

    @And("^i click the second entree item$")
    public void i_click_the_second_entree_item() throws Throwable {
        sales.orderSecondEntree().click();
    }

    @And("^i enter the first entree quantity$")
    public void i_enter_the_first_entree_quantity() throws Throwable {
        sales.orderFirstItemQTY().sendKeys("1");
    }

    @And("^i enter the second entree quantity$")
    public void i_enter_the_second_entree_quantity() throws Throwable {
        sales.orderSecondItemQTY().sendKeys("1");
    }

    @And("^i remove an entree item$")
    public void i_remove_an_entree_item() throws Throwable {
	   jse.executeScript("arguments[0].scrollIntoView(true);", sales.orderFirstItemMinusSign());
	       

	   waitHelper.WaitForElement(sales.orderFirstItemMinusSign(), 10);
       sales.orderFirstItemMinusSign().click();
    }

    
    
    @And("^i enter a discount percentage$")
    public void i_enter_a_discount_percentage() throws Throwable {
        Select select = new Select(sales.orderDiscountSelect());
        select.selectByIndex(2);
        sales.orderPercentageBox().sendKeys("10");
    }

    @And("^i remove discount$")
    public void i_remove_discount() throws Throwable {
    	  Select select = new Select(sales.orderDiscountSelect());
          select.selectByIndex(1);
    }
    
    
    
    @And("^i click save order$")
    public void i_click_save_order() throws Throwable {
    	
    	Thread.sleep(time1);
        String addOrderTotal = sales.orderTotal().getAttribute("textContent");
    	
        sales.orderSaveButton().click();
        
        
        waitHelper.WaitForElement(sales.pageTitle(), 40);
        String orderOverviewTotal;
        try {
            orderOverviewTotal = sales.orderOverviewTotal().getAttribute("textContent");


		} catch (Exception e) {

          	orderOverviewTotal = driver.findElement(By.cssSelector("div.list-group:nth-child(6) > span:nth-child(7) > span:nth-child(2)")).getAttribute("textContent");

		}
        
 
	
        
        System.out.println(addOrderTotal);
        System.out.println(orderOverviewTotal);
        
       assertTrue(addOrderTotal.equals(orderOverviewTotal));
    }
        
       
    

    @And("^i click save order and verify order charges$")
    public void i_click_save_order_and_verify_order_charges() throws Throwable {
    	String addOrderTotal = sales.orderTotal().getAttribute("textContent");
    	
        sales.orderSaveButton().click();
        
        waitHelper.WaitForElement(sales.pageTitle(), 10);
        String orderOverviewTotal;
        try {
             orderOverviewTotal = sales.orderOverviewTotal().getAttribute("textContent");

		} catch (Exception e) {
		       orderOverviewTotal = driver.findElement(By.cssSelector("div.list-group:nth-child(6) > span:nth-child(6) > span:nth-child(2)")).getAttribute("textContent");

		}
        System.out.println(addOrderTotal);
        System.out.println(orderOverviewTotal);
        
        assertTrue(addOrderTotal.equals(orderOverviewTotal));
    }
    
    @And("^i enter a flat discount$")
    public void i_enter_a_flat_discount() throws Throwable {
        Select select = new Select(sales.orderDiscountSelect());
        select.selectByIndex(2);
      // sales.orderPercentageBox().sendKeys("10");
    }

    @And("^i enter setup complete by time$")
    public void i_enter_setup_complete_by_time() throws Throwable {
        throw new PendingException();
    }

    @And("^i enter order charge date$")
    public void i_enter_order_charge_date() throws Throwable {
       /* sales.orderChargeDate().click();
        sales.orderChargeDateDay28().click();*/
    	
    }

    @And("^i select the meal type$")
    public void i_select_the_meal_type() throws Throwable {
        Select select = new Select(sales.orderMealTypeSelect());
        select.selectByIndex(3);
    }

    @And("^i select order presentation setup type$")
    public void i_select_order_presentation_setup_type() throws Throwable {
        Select select = new Select(sales.orderPresentationType());
        select.selectByIndex(2);
    }

    @And("^i enter chef notes \"([^\"]*)\"$")
    public void i_enter_chef_notes_something(String strArg1) throws Throwable {
        sales.orderChefNotes().sendKeys(strArg1);
    }

    @And("^i verify that client is tax exempt$")
    public void i_verify_that_client_is_tax_exempt() throws Throwable {
        System.out.println(sales.orderSalesTax().getText());
        assert(sales.orderSalesTax().getText().contains("Tax Exempt (cause: Account)"));
        assert(sales.orderSalesTax().getText().contains("$0.00"));

    }
    @And("^i enter a tip \"([^\"]*)\"$")
    public void i_enter_a_tip_something(String strArg1) throws Throwable {
       sales.orderTipBox().sendKeys(strArg1);
    }

    @And("^i click tip percentage$")
    public void i_click_tip_percentage() throws Throwable {
	    jse.executeScript("arguments[0].scrollIntoView(true);", sales.orderTipPercentButton());

		   waitHelper.WaitForElement(sales.orderTipPercentButton(), 10);

        sales.orderTipPercentButton().click();
    }

    @And("^i click on the charge client panel$")
    public void i_click_on_the_charge_client_panel() throws Throwable {
        sales.orderDetailsOrangeChargeClientPanel().click();
        
    }

    @And("^i click the charge client button$")
    public void i_click_the_charge_client_button() throws Throwable {
    	waitHelper.WaitForElement(sales.chargeClientPanelChargeClient(), 10);
       sales.chargeClientPanelChargeClient().click();
    }

    @And("^i click on the edit button$")
    public void i_click_on_the_edit_button() throws Throwable {
       sales.orderOverviewEditButton().click();
    }

    @And("^i click on the delete button$")
    public void i_click_on_the_delete_button() throws Throwable {
        sales.orderDetailsDeleteButton().click();
    }

    @And("^i accept delete$")
    public void i_accept_delete() throws Throwable {
       sales.deleteConfirmationYesButton().click();
    }

    @And("^i click the free delivery check box$")
    public void i_click_the_free_delivery_check_box() throws Throwable {
	    jse.executeScript("arguments[0].scrollIntoView(true);", sales.orderFreeDeliveryCheckBox());

    	waitHelper.WaitForElement(sales.orderFreeDeliveryCheckBox(), 10);
        sales.orderFreeDeliveryCheckBox().click();
    }

    @And("^i click the free delivery check box to apply a delivery fee$")
    public void i_click_the_free_delivery_check_box_to_apply_a_delivery_fee() throws Throwable {
	    jse.executeScript("arguments[0].scrollIntoView(true);", sales.orderFreeDeliveryCheckBox());

		   waitHelper.WaitForElement(sales.orderFreeDeliveryCheckBox(), 10);

        if(sales.orderFreeDeliveryCheckBox().isSelected())
        {
        	sales.orderFreeDeliveryCheckBox().click();
        }
    }

    @And("^i click on the invoice panel$")
    public void i_click_on_the_invoice_panel() throws Throwable {


       
       
       try {
		
    	   if(sales.orderDetailsOrangeSendInvoicePanel().isDisplayed())
    	   {
    	       sales.orderDetailsOrangeSendInvoicePanel().click();

    		   
    	   }
    		   
	} catch (Exception e) {
		

	       sales.orderDetailsOrangeSendInvoicePanel().click();

	}
    }

    @And("^i click on the invoice pdf link$")
    public void i_click_on_the_invoice_pdf_link() throws Throwable {
        sales.orderDetailsInvoicePDF().click();
    }

    @And("^i should be able to download the invoice pdf$")
    public void i_should_be_able_to_download_the_invoice_pdf() throws Throwable {
        throw new PendingException();
    }

    @And("^i click on the invoice link$")
    public void i_click_on_the_invoice_link() throws Throwable {
        try {
            sales.orderDetailsInvoiceLink().click();
      

		} catch (Exception e) {
	        sales.orderDetailsInvoiceLink2().click();

		}
        
       
    }

    @And("^i click on the invoice email button$")
    public void i_click_on_the_invoice_email_button() throws Throwable {
        sales.orderDetailsEmailInvoiceButton().click();
    }

    @And("^i click on the final invoice check box$")
    public void i_click_on_the_final_invoice_check_box() throws Throwable {
    	waitHelper.WaitForElement(sales.orderDetailsFinalizeInvoiceCheckBox(), 10);
        sales.orderDetailsFinalizeInvoiceCheckBox().click();
    }

    @And("^i click on the login to use your saved cards link$")
    public void i_click_on_the_login_to_use_your_saved_cards_link() throws Throwable {
        sales.invoiceLinkLogin().click();
    }

   

    @And("^i click the pay invoice button$")
    public void i_click_the_pay_invoice_button() throws Throwable {
    	waitHelper.WaitForElement(sales.invoiceLinkPayInvoiceButton(), 5);
        sales.invoiceLinkPayInvoiceButton().click();
    }




    @And("^i click the first side item$")
    public void i_click_the_first_side_item() throws Throwable {
       sales.orderFirstSides().click();
    }

    @And("^i enter the first side quantity$")
    public void i_enter_the_first_side_quantity() throws Throwable {
        sales.orderThirdItemQTY().sendKeys("1");
    }

    @And("^i select the \"([^\"]*)\" as the payment source$")
    public void i_select_the_something_as_the_payment_source(String strArg1) throws Throwable {
        Select select = new Select(sales.selectPaymentSourceSelect());
        select.selectByVisibleText(strArg1);
    }

    @And("^i click the pay via external method button$")
    public void i_click_the_pay_via_external_method_button() throws Throwable {
        sales.orderDetailsPayViaExtMethodButton().click();
        waitHelper.WaitForElement(sales.okButton(), 3);
        sales.okButton().click();
    }

    @And("^i enter the name on card \"([^\"]*)\"$")
    public void i_enter_the_name_on_card_something(String strArg1) throws Throwable {

        sales.invoiceLinkNameOnCard().sendKeys(strArg1);
    }

    @And("^i enter a card number \"([^\"]*)\"$")
    public void i_enter_a_card_number_something(String strArg1) throws Throwable {
    	driver.switchTo().frame(sales.invoiceLinkPaymentFrame());
       sales.invoiceLinkCardNumber().sendKeys(strArg1);
       driver.switchTo().defaultContent();
    }

    @And("^i enter cc exp date \"([^\"]*)\"$")
    public void i_enter_cc_exp_date_something(String strArg1) throws Throwable {
    	driver.switchTo().frame(driver.findElement(By.cssSelector("#braintree-hosted-field-expirationDate")));
        sales.invoiceLinkCardExpDate().sendKeys(strArg1);
        driver.switchTo().defaultContent();
    }

    @And("^i enter cc cvv \"([^\"]*)\"$")
    public void i_enter_cc_cvv_something(String strArg1) throws Throwable {
    	driver.switchTo().frame(driver.findElement(By.cssSelector("#braintree-hosted-field-cvv")));

       sales.invoiceLinkCardCvv().sendKeys(strArg1);
       driver.switchTo().defaultContent();
    }

    @And("^search orders by \"([^\"]*)\"$")
    public void search_orders_by_something(String strArg1) throws Throwable {
    	
    	
    	sales.orderSearchField().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));

       sales.orderSearchField().sendKeys(strArg1);
    }



    @And("^i click on the send chef order details panel$")
    public void i_click_on_the_send_chef_order_details_panel() throws Throwable {
       try {
           sales.orderDetailsOrangeSendOrderDetailsToChefsPanel().click();
           try {
               sales.orderDetailsOrangeSendOrderDetailsToChefsPanel2().click();

		} catch (Exception e) {
			// TODO: handle exception
		}

	} catch (Exception e) {
		sales.orderDetailsOrangeSendOrderDetailsToChefsPanel1().click();
	}
    }

    @And("^i select chef \"([^\"]*)\"$")
    public void i_select_chef_something(String strArg1) throws Throwable {
        Select select = new Select(sales.sendChefPanelChefSelect());
        select.selectByIndex(1);
    }

    @And("^i click email and text button$")
    public void i_click_email_and_text_button() throws Throwable {
        sales.sendChefPanelEmailSelectedChefButton().click();
    }

    @And("^i click email and text all updated chefs button$")
    public void i_click_email_and_text_all_updated_chefs_button() throws Throwable {
        sales.sendChefPanelEmailAllChefButton().get(2).click();
    }

    @And("^i click on the send service details to catering captain panel$")
    public void i_click_on_the_send_service_details_to_catering_captain_panel() throws Throwable {
        sales.orderDetailsOrangeSendSerDetailsToCatCaptainPanel().click();
    }

    @And("^i select catering captain \"([^\"]*)\"$")
    public void i_select_catering_captain_something(String strArg1) throws Throwable {
        sales.sendServicesPanelCatCaptainField().sendKeys(strArg1);
        Thread.sleep(time1);
        sales.sendServPanelCatCaptainFirstChoice().click();
    }

    @And("^i click Email catering Captain Button$")
    public void i_click_email_catering_captain_button() throws Throwable {
    	waitHelper.WaitForElement(sales.emailCatCaptainButton(), 10);
        sales.emailCatCaptainButton().click();
    }

    @And("^i should be able to click and send captain survey email successfully$")
    public void i_should_be_able_to_click_and_send_captain_survey_email_successfully() throws Throwable {
    	waitHelper.WaitForElement(sales.emailCatCaptainSurvey(), 10);
       sales.emailCatCaptainSurvey().click();
    }

    @And("^i click on the send survey to client panel$")
    public void i_click_on_the_send_survey_to_client_panel() throws Throwable {
    	waitHelper.WaitForElement(sales.orderDetailsSendSurveyToClient(), 10);

       try {
           sales.orderDetailsSendSurveyToClient().click();

	} catch (Exception e) {
	       sales.orderDetailsSendSurveyToClient().click();
	}
    }

    @And("^i click the email order survey button$")
    public void i_click_the_email_order_survey_button() throws Throwable {
    	waitHelper.WaitForElement(sales.sendSurveyPanelEmailOrderSurveyButton(), 10);

       sales.sendSurveyPanelEmailOrderSurveyButton().click();
       
   	waitHelper.WaitForElement(sales.okButton(), 10);
   	
   	sales.okButton().click();

    }

    @And("^sort orders by \"([^\"]*)\"$")
    public void sort_orders_by_something(String strArg1) throws Throwable {
		sales.orderSearchField().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));

        sales.orderSearchField().sendKeys(strArg1);

    }
    
    @And("^i click on the copy button$")
    public void i_click_on_the_copy_button() throws Throwable {
		//sales.orderSearchField().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));

        sales.orderOverviewCopyButton().click();
    }
    
    @And("^i click save to select captain$")
    public void i_click_save_to_select_captain() throws Throwable {
        sales.selectCapSaveButton().click();
    }
    
    
    @Then("^i should be able to send the day of menu email successfully$")
    public void i_should_be_able_to_send_the_day_of_menu_email_successfully() throws Throwable {
    	waitHelper.WaitForElement(sales.emailclientUpComOrderButton(), 10);

    	sales.emailclientUpComOrderButton().click();
    	waitHelper.WaitForElement(sales.okButton(), 10);
    	
    	sales.okButton().click();
    }

 

    @And("^i click on the send client order menu panel$")
    public void i_click_on_the_send_client_order_menu_panel() throws Throwable {
    	sales.dayOfMenuEmailPanel().click();

    }

    @And("^i click on the email client the upcoming order button$")
    public void i_click_on_the_email_client_the_upcoming_order_button() throws Throwable {
        
    }
    
    

@And("^i click on add custom entree$")
public void i_click_on_add_custom_entree() throws Throwable {

	sales.customEntree().click();

	
}

@And("^i enter custom entree name \"([^\"]*)\"$")
public void i_enter_custom_entree_name(String arg1) throws Throwable {
   
	sales.customEntreeName().get(0).sendKeys(arg1);

}



@And("^i click on my custom test item \"([^\"]*)\"$")
public void i_click_on_my_custom_test_item_something(String strArg1) throws Throwable {
	
	
	int numberOfEntrees = chef.customItemTest().size();
	for(int i = 0; i<numberOfEntrees; i++ )
	{

		String entree = chef.customItemTest().get(i).getText();
		if(entree.contains(strArg1) || entree.contains("entree test") || entree.contains("side test"))
		{
			chef.customItemTest().get(i).click();
			break;
			
		}
	}
}





@And("^i click on add custom side$")
public void i_click_on_add_custom_side() throws Throwable {
   sales.customSide().click();
}

@And("^i enter custom side name \"([^\"]*)\"$")
public void i_enter_custom_side_name(String arg1) throws Throwable {
  
  
  try {
	  
	  if(sales.customEntreeName().get(2).isDisplayed())
	  {
		  sales.customEntreeName().get(2).sendKeys(arg1);
	  }
		  
} catch (Exception e) {
	  sales.customEntreeName().get(0).sendKeys(arg1);

}
  
  
}

    
@Then("^i should successfully cancel the order$")
public void i_should_successfully_cancel_the_order() throws Throwable {
	
	sales.cancelConfirmation().getText().contains("canceled");
	
}


@Then("^i should successfully create the order$")
public void i_should_successfully_create_the_order() throws Throwable {
	
	sales.createdFromCancelConf().getText().contains("created");

}


@And("^i select cancel from the status dropdown$")
public void i_select_cancel_from_the_status_dropdown() throws Throwable {
	
	Thread.sleep(3000);
	jse.executeScript("window.scrollBy(0,150)", "");
	Thread.sleep(3000);

	jse.executeScript("arguments[0].scrollIntoView(true);",sales.orderOverviewOrderNumber() );
	WebElement status = driver.findElement(By.className("form-control"));
	mouse.moveToElement(status).click();
	WebElement cancel = status.findElement(By.xpath("//*[.=\"canceled\"]"));
	cancel.click();
	System.out.println(status.getText());
	Thread.sleep(3000);

}

@When("^i select create from the status dropdown$")
public void i_select_create_from_the_status_dropdown() throws Throwable {
	Thread.sleep(3000);
	jse.executeScript("window.scrollBy(0,150)", "");
	Thread.sleep(3000);

	jse.executeScript("arguments[0].scrollIntoView(true);",sales.orderOverviewOrderNumber() );
	WebElement status = driver.findElement(By.className("form-control"));
	mouse.moveToElement(status).click();
	WebElement cancel = status.findElement(By.xpath("//*[.=\"created\"]"));
	cancel.click();
	System.out.println(status.getText());
	Thread.sleep(3000);
}





}