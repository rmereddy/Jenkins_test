package com.cucumberFramework.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumberFramework.helper.WaitHelper;

public class loginPage {
	
	private WebDriver driver;

	WaitHelper waitHelper;
	
	
	By email = By.cssSelector("#email");
	By password = By.cssSelector("#password");
	By signIn = By.cssSelector("button.round-button");
	By forgotPassword = By.cssSelector(".blue-link");
	By createAccount = By.cssSelector("a.round-button");
	By close = By.cssSelector(".contact-form-container__inner--close-button");
	By signInHeader = By.cssSelector("div.contact-form-container__inner--column:nth-child(1) > div:nth-child(1) > h2:nth-child(1)");
	By myAccount = By.cssSelector("#app > div > div.homepage-container > header > nav > div:nth-child(7) > a");
	
	
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
		waitHelper = new WaitHelper(driver);
	}
	
	public WebElement email()
	{
		return driver.findElement(email);
	}
	
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement signIn()
	{
		return driver.findElement(signIn);
	}
	
	public WebElement forgotPassword()
	{
		return driver.findElement(forgotPassword);
	}
	
	public WebElement createAccount()
	{
		return driver.findElement(createAccount);
	}
	
	public WebElement close()
	{
		return driver.findElement(close);
	}
	
	
	public WebElement signInHeader()
	{
		return driver.findElement(signInHeader);
	}
	
	public WebElement myAccount()
	{
		return driver.findElement(myAccount);
	}
	
}
