package com.cucumberFramework.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
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

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpsDash  extends TestBase{

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
    
    OpsDashObjects ops = new OpsDashObjects(driver);
    
    
    
    String order;


    
    
    Actions mouse = new Actions(driver);
    
    JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	
	
	  @Given("^i navigate to the ops dashboard$")
	    public void i_navigate_to_the_ops_dashboard() throws Throwable {
	        
			driver.navigate().to(opsSite);

	    }

	    @When("^i enter my username \"([^\"]*)\"$")
	    public void i_enter_my_username_something(String strArg1) throws Throwable {
	    	
	    	waitHelper.WaitForElement(ops.email(), 10);
	        ops.email().sendKeys(strArg1);
	    }

	    @Then("^i should successfully log in to the ops dashboard full access$")
	    public void i_should_successfully_log_in_to_the_ops_dashboard_full_access() throws Throwable {
	    	waitHelper.WaitForElement(ops.closeUpdatesAlert(), 10);
	    	assert(ops.closeUpdatesAlert().isDisplayed());
	    	ops.closeUpdatesAlert().click();
	    	
	    	assert(ops.topTaps().get(1).isDisplayed());
	    	assert(ops.topTaps().get(2).isDisplayed());

	    }

	    @Then("^i should successfully log in to the ops dashboard catering captain view$")
	    public void i_should_successfully_log_in_to_the_ops_dashboard_catering_captain_view() throws Throwable {
	    	waitHelper.WaitForElement(ops.cateringsTab(), 10);
	    
	    	
	    	
	    }

	    @And("^i enter my password \"([^\"]*)\"$")
	    public void i_enter_my_password_something(String strArg1) throws Throwable {
	       ops.password().sendKeys(strArg1);
	    }

	    @And("^i select my operating location$")
	    public void i_select_my_operating_location() throws Throwable {
	    	Select select = new Select(ops.locationDropdown());
	    	select.selectByVisibleText("Rosslyn");
	    }

	    @And("^i click the login button to log in to ops$")
	    public void i_click_the_login_button_to_log_in_to_ops() throws Throwable {
	        ops.loginButton().click();
	    }
	    
	    @Then("^i should navigate to dash and verify that the order shows up in ops dash \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	    public void i_should_navigate_to_dash_and_verify_that_the_order_shows_up_in_ops_dash_something_something_something_something_something_something_something(String strArg1, String strArg2, String strArg3, String strArg4, String strArg5, String strArg6, String strArg7) throws Throwable {
	    	 //get order number in order overview
	    	
	    	String orderNumber = sales.orderOverviewOrderNumber().getText();
	    	
	    	
	    	//get service instructions in order overview
	    	String orderInstructions = sales.orderOverviewServiceInstructions().getText();
	    	
	        System.out.println(orderNumber);
	    	
	    	System.out.println(orderInstructions);
	    	
	    	
	    	
	    	
	    	//navigate to ops dash
	    	driver.navigate().to(opsSite);
	    	
	    	
	    	//login into ops
	    	ops.email().sendKeys(strArg1);
	    	ops.password().sendKeys(strArg2);
	    	

	    	Select select = new Select(ops.locationDropdown());
	    	select.selectByVisibleText("Rosslyn");
	    	ops.loginButton().click();
	    	waitHelper.WaitForElement(ops.closeUpdatesAlert(), 10);
	    	assert(ops.closeUpdatesAlert().isDisplayed());
	    	ops.closeUpdatesAlert().click();
	    	waitHelper.WaitForElement(ops.cateringsTab(), 10);
	    	
	    	
	    	//locate order
	    	
	    	
	    	int ordersOnPage =  ops.orderOverviewRow().size();
	    	for(int i = 0; i <= ordersOnPage; i++)
	    	{
	    		String opsOrderNumber = ops.orderOverviewOrderNumber().get(i).getText();
	    		
	    		if(opsOrderNumber.equals(orderNumber))
	    		{
	    			System.out.println("ops order number is " + opsOrderNumber + " and overview order Number is "+ orderNumber);
	    			assert(ops.orderOverviewClientName().get(i).getText().equals(strArg4));
	    			System.out.println("ops overview client name is " + ops.orderOverviewClientName().get(i).getText() + " and order client name is "+ strArg4);

	    			ops.orderDetails().click();
	    			waitHelper.WaitForElement(ops.orderRow().get(i), 10);
	    			
	    			System.out.println("ops overview sales rep name is " + ops.salesRep().get(i).getText() + " and order salesRep is "+ strArg3);
	    			assert(ops.salesRep().get(i).getText().equals(strArg3) || ops.salesRep().get(i).getText().contains("Pahlevani"));

	    			System.out.println("ops overview POC name is " + ops.clientName().get(i + 1).getText() + " and order POC name is "+ strArg7);
	    			assert(ops.clientName().get(i + 1).getText().contains(strArg7));

	    			System.out.println("ops overview headcount is " + ops.headCount().get(i).getText() + " and order headCount is "+ strArg5);
	    			assert(ops.headCount().get(i).getText().equals(strArg5));

	    			System.out.println("ops overview client name is " + ops.chefNames().get(i).getText() + " and order chef name is "+ strArg6);
	    			assert(ops.chefNames().get(i).getText().equals(strArg6));
	    			
	    			break;

	    		
	    			
	    		}else {
	    			System.out.println("ops order number is " + opsOrderNumber + " and overview order Number is "+ orderNumber);
	    			break;

	    		}
	    		
	    	}
	    	
	    	
	    }
	    
	    
	    

	    @Then("^i should navigate to dash and verify that marketplace order shows up in ops dash \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	    public void i_should_navigate_to_dash_and_verify_that_marketplace_order_shows_up_in_ops_dash_something_something_something_something_something_something_something(String strArg1, String strArg2, String strArg3, String strArg4, String strArg5, String strArg6, String strArg7) throws Throwable {
	        
	    	// navigate to admin to get order number 
	    	driver.navigate().to(adminStaging);
	    	
	    	
	    	
	    	// navigate to sales page
	    	admin.email().sendKeys(strArg1);
	    	admin.password().sendKeys(strArg2);
	    	
	    	Select select = new Select(driver.findElement(By.className("form-control")));
	        select.selectByVisibleText("Rosslyn, VA");
	    	
	    	admin.loginButton().click();
	    	
	    	
	    	waitHelper.WaitForElement(sales.salesLink(), 10);
	    	sales.salesLink().click();
	    	waitHelper.WaitForElement(sales.pageTitle(), 10);
	    	
	    	
	    	//locate order in admin
	    	sales.orderSearchField().sendKeys("Jest Shef");
	    	
	    	Thread.sleep(time);
	    	
	    	sales.orderList1().click();
	    	
	    	waitHelper.WaitForElement(sales.orderDetailsChefName(), 10);
	    	
	    	assert(sales.orderDetailsChefName().getText().equals("Jest Shef"));
	    	
	    
	    	
	    	//get order number in order overview
	    	
	    	String orderNumber = sales.orderOverviewOrderNumber().getText();
	    	
	    	
	    	//get service instructions in order overview
	    	String orderInstructions = sales.orderOverviewServiceInstructions().getText();
	    	
	        System.out.println(orderNumber);
	    	
	    	System.out.println(orderInstructions);
	    	
	    	
	    	
	    	
	    	//navigate to ops dash
	    	driver.navigate().to(opsSite);
	    	
	    	
	    	//login into ops
	    	ops.email().sendKeys(strArg1);
	    	ops.password().sendKeys(strArg2);
	    	
	    	select = new Select(ops.locationDropdown());
	    	select.selectByVisibleText("Rosslyn");
	    	
	    	ops.loginButton().click();
	    	
	    	waitHelper.WaitForElement(ops.closeUpdatesAlert(), 10);
	    	assert(ops.closeUpdatesAlert().isDisplayed());
	    	ops.closeUpdatesAlert().click();
	    	waitHelper.WaitForElement(ops.cateringsTab(), 10);
	    	
	    	//set date
	    	
	    	ops.dateBox().click();
	    	waitHelper.WaitForElement(ops.today(), 10);
	    	String day = ops.today().getText();
	    	int days = Integer.parseInt(day);
	    	
	    	
	    	System.out.println("day"+days);
	    	waitHelper.WaitForElement(ops.days().get(days + 7), 10);
	    	System.out.println("2 days ahead"+(ops.days().get(days + 7).getText()));

	    	ops.days().get(days + 7).click();
	    	
	    	
	    	//locate order

	    	int ordersOnPage =  ops.orderOverviewRow().size();
	    	for(int i = 0; i <= ordersOnPage; i++)
	    	{
	    		String opsOrderNumber = ops.orderOverviewOrderNumber().get(i).getText();
	    		
	    		if(opsOrderNumber.equals(orderNumber))
	    		{
	    			System.out.println("ops order number is " + opsOrderNumber + " and overview order Number is "+ orderNumber);
	    			assert(ops.orderOverviewClientName().get(i).getText().equals(strArg4));
	    			System.out.println("ops overview client name is " + ops.orderOverviewClientName().get(i).getText() + " and order client name is "+ strArg4);

	    			ops.orderDetails().click();
	    			waitHelper.WaitForElement(ops.orderRow().get(i), 10);
	    			
	    			System.out.println("ops overview sales rep name is " + ops.salesRep().get(i).getText() + " and order salesRep is "+ strArg3);
	    			assert(ops.salesRep().get(i).getText().equals(strArg3) || ops.salesRep().get(i).getText().contains("Pahlevani"));

	    			System.out.println("ops overview POC name is " + ops.clientName().get(i + 1).getText() + " and order POC name is "+ strArg7);
	    			assert(ops.clientName().get(i + 1).getText().contains(strArg7));

	    			System.out.println("ops overview headcount is " + ops.headCount().get(i).getText() + " and order headCount is "+ strArg5);
	    			assert(ops.headCount().get(i).getText().equals(strArg5));

	    			System.out.println("ops overview client name is " + ops.chefNames().get(i).getText() + " and order chef name is "+ strArg6);
	    			assert(ops.chefNames().get(i).getText().equals(strArg6));
	    			
	    			break;

	    		
	    			
	    		}else {
	    			System.out.println("ops order number is " + opsOrderNumber + " and overview order Number is "+ orderNumber);
	    			break;

	    		}
	    		
	    	}
	    	
	    	
	    	
	    	
	    }
	    
	    
	    @Then("^i should navigate to dash to calculate route and assign a captain \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	    public void i_should_navigate_to_dash_to_calculate_route_and_assign_a_captain_something_something_something_something_something_something_something(String strArg1, String strArg2, String strArg3, String strArg4, String strArg5, String strArg6, String strArg7) throws Throwable {
	    	 //get order number in order overview
	    	
		    	String orderNumber = sales.orderOverviewOrderNumber().getText();
		    	
		    	
		    	//get service instructions in order overview
		    	String orderInstructions = sales.orderOverviewServiceInstructions().getText();
		    	
		        System.out.println(orderNumber);
		    	
		    	System.out.println(orderInstructions);
		    	
		    	
		    	
		    	
		    	//navigate to ops dash
		    	driver.navigate().to(opsSite);
		    	
		    	
		    	//login into ops
		    	ops.email().sendKeys(strArg1);
		    	ops.password().sendKeys(strArg2);
		    	

		    	Select select = new Select(ops.locationDropdown());
		    	select.selectByVisibleText("Rosslyn");
		    	ops.loginButton().click();
		    	waitHelper.WaitForElement(ops.closeUpdatesAlert(), 10);
		    	assert(ops.closeUpdatesAlert().isDisplayed());
		    	ops.closeUpdatesAlert().click();
		    	waitHelper.WaitForElement(ops.cateringsTab(), 10);
		    	
		    	
		    	//locate order
		    	
		    	
		    	int ordersOnPage =  ops.orderOverviewRow().size();
		        System.out.println("Number of order on the page are " + ordersOnPage);
		    
		   
		    	for(int i = 0; i < ordersOnPage; i++)
		    	{
		    		String opsOrderNumber = ops.orderOverviewOrderNumber().get(i).getText();
		    		
		    		if(opsOrderNumber.equals(orderNumber))
		    		{
		    			System.out.println("ops order number is " + opsOrderNumber + " and overview order Number is "+ orderNumber);
		    			assert(ops.orderOverviewClientName().get(i).getText().equals(strArg4));
		    			System.out.println("ops overview client name is " + ops.orderOverviewClientName().get(i).getText() + " and order client name is "+ strArg4);


		    			ops.orderDetails().click();
		    			waitHelper.WaitForElement(ops.orderRow().get(i), 10);
		    			
		    			System.out.println("ops overview sales rep name is " + ops.salesRep().get(i).getText() + " and order salesRep is "+ strArg3);
		    			assert(ops.salesRep().get(i).getText().equals(strArg3) || ops.salesRep().get(i).getText().contains("Pahlavani"));

		    			System.out.println("ops overview POC name is " + ops.clientName().get(i + 1).getText() + " and order POC  name is "+ strArg7);
		    			assert(ops.clientName().get(i + 1).getText().contains("Tahiru"));

//		    			System.out.println("ops overview headcount is " + ops.headCount().get(i).getText() + " and order headCount is "+ strArg5);
//		    			assert(ops.headCount().get(i).getText().equals(strArg5));

		    			System.out.println("ops overview chef name is " + ops.chefNames().get(i).getText() + " and order chef name is "+ strArg6);
		    			assert(ops.chefNames().get(i).getText().equals(strArg6));
		    			
		    			
		    			// click calc service times link
		    			
		    			

		    			
		    			
		    			try {
			    		
							
							WebElement calcRouteLink = ops.orderRow().get(i).findElement(By.cssSelector("p.calculate-service-times"));

							JavascriptExecutor jse = (JavascriptExecutor)driver;

							jse.executeScript("arguments[0].scrollIntoView()", calcRouteLink); 
							
							jse.executeScript("arguments[0].click();", calcRouteLink);


						} catch (Exception e) {
							
							WebElement serviceLink = ops.orderRow().get(i).findElement(By.cssSelector("#order-row > td.no-padding > a"));
			    			
		    				JavascriptExecutor jse = (JavascriptExecutor)driver;

		    				jse.executeScript("arguments[0].scrollIntoView()", serviceLink); 
		    				
							mouse.moveToElement(serviceLink).click().perform();
							if(serviceLink.isDisplayed()) {
								jse.executeScript("arguments[0].click();", serviceLink);

							}
						}

		    			waitHelper.WaitForElement(ops.calcRouteButton(), 10);
		    			
		    			
		    			ops.calcRouteButton().click();
		    			Thread.sleep(time);
			    		
		    			if(ops.saveTimesButton().isDisplayed()) {
		    				ops.saveTimesButton().click();
			    			waitHelper.WaitForElement(ops.recalcTimes(), 10);
			    			

		    			}else {
		    				Thread.sleep(time);
		    				ops.saveTimesButton().click();
			    			waitHelper.WaitForElement(ops.recalcTimes(), 10);
			    			

		    			}

		    			

		    			break;

		    		
		    			
		    		}
		    		
		    		
		    	}
	    }

	    @Then("^i should navigate to dash from marketplace and calculate routes and assign a captain \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	    public void i_should_navigate_to_dash_from_marketplace_and_calculate_routes_and_assign_a_captain_something_something_something_something_something_something_something(String strArg1, String strArg2, String strArg3, String strArg4, String strArg5, String strArg6, String strArg7) throws Throwable {
	    	// navigate to admin to get order number 
	    	driver.navigate().to(adminStaging);
	    	
	    	
	    	
	    	// navigate to sales page
	    	admin.email().sendKeys(strArg1);
	    	admin.password().sendKeys(strArg2);
	    	
	    	Select select = new Select(driver.findElement(By.className("form-control")));
	        select.selectByVisibleText("Rosslyn, VA");
	    	
	    	admin.loginButton().click();
	    	
	    	
	    	waitHelper.WaitForElement(sales.salesLink(), 10);
	    	sales.salesLink().click();
	    	waitHelper.WaitForElement(sales.pageTitle(), 10);
	    	
	    	
	    	//locate order in admin
	    	sales.orderSearchField().sendKeys("Jest Shef");
	    	
	    	Thread.sleep(time);
	    	
	    	sales.orderList1().click();
	    	
	    	waitHelper.WaitForElement(sales.orderDetailsChefName(), 10);
	    	
	    	assert(sales.orderDetailsChefName().getText().equals("Jest Shef"));
	    	
	    
	    	
	    	//get order number in order overview
	    	
	    	String orderNumber = sales.orderOverviewOrderNumber().getText();
	    	
	    	
	    	//get service instructions in order overview
	    	String orderInstructions = sales.orderOverviewServiceInstructions().getText();
	    	
	        System.out.println(orderNumber);
	    	
	    	System.out.println(orderInstructions);
	    	
	    	
	    	
	    	
	    	//navigate to ops dash
	    	driver.navigate().to(opsSite);
	    	
	    	
	    	//login into ops
	    	ops.email().sendKeys(strArg1);
	    	ops.password().sendKeys(strArg2);
	    	
	    	select = new Select(ops.locationDropdown());
	    	select.selectByVisibleText("Rosslyn");
	    	
	    	ops.loginButton().click();
	    	
	    	waitHelper.WaitForElement(ops.closeUpdatesAlert(), 10);
	    	assert(ops.closeUpdatesAlert().isDisplayed());
	    	ops.closeUpdatesAlert().click();
	    	waitHelper.WaitForElement(ops.cateringsTab(), 10);
	    	
	    	//set date
	    	
	    	ops.dateBox().click();
	    	waitHelper.WaitForElement(ops.today(), 10);
	    	String day = ops.today().getText();
	    	int days = Integer.parseInt(day);
	    	
	    	
	    	System.out.println("day"+days);
	    	waitHelper.WaitForElement(ops.days().get(days + 7), 10);
	    	System.out.println("2 days ahead"+(ops.days().get(days + 7).getText()));

	    	ops.days().get(days + 7).click();
	    	
	    	
	    	//locate order

	    	int ordersOnPage =  ops.orderOverviewRow().size();
	    	for(int i = 0; i < ordersOnPage; i++)
	    	{
	    		String opsOrderNumber = ops.orderOverviewOrderNumber().get(i).getText();
	    		
	    		if(opsOrderNumber.equals(orderNumber))
	    		{
	    			System.out.println("ops order number is " + opsOrderNumber + " and overview order Number is "+ orderNumber);
	    			assert(ops.orderOverviewClientName().get(i).getText().equals(strArg4));
	    			System.out.println("ops overview client name is " + ops.orderOverviewClientName().get(i).getText() + " and order client name is "+ strArg4);

	    			ops.orderDetails().click();
	    			waitHelper.WaitForElement(ops.orderRow().get(i), 10);
	    			
	    			System.out.println("ops overview sales rep name is " + ops.salesRep().get(i).getText() + " and order salesRep is "+ strArg3);
	    			assert(ops.salesRep().get(i).getText().equals(strArg3) || ops.salesRep().get(i).getText().contains("Pahlavani"));

//	    			System.out.println("ops overview POC name is " + ops.clientName().get(i + 1).getText() + " and order POC  name is "+ strArg7);
//	    			assert(ops.clientName().get(i + 1).getText().contains("Tahiru"));

//	    			System.out.println("ops overview headcount is " + ops.headCount().get(i).getText() + " and order headCount is "+ strArg5);
//	    			assert(ops.headCount().get(i).getText().equals(strArg5));

//	    			System.out.println("ops overview chef name is " + ops.chefNames().get(i).getText() + " and order chef name is "+ strArg6);
//	    			assert(ops.chefNames().get(i).getText().equals(strArg6));
//	    			
//	    			
	    			
	    			// click calc service times link
	    			
	    			

	    			
	    			
	    			try {
		    		
						
						WebElement calcRouteLink = ops.orderRow().get(i).findElement(By.cssSelector("#order-row > td:nth-child(8) > table > tr.no-border > td > div > p"));

						JavascriptExecutor jse = (JavascriptExecutor)driver;

						jse.executeScript("arguments[0].scrollIntoView()", calcRouteLink); 
						
						jse.executeScript("arguments[0].click();", calcRouteLink);

					} catch (Exception e) {
						
						WebElement serviceLink = ops.orderRow().get(i).findElement(By.className("link"));
		    			
	    				JavascriptExecutor jse = (JavascriptExecutor)driver;

	    				jse.executeScript("arguments[0].scrollIntoView()", serviceLink); 
	    				
						mouse.moveToElement(serviceLink).click().perform();
						if(serviceLink.isDisplayed()) {
							jse.executeScript("arguments[0].click();", serviceLink);

						}
					}

	    			waitHelper.WaitForElement(ops.calcRouteButton(), 10);
	    			
	    			
	    			ops.calcRouteButton().click();
	    			Thread.sleep(time);
		    		
	    			if(ops.saveTimesButton().isDisplayed()) {
	    				ops.saveTimesButton().click();
		    			waitHelper.WaitForElement(ops.recalcTimes(), 10);
		    			

	    			}else {
	    				Thread.sleep(time);
	    				ops.saveTimesButton().click();
		    			waitHelper.WaitForElement(ops.recalcTimes(), 10);
		    			

	    			}

	    			
	    			break;

	    		
	    			
	    		}
	    		
	    		
	    	}
	    }
	    
	    
	    
	    @Then("^i should locate order and navigate to dash to calculate routes and assign multiple captains \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	    public void i_should_locate_order_and_navigate_to_dash_to_calculate_routes_and_assign_multiple_captains_something_something_something_something_something_something_something(String strArg1, String strArg2, String strArg3, String strArg4, String strArg5, String strArg6, String strArg7) throws Throwable {
	    	 //get order number in order overview
	    	
	    	String orderNumber = sales.orderOverviewOrderNumber().getText();
	    	
	    	
	    	//get service instructions in order overview
	    	String orderInstructions = sales.orderOverviewServiceInstructions().getText();
	    	
	        System.out.println(orderNumber);
	    	
	    	System.out.println(orderInstructions);
	    	
	    	
	    	
	    	
	    	//navigate to ops dash
	    	driver.navigate().to(opsSite);
	    	
	    	
	    	//login into ops
	    	ops.email().sendKeys(strArg1);
	    	ops.password().sendKeys(strArg2);
	    	

	    	Select select = new Select(ops.locationDropdown());
	    	select.selectByVisibleText("Rosslyn");
	    	ops.loginButton().click();
	    	waitHelper.WaitForElement(ops.closeUpdatesAlert(), 10);
	    	assert(ops.closeUpdatesAlert().isDisplayed());
	    	ops.closeUpdatesAlert().click();
	    	waitHelper.WaitForElement(ops.cateringsTab(), 10);
	    	
	    	
	    	//locate order
	    	
	    	
	    	int ordersOnPage =  ops.orderOverviewRow().size();
	        System.out.println("Number of order on the page are " + ordersOnPage);
	    
	   
	    	for(int i = 0; i < ordersOnPage; i++)
	    	{
	    		String opsOrderNumber = ops.orderOverviewOrderNumber().get(i).getText();
	    		
	    		if(opsOrderNumber.equals(orderNumber))
	    		{
	    			System.out.println("ops order number is " + opsOrderNumber + " and overview order Number is "+ orderNumber);
	    			assert(ops.orderOverviewClientName().get(i).getText().equals(strArg4));
	    			System.out.println("ops overview client name is " + ops.orderOverviewClientName().get(i).getText() + " and order client name is "+ strArg4);


	    			ops.orderDetails().click();
	    			waitHelper.WaitForElement(ops.orderRow().get(i), 10);
	    			
	    			System.out.println("ops overview sales rep name is " + ops.salesRep().get(i).getText() + " and order salesRep is "+ strArg3);
	    			assert(ops.salesRep().get(i).getText().equals(strArg3) || ops.salesRep().get(i).getText().contains("Pahlavani"));

	    			System.out.println("ops overview POC name is " + ops.clientName().get(i + 1).getText() + " and order POC  name is "+ strArg7);
	    			assert(ops.clientName().get(i + 1).getText().contains("Tahiru"));

//	    			System.out.println("ops overview headcount is " + ops.headCount().get(i).getText() + " and order headCount is "+ strArg5);
//	    			assert(ops.headCount().get(i).getText().equals(strArg5));

	    			System.out.println("ops overview chef name is " + ops.chefNames().get(i).getText() + " and order chef name is "+ strArg6);
	    			assert(ops.chefNames().get(i).getText().equals(strArg6));
	    			
	    			
	    			// click calc service times link
	    			
	    			

	    			
	    			
	    			try {
		    		
						
						WebElement calcRouteLink = ops.orderRow().get(i).findElement(By.cssSelector("p.calculate-service-times"));

						JavascriptExecutor jse = (JavascriptExecutor)driver;

						jse.executeScript("arguments[0].scrollIntoView()", calcRouteLink); 
						
						
						
						//mouse.moveToElement(calcRouteLink).click().perform();
						
						
						
						
						jse.executeScript("arguments[0].click();", calcRouteLink);
						
						
						

					} catch (Exception e) {
						
						WebElement serviceLink = ops.orderRow().get(i).findElement(By.cssSelector("#order-row > td.no-padding > a"));
		    			
	    				JavascriptExecutor jse = (JavascriptExecutor)driver;

	    				jse.executeScript("arguments[0].scrollIntoView()", serviceLink); 
	    				
	    				
						mouse.moveToElement(serviceLink).click().perform();
						
						if(serviceLink.isDisplayed()) {
							jse.executeScript("arguments[0].click();", serviceLink);

						}
						
					}

	    			waitHelper.WaitForElement(ops.calcRouteButton(), 10);
	    			
	    			//assign 4 captains
	    			ops.numberOfCateringCaptains().click();
	    			ops.numberOfCateringCaptains().sendKeys(Keys.BACK_SPACE);

	    			ops.numberOfCateringCaptains().sendKeys("4");
	    			
	    			
	    			ops.calcRouteButton().click();

	    			
	    			
	    			waitHelper.WaitForElement(ops.saveTimesButton(), 10);

	    			Thread.sleep(time);
	    		
	    			if(ops.saveTimesButton().isDisplayed()) {
	    				ops.saveTimesButton().click();
		    			waitHelper.WaitForElement(ops.recalcTimes(), 10);
		    			

	    			}else {
	    				Thread.sleep(time);
	    				ops.saveTimesButton().click();
		    			waitHelper.WaitForElement(ops.recalcTimes(), 10);
		    			

	    			}

	    			
	    			
	    			break;

	    		
	    			
	    		}
	    		
	    		
	    	}
	    }


}
