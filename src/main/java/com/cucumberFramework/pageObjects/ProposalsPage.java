package com.cucumberFramework.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumberFramework.helper.WaitHelper;

public class ProposalsPage {
	
	private WebDriver driver;

	WaitHelper waitHelper;
	
	
	By proposalsLink = By.xpath("//a[contains(text(),'Proposals')]");
	By createOrderButton = By.cssSelector("#showOrderOverviewDiv > div.page > center > button:nth-child(2)");
	By proposalNumber = By.id("proposal-number");
	By chefName = By.id("chef-name");
	By clientName = By.id("client-name");
	By subtotal = By.id("subtotal");
	By total = By.id("total");
	By chefInstructions = By.id("chef-instructions");
	By proposalstatuspanel = By.cssSelector("#showOrderOverviewDiv > div.action-panel.undefined.panel.panel-warning > div.panel-heading > div > a");
	By proposalNumber1 = By.cssSelector("#showOrderOverviewDiv > div.tab-content-column-container > div:nth-child(1) > div:nth-child(1) > span:nth-child(2) > span:nth-child(2)");
	By chefName1 = By.cssSelector("#showOrderOverviewDiv > div.tab-content-column-container > div:nth-child(2) > div:nth-child(1) > div > span:nth-child(2) > span:nth-child(2)");
	By clientName1 = By.id("client-name");
	By subtotal1 = By.id("subtotal");
	By total1 = By.id("total");
	By chefInstructions1 = By.id("chef-instructions");
	By proposalInvoiceLink = By.cssSelector("#showOrderOverviewDiv > div.action-panel.undefined.panel.panel-warning > div.panel-collapse.collapse.in > div > div > div > a");
	By sendProposalsInvoiceButton = By.cssSelector("#showOrderOverviewDiv > div.action-panel.undefined.panel.panel-warning > div.panel-collapse.collapse.in > div > div > div > button");
	By createOrderConfirmation= By.cssSelector("div > div > p");

	
	
	
	public ProposalsPage(WebDriver driver) {
		this.driver = driver;
		waitHelper = new WaitHelper(driver);
	}
	
	
	public WebElement proposalstatuspanel()
	{
		return driver.findElement(proposalstatuspanel);
	}
	
	
	public WebElement proposalInvoiceLink()
	{
		return driver.findElement(proposalInvoiceLink);
	}
	
	public WebElement sendProposalsInvoiceButton()
	{
		return driver.findElement(sendProposalsInvoiceButton);
	}
	
	public WebElement createOrderConfirmation()
	{
		return driver.findElement(createOrderConfirmation);
	}
	
	public WebElement proposalsLink()
	{
		return driver.findElement(proposalsLink);
	}
	
	
	public WebElement createOrderButton()
	{
		return driver.findElement(createOrderButton);
	}
	
	public WebElement proposalNumber()
	{
		return driver.findElement(proposalNumber);
	}
	
	public WebElement chefName()
	{
		return driver.findElement(chefName);
	}
	
	public WebElement clientName()
	{
		return driver.findElement(clientName);
	}
	
	public WebElement total()
	{
		return driver.findElement(total);
	}
	
	
	public WebElement subtotal()
	{
		return driver.findElement(subtotal);
	}
	
	public WebElement chefInstructions()
	{
		return driver.findElement(chefInstructions);
	}
	
	public WebElement proposalNumber1()
	{
		return driver.findElement(proposalNumber1);
	}
	
	public WebElement chefName1()
	{
		return driver.findElement(chefName1);
	}
	
	public WebElement clientName1()
	{
		return driver.findElement(clientName1);
	}
	
	public WebElement total1()
	{
		return driver.findElement(total1);
	}
	
	
	public WebElement subtotal1()
	{
		return driver.findElement(subtotal1);
	}
	
	public WebElement chefInstructions1()
	{
		return driver.findElement(chefInstructions1);
	}
	
}
