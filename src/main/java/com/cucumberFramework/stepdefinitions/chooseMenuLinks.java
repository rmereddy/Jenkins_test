package com.cucumberFramework.stepdefinitions;

import org.openqa.selenium.Dimension;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.HomePage;
import com.cucumberFramework.pageObjects.chooseMenuPage;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class chooseMenuLinks  extends TestBase{

	HomePage homepage = new HomePage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
    chooseMenuPage menu = new chooseMenuPage(driver);

	

@When("^i count the number of links on the page$")
public void i_count_the_number_of_links_on_the_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   int links = menu.menuPageLinks().size();
   System.out.println(links);
}

@Then("^i should count that there are (\\d+) links$")
public void i_should_count_that_there_are_links(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	int links = menu.menuPageLinks().size();
	assert(links <= 4);
}
}
