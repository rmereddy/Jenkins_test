package com.cucumberFramework.stepdefinitions;

import static org.testng.Assert.assertTrue;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.HomePage;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class homepageBrokenLinks extends TestBase{

	HomePage homepage = new HomePage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	

    @When("^i verify the response code of every link$")
    public void i_verify_the_response_code_of_every_link() throws Throwable {
    	List<WebElement> links = homepage.links();
    	System.out.println("Total links are "+links.size()); 
    	
    	 //used for loop to 
    	 for(int i=0; i<links.size(); i++) {
    	 WebElement element = links.get(i);
    	 //By using "href" attribute, we could get the url of the requried link
    	 String url=element.getAttribute("href");
    	 //calling verifyLink() method here. Passing the parameter as url which we collected in the above link
    	 //See the detailed functionality of the verifyLink(url) method below
    	 verifyLink(url); 
    	 } 
    	 }
    	 
    	 // The below function verifyLink(String urlLink) verifies any broken links and return the server status. 
    	 public static void verifyLink(String urlLink) {
    	        //Sometimes we may face exception "java.net.MalformedURLException". Keep the code in try catch block to continue the broken link analysis
    	        try {
    	 //Use URL Class - Create object of the URL Class and pass the urlLink as parameter 
    	 URL link = new URL(urlLink);
    	 // Create a connection using URL object (i.e., link)
    	 HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
    	 //Set the timeout for 2 seconds
    	 httpConn.setConnectTimeout(2000);
    	 //connect using connect method
    	 httpConn.connect();
    	 //use getResponseCode() to get the response code. 
    	 if(httpConn.getResponseCode()== 200 || httpConn.getResponseCode()== 403) { 
    	 System.out.println(urlLink+" - "+httpConn.getResponseMessage());
    	 }
    	 else {
    	 System.out.println(urlLink+" - "+ httpConn.getResponseCode() + " which is " + httpConn.getResponseMessage());
    	 }
    	   //assertTrue(httpConn.getResponseCode()==200);
    	 }
    	 //getResponseCode method returns = IOException - if an error occurred connecting to the server. 
    	 catch (Exception e) {
    	 //e.printStackTrace();
    	 }
        
    }



}
