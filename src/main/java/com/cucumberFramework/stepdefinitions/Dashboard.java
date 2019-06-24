package com.cucumberFramework.stepdefinitions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.AdminClientsPage;
import com.cucumberFramework.pageObjects.AdminDashboard;
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
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.java.en.Then;

public class Dashboard extends TestBase{

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
    AdminDashboard dash = new  AdminDashboard(driver);
    
    
    String order;


    
    
    Actions mouse = new Actions(driver);
    
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    
    
    
    @Then("^i should navigate to dash and verify that the order shows in admin dashboard \"([^\"]*)\"$")
    public void i_should_navigate_to_dash_and_verify_that_the_order_shows_in_admin_dashboard_something(String strArg1) throws Throwable {

    //get order number in order overview
    	
    	String orderNumber = sales.orderOverviewOrderNumber().getText();
    	
    	
    //get service instructions in order overview
    	String orderInstructions = sales.orderOverviewServiceInstructions().getText();
    	
        System.out.println(orderNumber);
    	
    	System.out.println(orderInstructions);
    	
    	
    	
    
    //navigate to dashboard page
    	waitHelper.WaitForElement(sales.pageTitle(), 10);

    	waitHelper.WaitForElement(dash.dashboardLink(), 10);

    	dash.dashboardLink().click();
    	waitHelper.WaitForElement(sales.pageTitle(), 10);
    	
    //enter date of order
    	
    	dash.fromDate().click();
    	waitHelper.WaitForElement(dash.today(), 10);

    	dash.today().click();
    	waitHelper.WaitForElement(dash.toDate(), 10);

    	dash.toDate().click();
    	waitHelper.WaitForElement(dash.today(), 10);

    	dash.today().click();
    	
    //locate the order
    	String dashOrderNumber = dash.orderNumber().get(1).getText();
    	
    	for(int i=0; !dashOrderNumber.equals(orderNumber); i++) 
    	{
    		dashOrderNumber = dash.orderNumber().get(i).getText();
    		
    	}
    	
    	System.out.println("dash order number is " + dashOrderNumber);
    	
    	System.out.println("sales overview order number is " + orderNumber);
    	
    	

    	
    //assert order number matches
    	
    	assert(dashOrderNumber.equals(orderNumber));
    	
    //assert service instructions matches
    

    	
    
    }
    
    
    @Then("^i should be able to verify that the order from marketplace showed up on the invoice page and in admin dashboard$")
    public void i_should_be_able_to_verify_that_the_order_from_marketplace_showed_up_on_the_invoice_page_and_in_admin_dashboard() throws Throwable {

    
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
       
         
         
         
    
    
 //get order number in order overview
    	
    	String orderNumber = sales.orderOverviewOrderNumber().getText();
    	
    	
    //get service instructions in order overview
    	String orderInstructions = sales.orderOverviewServiceInstructions().getText();
    	
        System.out.println(orderNumber);
    	
    	System.out.println(orderInstructions);
    	
    	
    	
    
    //navigate to dashboard page
    	waitHelper.WaitForElement(sales.pageTitle(), 10);

    	waitHelper.WaitForElement(dash.dashboardLink(), 10);

    	dash.dashboardLink().click();
    	waitHelper.WaitForElement(sales.pageTitle(), 10);
    	
    //enter date of order
    	
    	
    	
    	
    	
    	
    //locate the order
    	
    	Select selectAll = new Select(dash.selectNumberOfOrdersToDisplay());
    	
    	selectAll.selectByVisibleText("All");
    	
    	waitHelper.WaitForElement(dash.orderNumber().get(1), 10);
    	String dashOrderNumber = dash.orderNumber().get(1).getText();
    	
    	for(int i=0; !dashOrderNumber.equals(orderNumber); i++) 
    	{
    		dashOrderNumber = dash.orderNumber().get(i).getText();
        	System.out.println("order numbers " + dashOrderNumber);

    	}
    	
    	System.out.println("dash order number is " + dashOrderNumber);
    	
    	System.out.println("sales overview order number is " + orderNumber);
    	
    	

    	
    //assert order number matches
    	
    	assert(dashOrderNumber.equals(orderNumber));
    	
    //assert service instructions matches
    
    }

    
    
    
    @Then("^i should navigate to dash and verify that the order shows in admin AR dashboard$")
    public void i_should_navigate_to_dash_and_verify_that_the_order_shows_in_admin_AR_dashboard() throws Throwable {

    //get order number in order overview
    	
    	String salesRepsName = "Shy Pahlevani";
    	String orderNumber = sales.orderOverviewOrderNumber().getText();
    	System.out.println(salesRepsName);
    	System.out.println(orderNumber);
    	
    	
    //get service instructions in order overview
    	String orderInstructions = sales.orderOverviewServiceInstructions().getText();
    	
        System.out.println(salesRepsName);
    	
    	System.out.println(orderInstructions);
    	
    	
    	
    
    //navigate to AR dashboard page
    	waitHelper.WaitForElement(sales.pageTitle(), 10);

    	waitHelper.WaitForElement(dash.dashboardLink(), 10);

    	dash.dashboardLink().click();
    	waitHelper.WaitForElement(dash.accountingReceivableTab(), 10);
    	
    	dash.accountingReceivableTab().click();
    	waitHelper.WaitForElement(dash.ARsalesReps().get(1), 10);
    	
    	
    	
    	
    	
    	
    	
    //locate the sales rep
    	
	String salesRep = dash.ARsalesReps().get(0).getText();
    	
    	for(int i=0; dash.ARsalesReps().get(i).isDisplayed(); i++) 
    	{
    		salesRep = dash.ARsalesReps().get(i).getText();
    		System.out.println(salesRep);
    		
    		if(salesRep.equals(salesRepsName))
    		{
    			System.out.println("AR dash sales Rep is " + salesRep);
    	    	
    	    	System.out.println("sales overview sales Rep is " + salesRepsName);
    	    	
    	    	dash.ARsalesReps().get(i).click();
    	    	
    	    	
    	    	Thread.sleep(time1);
    	    	
    	    	String ARdashOrderNumber = dash.ARorderNumber().get(0).getText();
    	    	//String textvalue=driver.findElement(By.xpath("//input[@value='"+orderNumber+"']")).getAttribute("value");

    	    	// System.out.println(textvalue);
    	    	for(int j=0; dash.ARorderNumber().get(j).isDisplayed(); j++)
    	    	{
    	    		ARdashOrderNumber = dash.ARorderNumber().get(j).getText();
    	    		System.out.println(ARdashOrderNumber);
    	    		
    	    		if(ARdashOrderNumber.equals(orderNumber))
    	    		{
    	    		 
    	    			dash.ARorderNumber().get(j).click();
    	    			
    	    	    	System.out.println("ARdash order number is " + ARdashOrderNumber);
    	    	    	
    	    	    	System.out.println("sales overview order number is " + orderNumber);
    	    	    	
    	    	    	

    	    	    	
    	    	    //assert order number matches
    	    	    	
    	    	    	assert(ARdashOrderNumber.equals(orderNumber));
    	    	    	
    	    	    //assert service instructions matches
    	    	    
    	    	    	
    	    		}
    	    	}
    	   
    	    	
    	    	
    	    	break;
    	    	
    		}
    	}
    	
    
    	
    	
    	
    	
    //locate the order
    	



    	
    
    }
    
    
    @Then("^i should be able to verify that the order from marketplace showed up on the invoice page and in admin AR dashboard$")
    public void i_should_be_able_to_verify_that_the_order_from_marketplace_showed_up_on_the_invoice_page_and_in_admin_AR_dashboard() throws Throwable {

    
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
       
         
         
         
    
    
 //get order number in order overview
    	
    	String orderNumber = sales.orderOverviewOrderNumber().getText();
    	
    	
    //get service instructions in order overview
    	String orderInstructions = sales.orderOverviewServiceInstructions().getText();
    	
        System.out.println(orderNumber);
    	
    	System.out.println(orderInstructions);
    	
    	
    	
    
    //navigate to dashboard page
    	waitHelper.WaitForElement(sales.pageTitle(), 10);

    	waitHelper.WaitForElement(dash.dashboardLink(), 10);

    	dash.dashboardLink().click();
    	waitHelper.WaitForElement(sales.pageTitle(), 10);
    	
    //enter date of order
    	
    	
    	
    	
    	
    	
    //locate the order
    	
    	Select selectAll = new Select(dash.selectNumberOfOrdersToDisplay());
    	
    	selectAll.selectByVisibleText("All");
    	
    	waitHelper.WaitForElement(dash.orderNumber().get(1), 10);
    	String dashOrderNumber = dash.orderNumber().get(1).getText();
    	
    	for(int i=1; !dashOrderNumber.equals(orderNumber); i++) 
    	{
    		dashOrderNumber = dash.orderNumber().get(i).getText();
        	System.out.println("order numbers " + dashOrderNumber);

    	}
    	
    	System.out.println("dash order number is " + dashOrderNumber);
    	
    	System.out.println("sales overview order number is " + orderNumber);
    	
    	

    	
    //assert order number matches
    	
    	assert(dashOrderNumber.equals(orderNumber));
    	
    //assert service instructions matches
    
    }

    
    
    
}
