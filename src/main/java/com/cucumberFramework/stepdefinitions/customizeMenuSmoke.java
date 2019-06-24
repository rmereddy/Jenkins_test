package com.cucumberFramework.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.HomePage;
import com.cucumberFramework.pageObjects.checkoutPage;
import com.cucumberFramework.pageObjects.chooseMenuPage;
import com.cucumberFramework.pageObjects.customizeMenuPage;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class customizeMenuSmoke extends TestBase{

	HomePage homepage = new HomePage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
    chooseMenuPage menu = new chooseMenuPage(driver);
    customizeMenuPage cus = new customizeMenuPage(driver);
    checkoutPage checkout = new checkoutPage(driver);

    
    Actions mouse = new Actions(driver);
    
    JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	

	
	
    @Given("^i am on the customize menu page$")
    public void i_am_on_the_customize_menu_page() throws Throwable {
        cus.chefName().isDisplayed();
        Thread.sleep(time);
    }

    

	@When("^i enter my zip code$")
    public void i_enter_my_zip_code() throws Throwable {

    	cus.zipCode().click();
        cus.zipCode().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        cus.zipCode().sendKeys("20001");
        Thread.sleep(time);

    }

    @Then("^i should be navigated to the checkout page$")
    public void i_should_be_navigated_to_the_checkout_page() throws Throwable {
    	  String actual = checkout.checkoutHeader().getText();
	        
	         
	         assert(actual.startsWith("CHECKOUT"));

    }
    
    @Then("^i should not be able to navigate to the checkout page$")
    public void i_should_not_be_able_to_navigate_to_the_checkout_page() throws Throwable {
    	  String actual = cus.customizeMenuHeader().getText();
	        
	         
	         assert(actual.startsWith("CUSTOMIZE"));
    }

    @And("^the continue button should ask me to adjust quantities$")
    public void the_continue_button_should_ask_me_to_adjust_quantities() throws Throwable {
        jse.executeScript("window.scrollBy(0,250)", "");

        String actual = cus.customizeMenuHeader().getText();
        
        
        assert(actual.startsWith("CUSTOMIZE"));
        
    }


    @And("^i enter my prefered date$")
    public void i_enter_my_prefered_date() throws Throwable {
        cus.date().click();
        Thread.sleep(time1);

        cus.nextMonth().click();
        Thread.sleep(time1);

        cus.nextMonth().click();
        Thread.sleep(time1);

        cus.dayFifteen().click();
        Thread.sleep(time1);

    }

    @And("^i enter my head count$")
    public void i_enter_my_head_count() throws Throwable {
    	cus.howMany().click();
       cus.howMany().sendKeys("10");
       Thread.sleep(time1);
       


    }

    @And("^i i enter my set up time$")
    public void i_i_enter_my_set_up_time() throws Throwable {
        cus.setUpTime().click();
        Thread.sleep(time1);

        cus.setUpHoursUp().click();
        Thread.sleep(time1);

        cus.setUpHoursDown().click();
        Thread.sleep(time1);

        cus.setUpMinutesUp().click();
        Thread.sleep(time1);

        cus.setUpAmPm().click();
        Thread.sleep(time1);

        cus.setUpAmPm().click();
        Thread.sleep(time1);

        
        
        
    }

    @And("^i enter my first entree quantity$")
    public void i_enter_my_first_entree_quantity() throws Throwable {


    	
    	cus.entreeQTY().get(1).click();
    	Thread.sleep(time1);
    	cus.entreeQTY().get(1).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        Thread.sleep(time1);

    	cus.entreeQTY().get(1).sendKeys("8");
          Thread.sleep(time1);

        


        
        
    }

    @And("^i enter my second entree quantity$")
    public void i_enter_my_second_entree_quantity() throws Throwable {
        cus.secondEntreeQTY().click();
        Thread.sleep(time1);
        
        cus.secondEntreeQTY().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        
        cus.secondEntreeQTY().sendKeys("8");
        Thread.sleep(time1);

    }

    @And("^i enter my first sides quantity$")
    public void i_enter_my_first_sides_quantity() throws Throwable {
        cus.sidesQTY().click(); 
        Thread.sleep(time1);

        cus.sidesQTY().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        Thread.sleep(time1);
        cus.sidesQTY().sendKeys("8");
        Thread.sleep(time1);
        
        
        jse.executeScript("window.scrollBy(0,350)", "");

    }

    @And("^i enter my drinks$")
    public void i_enter_my_drinks() throws Throwable {
    	
        
        Thread.sleep(time1);



        cus.drinks().click();
        Thread.sleep(time1);

        cus.drinksOptionOne().click();
        Thread.sleep(time1);
       
 


    }

    @And("^i enter my drinks quantity$")
    public void i_enter_my_drinks_quantity() throws Throwable {
    	 
        //cus.drinksQTY().click();
        
        cus.drinksQTY().sendKeys("1");
        Thread.sleep(time1);
    }

    @And("^i enter my desert$")
    public void i_enter_my_desert() throws Throwable {
      cus.deserts().click();
      Thread.sleep(time1);
      cus.desertsOptionOne().click();
      Thread.sleep(time1);
    }

    @And("^i enter my deserts quantity$")
    public void i_enter_my_deserts_quantity() throws Throwable {
    	  //cus.desertsQTY().click();
          cus.desertsQTY().sendKeys("5");
          Thread.sleep(time1);
    }

    @And("^i enter notes for the chef$")
    public void i_enter_notes_for_the_chef() throws Throwable {
        cus.chefnotes().click();
        cus.chefnotes().sendKeys("testing chef notes");
        Thread.sleep(time1);
        
       
    }

    @And("^i choose my delivery option$")
    public void i_choose_my_delivery_option() throws Throwable {

    
    	
         try {
        	 jse.executeScript("arguments[0].scrollIntoView(true);", cus.tipBox());
		} catch (Exception e) {
			 jse.executeScript("window.scrollBy(0,1000)", "");
	    	  
		}
         Thread.sleep(time1);

    }

    @And("^i enter a promo code$")
    public void i_enter_a_promo_code() throws Throwable {
   
        cus.promoCode().click();
        cus.promoCode().sendKeys("FREEDELIVERY");
        Thread.sleep(time1);
        cus.applyPromo().click();
        Thread.sleep(time1);
    }

    @And("^i enter a tip percentage$")
    public void i_enter_a_tip_percentage() throws Throwable {
    	try {
    		if (cus.tipPercent().isDisplayed())
    			{cus.tipPercent().click();
    			}
		} catch (Exception e) {

			cus.tipBox().sendKeys("20");
	        Thread.sleep(time1);
		} 
        
    }

    @And("^i i click continue$")
    public void i_i_click_continue() throws Throwable {
    	
    	if( cus.continueButton().isDisplayed())
    	{
            cus.continueButton().click();

    	}else if (cus.continueButton2().isDisplayed())
    	{
    		cus.continueButton2().click();
    	}
         else if(cus.continueButton3().isDisplayed()) 
         {
    	              	cus.continueButton3().click();
    	  } else if (cus.continueButton4().isDisplayed())
    	  {
            	cus.continueButton4().click();

    	  }else if (cus.continueButton5().isDisplayed())
    	  {
            	cus.continueButton5().click();

    	  } else if (cus.continueButton6().isDisplayed())
    	  {
            	cus.continueButton6().click();

    	  } else {
    		  
          	cus.continueButton7().click();

    	  }
    	  
    	
                       Thread.sleep(time);
         }

    @And("^i should be able to navigate back to the customize menu page to make changes$")
    public void i_should_be_able_to_navigate_back_to_the_customize_menu_page_to_make_changes() throws Throwable {

    	cus.backButtonCheckoutPage().click();
        Thread.sleep(time);
    }

}
