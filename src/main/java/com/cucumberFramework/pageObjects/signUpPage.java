package com.cucumberFramework.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumberFramework.helper.WaitHelper;

public class signUpPage {

	
	private WebDriver driver;

	WaitHelper waitHelper;
	
	By firstName = By.cssSelector("#name");
	By lastName = By.cssSelector("#last-name");
	By email = By.cssSelector("#email");
	By password = By.cssSelector("#password");
	By retypePassword = By.cssSelector("#password2");
	By create = By.cssSelector(".round-button");
	By close = By.cssSelector(".contact-form-container__inner--close-button");
	By backToSignIn = By.cssSelector(".blue-link");
	By termsOfUs = By.cssSelector(".basic-link");
	By createNewAccount = By.className("round-button round-button--small");
	
	
	
	
	
	public signUpPage(WebDriver driver) {
		this.driver = driver;
		waitHelper = new WaitHelper(driver);
	}
	
	
	public WebElement createNewAccount()
	{
		return driver.findElement(createNewAccount);
	}
	
	
	public WebElement firstName()
	{
		return driver.findElement(firstName);
	}
	
	public WebElement lastName()
	{
		return driver.findElement(lastName);
	}
	
	public WebElement email()
	{
		return driver.findElement(email);
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement retypePassword()
	{
		return driver.findElement(retypePassword);
	}
	
	public WebElement create()
	{
		return driver.findElement(create);
	}
	
	public WebElement close()
	{
		return driver.findElement(close);
	}
	
	public WebElement backToSignIn()
	{
		return driver.findElement(backToSignIn);
	}
	
	public WebElement termsOfUs()
	{
		return driver.findElement(termsOfUs);
	}
}
