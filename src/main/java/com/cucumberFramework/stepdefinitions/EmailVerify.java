package com.cucumberFramework.stepdefinitions;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.AdminClientsPage;
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

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmailVerify extends TestBase{

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
    
    
    String order;


    
    
    Actions mouse = new Actions(driver);
    
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    
    @Given("^i navigate to the client test email \"([^\"]*)\"$")
    public void i_navigate_to_the_client_test_email_something(String strArg1) throws Throwable {
       driver.navigate().to(strArg1);
    }

    @When("^i login to the test email account \"([^\"]*)\" \"([^\"]*)\"$")
    public void i_login_to_the_test_email_account_something_something(String strArg1, String strArg2) throws Throwable {
        email.username().sendKeys(strArg1);
        email.password().sendKeys(strArg2);
        email.loginButton().click();
    }

    @Then("^i should verify that it's the client survey email \"([^\"]*)\"$")
    public void i_should_verify_that_its_the_client_survey_email_something(String strArg1) throws Throwable {
      	waitHelper.WaitForElement(email.emailText(), 10);
    	
  	  String text = email.emailText().getText();
        
        System.out.println(text);
  	
  if(text.contains(strArg1))
  {
  		

  	   
     
       assert(text.contains(strArg1));
       
	} else
	{
		
		driver.navigate().refresh();
		waitHelper.WaitForElement(email.inbox(), 10);
		Thread.sleep(time1);

		email.firstEmail().click();

		Thread.sleep(time1);

		waitHelper.WaitForElement(email.emailText(), 10);
		 text = email.emailText().getText();

		System.out.println(text);
  
		if(text.contains(strArg1))
		{
		    		
		  
		    	   
			
			assert(text.contains(strArg1));
		         
		} else
		{
			driver.navigate().refresh();
			waitHelper.WaitForElement(email.inbox(), 10);
			
			Thread.sleep(time);
			
			email.firstEmail().click();
 
			Thread.sleep(time);

			waitHelper.WaitForElement(email.emailText(), 10);
			 text = email.emailText().getText();
			System.out.println(text);
		
			
			if(text.contains(strArg1)) {
				
			assert(text.contains(strArg1));

			} else {
				email.firstEmail().click();
				 
				Thread.sleep(time);

				waitHelper.WaitForElement(email.emailText(), 10);
				 text = email.emailText().getText();
				System.out.println(text);
				assert(text.contains(strArg1));
				
			}
		      
		      
			}
    
    
	}
        
        
    }

    
    
    
    @Then("^i should verify that it's the client receipt email \"([^\"]*)\"$")
    public void i_should_verify_that_its_the_client_receipt_email_something(String strArg1) throws Throwable {
      	waitHelper.WaitForElement(email.emailText(), 10);
    	
  	  String text = email.emailText().getText();
        
        System.out.println(text);
  	
  if(text.contains(strArg1))
  {
  		

  	   
     
       assert(text.contains(strArg1));
       
	} else
	{
		
		driver.navigate().refresh();
		waitHelper.WaitForElement(email.inbox(), 10);
		  
		email.firstEmail().click();
		
		waitHelper.WaitForElement(email.emailText(), 10);

		 text = email.emailText().getText();

		System.out.println(text);
  
		if(text.contains(strArg1))
		{
		    		
		  
		    	   
			
			assert(text.contains(strArg1));
		         
		} else
		{
			driver.navigate().refresh();
			waitHelper.WaitForElement(email.inbox(), 10);
			
			email.firstEmail().click();
			
			waitHelper.WaitForElement(email.emailText(), 10);

			 text = email.emailText().getText();

			System.out.println(text);
			assert(text.contains(strArg1));
		      
		      
			}
    
    
	}
        
        
    }

    
    
    
    
    
    @Then("^i should verify that it's the chef order details \"([^\"]*)\"$")
    public void i_should_verify_that_its_the_chef_order_details_something(String strArg1) throws Throwable {
      	waitHelper.WaitForElement(email.emailText(), 10);
    	
  	  String text = email.emailBody().getText();
        
        System.out.println(text);
  	
  if(text.contains(strArg1))
  {
  		

  	   
     
       assert(text.contains(strArg1));
       
	} else
	{
		
		driver.navigate().refresh();
		waitHelper.WaitForElement(email.inbox(), 10);
		  
		email.firstEmail().click();
		waitHelper.WaitForElement(email.emailBody(), 10);
		 text = email.emailBody().getText();

		System.out.println(text);
  
		if(text.contains(strArg1))
		{
		    		
		  
		    	   
			
			assert(text.contains(strArg1));
		         
		} else
		{
			driver.navigate().refresh();
			waitHelper.WaitForElement(email.inbox(), 10);
			
			email.firstEmail().click();
		    
			
			
			waitHelper.WaitForElement(email.emailBody(), 10);
			 text = email.emailBody().getText();

			System.out.println(text);
			assert(text.contains(strArg1));
		      
		      
			}
	}
    
    
	}
    
    
    @And("^i click on the first email$")
    public void i_click_on_the_first_email() throws Throwable {
    
        
        try {
            waitHelper.WaitForElement(email.inbox(), 10);
            
            email.firstEmail().click();
            
            if(email.firstEmail().isDisplayed())
            {
            	System.out.println("Email body is displayed");
            }
		} catch (Exception e) {
			
			driver.navigate().refresh();
		    waitHelper.WaitForElement(email.inbox(), 10);
	        
	        email.firstEmail().click();
	        
	        if(email.firstEmail().isDisplayed())
	        {
	        	System.out.println("Email body is displayed");
	        }
		}
        
        
        
    }

    @Then("^i should verify that it's the final invoice email \"([^\"]*)\"$")
    public void i_should_verify_that_its_the_final_invoice_email_something(String strArg1) throws Throwable {
       
      	waitHelper.WaitForElement(email.emailText(), 10);
    	
  	  String text = email.emailText().getText();
        
        System.out.println(text);
  	
  if(text.contains(strArg1))
  {
  		

  	   
     
       assert(text.contains(strArg1));
       
	} else
	{
		
		driver.navigate().refresh();
		waitHelper.WaitForElement(email.inbox(), 10);
		  
		email.firstEmail().click();
  
		
		waitHelper.WaitForElement(email.emailText(), 10);
		 text = email.emailText().getText();

		System.out.println(text);
  
		if(text.contains(strArg1))
		{
		    		
		  
		    	   
			
			assert(text.contains(strArg1));
		         
		} else
		{
			driver.navigate().refresh();
			waitHelper.WaitForElement(email.inbox(), 10);
			
			email.firstEmail().click();
		      
			
			waitHelper.WaitForElement(email.emailText(), 10);
			 text = email.emailText().getText();

			System.out.println(text);
			assert(text.contains(strArg1));
		      
		      
			}
    
    
	}
    	
    }

    
    @Then("^i should verify that it's the day of menu email \"([^\"]*)\"$")
    public void i_should_verify_that_its_the_day_of_menu_email_something(String strArg1) throws Throwable {
        
    	waitHelper.WaitForElement(email.emailText(), 10);
    	
    	  String text = email.emailText().getText();
          
          System.out.println(text);
    	
    if(text.contains(strArg1))
    {
    		
  
    	   
       
         assert(text.contains(strArg1));
         
	} else
	{
		
		driver.navigate().refresh();
		waitHelper.WaitForElement(email.inbox(), 10);
		  
		email.firstEmail().click();
		waitHelper.WaitForElement(email.emailText(), 10);
		 text = email.emailText().getText();

		System.out.println(text);
    
		if(text.contains(strArg1))
		{
		    		
		  
		    	   
			
			assert(text.contains(strArg1));
		         
		} else
		{
			driver.navigate().refresh();
			waitHelper.WaitForElement(email.inbox(), 10);
			
			email.firstEmail().click();
		      
			
			waitHelper.WaitForElement(email.emailText(), 10);
			 text = email.emailText().getText();

			System.out.println(text);
			assert(text.contains(strArg1));
		      
		      
			}
      
      
	}
    	
	
        
	
        
    }
    
    
    
    @Then("^i should verify that it's the invoice email \"([^\"]*)\"$")
    public void i_should_verify_that_its_the_invoice_email_something(String strArg1) throws Throwable {
    	
      	waitHelper.WaitForElement(email.emailText(), 10);
    	
  	  String text = email.emailText().getText();
        
        System.out.println(text);
  	
  if(text.contains(strArg1))
  {
  		

  	   
     
       assert(text.contains(strArg1));
       
	} else
	{
		
		driver.navigate().refresh();
		waitHelper.WaitForElement(email.inbox(), 10);
		  
		email.firstEmail().click();
		
		waitHelper.WaitForElement(email.emailText(), 10);
		 text = email.emailText().getText();

		System.out.println(text);
  
		if(text.contains(strArg1))
		{
		    		
		  
		    	   
			
			assert(text.contains(strArg1));
		         
		} else
		{
			driver.navigate().refresh();
			waitHelper.WaitForElement(email.inbox(), 10);
			
			email.firstEmail().click();

			waitHelper.WaitForElement(email.emailText(), 10);
			 text = email.emailText().getText();

			System.out.println(text);
			assert(text.contains(strArg1));
		      
		      
			}
    
    
	}
        
    }
    
    
    
    
    @Then("^i should delete the chef order email$")
    public void i_should_delete_the_chef_order_email() throws Throwable {
    	waitHelper.WaitForElement(email.emailDelete(), 10);
    	

		email.emailDelete().click();
		

    
    
    }

    @And("^i click on the first email check box$")
    public void i_click_on_the_first_email_check_box() throws Throwable {

		
		try {
	    	waitHelper.WaitForElement(email.emailCheckbox(), 10);
			email.emailCheckbox().click();  

		} catch (Exception e) {
	    	waitHelper.WaitForElement(email.emailCheckbox(), 10);
			email.emailCheckbox().click();  
		}
		
    
    }
    
    
    
    @Given("^i click on the survey email body$")
    public void i_click_on_the_survey_email_body() throws Throwable {
	 	   //jse.executeScript("arguments[0].scrollIntoView(true);",email.surveyEmailBody());

	 	 email.loadMessageBody().click();
	 	 
	 	 waitHelper.WaitForElement(email.surveyEmailBody(), 10);
    	//mouse.moveToElement(email.surveyEmailBody()).click().perform();
	 	 
	 	 email.surveyEmailBody().click();
	 	 if(driver.findElement(By.cssSelector("button.pm_button.primary.modal-footer-button")).isDisplayed())
	 		 
	 	 {
	 		 
	 		driver.findElement(By.cssSelector("button.pm_button.primary.modal-footer-button")).click();
	 	 }
	 	  
    }

    @Then("^i should successfully summit my survey$")
    public void i_should_successfully_summit_my_survey() throws Throwable {
    	
    	waitHelper.WaitForElement(email.surveyCompleted(), 20);
    	System.out.println(email.surveyCompleted().getText());
        assert(email.surveyCompleted().getText().equals("Thank you for completing the HUNGRY survey!"));
    }

    @And("^i navigate to the submit survey page$")
    public void i_navigate_to_the_submit_survey_page() throws Throwable {
    	
    	ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
    }

    @And("^i fill survey and click the submit button$")
    public void i_fill_survey_and_click_the_submit_button() throws Throwable {
        email.star().click();
        email.chefReviewBox().click();
        email.chefReviewBox().sendKeys("This is a test");
        email.okCaptainRating().click();
        email.commentsForCaptain().sendKeys("This is a test");
        email.questionBox().sendKeys("This is a test");
        email.feedbackBox().sendKeys("This is a test");
        email.submitSurveyButton().click();
    }
    
}
    
    

  
