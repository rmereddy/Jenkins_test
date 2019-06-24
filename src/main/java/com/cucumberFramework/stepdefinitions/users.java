package com.cucumberFramework.stepdefinitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.AdminClientsPage;
import com.cucumberFramework.pageObjects.HomePage;
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

public class users extends TestBase{

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
    
    
    String order;


    
    
    Actions mouse = new Actions(driver);
    
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    
    

	
	
    @Given("^i am on the users page$")
    public void i_am_on_the_users_page() throws Throwable {
        waitHelper.WaitForElement(sales.pageTitle(), 10);
        System.out.println(sales.pageTitle().getText());
        assert(sales.pageTitle().getText().equals("Users"));
    }

    @When("^i click on the users link$")
    public void i_click_on_the_users_link() throws Throwable {
        waitHelper.WaitForElement(users.usersLink(), 10);
        users.usersLink().click();

    }

    @When("^i click on the add new user button$")
    public void i_click_on_the_add_new_user_button() throws Throwable {

    	users.addNewUser().click();
    }

    @When("^i search for and delete the user \"([^\"]*)\"$")
    public void i_search_for_and_delete_the_user_something(String strArg1) throws Throwable {
    	   waitHelper.WaitForElement(chef.chefList1(), 5);
           // cus.zipCode().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));

     	   chef.chefSearchField().sendKeys(strArg1);

            Thread.sleep(time1);
       	 try   
 	  		{
  		 if (chef.chefList1().isDisplayed())
 	  
  		  
 		          {
 		          	chef.chefList1().click();
 		          	Thread.sleep(time1);
 		            
 		      	    if(chef.pageTitle().getText().endsWith("Testing"))
 		            {
 		      	    	System.out.println(chef.pageTitle().getText());
 		      	       assert(users.name().getText().contains("Testing Testing"));
 		      	       
 		      	       assert(chef.pageTitle().getText().endsWith("Testing"));
 		      	       Thread.sleep(time2);
 			             chef.chefOverviewEditButton().click();
 			             mouse.moveToElement(users.deleteButton()).perform();

 			            waitHelper.WaitForElement(users.deleteButton(), 10);
 			             users.deleteButton().click();
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
  		chef.chefSearchField().sendKeys(strArg1);
  		 if (chef.chefList1().isDisplayed())
  			  
  	 		  
          {
          	chef.chefList1().click();
          	Thread.sleep(time1);
            
      	    if(chef.pageTitle().getText().endsWith("Testing"))
            {
      	    	System.out.println(chef.pageTitle().getText());
	      	       assert(users.name().getText().contains("Testing Testing"));
	      	       
	      	       assert(chef.pageTitle().getText().endsWith("Testing"));
	      	       Thread.sleep(time2);
		             chef.chefOverviewEditButton().click();
		             waitHelper.WaitForElement(users.deleteButton(), 10);
		             mouse.moveToElement(users.deleteButton()).perform();
		            users.deleteButton().click();
		             Thread.sleep(time1);
		             	chef.yesButton().click();
  	   
  
            }
      	    else {
      	    	driver.navigate().refresh();
      	    }
          }
  	  }
    }
    @When("^i search for user and click edit \"([^\"]*)\"$")
    public void i_search_for_user_and_click_edit(String strArg1) throws Throwable {
    	   waitHelper.WaitForElement(chef.chefList1(), 5);
           // cus.zipCode().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));

     	   chef.chefSearchField().sendKeys(strArg1);

            Thread.sleep(time1);
       	    
 	  		
  		 if (chef.chefList1().isDisplayed())
 	  
  		  
 		          {
 		          	chef.chefList1().click();
 		          	Thread.sleep(time1);
 		            
 		      	    if(chef.pageTitle().getText().endsWith("Testing"))
 		            {
 		      	    	System.out.println(chef.pageTitle().getText());
 		      	       assert(users.name().getText().contains("Testing Testing"));
 		      	       
 		      	       assert(chef.pageTitle().getText().endsWith("Testing"));
 		      	       Thread.sleep(time2);
 			             chef.chefOverviewEditButton().click();
 			         
 	      	   
    	   
 		            }
 		          }
      	    
          
  	  
    }
    @Then("^i should successfuly navigate to the users page$")
    public void i_should_successfuly_navigate_to_the_users_page() throws Throwable {
    	Thread.sleep(time1);
		  assert (chef.pageTitle().getText().equalsIgnoreCase("Users"));
    }

    @Then("^i should succesfully add the new all roles user$")
    public void i_should_succesfully_add_the_new_all_roles_user() throws Throwable {
    	Thread.sleep(time);
    	System.out.println(sales.pageTitle().getText());
         assert(sales.pageTitle().getText().equals("Testing Testing"));
         waitHelper.WaitForElement(users.name(), 10);

         System.out.println(users.name().getText());
         assert(users.name().getText().equalsIgnoreCase("Testing Testing"));
         System.out.println(users.email().getText());
         assert(users.email().getText().equalsIgnoreCase("Testing@Testemail.com"));
         System.out.println(users.phoneNumber().getText());
         assert(users.phoneNumber().getText().equals("+12021111111"));
         
    }
    
    
    
    @Then("^i should succesfully edit user$")
    public void i_should_succesfully_edit_user() throws Throwable {
    	Thread.sleep(time);
         assert(sales.pageTitle().getText().contains("Testing Testing"));
         waitHelper.WaitForElement(users.name(), 10);

         assert(users.name().getText().contains("Testing Testing"));
         assert(users.email().getText().equalsIgnoreCase("Testing@Testemail.com"));
         assert(users.phoneNumber().getText().equals("+12021111111"));
         
    }
    
    

    @Then("^i should navigate to the users page$")
    public void i_should_navigate_to_the_users_page() throws Throwable {
        Thread.sleep(time1);

		  assert (chef.pageTitle().getText().equalsIgnoreCase("Users"));
    }

    @And("^i enter the users first name \"([^\"]*)\"$")
    public void i_enter_the_users_first_name_something(String strArg1) throws Throwable {
        users.firstName().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	users.firstName().sendKeys(strArg1);
    }

    @And("^i enter the users last name \"([^\"]*)\"$")
    public void i_enter_the_users_last_name_something(String strArg1) throws Throwable {
        users.lastName().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));

    	users.lastName().sendKeys(strArg1);
    }

    @And("^i enter the users email \"([^\"]*)\"$")
    public void i_enter_the_users_email_something(String strArg1) throws Throwable {
        users.email().sendKeys(strArg1);
    }

    @And("^i enter the users phone number \"([^\"]*)\"$")
    public void i_enter_the_users_phone_number_something(String strArg1) throws Throwable {
        users.phoneNumber().sendKeys(strArg1);
    }

    @And("^i enter the users temporary password \"([^\"]*)\"$")
    public void i_enter_the_users_temporary_password_something(String strArg1) throws Throwable {
        users.password().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        users.password().sendKeys(strArg1);
    }

    @And("^i select the users headquarter$")
    public void i_select_the_users_headquarter() throws Throwable {

    	Select select = new Select(users.locationSelect());
    	select.selectByIndex(1);
    }

    @And("^i click on account executive checkbox$")
    public void i_click_on_account_executive_checkbox() throws Throwable {
        users.acountExecRole().click();
    }

    @And("^i click on admin checkbox$")
    public void i_click_on_admin_checkbox() throws Throwable {
        users.adminRole().click();
    }

    @And("^i click on catering captain checkbox$")
    public void i_click_on_catering_captain_checkbox() throws Throwable {
        users.cateringCapRole().click();
    }

    @And("^i click on chef checkbox$")
    public void i_click_on_chef_checkbox() throws Throwable {
        users.chefRole().click();
    }

    @And("^i click on chef recruiting checkbox$")
    public void i_click_on_chef_recruiting_checkbox() throws Throwable {
        users.chefRecRole().click();
     
    }

    @And("^i click on master account executive checkbox$")
    public void i_click_on_master_account_executive_checkbox() throws Throwable {
       users.masterAccExecRole().click();
    }

    @And("^i click the save button$")
    public void i_click_the_save_button() throws Throwable {
       users.saveButton().click();
    }

}
