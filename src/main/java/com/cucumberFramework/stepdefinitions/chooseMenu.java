package com.cucumberFramework.stepdefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.HomePage;
import com.cucumberFramework.pageObjects.chooseMenuPage;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class chooseMenu extends TestBase{

	HomePage homepage = new HomePage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
    chooseMenuPage menu = new chooseMenuPage(driver);
    
    Actions mouse = new Actions(driver);
    
    
    
    
    
	         
	    
@Given("^i navigate to \"([^\"]*)\"$")
public void i_navigate_to_something(String strArg1) throws Throwable {
	
	driver.get(marketPlaceStaging);
	
	 String actual = driver.getTitle();
     
     
     assert(actual.equals("Hungry Marketplace")||actual.equals("HUNGRY Catering"));
     

}

@When("^i click on menus or seeMenus$")
public void i_click_on_menus_or_seemenus() throws Throwable {
	
	//homepage.orderInPA().click();
	
	//mouse.moveToElement(homepage.menusButton()).perform();
    
}

@Then("^i should be navigated to the hungry choose a menu page$")
public void i_should_be_navigated_to_the_hungry_choose_a_menu_page() throws Throwable {
	
	waitHelper.WaitForElement(menu.menuPageTitle(), 10);
	String menupagetitle = menu.menuPageTitle().getText();
	System.out.println(menupagetitle);
	//assert(menupagetitle.toLowerCase().equalsIgnoreCase("choose a menu"));
}

@And("^i click on my location$")
public void i_click_on_my_location() throws Throwable {
	
	waitHelper.WaitForElement(homepage.homepageZipCode(), 10);

//	  homepage.homepageZipCode().click();
//	  homepage.homepageZipCode().sendKeys("20001");
//	  homepage.homepageDateField().click();
//	  
//	  waitHelper.WaitForElement(homepage.selectedDate(), 10);
//	  homepage.selectedDate().click();
//	  homepage.seeMenusButton().click();

	mouse.moveToElement(homepage.menusButton()).perform();
	homepage.menusDC().click();
	
	    
    
}

///////////////////////////////////////////////////////////////////////////////////////////



@When("^i hover my mouse over the chef image$")
public void i_hover_my_mouse_over_the_chef_image() throws Throwable {
	
	mouse.moveToElement(menu.chefPicture()).perform();
   
}

@When("^i hover my mouse over the chef menu image$")
public void i_hover_my_mouse_over_the_chef_menu_image() throws Throwable {
	mouse.moveToElement(menu.menuCardImages()).perform();
}

@When("^i click on the back arrow $")
public void i_click_on_the_back_arrow() throws Throwable {
    menu.cuztomizeMenuBackButton().click();
}

@Then("^i should see that event details are displayed$")
public void i_should_see_that_event_details_are_displayed() throws Throwable {
	
	menu.zipCode().click();
	menu.date().click();
	menu.howMany().click();
	menu.setUpTime().click();
	
}

@Then("^i should count that 56 cuisines are displayed$")
public void i_should_count_that_56_cuisines_are_displayed() throws Throwable {
   int noOfchefs = menu.chefPictures().size();
   Assert.assertTrue(noOfchefs>56);
}

@Then("^by date and time$")
public void by_date_and_time() throws Throwable {
   menu.date().click();
   Thread.sleep(time);
   menu.nextMonth().click();
   Thread.sleep(time);

   menu.dayTen().click();
   Thread.sleep(time);

   
}

@Then("^i should see see that the blue background with chef bio displayed$")
public void i_should_see_see_that_the_blue_background_with_chef_bio_displayed() throws Throwable {
 
	waitHelper.WaitForElement(menu.firstMenuCard(), 10);
	assert( menu.firstMenuCard().isDisplayed());
}

@Then("^i should see a red background appear with menu details$")
public void i_should_see_a_red_background_appear_with_menu_details() throws Throwable {
	waitHelper.WaitForElement(menu.menuEntreeDisplay(), 10);

   assert(menu.menuEntreeDisplay().isDisplayed());
   
}

@Then("^i should navigate back to the hompage$")
public void i_should_navigate_back_to_the_hompage() throws Throwable {
	String actual = driver.getTitle();
    
    
    assert(actual.equals("Hungry Marketplace"));
}

@And("^the local area zip code is displayed$")
public void the_local_area_zip_code_is_displayed() throws Throwable {
    menu.zipCode().click();
}

@And("^a date which is two days ahead is displayed$")
public void a_date_which_is_two_days_ahead_is_displayed() throws Throwable {
    menu.date().click();
    
}

@And("^a time is displayed$")
public void a_time_is_displayed() throws Throwable {
   menu.setUpTime().click();
   Thread.sleep(time1);
   menu.setUpAmPm().click();
}

@And("^by cuisine type$")
public void by_cuisine_type() throws Throwable {
	menu.searchBox().click();
    Thread.sleep(time1);
    menu.searchBox().sendKeys("indian");
    
   
    
    
}

@And("^by meal types$")
public void by_meal_types() throws Throwable {
	menu.searchBox().click();
    Thread.sleep(time1);
    menu.searchBox().sendKeys("lunch");
    
    Thread.sleep(time1);
    
    
}

@And("^by chef name$")
public void by_chef_name() throws Throwable {
	//int chefs = menu.chefPictures().size();
    menu.searchBox().click();
    Thread.sleep(time1);
    menu.searchBox().sendKeys("jest");
    
    int Chefs = menu.chefPictures().size();
    
    Thread.sleep(time);
    
    assert(Chefs == 1);
}

@And("^by prices$")
public void by_prices() throws Throwable {
	
	menu.eventDetails().click();
    menu.price().click();
    Thread.sleep(time1);
    
    menu.priceLowToHigh().click();
}

@And("^by ratings$")
public void by_ratings() throws Throwable {
	
	menu.eventDetails().click();
    menu.Rating().click();
    
    Thread.sleep(time);
    menu.priceHighToLow().click();
}



@Then("^by cuisines$")
public void by_cuisines() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	menu.eventDetails().click();
	menu.cuisineType().click();
	Thread.sleep(time);
	menu.americanCuisine().click();
}

@Then("^by meals$")
public void by_meals() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	menu.eventDetails().click();
	menu.mealTypes().click();
	Thread.sleep(time);
	menu.breakFastCheckBox();
}

@Then("^by chefs$")
public void by_chefs() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	menu.eventDetails().click();
	menu.chefs().click();
	Thread.sleep(time);
	menu.chefJestCheckBox().click();
}

@Then("^by dietary preferences$")
public void by_dietary_preferences() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	menu.eventDetails().click();
	menu.dietaryPref().click();
	Thread.sleep(time);
	menu.vegetarian();
	
}

@And("^by multiple preferences$")
public void by_multiple_preferences() throws Throwable {
	menu.eventDetails().click();
    menu.cuisineType().click();
    Thread.sleep(time);
    menu.americanCuisine().click();
	Thread.sleep(time);

	menu.cuisineType().click();
	   menu.mealTypes().click();
	    Thread.sleep(time);
	    
	    menu.breakFastCheckBox().click();
	    
		   menu.mealTypes().click();

	    Thread.sleep(time);
	    menu.chefs().click();
	    Thread.sleep(time);
	    
	    menu.chefJestCheckBox().click();
	    
	    
	    Thread.sleep(time);
	    
	    
	    menu.chefs().click();

	    menu.price().click();
	    Thread.sleep(time);
	    
	    menu.priceLowToHigh().click();
	    
	    
	    Thread.sleep(time);
	    
	    
	    menu.price().click();

	    menu.Rating().click();
	    
	    Thread.sleep(time);
	    menu.priceHighToLow().click();
	    
	    
	    Thread.sleep(time);
	    
	    
	    menu.Rating().click();

	    menu.dietaryPref().click();
	    Thread.sleep(time);
	    
	    menu.vegan().click();
	    
	    
	    
	    
	    
	    
	    
	    
    
}




}
