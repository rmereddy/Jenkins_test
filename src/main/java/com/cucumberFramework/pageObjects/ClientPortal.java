package com.cucumberFramework.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumberFramework.helper.WaitHelper;

public class ClientPortal {


	private WebDriver driver;

	WaitHelper waitHelper;
	
	

	By marketplace = By.cssSelector("a.nav-link:nth-child(1)");
	By logOut = By.cssSelector("a.nav-link:nth-child(1)");
	By firstName = By.cssSelector("#first-name");
	By lastName = By.cssSelector("#last-name");
	By phone = By.cssSelector("#phone");
	By email = By.cssSelector("#email");
	By company = By.cssSelector("#company");
	By address = By.cssSelector("#address");
	By suite = By.cssSelector("#address-2");
	By city = By.cssSelector("#city");
	By state = By.cssSelector("#state");
	By zipCode = By.cssSelector("#zipcode");
	By yesUtenslsNapkinsPlates = By.cssSelector("#utensils-yes");
	By noUtensilsNapkinsPlates = By.cssSelector("#utensils-no");
	By addNewCard = By.cssSelector(".add-card");
	By save = By.xpath("//button[@class='square-button save-button']");
	By deliveryInstructions = By.cssSelector("#delivery-instructions");
	By loadingDockAccess = By.cssSelector("#loading-dock");
	By frontDoorAccess = By.cssSelector("#front-door");
	By sideDoorAccess = By.cssSelector("#side-door");
	By noSecurityCheckin = By.cssSelector("#security-no");
	By yesSecurityCheckin = By.cssSelector("#security-yes");
	By nameOnCard = By.cssSelector("#cardholder-name");
	By cardNumber = By.cssSelector("#card-number");
	By ccExpDate = By.cssSelector("#expiration-date");
	By ccCvv = By.cssSelector("#cvv");
	By myOrders = By.xpath("//a[contains(text(),'My Orders')]");
	By orderNumber = By.cssSelector("table.order:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > p:nth-child(2)");
	By dateAndTime = By.cssSelector("table.order:nth-child(1) > tr:nth-child(1) > td:nth-child(3) > p:nth-child(2)");
	By total = By.cssSelector("table.order:nth-child(1) > tr:nth-child(1) > td:nth-child(4) > p:nth-child(2)");
	By invoice = By.cssSelector("table.order:nth-child(1) > tr:nth-child(1) > td:nth-child(5) > a:nth-child(1)");
	By forgotPassword = By.className("blue-link");
	By saveProfileConfirmation = By.cssSelector(".alert-container");
	By editProfile = By.cssSelector("#app > div > div.admin-outer-container > div.admin-container > div.admin-sidebar-container > ul > li.sidebar-profile > a");
	By myAccount = By.cssSelector("#app > div > div.homepage-container > header > nav > div:nth-child(7) > a");
	By customizeLink = By.id("customize-order");
	By orderAgainLink = By.id("order-again");
	
	
	
	public ClientPortal(WebDriver driver) {
		this.driver = driver;
		waitHelper = new WaitHelper(driver);
	}
	
	public WebElement orderAgainLink()
	{
		return driver.findElement(orderAgainLink);
	}
	
	public WebElement customizeLink()
	{
		return driver.findElement(customizeLink);
	}
	
	
	public WebElement myAccount()
	{
		return driver.findElement(myAccount);
	}
	
	
	public WebElement editProfile()
	{
		return driver.findElement(editProfile);
	}
	
	
	public WebElement saveProfileConfirmation()
	{
		return driver.findElement(saveProfileConfirmation);
	}
	
	
	public WebElement forgotPassword()
	{
		return driver.findElement(forgotPassword);
	}

	
	public WebElement marketplace()
	{
		return driver.findElement(marketplace);
	}

public WebElement logOut()
	{
		return driver.findElement(logOut);
	}


public WebElement firstName()
	{
		return driver.findElement(firstName);
	}


public WebElement lastName()
	{
		return driver.findElement(lastName);
	}


public WebElement phone()
	{
		return driver.findElement(phone);
	}


public WebElement email()
	{
		return driver.findElement(email);
	}


public WebElement company()
	{
		return driver.findElement(company);
	}


public WebElement address()
	{
		return driver.findElement(address);
	}


public WebElement suite()
	{
		return driver.findElement(suite);
	}


public WebElement city()
	{
		return driver.findElement(city);
	}


public WebElement state()
	{
		return driver.findElement(state);
	}


public WebElement zipCode()
	{
		return driver.findElement(zipCode);
	}


public WebElement yesUtenslsNapkinsPlates()
	{
		return driver.findElement(yesUtenslsNapkinsPlates);
	}


public WebElement noUtensilsNapkinsPlates()
	{
		return driver.findElement(noUtensilsNapkinsPlates);
	}


public WebElement addNewCard()
	{
		return driver.findElement(addNewCard);
	}


public WebElement save()
	{
		return driver.findElement(save);
	}


public WebElement deliveryInstructions()
	{
		return driver.findElement(deliveryInstructions);
	}


public WebElement loadingDockAccess()
	{
		return driver.findElement(loadingDockAccess);
	}


public WebElement frontDoorAccess()
	{
		return driver.findElement(frontDoorAccess);
	}




public WebElement sideDoorAccess()
	{
		return driver.findElement(sideDoorAccess);
	}

public WebElement noSecurityCheckin()
	{
		return driver.findElement(noSecurityCheckin);
	}

public WebElement yesSecurityCheckin()
	{
		return driver.findElement(yesSecurityCheckin);
	}

public WebElement nameOnCard()
	{
		return driver.findElement(nameOnCard);
	}

public WebElement cardNumber()
	{
		return driver.findElement(cardNumber);
	}

public WebElement ccExpDate()
	{
		return driver.findElement(ccExpDate);
	}

public WebElement ccCvv()
	{
		return driver.findElement(ccCvv);
	}

public WebElement myOrders()
	{
		return driver.findElement(myOrders);
	}

public WebElement orderNumber()
	{
		return driver.findElement(orderNumber);
	}

public WebElement dateAndTime()
	{
		return driver.findElement(dateAndTime);
	}

public WebElement total()
	{
		return driver.findElement(total);
	}

public WebElement invoice()
	{
		return driver.findElement(invoice);
	}


	
	
	
	
	
	
}
