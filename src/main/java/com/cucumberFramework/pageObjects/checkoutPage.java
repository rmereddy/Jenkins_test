package com.cucumberFramework.pageObjects;

import java.awt.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumberFramework.helper.WaitHelper;

public class checkoutPage {
	
	private WebDriver driver;

	WaitHelper waitHelper;
	
	By firstName = By.cssSelector(".general-info-container > div:nth-child(1) > input:nth-child(2)");
	By lastName = By.cssSelector(".general-info-container > div:nth-child(2) > input:nth-child(2)");
	By phoneNumber = By.cssSelector(".general-info-container > div:nth-child(3) > input:nth-child(2)");
	By checkoutHeader = By.cssSelector(".card-header");
	By login = By.cssSelector(".nav-account");
	By emailAddress = By.cssSelector("div.input-container:nth-child(4) > div:nth-child(2) > input:nth-child(1)");
	By companyName = By.cssSelector(".company > input:nth-child(2)");
	By address = By.cssSelector(".address > div:nth-child(2) > input:nth-child(1)");
	By suite = By.cssSelector(".suite > input:nth-child(2)");
	By city = By.cssSelector(".city > div:nth-child(2) > input:nth-child(1)");
	By state = By.cssSelector(".state > div:nth-child(2) > input:nth-child(1)");
	By zipCode = By.cssSelector(".zip > div:nth-child(2) > input:nth-child(1)");
	By deliveryInstructions = By.cssSelector("div.input-container:nth-child(5) > textarea:nth-child(2)");
	By frontDoorAccess = By.cssSelector("div.input-container:nth-child(6) > div:nth-child(2) > input:nth-child(1)");
	By loadingDockAccess = By.cssSelector("div.input-container:nth-child(6) > div:nth-child(3) > input:nth-child(1)");
	By noSecurityCheckIn = By.cssSelector("div.input-container:nth-child(7) > div:nth-child(2) > input:nth-child(1)");
	By yesSecurityCheckIn = By.cssSelector("div.input-container:nth-child(7) > div:nth-child(3) > input:nth-child(1)");
	By nameOnCard = By.cssSelector(".card-name > input:nth-child(2)");
	By ccFrame = By.cssSelector("#braintree-hosted-field-number");
	By ccNumber = By.cssSelector("#credit-card-number");
	By ccExpDate = By.cssSelector("#expiration");
	By ccCvv = By.cssSelector("#cvv");
	By saveCardOnFile = By.cssSelector(".card-save > input:nth-child(1)");
	By subtotal = By.cssSelector("div.amount-container:nth-child(1) > p:nth-child(2)");
	By discount = By.cssSelector("div.amount-container:nth-child(2) > p:nth-child(2)");
	By deliveryFee = By.cssSelector("div.amount-container:nth-child(3) > p:nth-child(2)");
	By tax = By.cssSelector("div.amount-container:nth-child(4) > p:nth-child(2)");
	By tip = By.cssSelector("div.amount-container:nth-child(5) > p:nth-child(2)");
	By total = By.cssSelector("div.amount-container:nth-child(6) > p:nth-child(2)");
	By placeOrder = By.cssSelector(".place-order");
	By orderConfirmation = By.cssSelector(".marketplace-title");
	By myAccount = By.cssSelector(".modal-form-container > div:nth-child(1) > div:nth-child(1) > a:nth-child(4)");
	By confirmationPageOrderNumber = By.cssSelector(".market-place-title-container > div:nth-child(3) > p:nth-child(1) > span:nth-child(1)");
	
	
	
	
	
	
	public checkoutPage(WebDriver driver) {
		this.driver = driver;
		waitHelper = new WaitHelper(driver);
	}
	
	public WebElement confirmationPageOrderNumber()
	{
		return driver.findElement(confirmationPageOrderNumber);
	}
	
	
	public WebElement myAccount  ()
	{
		return driver.findElement(myAccount  );
	}
	
	public WebElement firstName  ()
	{
		return driver.findElement(firstName  );
	}
	
	public WebElement lastName  ()
	{
		return driver.findElement(lastName  );
	}
	
	public WebElement phoneNumber  ()
	{
		return driver.findElement(phoneNumber  );
	}
	
	public WebElement checkoutHeader  ()
	{
		return driver.findElement(checkoutHeader  );
	}
	
	public WebElement login  ()
	{
		return driver.findElement(login  );
	}
	
	public WebElement emailAddress  ()
	{
		return driver.findElement(emailAddress  );
	}
	
	public WebElement companyName  ()
	{
		return driver.findElement(companyName  );
	}
	
	public WebElement address  ()
	{
		return driver.findElement(address  );
	}
	
	public WebElement suite  ()
	{
		return driver.findElement(suite  );
	}
	
	public WebElement city  ()
	{
		return driver.findElement(city  );
	}
	
	public WebElement state  ()
	{
		return driver.findElement(state  );
	}
	
	public WebElement zipCode  ()
	{
		return driver.findElement(zipCode  );
	}
	
	public WebElement deliveryInstructions  ()
	{
		return driver.findElement(deliveryInstructions  );
	}
	
	public WebElement frontDoorAccess  ()
	{
		return driver.findElement(frontDoorAccess  );
	}
	
	public WebElement loadingDockAccess  ()
	{
		return driver.findElement(loadingDockAccess  );
	}
	
	public WebElement noSecurityCheckIn  ()
	{
		return driver.findElement(noSecurityCheckIn  );
	}
	
	public WebElement yesSecurityCheckIn  ()
	{
		return driver.findElement(yesSecurityCheckIn  );
	}
	
	public WebElement nameOnCard  ()
	{
		return driver.findElement(nameOnCard  );
	}
	
	public WebDriver ccFrame  ()
	{
		return driver.switchTo().frame(1);
	}
	
	public WebElement ccNumber  ()
	{
		return driver.findElement(ccNumber  );
	}
	
	public WebElement ccExpDate  ()
	{
		return driver.findElement(ccExpDate  );
	}
	
	public WebElement ccCvv  ()
	{
		return driver.findElement(ccCvv  );
	}
	
	public WebElement saveCardOnFile  ()
	{
		return driver.findElement(saveCardOnFile  );
	}
	
	public WebElement subtotal  ()
	{
		return driver.findElement(discount  );
	}
	
	public WebElement deliveryFee  ()
	{
		return driver.findElement(deliveryFee  );
	}
	
	public WebElement tax  ()
	{
		return driver.findElement(tax  );
	}
	
	public WebElement tip  ()
	{
		return driver.findElement(tip  );
	}
	
	public WebElement total  ()
	{
		return driver.findElement(total  );
	}
	
	public WebElement placeOrder  ()
	{
		return driver.findElement(placeOrder  );
	}
	
	public WebElement orderConfirmation  ()
	{
		return driver.findElement(orderConfirmation  );
	}


	
	
	
	
}
