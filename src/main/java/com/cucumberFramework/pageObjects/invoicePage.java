package com.cucumberFramework.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumberFramework.helper.WaitHelper;

public class invoicePage {
	private WebDriver driver;

	WaitHelper waitHelper;
	
	By invoiceHeader = By.cssSelector("<div class=\"invoice-title\"> INVOICE </div>");
	By orderNumber = By.cssSelector("div.invoice-container__content-order-details__group:nth-child(1) > div:nth-child(1) > span:nth-child(2)");
	By date = By.cssSelector("div.invoice-label:nth-child(2) > span:nth-child(2)");
	By time = By.cssSelector("div.invoice-label:nth-child(3) > span:nth-child(2)");
	By entreeOnePrice = By.cssSelector(".invoice-table > tr:nth-child(2) > td:nth-child(2)");
	By entreeTwoPrice = By.cssSelector(".invoice-table > tr:nth-child(3) > td:nth-child(2)");
	By entreeOneQTY = By.cssSelector(".invoice-table > tr:nth-child(2) > td:nth-child(3)");
	By entreeTwoQTY = By.cssSelector(".invoice-table > tr:nth-child(3) > td:nth-child(3)");
	By entreeOneTotal = By.cssSelector(".invoice-table > tr:nth-child(2) > td:nth-child(4)");
	By entreeTwoTotal = By.cssSelector(".invoice-table > tr:nth-child(3) > td:nth-child(4)");
	By subTotal = By.cssSelector(".container-total > table:nth-child(1) > tr:nth-child(1) > td:nth-child(2)");
	By deliveryFee = By.cssSelector(".container-total > table:nth-child(1) > tr:nth-child(2) > td:nth-child(2)");
	By tax = By.cssSelector(".container-total > table:nth-child(1) > tr:nth-child(3) > td:nth-child(2)");
	By tip = By.cssSelector(".container-total > table:nth-child(1) > tr:nth-child(4) > td:nth-child(2) > div:nth-child(1) > p:nth-child(1)");
	By total = By.cssSelector("td.container-total__item--bold:nth-child(2)");
	
	

	
	
	
	
	
	
	
	
	
	
	
	public invoicePage(WebDriver driver) {
		this.driver = driver;
		waitHelper = new WaitHelper(driver);
	}
	
}
