package com.cucumberFramework.stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.HomePage;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class launchHomePage extends TestBase {
	


	HomePage homepage = new HomePage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);

    @Given("^i lunch my prefered web browser$")
    public void i_lunch_my_prefered_web_browser() throws Throwable {


    }

    @When("^i enter \"([^\"]*)\" on the navigation bar and i hit enter$")
    public void i_enter_something_on_the_navigation_bar_and_i_hit_enter(String strArg1) throws Throwable {
		driver.get(strArg1);

    }

    @Then("^i should see the tryHungry homepage launch in my browser$")
    public void i_should_see_the_tryhungry_homepage_launch_in_my_browser() throws Throwable {

    }



}
