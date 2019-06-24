package com.cucumberFramework.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class adminLogin extends TestBase{

	HomePage homepage = new HomePage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
    chooseMenuPage menu = new chooseMenuPage(driver);
    customizeMenuPage cus = new customizeMenuPage(driver);
    checkoutPage checkout = new checkoutPage(driver);
    loginPage login=new loginPage(driver);
    adminLoginPage admin = new adminLoginPage(driver);
    
    


    
    
    Actions mouse = new Actions(driver);
    
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    
    
	
    
    @When("^i login with \"([^\"]*)\" as my email$")
    public void i_login_with_something_as_my_email(String strArg1) throws Throwable {
        admin.email().sendKeys(strArg1);
    }

    @Then("^system should display an error message$")
    public void system_should_display_an_error_message() throws Throwable {
        Select select = new Select(driver.findElement(By.cssSelector(".form-control")));
        select.selectByVisibleText("Rosslyn, VA");
        admin.loginButton().click();
        
        assert(driver.findElement(By.cssSelector(".login-container__form > h2:nth-child(1)")).getText().startsWith("Sign"));
    }
    
    
    @And("^and \"([^\"]*)\" as my password$")
    public void and_something_as_my_password(String strArg1) throws Throwable {
        admin.password().sendKeys(strArg1);
    }
    

}
