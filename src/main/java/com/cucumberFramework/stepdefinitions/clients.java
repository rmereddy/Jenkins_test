package com.cucumberFramework.stepdefinitions;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;

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

public class clients extends TestBase{

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
    
    

    @When("^i click on the clients link$")
    public void i_click_on_the_clients_link() throws Throwable {
    	waitHelper.WaitForElement(clients.clientsLink(), 10);
    	clients.clientsLink().click();
        
    }

    @Then("^i should successfuly navigate to the clients page$")
    public void i_should_successfuly_navigate_to_the_clients_page() throws Throwable {
       waitHelper.WaitForElement(sales.pageTitle(), 10);
       System.out.println(sales.pageTitle().getText());
       assert(sales.pageTitle().getText().equals("Clients"));
    }
    
    

    @Given("^i am on the clients page$")
    public void i_am_on_the_clients_page() throws Throwable {
    	   waitHelper.WaitForElement(sales.pageTitle(), 10);
           System.out.println(sales.pageTitle().getText());
           assert(sales.pageTitle().getText().equals("Clients"));
    }

    @When("^i enter clients account name \"([^\"]*)\"$")
    public void i_enter_clients_account_name_something(String strArg1) throws Throwable {
    	clients.accountNameInputBox().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));

        clients.accountNameInputBox().sendKeys(strArg1);
    }

    @When("^i search for and delete the client \"([^\"]*)\"$")
    public void i_search_for_and_delete_the_client_something(String strArg1) throws Throwable {
           waitHelper.WaitForElement(chef.chefList1(), 5);
          // cus.zipCode().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));

           Thread.sleep(time1);
    	   chef.chefSearchField().sendKeys(strArg1);

           Thread.sleep(time1);
      	 try   
	  		{
 		 if (chef.chefList1().isDisplayed())
	  
 		  
		          {
		          	chef.chefList1().click();
		          	Thread.sleep(time1);
		            
		      	    if(chef.pageTitle().getText().endsWith("TestingTesting"))
		            {
		      	    	System.out.println(chef.pageTitle().getText());
		      	       assert(clients.overviwAccountName().isDisplayed());
		      	       assert(chef.pageTitle().getText().endsWith("TestingTesting"));
			             chef.chefOverviewEditButton().click();

			             waitHelper.WaitForElement(clients.net(), 5);
			          if(clients.net().isDisplayed())
			          {
			        	  clients.net().click();
			          	/*clients.net().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));

			        	 clients.net().sendKeys("11");*/
			        	  Thread.sleep(time1);
			        	 clients.net().sendKeys(Keys.TAB);
			        	 Thread.sleep(time1);
			        	 chef.deleteButton().sendKeys(Keys.ENTER);
			        	  
			          }else {
			        	   try {
				            	  mouse.moveToElement(chef.deleteButton()).perform();
						             chef.deleteButton().click();
							} catch (Exception e) {
								  mouse.moveToElement(chef.deleteButton2()).perform();
						             chef.deleteButton2().click();
							}
			          }
			             
			             
			             
			             Thread.sleep(time1);
			             	chef.yesButton().click();
			             	
   	   
		            }
		      	    else {
		      	    	driver.navigate().refresh();
		      	    }
       	     

        }

       }
	  		       
 	  catch(Exception e)     
 	  {  
 		 driver.navigate().refresh();
 		 waitHelper.WaitForElement(sales.pageTitle(), 10);
         Thread.sleep(time);

 		chef.chefSearchField().sendKeys(strArg1);
 		Thread.sleep(time1);
 		 if (chef.chefList1().isDisplayed())
 			  
 	 		  
         {
         	chef.chefList1().click();
         	Thread.sleep(time1);
           
     	    if(chef.pageTitle().getText().endsWith("TestingTesting"))
           {
     	    	System.out.println(chef.pageTitle().getText());
     	       assert(clients.overviwAccountName().isDisplayed());
     	       Thread.sleep(time1);
     	       assert(chef.pageTitle().getText().endsWith("TestingTesting"));
     	       Thread.sleep(time1);
	             chef.chefOverviewEditButton().click();

	             try {
	            	  mouse.moveToElement(chef.deleteButton3()).perform();
			             chef.deleteButton3().click();
				} catch (Exception e1) {
					  mouse.moveToElement(chef.deleteButton4()).perform();
			             chef.deleteButton4().click();
				}
	             Thread.sleep(time1);
	             	chef.yesButton().click();
 	   
 
           }
     	    
         }
 	  }
    }

    @Then("^i should successfuly add my new client$")
    public void i_should_successfuly_add_my_new_client() throws Throwable {

    	Thread.sleep(3000);
    	System.out.println(sales.pageTitle().getText());
		  assert (sales.pageTitle().getText().endsWith("TestingTesting"));

    }

    @Then("^i should navigate to the clients page$")
    public void i_should_navigate_to_the_clients_page() throws Throwable {
    	//after deleting client
    	Thread.sleep(time);
		  assert (chef.pageTitle().getText().equalsIgnoreCase("Clients"));
    }

    @And("^i click on add new client button$")
    public void i_click_on_add_new_client_button() throws Throwable {
        waitHelper.WaitForElement(clients.addNewCient(), 10);
        clients.addNewCient().click();
    }

    @And("^i enter the number of employees \"([^\"]*)\"$")
    public void i_enter_the_number_of_employees_something(String strArg1) throws Throwable {
        clients.numberOfEmployeesInputBox().sendKeys(strArg1);
    }

    @And("^i enter the price per person \"([^\"]*)\"$")
    public void i_enter_the_price_per_person_something(String strArg1) throws Throwable {
        clients.averagePricePerPersonInputBox().sendKeys(strArg1);
    }

    @And("^i click call on arrival check box$")
    public void i_click_call_on_arrival_check_box() throws Throwable {
       clients.callOnArrivalCheckBox().click();
    }

    @And("^i click napkins utensils check box$")
    public void i_click_napkins_utensils_check_box() throws Throwable {
       clients.needUtensilsYesRadioButton().click();
    }

    @And("^i click servings utensils check box$")
    public void i_click_servings_utensils_check_box() throws Throwable {
        clients.needsServingUtensilsYesRadio().click();
    }

    @And("^i enter parking instructions \"([^\"]*)\"$")
    public void i_enter_parking_instructions_something(String strArg1) throws Throwable {
        clients.parkingInstructions().sendKeys(strArg1);
    }

    @And("^i enter clients address \"([^\"]*)\"$")
    public void i_enter_clients_address_something(String strArg1) throws Throwable {
        clients.addressLine1().sendKeys(strArg1);
    }

    @And("^i enter clients city \"([^\"]*)\"$")
    public void i_enter_clients_city_something(String strArg1) throws Throwable {
       clients.city().sendKeys(strArg1);
    }

    @And("^i enter clients state \"([^\"]*)\"$")
    public void i_enter_clients_state_something(String strArg1) throws Throwable {
        clients.state().sendKeys(strArg1);
    }

    @And("^i enter clients zip code \"([^\"]*)\"$")
    public void i_enter_clients_zip_code_something(String strArg1) throws Throwable {
        clients.zipcode().sendKeys(strArg1);
    }

    @And("^i enter clients building instruction \"([^\"]*)\"$")
    public void i_enter_clients_building_instruction_something(String strArg1) throws Throwable {
    	clients.buildingInstructions().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));

    	clients.buildingInstructions().sendKeys(strArg1);
    }

    @And("^i enter clients contacts title \"([^\"]*)\"$")
    public void i_enter_clients_contacts_title_something(String strArg1) throws Throwable {
        clients.title().sendKeys(strArg1);
    }

    @And("^i enter clients first name \"([^\"]*)\"$")
    public void i_enter_clients_first_name_something(String strArg1) throws Throwable {
        clients.firstName().sendKeys(strArg1);
    }
    
    @And("^i enter clients last name \"([^\"]*)\"$")
    public void i_enter_clients_last_name_something(String strArg1) throws Throwable {
        clients.lastName().sendKeys(strArg1);
    }

    @And("^i enter card holder name$")
    public void i_enter_card_holder_name() throws Throwable {
        if(driver.getCurrentUrl().contains("staging"))
        {
        	clients.cardHolderName().sendKeys("Test Card");
        }else {
        	clients.cardHolderName().sendKeys("Jeffery CEO");
        }
    }

    @And("^i enter card number$")
    public void i_enter_card_number() throws Throwable {
        if(driver.getCurrentUrl().contains("staging"))
        {
        	clients.cardNumber().sendKeys("4111111111111111");
        }else {
        	clients.cardNumber().sendKeys("1111111111111111");
        }
    }

    @And("^i enter expiration date$")
    public void i_enter_expiration_date() throws Throwable {
        if(driver.getCurrentUrl().contains("staging"))
        {
        	clients.expirationDate().sendKeys("520");
        }else {
        	clients.expirationDate().sendKeys("520");
        }
    }

    @And("^i enter cvv$")
    public void i_enter_cvv() throws Throwable {
    	
        if(driver.getCurrentUrl().contains("staging"))
        {
        	clients.cvv().sendKeys("520");
        }else {
        	clients.cvv().sendKeys("520");
        }
    }

    @And("^i click net client check box$")
    public void i_click_net_client_check_box() throws Throwable {
        clients.netPaymentCheckBox().click();
    }

    @And("^i click tax exempt client check box$")
    public void i_click_tax_exempt_client_check_box() throws Throwable {
        clients.taxExemptCheckBox().click();
    }

    @And("^i click pay by check check box$")
    public void i_click_pay_by_check_check_box() throws Throwable {
    	clients.payByCheckCheckBox().click();
    
    }

    
    @And("^i enter clients phone number \"([^\"]*)\"$")
    public void i_enter_clients_phone_number_something(String strArg1) throws Throwable {
       clients.phoneNumber().sendKeys(strArg1);
    }

    @And("^i enter clients email address \"([^\"]*)\"$")
    public void i_enter_clients_email_address_something(String strArg1) throws Throwable {
    	
      
        
       LocalDateTime  time = java.time.LocalDateTime.now();
       
       System.out.println(java.time.LocalDateTime.now());;
  
        clients.emaiil().sendKeys(time + strArg1);
    }

    @And("^i enter clients tax status$")
    public void i_enter_clients_tax_status() throws Throwable {
        if(clients.taxExemptCheckBox().isSelected())
        {
        	
        	Select select = new Select(clients.purchaserTaxStatus());
        	select.selectByIndex(1);
        }else {
        	Select select = new Select(clients.purchaserTaxStatus());
        	select.selectByIndex(2);
        }
    }

}
