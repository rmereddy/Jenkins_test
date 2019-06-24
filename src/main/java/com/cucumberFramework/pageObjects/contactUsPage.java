package com.cucumberFramework.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumberFramework.helper.WaitHelper;

public class contactUsPage {
	private WebDriver driver;

	WaitHelper waitHelper;
	
	By fullName = By.cssSelector("#Full\\ Name");
	By company = By.cssSelector("#Company");
	By email = By.cssSelector("#Email\\ Address\\*");
	By phoneNumber = By.cssSelector("#Phone\\ Number");
	By submit = By.cssSelector(".round-button");
	By close = By.cssSelector(".contact-form-container__inner--close-button");
	By confirmation = By.cssSelector(".contact-thankyou-container > h1:nth-child(2)");
	By errorMessage = By.cssSelector("div.contact-form-container__inner--form:nth-child(4) > div:nth-child(1) > label:nth-child(1) > div:nth-child(1) > p:nth-child(1)");
	
	
	
	
	
	public contactUsPage(WebDriver driver) {
		this.driver = driver;
		waitHelper = new WaitHelper(driver);
	}
	
	public WebElement fullName ()
	{
		return driver.findElement(fullName );
	}

	public WebElement errorMessage ()
	{
		return driver.findElement(errorMessage );
	}
	
	public WebElement confirmation ()
	{
		return driver.findElement(confirmation );
	}
	
	public WebElement company ()
	{
		return driver.findElement(company );
	}
	
	public WebElement email ()
	{
		return driver.findElement(email );
	}
	
	public WebElement phoneNumber ()
	{
		return driver.findElement(phoneNumber );
	}
	
	public WebElement submit ()
	{
		return driver.findElement(submit );
	}
	
	public WebElement close ()
	{
		return driver.findElement(close );
	}
}
