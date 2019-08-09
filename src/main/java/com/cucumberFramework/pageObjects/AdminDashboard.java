package com.cucumberFramework.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumberFramework.helper.WaitHelper;

public class AdminDashboard {
	private WebDriver driver;

	WaitHelper waitHelper;

	By dashboardLink = By.xpath("//a[contains(text(),'Dashboard')]");
	By servicesTab = By.xpath("//a[contains(text(),'Services')]");
	By accountingTab = By.xpath("//a[contains(text(),'Accounting')]");
	By accountingReceivableTab = By.xpath("//a[contains(text(),'Accounts Receivable')]");
	By fromDate = By.cssSelector("#app > div > div:nth-child(2) > div > div > div > div > div > div > div > div:nth-child(3) > div > div.table-filters > div > div.date-filters > div > div:nth-child(2) > div > input");
	By toDate = By.cssSelector("#app > div > div:nth-child(2) > div > div > div > div > div > div > div > div:nth-child(3) > div > div.table-filters > div > div.date-filters > div > div:nth-child(4) > div > input");
	By today = By.xpath("//span[@class='flatpickr-day today']");
	By orderNumber = By.className("bold");
	By serviceInstructions = By.className("normal-text-area form-control");
	By ARsalesReps = By.id("name");
	By ARorderNumber = By.className("order-link");
	By companyName = By.className("//div[@class='account-receivable-table-container open']//tr[2]//td[3]");
	By searchBox = By.className("Select-placeholder");
	By selectNumberOfOrdersToDisplay = By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div/div/div/div/div[3]/div/div[1]/div/div[3]/div/select");
	
	
	

	
	
	
	
	public AdminDashboard(WebDriver driver) {
		this.driver = driver;
		waitHelper = new WaitHelper(driver);
	}
	
	public WebElement selectNumberOfOrdersToDisplay ()
	{
		return driver.findElement(selectNumberOfOrdersToDisplay   );
	}
	
	
	public WebElement searchBox ()
	{
		return driver.findElement(searchBox   );
	}
	
	
	
	public WebElement dashboardLink ()
	{
		return driver.findElement(dashboardLink   );
	}
	
	
	public WebElement servicesTab ()
	{
		return driver.findElement(servicesTab   );
	}
	
	public WebElement accountingTab ()
	{
		return driver.findElement(accountingTab   );
	}
	
	
	public WebElement accountingReceivableTab ()
	{
		return driver.findElement(accountingReceivableTab   );
	}
	
	
	public WebElement fromDate ()
	{
		return driver.findElement(fromDate   );
	}
	
	public WebElement toDate   ()
	{
		return driver.findElement(toDate   );
	}
	
	public WebElement today   ()
	{
		return driver.findElement(today   );
	}
	
	public List<WebElement> orderNumber   ()
	{
		return driver.findElements(orderNumber   );
	}
	
	public List<WebElement> serviceInstructions   ()
	{
		return driver.findElements(serviceInstructions   );
	}
	
	public List<WebElement> ARsalesReps   ()
	{
		return driver.findElements(ARsalesReps   );
	}
	
	public List<WebElement> ARorderNumber   ()
	{
		return driver.findElements(ARorderNumber   );
	}
	
	public List<WebElement> companyName   ()
	{
		return driver.findElements(companyName   );
	}

	
	
	

}
