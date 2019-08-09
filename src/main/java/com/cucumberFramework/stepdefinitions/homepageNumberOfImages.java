package com.cucumberFramework.stepdefinitions;

import static org.testng.Assert.assertTrue;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.WebElement;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.HomePage;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class homepageNumberOfImages extends TestBase{

	HomePage homepage = new HomePage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
	
	
	
	  @Given("^i am on the tryhungry homepage i should see that there are more than 50 images on the homepage$")
	    public void i_am_on_the_tryhungry_homepage_i_should_see_that_there_are_more_than_50_images_on_the_homepage() throws Throwable {
		int numberOfImages =  homepage.images().size();
		  System.out.println("Total no. of images are " + numberOfImages);
		  
		  assertTrue(numberOfImages > 50);
			
				
	    }

}
