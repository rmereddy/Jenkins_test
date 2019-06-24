package com.cucumberFramework.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumberFramework.helper.WaitHelper;

public class orderConfirmationPage {
	
	private WebDriver driver;

	WaitHelper waitHelper;
	
	By orderNumber = By.cssSelector(".market-place-title-container > div:nth-child(3) > p:nth-child(1)");
	By numberOfpeople = By.cssSelector("span.bold:nth-child(2)");
	By date = By.cssSelector("span.bold:nth-child(3)");
	By time = By.cssSelector("span.bold:nth-child(4)");
	By entreeOneAmount = By.cssSelector("div.receipt-item:nth-child(2) > p:nth-child(2)");
	By entreeTwoAmount = By.cssSelector("div.receipt-item:nth-child(3) > p:nth-child(2)");
	By subtotal = By.cssSelector("p.bold:nth-child(2)");
	By deliveryTypeFee = By.cssSelector("div.receipt-item:nth-child(5) > p:nth-child(2)");
	By tax = By.cssSelector("div.receipt-item:nth-child(6) > p:nth-child(2)");
	By tip = By.cssSelector("div.receipt-item:nth-child(7) > p:nth-child(2)");
	By total = By.cssSelector(".green");
	By chefInstructions = By.cssSelector("p.receipt-details-description:nth-child(4)");
	By deliveryInstructions = By.cssSelector("p.receipt-details-description:nth-child(6)");
	By buildingAccess = By.cssSelector("div.receipt-details:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > p:nth-child(4)");
	By securityCheckin = By.cssSelector("div.receipt-details:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > p:nth-child(5)");
	By utensilsNapkinsPlates = By.cssSelector("div.receipt-details:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > p:nth-child(6)");
	By servingUtensils = By.cssSelector("div.receipt-details:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > p:nth-child(7)");
	
	
	
	
	
	
	
	
	
	
	
	public orderConfirmationPage(WebDriver driver) {
		this.driver = driver;
		waitHelper = new WaitHelper(driver);
	}

}
