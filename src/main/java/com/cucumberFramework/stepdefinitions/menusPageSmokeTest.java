package com.cucumberFramework.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.HomePage;
import com.cucumberFramework.pageObjects.chooseMenuPage;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class menusPageSmokeTest extends TestBase{

	HomePage homepage = new HomePage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
    chooseMenuPage menu = new chooseMenuPage(driver);
    
    Actions mouse = new Actions(driver);
    
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    
	int time = 2000;
	
	@Then("^i should be able to navigate to the choose menus page$")
    public void i_should_be_able_to_navigate_to_the_choose_menus_page() throws Throwable {
	
		    
		    
		    
		String menupagetitle = menu.menuPageTitle().getText();
		System.out.println(menupagetitle);
		//assert(menupagetitle.equalsIgnoreCase("Choose a menu"));
    }

    @And("^i should be able to filter menus by cuisine$")
    public void i_should_be_able_to_filter_menus_by_cuisine() throws Throwable {
    	
    	menu.searchBox().sendKeys("indian");
    	Thread.sleep(time);
        
    }

    @And("^i should be able to filter menus by meal type$")
    public void i_should_be_able_to_filter_menus_by_meal_type() throws Throwable {
        menu.clearFilters().click();
    	Thread.sleep(time);

        menu.searchBox().sendKeys("breakfast");
    	Thread.sleep(time);

    }

    @And("^i should be able to filter menus by dietary preference$")
    public void i_should_be_able_to_filter_menus_by_dietary_preference() throws Throwable {
    	 menu.clearFilters().click();
     	Thread.sleep(time);

         menu.searchBox().sendKeys("vegan");
     	Thread.sleep(time);

    }

    @And("^i should be able to filter menus by chef$")
    public void i_should_be_able_to_filter_menus_by_chef() throws Throwable {
    	
    	
         
         try {
        	 if(menu.clearFilters().isDisplayed())
         	{
         	   	 menu.clearFilters().click();

         	}
          	
		} catch (Exception e) {

            menu.searchBox().sendKeys("Chef Jest");
			Thread.sleep(time1);

		}
     	

    }

    @And("^i should be able to my prefered date and time$")
    public void i_should_be_able_to_my_prefered_date_and_time() throws Throwable {
    	
    	

    	Thread.sleep(time1);
 menu.date().click();
	Thread.sleep(time1);
  menu.nextMonth().click();
	Thread.sleep(time1);
        menu.dayTen().click();
        
    	Thread.sleep(time1);
        menu.zipCode().click();

    	Thread.sleep(time1);
        mouse.doubleClick(menu.zipCode()).perform();
    	Thread.sleep(time1);
        menu.zipCode().sendKeys("20001");

    	Thread.sleep(time1);
        menu.howMany().click();
    	Thread.sleep(time1);
        menu.howMany().sendKeys("30");

    	Thread.sleep(time1);
        menu.setUpTime().click();

    	Thread.sleep(time1);
        menu.setUpHoursUp().click();

    	Thread.sleep(time);
  menu.setUpMinutesUp().click();

	Thread.sleep(time1);
        menu.setUpAmPm().click();
    	Thread.sleep(time1);
        menu.setUpAmPm().click();

    }

    @And("^i should be able to use the left panel to filter the menus$")
    public void i_should_be_able_to_use_the_left_panel_to_filter_the_menus() throws Throwable {

    	
    	
    	Thread.sleep(time1);
    	menu.eventDetails().click();
    	Thread.sleep(time1);
    	
    	
    	menu.categories().click();
    	menu.mostOrdered().click();
    	Thread.sleep(time1);
    	menu.showAllButton().click();
    	Thread.sleep(time1);

    	menu.topPicks().click();
    	Thread.sleep(time1);
    	menu.showAllButton().click();
    	Thread.sleep(time1);

    	
    	
        menu.cuisineType().click();
    	Thread.sleep(time1);
    	menu.americanCuisine().click();
    	Thread.sleep(time1);

   	
   	
   	
    	menu.clearFilters().click();
   		Thread.sleep(time1);

      
  	
  	
        
        menu.mealTypes().click();
    	Thread.sleep(time1);
        menu.breakFastCheckBox().click();
    	Thread.sleep(time1);
    	menu.clearFilters().click();
    	Thread.sleep(time1);
        menu.mealTypes().click();
    	Thread.sleep(time1);

        menu.happyHourCheckBox().click();
    	Thread.sleep(time1);
    	menu.clearFilters().click();
    	
        
    	Thread.sleep(time1);
        menu.chefs().click();
    	Thread.sleep(time1);
        menu.chefBeverlyCheckBox().click();
    	Thread.sleep(time1);  	
    	menu.clearFilters().click();
    	jse.executeScript("window.scrollBy(0,50)", "");
        menu.chefs().click();

    	Thread.sleep(time1);
        menu.chefGuruCheckBox().click();
    	Thread.sleep(time1);
    	menu.clearFilters().click();
    	Thread.sleep(time1);
    	jse.executeScript("window.scrollBy(0,50)", "");

        menu.chefs().click();
    	Thread.sleep(time1);

        menu.chefJestCheckBox().click();
    	Thread.sleep(time1);
    	menu.clearFilters().click();        
        
    	Thread.sleep(time1);
        menu.price().click();
    	Thread.sleep(time1);
        menu.priceLowToHigh().click();
    	Thread.sleep(time1);
        menu.priceHighToLow().click();
    	Thread.sleep(time1);
    	menu.below6().click();
    	Thread.sleep(time1);
    	menu.above6().click();

        menu.closeSortingTab().click();
        
        
    	Thread.sleep(time1);
        menu.Rating().click();
    	Thread.sleep(time1);
    menu.fiveStars().click();
    	Thread.sleep(time1);
    	menu.clearFilters().click();
    	Thread.sleep(time1);
        menu.Rating().click();

    	jse.executeScript("window.scrollBy(0,50)", "");
    	Thread.sleep(time1);

   menu.fourStars().click();
    	Thread.sleep(time1);
    	menu.clearFilters().click();
    	Thread.sleep(time1);
        menu.Rating().click();

    	jse.executeScript("window.scrollBy(0,50)", "");
    	Thread.sleep(time1);

    menu.threeStars().click();
    	Thread.sleep(time1);
    	menu.clearFilters().click();
    	Thread.sleep(time1);
        menu.Rating().click();

    	jse.executeScript("window.scrollBy(0,50)", "");
    	Thread.sleep(time1);

   menu.twoStars().click();
    	Thread.sleep(time1);
    	menu.clearFilters().click();
    	Thread.sleep(time1);
        menu.Rating().click();

    	jse.executeScript("window.scrollBy(0,50)", "");
    	Thread.sleep(time1);

   menu.oneStar().click();
    	Thread.sleep(time1);
    	menu.clearFilters().click();
    	Thread.sleep(time1);
        menu.Rating().click();

    	jse.executeScript("window.scrollBy(0,50)", "");
        menu.ratingsLtoH().click();

    	
    	Thread.sleep(time1);

    	menu.dietaryPref().click();
    	Thread.sleep(time1);
        jse.executeScript("window.scrollBy(0,150)", "");
    	Thread.sleep(time1);

        menu.vegan().click();
        Thread.sleep(time1);
        
    	menu.clearFilters().click();
        Thread.sleep(time1);
        
    	jse.executeScript("window.scrollBy(0,150)", "");
     menu.vegetarian().click();
        Thread.sleep(time1);
        
    	menu.clearFilters().click();
        Thread.sleep(time1);
        
        
        
        
    }



@Then("^i should be to see the chefs bio$")
public void i_should_be_to_see_the_chefs_bio() throws Throwable {
	Thread.sleep(time1);
   mouse.moveToElement(menu.chefPicture()).perform();
    }

    @Then("^i should be able to see the menus details$")
    public void i_should_be_able_to_see_the_menus_details() throws Throwable {
    	Thread.sleep(time1);
   mouse.moveToElement(menu.eventDetails()).perform();
        mouse.moveToElement(menu.menuCard()).perform();
    }

    @And("^i should be able to select my prefered menu$")
    public void i_should_be_able_to_select_my_prefered_menu() throws Throwable {
    	
    	Thread.sleep(time2);
    	System.out.println(menu.chefName().getText());
    	assert(menu.chefName().getText().equals("Chef Jest"));
        menu.chefPicture().click();
    }

    @And("^i should be able to go back to the menus page if i want to choose a different menu$")
    public void i_should_be_able_to_go_back_to_the_menus_page_if_i_want_to_choose_a_different_menu() throws Throwable {
    	Thread.sleep(time);
   menu.cuztomizeMenuBackButton().click();
    }
}
