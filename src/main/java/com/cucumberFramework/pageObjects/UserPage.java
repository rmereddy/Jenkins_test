package com.cucumberFramework.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumberFramework.helper.WaitHelper;

public class UserPage {
	private WebDriver driver;

	WaitHelper waitHelper;
	
	
	By usersLink = By.xpath("//a[contains(text(),'Users')]");
	By addNewUser = By.className("add-new-button");
	By firstName = By.id("first-name");
	By lastName = By.id("last-name");
	By email = By.id("email");
	By phoneNumber = By.id("phone-number");
	By password = By.id("password");
	By locationSelect = By.id("headquarter");
	By acountExecRole = By.id("account executive");
	By adminRole = By.id("admin");
	By cateringCapRole = By.id("catering captain");
	By chefRole = By.id("chef");
	By chefRecRole = By.id("chef recruiting");
	By masterAccExecRole = By.id("master account executive");
	By saveButton = By.id("save");
	By cancelButton = By.id("cancel");
	By name = By.id("name");
	By roles = By.id("roles");
	By deleteButton = By.id("delete");
	
	
	
	
	
	
	public UserPage(WebDriver driver) {
		this.driver = driver;
		waitHelper = new WaitHelper(driver);
	}
	
	public WebElement usersLink ()
	{
		return driver.findElement(usersLink   );
	}

	public WebElement deleteButton ()
	{
		return driver.findElement(deleteButton   );
	}
	
	public WebElement addNewUser ()
	{
		return driver.findElement(addNewUser   );
	}
	
	public WebElement firstName   ()
	{
		return driver.findElement(firstName   );
	}
	
	public WebElement lastName   ()
	{
		return driver.findElement(lastName   );
	}
	
	public WebElement phoneNumber   ()
	{
		return driver.findElement(phoneNumber   );
	}
	
	public WebElement email   ()
	{
		return driver.findElement(email   );
	}
	
	public WebElement password   ()
	{
		return driver.findElement(password   );
	}
	
	public WebElement cateringCapRole   ()
	{
		return driver.findElement(cateringCapRole   );
	}
	
	public WebElement acountExecRole   ()
	{
		return driver.findElement(acountExecRole   );
	}
	
	public WebElement locationSelect   ()
	{
		return driver.findElement(locationSelect   );
	}
	
	public WebElement adminRole   ()
	{
		return driver.findElement(adminRole   );
	}
	
	public WebElement saveButton   ()
	{
		return driver.findElement(saveButton   );
	}
	
	public WebElement chefRecRole   ()
	{
		return driver.findElement(chefRecRole   );
	}
	
	public WebElement chefRole   ()
	{
		return driver.findElement(chefRole   );
	}
	
	public WebElement masterAccExecRole   ()
	{
		return driver.findElement(masterAccExecRole   );
	}
	
	public WebElement roles   ()
	{
		return driver.findElement(roles   );
	}
	
	public WebElement name   ()
	{
		return driver.findElement(name   );
	}
	
	public WebElement cancelButton   ()
	{
		return driver.findElement(cancelButton   );
	}

}
