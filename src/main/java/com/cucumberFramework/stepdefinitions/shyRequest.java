package com.cucumberFramework.stepdefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.HomePage;
import com.cucumberFramework.pageObjects.adminLoginPage;
import com.cucumberFramework.pageObjects.checkoutPage;
import com.cucumberFramework.pageObjects.chooseMenuPage;
import com.cucumberFramework.pageObjects.customizeMenuPage;
import com.cucumberFramework.pageObjects.loginPage;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class shyRequest extends TestBase{

	HomePage homepage = new HomePage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
    chooseMenuPage menu = new chooseMenuPage(driver);
    customizeMenuPage cus = new customizeMenuPage(driver);
    checkoutPage checkout = new checkoutPage(driver);
    loginPage login=new loginPage(driver);
    adminLoginPage admin = new adminLoginPage(driver);
    
    String order;


    
    
    Actions mouse = new Actions(driver);
    
    JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	


    @When("^i log in$")
    public void i_log_in() throws Throwable {

    	homepage.loginSignUpButton().click();
    }

    @Given("^i navigate to admin login$")
    public void i_navigate_to_admin_login() throws Throwable {


		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to(adminStaging);

    	
    }
    
    @When("^i login with \"([^\"]*)\"$")
    public void i_login_with_something(String strArg1) throws Throwable {
       admin.email().sendKeys(strArg1);
    }

    @Then("^i should successfully login to the application$")
    public void i_should_successfully_login_to_the_application() throws Throwable {
        Select select = new Select(driver.findElement(By.cssSelector(".form-control")));
        select.selectByVisibleText("Rosslyn, VA");
        admin.loginButton().click();
        
        
        
    }

    @And("^my password as \"([^\"]*)\"$")
    public void my_password_as_something(String strArg1) throws Throwable {
        admin.password().sendKeys(strArg1);
    }
    

    @Then("^i should see that placing and adding orders work correctly$")
    public void i_should_see_that_placing_and_adding_orders_work_correctly() throws Throwable {
        driver.findElement(By.cssSelector("#showOrderOverviewDiv > div.alert-banner-container > div:nth-child(1) > div.action-panel.proposal-panel.panel.panel-warning > div.panel-collapse.collapse.in > div > div:nth-child(1) > a")).click();
        Thread.sleep(2000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.close();
        driver.switchTo().window(tabs2.get(0));
    }

    @And("^i click on sales$")
    public void i_click_on_sales() throws Throwable {

        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#app > div > div:nth-child(2) > nav > ul.navbar-ul > li:nth-child(3) > a")).click();

    }

    @And("^i click on orders$")
    public void i_click_on_orders() throws Throwable {
    	
    	
    	 driver.findElement(By.cssSelector("#app > div > div:nth-child(2) > div > div > div > div > div.page-columns > div:nth-child(1) > div > div.search-field > div > input")).sendKeys("Jest");
	        Thread.sleep(time1);
	        
	        
    }

    @And("^i search and click on the order number$")
    public void i_search_and_click_on_the_order_number() throws Throwable {
    	if (driver.findElement(By.cssSelector("#app > div > div:nth-child(2) > div > div > div > div > div.page-columns > div:nth-child(1) > div > div.search-field > div > div > div:nth-child(1)")).isDisplayed())
    	{
        	driver.findElement(By.cssSelector("#app > div > div:nth-child(2) > div > div > div > div > div.page-columns > div:nth-child(1) > div > div.search-field > div > div > div:nth-child(1)")).click();
    	} else {
    		
    		driver.navigate().refresh();
    		Thread.sleep(time1);
       	    driver.findElement(By.cssSelector("#app > div > div:nth-child(2) > div > div > div > div > div.page-columns > div:nth-child(1) > div > div.search-field > div > input")).sendKeys("jest");

       	    Thread.sleep(time1);
    		
    		if (driver.findElement(By.cssSelector("#app > div > div:nth-child(2) > div > div > div > div > div.page-columns > div:nth-child(1) > div > div.search-field > div > div > div:nth-child(1)")).isDisplayed())
    		{
            	driver.findElement(By.cssSelector("#app > div > div:nth-child(2) > div > div > div > div > div.page-columns > div:nth-child(1) > div > div.search-field > div > div > div:nth-child(1)")).click();

    		}

    	}
        Thread.sleep(time1);
    }

    @And("^i click click and send invoice email$")
    public void i_click_click_and_send_invoice_email() throws Throwable {
    	
    	
	 
    	try {
			driver.findElement(By.cssSelector("#showOrderOverviewDiv > div.alert-banner-container > div:nth-child(1) > div.action-panel.proposal-panel.panel.panel-warning > div.panel-collapse.collapse.in > div > div:nth-child(2) > center > span:nth-child(2) > button")).click();
		} catch (Exception e) {
		       driver.findElement(By.cssSelector("#showOrderOverviewDiv > div.alert-banner-container > div:nth-child(1) > div.action-panel.proposal-panel.panel.panel-success > div.panel-collapse.collapse.in > div > div:nth-child(2) > center > span:nth-child(2) > button")).click();

		}
	      Thread.sleep(time1);
	      driver.findElement(By.cssSelector(".modal-footer > button:nth-child(1)")).click();
	      Thread.sleep(time1);
	      
	      driver.findElement(By.cssSelector(".checkbox > label:nth-child(1) > input:nth-child(1)")).click();
	      Thread.sleep(time1);
	      driver.findElement(By.cssSelector(".in > div:nth-child(1) > div:nth-child(2) > center:nth-child(1) > span:nth-child(2) > button:nth-child(1)")).click();
  
	      driver.findElement(By.cssSelector(".modal-footer > button:nth-child(1)")).click();
	      Thread.sleep(time);
	      driver.findElement(By.cssSelector(".proposal-panel > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > p:nth-child(1)")).click();
	      driver.findElement(By.cssSelector(".services-panel > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > p:nth-child(1)")).click();
	      Thread.sleep(time);
	      driver.findElement(By.cssSelector("div.dropdown:nth-child(2) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).click();
	      driver.findElement(By.cssSelector("div.dropdown:nth-child(2) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).sendKeys("Tahiru Nasuru");
	      Thread.sleep(time);
	      driver.findElement(By.cssSelector("div.dropdown:nth-child(2) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(3) > li:nth-child(1)")).click();

	      //save
	      driver.findElement(By.cssSelector(".button-primary")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.cssSelector(".form-field-container > div:nth-child(6) > button:nth-child(1)")).click();
	      Thread.sleep(time);
	      driver.findElement(By.cssSelector(".modal-footer > button:nth-child(1)")).click();
	      Thread.sleep(time);
	      driver.findElement(By.cssSelector(".form-field-container > div:nth-child(6) > button:nth-child(2)")).click();
	      Thread.sleep(time);
	      driver.findElement(By.cssSelector(".modal-footer > button:nth-child(1)")).click();
	      Thread.sleep(4000);
	      driver.findElement(By.cssSelector(".services-panel > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > p:nth-child(1)")).click();
	      Thread.sleep(time);
	      driver.findElement(By.cssSelector(".survey-panel > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > p:nth-child(1)")).click();
	      Thread.sleep(time);
	      driver.findElement(By.cssSelector(".in > div:nth-child(1) > div:nth-child(1) > button:nth-child(2)")).click();
	      Thread.sleep(time);
	      driver.findElement(By.cssSelector(".modal-footer > button:nth-child(1)")).click();
	      Thread.sleep(time);

    }

    @And("^i click and verify invoice link$")
    public void i_click_and_verify_invoice_link() throws Throwable {
    	try {
            driver.findElement(By.cssSelector("#showOrderOverviewDiv > div.alert-banner-container > div:nth-child(1) > div.action-panel.proposal-panel.panel.panel-success > div.panel-heading > div > a")).click();

			
	
		} catch (Exception e) {
			driver.findElement(By.cssSelector("#showOrderOverviewDiv > div.alert-banner-container > div:nth-child(1) > div.action-panel.proposal-panel.panel.panel-warning > div.panel-heading > div > a")).click();
		}

        Thread.sleep(time1);


        try {
            driver.findElement(By.cssSelector("#showOrderOverviewDiv > div.alert-banner-container > div:nth-child(1) > div.action-panel.proposal-panel.panel.panel-success > div.panel-collapse.collapse.in > div > div:nth-child(1) > a.download-pdf")).click();

		} catch (Exception e) {

			driver.findElement(By.cssSelector("#showOrderOverviewDiv > div.alert-banner-container > div:nth-child(1) > div.action-panel.proposal-panel.panel.panel-warning > div.panel-collapse.collapse.in > div > div:nth-child(1) > a.download-pdf")).click();

		}
         Thread.sleep(time);
         ArrayList<String> pdftab = new ArrayList<String> (driver.getWindowHandles());
         driver.switchTo().window(pdftab.get(1));
        Thread.sleep(time);
         
         driver.close();
         driver.switchTo().window(pdftab.get(0));
         
         try {
			driver.findElement(By.cssSelector("#showOrderOverviewDiv > div.alert-banner-container > div:nth-child(1) > div.action-panel.proposal-panel.panel.panel-warning > div.panel-collapse.collapse.in > div > div:nth-child(1) > a.link")).click();
		} catch (Exception e) {
	         driver.findElement(By.cssSelector("#showOrderOverviewDiv > div.alert-banner-container > div:nth-child(1) > div.action-panel.proposal-panel.panel.panel-success > div.panel-collapse.collapse.in > div > div:nth-child(1) > a.link")).click();

		}
         Thread.sleep(time);
         ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
         driver.switchTo().window(tabs2.get(1));
        assert(driver.findElement(By.cssSelector("#app > div > div.invoice-container > div.invoice-container__inner > div.invoice-container__content > div > div:nth-child(1) > div:nth-child(1) > span")).getText().startsWith("WAS"));
        assert(driver.findElement(By.cssSelector("#app > div > div.invoice-container > div.invoice-container__inner > div.invoice-container__content > div > div:nth-child(1) > div:nth-child(1) > label")).getText().startsWith("Order"));
        Thread.sleep(time);
         
         driver.close();
         driver.switchTo().window(tabs2.get(0));
         
         
    }


    @And("^i click and send captain notice$")
    public void i_click_and_send_captain_notice() throws Throwable {
/*        if (driver.findElement(By.cssSelector("#showOrderOverviewDiv > div.alert-banner-container > div:nth-child(2) > div.action-panel.services-panel.panel.panel-warning > div.panel-heading > div > a > p")).isDisplayed())
	       {
	    	   driver.findElement(By.cssSelector("#showOrderOverviewDiv > div.alert-banner-container > div:nth-child(2) > div.action-panel.services-panel.panel.panel-warning > div.panel-heading > div > a > p")).click();
	       }else {
	    	   driver.findElement(By.cssSelector("#showOrderOverviewDiv > div.alert-banner-container > div:nth-child(2) > div.action-panel.services-panel.panel.panel-success > div.panel-heading > div > a > p")).click();
	       }
        
        if (driver.findElement(By.xpath("//*[@id=\"showOrderOverviewDiv\"]/div[1]/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div/input")).isSelected())
	       {
	    	   driver.findElement(By.xpath("//*[@id=\"showOrderOverviewDiv\"]/div[1]/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div/input"));
	       }
	       else {
	    	   driver.findElement(By.xpath("//*[@id=\"showOrderOverviewDiv\"]/div[1]/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div/input")).click();
	       }*/
        
	       
        
        
    }

    

    @And("^i get edit order and compare old total and new total$")
    public void i_get_edit_order_and_compare_old_total_and_new_total() throws Throwable {
    	 JavascriptExecutor jse = (JavascriptExecutor)driver;
	       jse.executeScript("window.scrollBy(0,2000)", "");
	  
	       Thread.sleep(time1);
	       
	       String total = driver.findElement(By.cssSelector("div.list-group:nth-child(6) > span:nth-child(6) > span:nth-child(2)")).getAttribute("textContent");

	       Thread.sleep(time);
	       
	       driver.findElement(By.cssSelector(".page > center:nth-child(1) > button:nth-child(1)")).click();
         Thread.sleep(time1);
         
         driver.findElement(By.cssSelector("body > div:nth-child(5) > div > div.fade.in.modal > div > div > div.modal-body > div:nth-child(3) > div > div:nth-child(1) > div > div:nth-child(1) > div > div > input")).click();
	        Thread.sleep(time1);
	          
	   	    try {
	   	        driver.findElement(By.cssSelector(".open > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > span:nth-child(32)")).click();

			} catch (Exception e) {

				driver.findElement(By.cssSelector(".open > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > span:nth-child(33)")).click();
			}
		
	        Thread.sleep(time1);

	        WebElement element = driver.findElement(By.cssSelector(".total > span:nth-child(1)"));

			   ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+element.getLocation().y+")");
	        	
	        	
	        Thread.sleep(time1);
		    
	      String editTotal=  driver.findElement(By.cssSelector(".total > span:nth-child(1)")).getAttribute("textContent");


	        
	      Thread.sleep(time);
	
	      
	      driver.findElement(By.cssSelector("button.button-primary:nth-child(1)")).click();
	      Thread.sleep(time1);
	      String afterEditTotal = driver.findElement(By.cssSelector("div.list-group:nth-child(6) > span:nth-child(6) > span:nth-child(2)")).getAttribute("textContent");

	      Thread.sleep(time);
	      total.toString();
	      editTotal.toString();
	      afterEditTotal.toString();
	      System.out.println("afterEditTotal " + afterEditTotal);
	       System.out.println("edittotal " + editTotal);
	       System.out.println("total " + total);
		    assert(total.equals(editTotal));
		      assert(total.equals(afterEditTotal));
		      

		     
    }
    
    
    
    public String orderNumber(String orderNumber)
    {
    	return orderNumber = checkout.confirmationPageOrderNumber().getText();
	       
	      
    }

}
