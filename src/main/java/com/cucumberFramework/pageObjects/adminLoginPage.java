package com.cucumberFramework.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumberFramework.helper.WaitHelper;

public class adminLoginPage {
	private WebDriver driver;

	WaitHelper waitHelper;
	
	By email = By.cssSelector("#app > div > div.login-container > div > form > input[type=\"text\"]:nth-child(1)");
	By password = By.cssSelector("#app > div > div.login-container > div > form > input[type=\"password\"]:nth-child(2)");
	By loginButton = By.cssSelector("#app > div > div.login-container > div > form > input[type=\"submit\"]:nth-child(4)");
	
	
	
	
	
	
	
	public adminLoginPage(WebDriver driver) {
		this.driver = driver;
		waitHelper = new WaitHelper(driver);
	}
	
	public WebElement email  ()
	{
		return driver.findElement(email  );
	}
	
	public WebElement password  ()
	{
		return driver.findElement(password  );
	}
	
	public WebElement loginButton  ()
	{
		return driver.findElement(loginButton  );
	}

}
