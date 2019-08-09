package com.cucumberFramework.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumberFramework.helper.WaitHelper;

public class ClientPortalTooltipObjects {


	private WebDriver driver;

	WaitHelper waitHelper;
	
	

	By closeTooltip = By.id("closeTooltip");
	By myAccount = By.className("main-nav-link");
	By welcomeMessage = By.className("login-tooltip-title");
	By welcomeMessageName = By.id("name");
	By currentOrders = By.id("currentOrders");
	By pastOrders = By.id("pastOrders");
	By donatedMealsMessage = By.className("login-tooltip-donations");
	By donatedMealsCounter = By.id("mealsDonated");
	By profileHeader = By.className("admin-underline");
	By editProfileLink = By.id("editProfile");
	By password = By.id("password");
	By upcomingOrders = By.id("upcomingOrders");
	By tooltipOrderImage = By.id("order-image");
	By orderLessThan24hrs = By.cssSelector("#loginTooltip > div.login-tooltip__inner > div.login-tooltip-orders > div:nth-child(1) > div.m-b-20 > p:nth-child(5)");
	By editOrderLink = By.id("customize-order");
	By orderAgainLink = By.id("order-again");
	By customOrderMessage = By.cssSelector("#app > div > div.homepage-container > header > nav > div:nth-child(7) > div > div.login-tooltip__inner > div.login-tooltip-orders > div:nth-child(2) > div.m-b-20 > p:nth-child(5)");
	
	
	
	
	
	public ClientPortalTooltipObjects(WebDriver driver) {
		this.driver = driver;
		waitHelper = new WaitHelper(driver);
	}
	

	public WebElement profileHeader()
	{
		return driver.findElement(profileHeader);
	}	
	
	
	public WebElement orderLessThan24hrs()
	{
		return driver.findElement(orderLessThan24hrs);
	}	
	
	public WebElement editOrderLink()
	{
		return driver.findElement(editOrderLink);
	}
	
	public WebElement orderAgainLink()
	{
		return driver.findElement(orderAgainLink);
	}	
	
	public WebElement customOrderMessage()
	{
		return driver.findElement(customOrderMessage);
	}
	
	
	
	public WebElement closeTooltip()
	{
		return driver.findElement(closeTooltip);
	}	
	
	public WebElement myAccount()
	{
		return driver.findElement(myAccount);
	}
	
	public WebElement welcomeMessage()
	{
		return driver.findElement(welcomeMessage);
	}	
	
	public WebElement welcomeMessageName()
	{
		return driver.findElement(welcomeMessageName);
	}
	
	
	public WebElement currentOrders()
	{
		return driver.findElement(currentOrders);
	}	
	
	public WebElement pastOrders()
	{
		return driver.findElement(pastOrders);
	}
	
	
	public WebElement donatedMealsMessage()
	{
		return driver.findElement(donatedMealsMessage);
	}	
	
	public WebElement donatedMealsCounter()
	{
		return driver.findElement(donatedMealsCounter);
	}
	
	public WebElement editProfileLink()
	{
		return driver.findElement(editProfileLink);
	}	
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement upcomingOrders()
	{
		return driver.findElement(upcomingOrders);
	}	
	
	public WebElement tooltipOrderImage()
	{
		return driver.findElement(tooltipOrderImage);
	}
	
	
	
	
	
	
	
}
