package com.cucumberFramework.stepdefinitions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.cucumberFramework.enums.OS;
import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.HomePage;
import com.cucumberFramework.pageObjects.adminChefPage;
import com.cucumberFramework.pageObjects.adminLoginPage;
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

public class chefsPage extends TestBase{

	HomePage homepage = new HomePage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
    chooseMenuPage menu = new chooseMenuPage(driver);
    customizeMenuPage cus = new customizeMenuPage(driver);
    checkoutPage checkout = new checkoutPage(driver);
    loginPage login=new loginPage(driver);
    adminLoginPage admin = new adminLoginPage(driver);
    adminChefPage chef = new adminChefPage(driver);
    
    
    String order;


    
    
    Actions mouse = new Actions(driver);
    
    JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	

    @Given("^i am on the admin homepage$")
    public void i_am_on_the_admin_homepage() throws Throwable {
        assert(chef.chefsButton().isDisplayed());
        
    }

    @When("^i click on the chefs button$")
    public void i_click_on_the_chefs_button() throws Throwable {
        chef.chefsButton().click();
    }

    @Then("^i should navigate to the chefs page$")
    public void i_should_navigate_to_the_chefs_page() throws Throwable {
        assert(chef.pageTitle().getText().equalsIgnoreCase("Chefs"));
    }

    @And("^i should see active chefs prepopulated on the chefs page$")
    public void i_should_see_active_chefs_prepopulated_on_the_chefs_page() throws Throwable {
        assert(chef.activeChefName().isDisplayed());
        assert(chef.chefList1().isDisplayed());
        assert(chef.activeChefImage().isDisplayed());
        assert(chef.addNewChef().isDisplayed());
        
    }
    @Given("^i am on the chefs page$")
    public void i_am_on_the_chefs_page() throws Throwable {
    	waitHelper.WaitForElement(chef.chefsButton(), 10);
    	chef.chefsButton().click();
    	assert(chef.pageTitle().getText().equalsIgnoreCase("Chefs"));
    }

    @Given("^i am on the chefs overview page$")
    public void i_am_on_the_chefs_overview_page() throws Throwable {
        assert(chef.chefProfileOverview().isDisplayed());
    }

    @When("^i search and select a chef$")
    public void i_search_and_select_a_chef() throws Throwable {
        chef.chefSearchField().sendKeys("Jest Shef");
        Thread.sleep(time);
        chef.chefList1().click();
        Thread.sleep(time1);
        assert(chef.pageTitle().getText().contains("Jest"));
    }

    @When("^i click on the chef status dropdown$")
    public void i_click_on_the_chef_status_dropdown() throws Throwable {
        Select status = new Select(chef.chefPageStatusSelect());
        status.selectByVisibleText("active");
        Thread.sleep(time);
        status.selectByVisibleText("inactive");
        status.selectByVisibleText("trial");
        status.selectByVisibleText("review");
        
    }

    @When("^i enter chefs first name \"([^\"]*)\"$")
    public void i_enter_chefs_first_name_something(String strArg1) throws Throwable {
        chef.firstName().sendKeys(strArg1);
    }

    @When("^i click on new menu item button$")
    public void i_click_on_new_menu_item_button() throws Throwable {
        chef.menuItemsNewItemButton().click();
    }

    @When("^i click on a menu item$")
    public void i_click_on_a_menu_item() throws Throwable {
        chef.menuItemsEnttree().click();
    }

    @When("^i click on add new menu card button$")
    public void i_click_on_add_new_menu_card_button() throws Throwable {
        chef.menuCardAddNewMenuCardButton().click();
    }

    @When("^i click on a menu card$")
    public void i_click_on_a_menu_card() throws Throwable {
        chef.menuCardEntry().click();
    }

    @When("^i click on new contact button$")
    public void i_click_on_new_contact_button() throws Throwable {
        chef.contactsNewContactButton().click();
    }

    @When("^i click on a chef contact$")
    public void i_click_on_a_chef_contact() throws Throwable {
    	chef.menuCards().click();
    	chef.contacts().click();
    	Thread.sleep(1000);
    	System.out.println(chef.contactEntryName().getText());
    	chef.contactEntryName().click();
    	
    }

    @When("^i click on edit$")
    public void i_click_on_edit() throws Throwable {
    	waitHelper.WaitForElement(chef.chefOverviewEditButton(), 10);
        chef.chefOverviewEditButton().click();
    }

    @Then("^i should see that all the profile tabs and contents are present$")
    public void i_should_see_that_all_the_profile_tabs_and_contents_are_present() throws Throwable {
        chef.chefSchedule().click();
        assert(chef.scheduleTodayButton().isDisplayed());
        assert(chef.scheduleSetAllRecurringButton().isDisplayed());
        chef.chefMenuItems().click();
        assert(chef.menuItemsItemNameColumn().isDisplayed());
        assert(chef.menuItemsEnttree().isDisplayed());
        chef.chefServiceItemsTab().click();
        assert(chef.ordersOrderNumberColumn().isDisplayed());
        assert(chef.ordersEventDateColumn().isDisplayed());
        chef.menuCards().click();
        assert(chef.menuCardsNameColumn().isDisplayed());
        assert(chef.menuCardEntry().isDisplayed());
        Thread.sleep(time);
        chef.contacts().click();
        assert(chef.contactsNameColumn().isDisplayed());
        Thread.sleep(time1);
        assert(chef.contactEntryName().isDisplayed());
        chef.chefOrders().click();
        assert(chef.ordersOrderNumberColumn().isDisplayed());
        assert(chef.ordersEventDateColumn().isDisplayed());
    }

    @Then("^i should be able to sort out chefs by active$")
    public void i_should_be_able_to_sort_out_chefs_by_active() throws Throwable {
    	Select status = new Select(chef.chefPageStatusSelect());
        status.selectByVisibleText("active");
        Thread.sleep(time);
    }

    @Then("^i should successfuly add my new chef$")
    public void i_should_successfuly_add_my_new_chef() throws Throwable {
    	
    	waitHelper.WaitForElement(chef.chefSchedule(), 10);
    	System.out.println(chef.pageTitle().getText());
        assert(chef.pageTitle().getText().endsWith("testing"));
        
    }

    @Then("^i should successfuly edit my chef$")
    public void i_should_successfuly_edit_my_chef() throws Throwable {
    	Thread.sleep(time);
        assert(chef.pageTitle().getText().endsWith("testing"));
        
    }

    @Then("^i should successfully add the new menu item and see that it is live$")
    public void i_should_successfully_add_the_new_menu_item_and_see_that_it_is_live() throws Throwable {
        assert(chef.menuItemsEnttree().getText().equalsIgnoreCase("test menu item"));
        Thread.sleep(time1);
        chef.chefProfileOverview2().click();
        Thread.sleep(time2);
        
    }

    @Then("^i should successfully edit the new menu item$")
    public void i_should_successfully_edit_the_new_menu_item() throws Throwable {
    	waitHelper.WaitForElement(chef.menuItemsEnttree(), 10);
    	Thread.sleep(time1);
    	System.out.println(chef.menuItemsEnttree().getText());
        assert(chef.menuItemsEnttree().getText().equalsIgnoreCase("edited menu item"));
        Thread.sleep(time1);
        chef.chefProfileOverview2().click();
        Thread.sleep(time2);
    }

    @Then("^i should successfully add a new menu card$")
    public void i_should_successfully_add_a_new_menu_card() throws Throwable {
        assert(chef.menuCardEntry().getText().equalsIgnoreCase("test menu card"));
        Thread.sleep(time1);
        chef.chefProfileOverview2().click();
        Thread.sleep(time2);
    }

    @Then("^i should successfully edit the menu card$")
    public void i_should_successfully_edit_the_menu_card() throws Throwable {
        Thread.sleep(time2);

    	System.out.println(chef.menuCardEntry().getText());
        assert(chef.menuCardEntry().getText().equalsIgnoreCase("edited menu card"));
        Thread.sleep(time1);
        chef.chefProfileOverview2().click();
        Thread.sleep(time2);
        
    }

    @Then("^i should successfully add a new chefs contact$")
    public void i_should_successfully_add_a_new_chefs_contact() throws Throwable {
    	Thread.sleep(time);
    	chef.menuCards().click();
    	chef.contacts().click();
    	Thread.sleep(time);
    	System.out.println(chef.contactEntryName().getText());

        assert(chef.contactEntryName().getText().equalsIgnoreCase("test name"));
        Thread.sleep(time1);
        chef.chefProfileOverview2().click();
        Thread.sleep(time2);

    }

    @Then("^i should successfully edit chefs contact$")
    public void i_should_successfully_edit_chefs_contact() throws Throwable {
    	try {
        	chef.menuCards().click();

		} catch (Exception e) {
	    	chef.menuCards().click();

		}
    	chef.contacts().click();
    	Thread.sleep(time1);
    	System.out.println(chef.contactEntryName().getText());
        assert(chef.contactEntryName().getText().equalsIgnoreCase("test name"));
        Thread.sleep(time1);
        chef.chefProfileOverview2().click();
        Thread.sleep(time2);
    }

    
    @Then("^i should successfully delete chefs contact$")
    public void i_should_successfully_delete_chefs_contact() throws Throwable {
    	Thread.sleep(time1);
        chef.chefProfileOverview2().click();
        Thread.sleep(time2);
    	
    	

    }

    @Then("^i should successfully delete menu card$")
    public void i_should_successfully_delete_menu_card() throws Throwable {
    	Thread.sleep(time1);
        chef.chefProfileOverview2().click();
        Thread.sleep(time2);
        
    }

    @Then("^i should successfully delete menu item$")
    public void i_should_successfully_delete_menu_item() throws Throwable {
    	Thread.sleep(time1);
        chef.chefProfileOverview2().click();
        Thread.sleep(time2);
        
    }

    @Then("^i should successfully delete chefs account$")
    public void i_should_successfully_delete_chefs_account() throws Throwable {
    	
        
    }    
    

    @And("^i click on add new chef button$")
    public void i_click_on_add_new_chef_button() throws Throwable {
        chef.addNewChef().click();
    }
    
    

    @And("^i should be able to sort out chefs by trial$")
    public void i_should_be_able_to_sort_out_chefs_by_trial() throws Throwable {
    	Select status = new Select(chef.chefPageStatusSelect());
        status.selectByVisibleText("trial");
        Thread.sleep(time);
    }

    @And("^i should be able to sort out chefs by inactive$")
    public void i_should_be_able_to_sort_out_chefs_by_inactive() throws Throwable {
    	Select status = new Select(chef.chefPageStatusSelect());
        status.selectByVisibleText("inactive");
        Thread.sleep(time);
    }

    @And("^i should be able to sort out chefs by review$")
    public void i_should_be_able_to_sort_out_chefs_by_review() throws Throwable {
    	Select status = new Select(chef.chefPageStatusSelect());
        status.selectByVisibleText("review");
        Thread.sleep(time);
    }

    @And("^i enter chefs last name \"([^\"]*)\"$")
    public void i_enter_chefs_last_name_something(String strArg1) throws Throwable {
    	
    	if (System.getProperty("os.name").toLowerCase().contains(OS.MAC.name().toLowerCase())) {
    		chef.lastName().sendKeys(Keys.chord(Keys.COMMAND,"a",Keys.DELETE));
        	chef.lastName().sendKeys(strArg1);
    		
    	}else {
    	
    	chef.lastName().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	chef.lastName().sendKeys(strArg1);
    	}
    }

    @And("^i enter chefs email \"([^\"]*)\"$")
    public void i_enter_chefs_email_something(String strArg1) throws Throwable {
    	if (System.getProperty("os.name").toLowerCase().contains(OS.MAC.name().toLowerCase())) {
    		chef.email().sendKeys(Keys.chord(Keys.COMMAND,"a",Keys.DELETE));
        	chef.email().sendKeys(strArg1);
    		
    	}else {
    	
    	chef.email().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	chef.email().sendKeys(strArg1);
    	}
    
    }

    @And("^i enter chefs phone number \"([^\"]*)\"$")
    public void i_enter_chefs_phone_number_something(String strArg1) throws Throwable {
    	chef.phoneNumber().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	chef.phoneNumber().sendKeys(strArg1);
    }

    @And("^i enter chefs rating \"([^\"]*)\"$")
    public void i_enter_chefs_rating_something(String strArg1) throws Throwable {
    	chef.rating().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	chef.rating().sendKeys(strArg1);
    }

    @And("^i choose chefs priority type$")
    public void i_choose_chefs_priority_type() throws Throwable {
        chef.priorityTypeNew().click();
    }

    @And("^i choose chefs account type$")
    public void i_choose_chefs_account_type() throws Throwable {
       chef.accounTypeBusiness().click();
    }

    @And("^i select chefs image$")
    public void i_select_chefs_image() throws Throwable {
        
    }

    @And("^i select chefs status$")
    public void i_select_chefs_status() throws Throwable {
        Select status = new Select(chef.statusSlelect());
        status.selectByVisibleText("active");
        
    }

    @And("^i i enter chefs account name \"([^\"]*)\"$")
    public void i_i_enter_chefs_account_name_something(String strArg1) throws Throwable {
    	chef.accountName().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	chef.accountName().sendKeys(strArg1);
    }

    @And("^i enter chefs award banner \"([^\"]*)\"$")
    public void i_enter_chefs_award_banner_something(String strArg1) throws Throwable {
    	chef.awardBanner().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	chef.awardBanner().sendKeys(strArg1);
    }

    @And("^i enter years as a chef \"([^\"]*)\"$")
    public void i_enter_years_as_a_chef_something(String strArg1) throws Throwable {
    	chef.yearsAsChef().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	chef.yearsAsChef().sendKeys(strArg1);
    }

    @And("^i enter chefs hometown \"([^\"]*)\"$")
    public void i_enter_chefs_hometown_something(String strArg1) throws Throwable {
    	chef.hometown().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	chef.hometown().sendKeys(strArg1);
    }

    @And("^i enter chefs bio \"([^\"]*)\"$")
    public void i_enter_chefs_bio_something(String strArg1) throws Throwable {
    	chef.bio().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	chef.bio().sendKeys(strArg1);
    }

    @And("^i enter hours of advance notice \"([^\"]*)\"$")
    public void i_enter_hours_of_advance_notice_something(String strArg1) throws Throwable {
    	chef.hoursOfAdvanceNotice().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	chef.hoursOfAdvanceNotice().sendKeys(strArg1);
    }

    @And("^i enter max individuals per session \"([^\"]*)\"$")
    public void i_enter_max_individuals_per_session_something(String strArg1) throws Throwable {
    	chef.maximumIndPerSesson().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));

    	chef.maximumIndPerSesson().sendKeys(strArg1);
    }

    @And("^i enter max buffet per session \"([^\"]*)\"$")
    public void i_enter_max_buffet_per_session_something(String strArg1) throws Throwable {
    	chef.maximunBuffetPerSession().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	chef.maximunBuffetPerSession().sendKeys(strArg1);
    }

    @And("^i enter on site fee \"([^\"]*)\"$")
    public void i_enter_on_site_fee_something(String strArg1) throws Throwable {
    	chef.onSiteFee().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	chef.onSiteFee().sendKeys(strArg1);
    }

    @And("^i enter chefs address line one \"([^\"]*)\"$")
    public void i_enter_chefs_address_line_one_something(String strArg1) throws Throwable {
    	chef.address1().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	chef.address1().sendKeys(strArg1);
    }

    @And("^i enter chefs address line two \"([^\"]*)\"$")
    public void i_enter_chefs_address_line_two_something(String strArg1) throws Throwable {
    	chef.address2().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	chef.address2().sendKeys(strArg1);
    }

    @And("^i enter chefs city \"([^\"]*)\"$")
    public void i_enter_chefs_city_something(String strArg1) throws Throwable {
    	chef.city().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	chef.city().sendKeys(strArg1);
    }

    @And("^i enter chefs state \"([^\"]*)\"$")
    public void i_enter_chefs_state_something(String strArg1) throws Throwable {
    	chef.state().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	chef.state().sendKeys(strArg1);
    }

    @And("^i enter chefs zip code \"([^\"]*)\"$")
    public void i_enter_chefs_zip_code_something(String strArg1) throws Throwable {
    	chef.zipCode().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	chef.zipCode().sendKeys(strArg1);
    }

    @And("^i enter chefs building instruction \"([^\"]*)\"$")
    public void i_enter_chefs_building_instruction_something(String strArg1) throws Throwable {
    	chef.buildingInstructions().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	chef.buildingInstructions().sendKeys(strArg1);
    }

    @And("^i click save$")
    public void i_click_save() throws Throwable {
//    	Actions actions = new Actions(driver);
//    	actions.moveToElement(chef.saveButton());
//    	actions.perform();

    	
        chef.saveButton().click();
        waitHelper.WaitForElement(chef.chefOverviewEditButton(), 10);
    }
    
    @And("^i search for the chef to edit \"([^\"]*)\"$")
    public void i_search_for_the_chef_to_edit_something(String strArg1) throws Throwable {
       
    	chef.chefSearchField().sendKeys(strArg1);
    	Thread.sleep(time);
    	
        chef.chefList1().click();
        
        Thread.sleep(time1);
        System.out.println(chef.pageTitle().getText());
        
        assert(chef.pageTitle().getText().contains(strArg1));
    }

    @And("^i click on edit button$")
    public void i_click_on_edit_button() throws Throwable {
        chef.chefOverviewEditButton().click();
    }

    @And("^i navigate to the menu items tab$")
    public void i_navigate_to_the_menu_items_tab() throws Throwable {
        chef.chefMenuItems().click();
    }

    @And("^i pick the menu item meal type$")
    public void i_pick_the_menu_item_meal_type() throws Throwable {
    	Thread.sleep(time1);
        chef.mainRadioButton().click();
    }

    @And("^i enter the manu item name \"([^\"]*)\"$")
    public void i_enter_the_manu_item_name_something(String strArg1) throws Throwable {
        chef.MenuItemName().sendKeys(strArg1);
    }

    @And("^i enter the menu item ingredients \"([^\"]*)\"$")
    public void i_enter_the_menu_item_ingredients_something(String list1) throws Throwable {
        chef.menuItemIngredients().sendKeys(list1);
    }

    @And("^i enter the menu item description \"([^\"]*)\"$")
    public void i_enter_the_menu_item_description_something(String strArg1) throws Throwable {
        chef.menuItemDescription().sendKeys(strArg1);
    }

    @And("^i enter the menu item servings per package \"([^\"]*)\"$")
    public void i_enter_the_menu_item_servings_per_package_something(String strArg1) throws Throwable {
        chef.servingsPerPackage().sendKeys(strArg1);
    }

    @And("^i select the menu item serving utensils \"([^\"]*)\"$")
    public void i_select_the_menu_item_serving_utensils_something(String strArg1) throws Throwable {

    	Select utensils = new Select(chef.servingUtensilsSelect());
    	utensils.selectByVisibleText(strArg1);
    }

    @And("^i enter the menu item chefs price \"([^\"]*)\"$")
    public void i_enter_the_menu_item_chefs_price_something(String strArg1) throws Throwable {
    	Thread.sleep(time2);
    	chef.chefPrice().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	Thread.sleep(time2);
    	chef.chefPrice().sendKeys(strArg1);
    }

    @And("^i enter the menu item market price \"([^\"]*)\"$")
    public void i_enter_the_menu_item_market_price_something(String strArg1) throws Throwable {
    	Thread.sleep(time2);

    	chef.marketPrice().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	Thread.sleep(time2);

    	chef.marketPrice().sendKeys(strArg1);
    }

    @And("^i upload the menu item meal image$")
    public void i_upload_the_menu_item_meal_image() throws Throwable {
        
    }

    @And("^i check the menu item dietary preference$")
    public void i_check_the_menu_item_dietary_preference() throws Throwable {
    	Thread.sleep(time1);
    	chef.diaryFreeCheckBox().click();
    	Thread.sleep(time1);
    	chef.veganCheckBox().click();
    	
    }

    @And("^i choose the menu item packaging$")
    public void i_choose_the_menu_item_packaging() throws Throwable {
        chef.individualBoxedLunches().click();
    }



    @And("^i check to make my new menu live and approved$")
    public void i_check_to_make_my_new_menu_live_and_approved() throws Throwable {
    	chef.liveCheckBox().click();
        chef.approvedCheckBox().click();
    }

    @And("^i check no minimum quatity requirement for the menu item$")
    public void i_check_no_minimum_quatity_requirement_for_the_menu_item() throws Throwable {
        chef.noMinimumQTY().click();
    }

    @And("^i change the menu item meal type$")
    public void i_change_the_menu_item_meal_type() throws Throwable {
    	Thread.sleep(time);
        chef.mainRadioButton().click();
    }

    @And("^i change the manu item name \"([^\"]*)\"$")
    public void i_change_the_manu_item_name_something(String strArg1) throws Throwable {
    	chef.MenuItemName().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	chef.MenuItemName().sendKeys(strArg1);
    }

    @And("^i change the menu item ingredients \"([^\"]*)\"$")
    public void i_change_the_menu_item_ingredients_something(String list1) throws Throwable {
    	chef.menuItemIngredients().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	chef.menuItemIngredients().sendKeys(list1);
    	chef.menuItemIngredients().sendKeys(Keys.chord(Keys.ENTER));

    }

    @And("^i change the menu item description \"([^\"]*)\"$")
    public void i_change_the_menu_item_description_something(String strArg1) throws Throwable {
    	chef.menuItemDescription().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	chef.menuItemDescription().sendKeys(strArg1);
    }

    @And("^i change the menu item servings per package \"([^\"]*)\"$")
    public void i_change_the_menu_item_servings_per_package_something(String strArg1) throws Throwable {
    	chef.servingsPerPackage().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	chef.servingsPerPackage().sendKeys(strArg1);
    }

    @And("^i upload the new menu item meal image$")
    public void i_upload_the_new_menu_item_meal_image() throws Throwable {
        
    }

    @And("^i change the menu item dietary preference$")
    public void i_change_the_menu_item_dietary_preference() throws Throwable {
    	Thread.sleep(time);
        chef.veganCheckBox().click();
        Thread.sleep(time);
        chef.diaryFreeCheckBox().click();
        Thread.sleep(time);
        chef.containsDiaryCheckBox().click();
        Thread.sleep(time);
        chef.containsGlutenCheckBox().click();
    }

    @And("^i change the menu item packaging$")
    public void i_change_the_menu_item_packaging() throws Throwable {
        chef.pieBox().click();
        
    }

    @And("^i change the status of my menu item$")
    public void i_change_the_status_of_my_menu_item() throws Throwable {
        chef.liveCheckBox().click();
        chef.approvedCheckBox().click();
    }

    @And("^i diselect no minimum quatity requirement for the menu item$")
    public void i_diselect_no_minimum_quatity_requirement_for_the_menu_item() throws Throwable {
       chef.noMinimumQTY().click();
    }

    @And("^i navigate to the menu cards tab$")
    public void i_navigate_to_the_menu_cards_tab() throws Throwable {
        chef.menuCards().click();
    }

    @And("^i enter new menu card name \"([^\"]*)\"$")
    public void i_enter_new_menu_card_name_something(String strArg1) throws Throwable {
        chef.menuCardName().sendKeys(strArg1);
    }

    @And("^i check new menu card status$")
    public void i_check_new_menu_card_status() throws Throwable {
        chef.approvedCheckBox().click();
        chef.liveCheckBox().click();
    }

    @And("^i choose new menu card day part$")
    public void i_choose_new_menu_card_day_part() throws Throwable {
        chef.breakfastRadioButton().click();
    }

    @And("^i choose new menu card cuisine type$")
    public void i_choose_new_menu_card_cuisine_type() throws Throwable {
        chef.asianCuisine().click();
    }

    @And("^i enter new menu card marketplace featured ranking \"([^\"]*)\"$")
    public void i_enter_new_menu_card_marketplace_featured_ranking_something(String strArg1) throws Throwable {
        chef.featuredRanking().sendKeys(strArg1);
    }

    @And("^i upload new menu card image$")
    public void i_upload_new_menu_card_image() throws Throwable {
        
    }

    @And("^i select new menu card entree$")
    public void i_select_new_menu_card_entree() throws Throwable {
        chef.addEntree().click();
        Thread.sleep(1000);
        chef.newMenuCardMainDropdown().click();
        chef.firstSelectChoice().click();
    }

    @And("^i change menu card name \"([^\"]*)\"$")
    public void i_change_menu_card_name_something(String strArg1) throws Throwable {
    	chef.menuCardName().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	chef.menuCardName().sendKeys(strArg1);
    }

    @And("^i change menu card status$")
    public void i_change_menu_card_status() throws Throwable {
       chef.enabledCheckedBox().click();
    }

    
    @And("^i change menu card status to live and approved$")
    public void i_change_menu_card_status_to_live_and_approved() throws Throwable {
    	
    	waitHelper.WaitForElement(chef.enabledCheckedBox(), 10);
       if(driver.getCurrentUrl().contains("staging"))
       {
    	   System.out.println(driver.getCurrentUrl());
       }else {
    	   if(chef.enabledCheckedBox().isSelected())
    	   {
    		   System.out.print("It is checked");
    	   }else {
    		   
    	   
           chef.enabledCheckedBox().click();
    	   }

       }
       
       if(driver.getCurrentUrl().contains("staging"))
       {
    	   System.out.println(driver.getCurrentUrl());
       }else {
    	   
    	   if(chef.approvedCheckBox().isSelected())
    	   {
    		   System.out.print("It is checked");
    	   }else {
    		   
    	   
               chef.approvedCheckBox().click();
    	   }

       }
    }
    
    @And("^i change menu card status from live and approved$")
    public void i_change_menu_card_status_from_live_and_approved() throws Throwable {
    	
    	waitHelper.WaitForElement(chef.enabledCheckedBox(), 10);
       if(driver.getCurrentUrl().contains("staging"))
       {
    	   System.out.println(driver.getCurrentUrl());
       }else {
    	   if(chef.enabledCheckedBox().isSelected())
    	   {
    		   chef.enabledCheckedBox().click();
    		  
    	   }else {
    		   
    		   System.out.print("It is unchecked");
           
    	   }

       }
       
       if(driver.getCurrentUrl().contains("staging"))
       {
    	   System.out.println(driver.getCurrentUrl());
       }else {
    	   
    	   if(chef.approvedCheckBox().isSelected())
    	   {
    		   chef.approvedCheckBox().click();
    	   }else {
    		   System.out.print("It is unchecked");

    	   
               
    	   }

       }
    }
    
    
    @And("^i change menu card day part$")
    public void i_change_menu_card_day_part() throws Throwable {
        chef.happyHourCheckBox().click();
    }

    @And("^i change menu card cuisine type$")
    public void i_change_menu_card_cuisine_type() throws Throwable {
        chef.persianCuisine().click();
        chef.asianCuisine().click();
    }

    @And("^i change menu card marketplace featured ranking \"([^\"]*)\"$")
    public void i_change_menu_card_marketplace_featured_ranking_something(String strArg1) throws Throwable {
    	chef.featuredRanking().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	chef.featuredRanking().sendKeys(strArg1);
    }

    @And("^i upload a new menu card image$")
    public void i_upload_a_new_menu_card_image() throws Throwable {
       
    }

    @And("^i navigate to the chef contacts tab$")
    public void i_navigate_to_the_chef_contacts_tab() throws Throwable {
        chef.contacts().click();
    }

    @And("^i enter chefs new contact name \"([^\"]*)\"$")
    public void i_enter_chefs_new_contact_name_something(String strArg1) throws Throwable {
        chef.newContactName().sendKeys(strArg1);
    }

    @And("^i enter chefs new contact role \"([^\"]*)\"$")
    public void i_enter_chefs_new_contact_role_something(String strArg1) throws Throwable {
        chef.newContactRole().sendKeys(strArg1);
    }

    @And("^i enter chefs new contact email \"([^\"]*)\"$")
    public void i_enter_chefs_new_contact_email_something(String strArg1) throws Throwable {
       chef.newContactEmail().sendKeys(strArg1);
    }

    @And("^i enter chefs new contact phone number \"([^\"]*)\"$")
    public void i_enter_chefs_new_contact_phone_number_something(String strArg1) throws Throwable {
        chef.newContactPhone().sendKeys(strArg1);
    }

    @And("^i check chefs contact roles$")
    public void i_check_chefs_contact_roles() throws Throwable {
        chef.newContactInvoivesCheckbox().click();
        chef.newContactConfirmationCheckboxx().click();
        chef.newContactOrdersCheckbox().click();
    }

    @And("^i change chefs contact name \"([^\"]*)\"$")
    public void i_change_chefs_contact_name_something(String strArg1) throws Throwable {
    	waitHelper.WaitForElement(chef.newContactName(), 5);
    	chef.newContactName().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	chef.newContactName().sendKeys(strArg1);
    }

    @And("^i change chefs contact role \"([^\"]*)\"$")
    public void i_change_chefs_contact_role_something(String strArg1) throws Throwable {
    	chef.newContactRole().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	chef.newContactRole().sendKeys(strArg1);
    }

    @And("^i change chefs contact email \"([^\"]*)\"$")
    public void i_change_chefs_contact_email_something(String strArg1) throws Throwable {
    	chef.newContactEmail().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	chef.newContactEmail().sendKeys(strArg1);
    }

    @And("^i enter new contact phone number \"([^\"]*)\"$")
    public void i_enter_new_contact_phone_number_something(String strArg1) throws Throwable {
    	chef.newContactPhone().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	chef.newContactPhone().sendKeys(strArg1);
    }

    @And("^i change chefs contact roles$")
    public void i_change_chefs_contact_roles() throws Throwable {
        chef.newContactConfirmationCheckboxx().click();
    }

    @And("^i click on delete$")
    public void i_click_on_delete() throws Throwable {
    
        try {
        	waitHelper.WaitForElement(chef.deleteButton(), 3);
            chef.deleteButton().click();
            waitHelper.WaitForElement(chef.yesButton(), 3);
            chef.yesButton().click();
		} catch (Exception e) {
			waitHelper.WaitForElement(chef.deleteButton(), 3);
	        chef.deleteButton().click();
	        waitHelper.WaitForElement(chef.yesButton(), 3);
	        chef.yesButton().click();
		}
    }

    
    @When("^i search for and click a failed test chef \"([^\"]*)\"$")
    public void i_search_for_and_click_a_failed_test_chef_something(String strArg1) throws Throwable {
        Thread.sleep(time1);
        chef.chefSearchField().sendKeys(strArg1);
        Thread.sleep(time1);
      
    }

    @Then("^i should navigate to the test chefs overview page$")
    public void i_should_navigate_to_the_test_chefs_overview_page() throws Throwable {
    	 try   
	  		{
    		 if (chef.chefList1().isDisplayed())
	  
    		  
		          {
		          	chef.chefList1().click();
		          	Thread.sleep(time1);
		            
		      	    if(chef.pageTitle().getText().endsWith("testing"))
		            {
		      	       assert(chef.chefProfileOverview().isDisplayed());
		      	       Thread.sleep(time1);
		      	       assert(chef.pageTitle().getText().endsWith("testing"));
		      	       Thread.sleep(time1);
			             chef.chefOverviewEditButton().click();
			             Thread.sleep(time1);
			             chef.deleteButton().click();
			             Thread.sleep(time1);
			             	chef.yesButton().click();
	      	   
      	   
		            }
          	     

           }

          }
	  		       
    	  catch(Exception e)     
    	  {  
    		  assert (chef.pageTitle().getText().equalsIgnoreCase("chefs"));
       	     System.out.println("no chef accounts to delete");
    	  }
    }
    
    @When("^i click on new service items$")
    public void i_click_on_new_service_items() throws Throwable {
        chef.newServiceItemsButton().click();
    }

    @Then("^i should successfully add a new service item$")
    public void i_should_successfully_add_a_new_service_item() throws Throwable {
    	
       waitHelper.WaitForElement(chef.ServiceItemsFirstItem(), 10);
       
       assert(chef.ServiceItemsFirstItem().isDisplayed());
    }



    @And("^i navigate to the service items tab$")
    public void i_navigate_to_the_service_items_tab() throws Throwable {
       chef.chefServiceItemsTab().click();
    }

    @And("^i enter service item name \"([^\"]*)\"$")
    public void i_enter_service_item_name_something(String strArg1) throws Throwable {
       chef.newServiceItemsName().sendKeys(strArg1);
    }

    @And("^i enter description \"([^\"]*)\"$")
    public void i_enter_description_something(String strArg1) throws Throwable {
       chef.newServiceItemDescription().sendKeys(strArg1);
    }

    @And("^i enter pricing rate \"([^\"]*)\"$")
    public void i_enter_pricing_rate_something(String strArg1) throws Throwable {
        chef.newServiceItemPriceRate().sendKeys(strArg1);
    }

    @And("^i choose choose vendor status$")
    public void i_choose_choose_vendor_status() throws Throwable {
        chef.newServiceItemLiveCheckBox().click();
        chef.newServiceItemApprovedCheckBox().click();
    }

    @And("^i enter vendor price \"([^\"]*)\"$")
    public void i_enter_vendor_price_something(String strArg1) throws Throwable {
    	chef.newServiceItemVendorPrice().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));

       chef.newServiceItemVendorPrice().sendKeys(strArg1);
    }

    @And("^i enter market price \"([^\"]*)\"$")
    public void i_enter_market_price_something(String strArg1) throws Throwable {
    	chef.newServiceItemMarketPrice().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));

       chef.newServiceItemMarketPrice().sendKeys(strArg1);
    }

    

    @And("^i choose vendor only account type$")
    public void i_choose_vendor_only_account_type() throws Throwable {
        chef.accountTypeVendor().click();
    }
    
    
    @Then("^i should successfuly delete service item$")
    public void i_should_successfuly_delete_service_item() throws Throwable {
        assert(chef.pageTitle().getText().equalsIgnoreCase("Chef deleteServiceItem testing"));
    }
    

    @Then("^i should successfully edit the service item$")
    public void i_should_successfully_edit_the_service_item() throws Throwable {
       Thread.sleep(time1);
        assert(chef.ServiceItemsFirstItem().getText().equals("testedit serviceitem"));
    }

    @And("^i click on the service item$")
    public void i_click_on_the_service_item() throws Throwable {
        chef.ServiceItemsFirstItem().click();
    }

    @And("^i edit service item name \"([^\"]*)\"$")
    public void i_edit_service_item_name_something(String strArg1) throws Throwable {
    	  chef.newServiceItemsName().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));

          chef.newServiceItemsName().sendKeys(strArg1);
    }

    @And("^i edit service item description \"([^\"]*)\"$")
    public void i_edit_service_item_description_something(String strArg1) throws Throwable {
    	  chef.newServiceItemDescription().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));

          chef.newServiceItemDescription().sendKeys(strArg1);
    }

    @And("^i edit service item pricing rate \"([^\"]*)\"$")
    public void i_edit_service_item_pricing_rate_something(String strArg1) throws Throwable {
        chef.newServiceItemPriceRate().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));

        chef.newServiceItemPriceRate().sendKeys(strArg1);
    }

    

    @And("^i edit service item status$")
    public void i_edit_service_item_status() throws Throwable {
        chef.newServiceItemLiveCheckBox().click();

    }

}
