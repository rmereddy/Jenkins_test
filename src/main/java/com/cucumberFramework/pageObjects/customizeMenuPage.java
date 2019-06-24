package com.cucumberFramework.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumberFramework.helper.WaitHelper;

public class customizeMenuPage {
	
	
	private WebDriver driver;

	WaitHelper waitHelper;
	
	By zipCode = By.cssSelector("#zip-code");
	By date = By.cssSelector(".react-datepicker__input-container > input:nth-child(1)");
	By previousMonth = By.cssSelector("a.react-datepicker__navigation:nth-child(2)");
	By nextMonth = By.cssSelector(".react-datepicker__navigation");
	By dayOne = By.xpath("//div[text() = '1']");
	By dayTen = By.xpath("//div[text() = '10']");
	By dayFifteen = By.xpath("//div[text() = '15']");
	By dayThirtyFirst = By.xpath("//div[text() = '31']");
	By howMany = By.cssSelector("#number-people");
	By setUpTime = By.cssSelector(".form-control");
	By setUpHoursUp = By.cssSelector("div.rdtCounter:nth-child(1) > span:nth-child(1)");
	By setUpHoursDown = By.cssSelector("div.rdtCounter:nth-child(1) > span:nth-child(3)");
	By setUpMinutesUp = By.cssSelector("div.rdtCounter:nth-child(3) > span:nth-child(1)");
	By setUpMinutesDown = By.cssSelector("div.rdtCounter:nth-child(3) > span:nth-child(3)");
	By setUpAmPm = By.cssSelector("div.rdtCounter:nth-child(4) > span:nth-child(1)");
	By setUpAmPmText = By.cssSelector("div.rdtCounter:nth-child(4) > div:nth-child(2)");
	By entreePrice = By.cssSelector(".menu-items-container > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1) > p:nth-child(1) > span:nth-child(1)");
	By entreeQTY = By.name("number of People");
	By secondEntreeQTY = By.xpath("(//input[@name='number of People'])[2]");
	By entreeTotal = By.cssSelector(".menu-items-container > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(3)");
	By sidesPrice = By.cssSelector(".menu-items-container > tr:nth-child(2) > td:nth-child(1) > p:nth-child(1) > span:nth-child(1)");
	By sidesQTY = By.xpath("(//input[@name='number of People'])[5]");
	By drinks =  By.className("Select-arrow-zone");
	By drinksOptionOne = By.xpath("//*[@id=\'react-select-40--option-0\']");
	By drinksQTY = By.xpath("//*[@id=\'app\']/div/div[2]/div/div[1]/div/div[2]/div[2]/div[4]/table/tbody[2]/tr[1]/td[2]/input");
	By sidesTotal = By.cssSelector(".menu-items-container > tr:nth-child(2) > td:nth-child(3)");
	By drinksTotal = By.cssSelector("//*[@id=\'app\']/div/div[2]/div/div[1]/div/div[2]/div[2]/div[4]/table/tbody[2]/tr[1]/td[3]");
	By deserts = By.cssSelector("#react-select-3--value > div:nth-child(1)");
	By desertsOptionOne = By.cssSelector("#react-select-3--option-0");
	By desertsQTY = By.xpath("(//input[@name='number of People'])[7]");
	By desertsTotal = By.cssSelector("tbody.select-container:nth-child(11) > tr:nth-child(1) > td:nth-child(3)");
	By chefnotes = By.cssSelector(".dietary-restrictions > textarea:nth-child(2)");
	By deliveryType = By.cssSelector("#react-select-11--value > div:nth-child(1)");
	By promoCode = By.cssSelector(".order-breakdown-promo-code__inner > input:nth-child(1)");
	By applyPromo = By.cssSelector(".order-breakdown-promo-code__inner > div:nth-child(2)");
	By tipPercent = By.cssSelector("button.tip-button:nth-child(4)");
	By tipBox = By.cssSelector("div.pricing:nth-child(4) > input:nth-child(2)");
	By salesTax = By.cssSelector("div.pricing:nth-child(6) > span:nth-child(2)");
	By invoiceTotal = By.cssSelector("span.bold");
	By continueButton = By.cssSelector("#app > div > div:nth-child(2) > div > div:nth-child(1) > div > div.modal-menu-card > div.modal-menu-card__inner > div.customize-menu-container > div.order-details-overview > div.continue-to-checkout > button");
	By continueButton2 = By.cssSelector("div.continue-to-checkout:nth-child(7) > button:nth-child(1)");
	By continueButton3 = By.cssSelector("div.continue-to-checkout:nth-child(4) > button:nth-child(1)");
	By continueButton4 = By.cssSelector("#app > div > div:nth-child(2) > div > div:nth-child(1) > div > div.modal-menu-card > div.modal-menu-card__inner > div.order-confirmation-container > div > div > button");
	By continueButton5 = By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[1]/div/div[2]/div[2]/div[4]/div[2]/div[7]/button");
	By continueButton6 = By.xpath("(//button[@class='continue-button'])");
	By continueButton7 = By.className("continue-button");
	By confirmOrder = By.cssSelector(".confirm-order");
	By chefName = By.cssSelector(".chef-name > p:nth-child(1)");
	By chefImage = By.cssSelector(".image-container > img:nth-child(1)");
	By confirmOrderDetails = By.cssSelector(".order-details");
	By confirmOrderContinueButton = By.cssSelector("div.continue-to-checkout:nth-child(4) > button:nth-child(1)");
	By backButtonCheckoutPage = By.cssSelector("p.back-button");
	By customizeMenuHeader = By.cssSelector(".card-header");
	By adjustQuantities = By.cssSelector("button.continue-button:nth-child(3)");
	
	
	
	
	
	
	
	
	
	public customizeMenuPage(WebDriver driver) {
		this.driver = driver;
		waitHelper = new WaitHelper(driver);
	}
	
	public WebElement customizeMenuHeader ()
	{
		return driver.findElement(customizeMenuHeader );
	}
	
	public WebElement continueButton2 ()
	{
		return driver.findElement(continueButton2 );
	}
	public WebElement continueButton7 ()
	{
		return driver.findElement(continueButton7 );
	}
	
	public WebElement continueButton3 ()
	{
		return driver.findElement(continueButton3 );
	}
	
	public WebElement continueButton4 ()
	{
		return driver.findElement(continueButton4 );
	}
	
	public WebElement continueButton5 ()
	{
		return driver.findElement(continueButton5 );
	}
	
	public WebElement continueButton6 ()
	{
		return driver.findElement(continueButton6 );
	}
	
	
	public WebElement adjustQuantities ()
	{
		return driver.findElement(adjustQuantities );
	}
	
	
	public WebElement zipCode ()
	{
		return driver.findElement(zipCode );
	}
	
	public WebElement date ()
	{
		return driver.findElement(date );
	}
	
	public WebElement previousMonth ()
	{
		return driver.findElement(previousMonth );
	}
	
	public WebElement nextMonth ()
	{
		return driver.findElement(nextMonth );
	}
	
	public WebElement dayOne ()
	{
		return driver.findElement(dayOne );
	}
	
	public WebElement dayTen ()
	{
		return driver.findElement(dayTen );
	}
	
	public WebElement dayFifteen ()
	{
		return driver.findElement(dayFifteen );
	}
	
	public WebElement dayThirtyFirst ()
	{
		return driver.findElement(dayThirtyFirst );
	}
	
	public WebElement howMany ()
	{
		return driver.findElement(howMany );
	}
	
	public WebElement setUpTime ()
	{
		return driver.findElement(setUpTime );
	}
	
	public WebElement setUpHoursUp ()
	{
		return driver.findElement(setUpHoursUp );
	}
	
	public WebElement setUpHoursDown ()
	{
		return driver.findElement(setUpHoursDown );
	}
	
	public WebElement setUpMinutesUp ()
	{
		return driver.findElement(setUpMinutesUp );
	}
	
	public WebElement setUpMinutesDown ()
	{
		return driver.findElement(setUpMinutesDown );
	}
	
	public WebElement setUpAmPm ()
	{
		return driver.findElement(setUpAmPm );
	}
	
	public WebElement setUpAmPmText ()
	{
		return driver.findElement(setUpAmPmText );
	}
	
	public WebElement entreePrice ()
	{
		return driver.findElement(entreePrice );
	}
	
	public List<WebElement> entreeQTY ()
	{
		return driver.findElements(entreeQTY );
	}
	
	public WebElement entreeTotal ()
	{
		return driver.findElement(entreeTotal );
	}
	
	public WebElement sidesPrice ()
	{
		return driver.findElement(sidesPrice );
	}
	
	public WebElement sidesQTY ()
	{
		return driver.findElement(sidesQTY );
	}
	
	public WebElement drinks ()
	{
		return driver.findElement(drinks );
	}
	
	public WebElement drinksQTY ()
	{
		return driver.findElement(drinksQTY );
	}
	
	public WebElement sidesTotal ()
	{
		return driver.findElement(sidesTotal );
	}
	
	public WebElement drinksTotal ()
	{
		return driver.findElement(drinksTotal );
	}
	
	public WebElement deserts ()
	{
		return driver.findElement(deserts );
	}
	
	public WebElement desertsQTY ()
	{
		return driver.findElement(desertsQTY );
	}
	
	public WebElement desertsTotal ()
	{
		return driver.findElement(desertsTotal );
	}
	
	public WebElement chefnotes ()
	{
		return driver.findElement(chefnotes );
	}
	
	public WebElement deliveryType ()
	{
		return driver.findElement(deliveryType );
	}
	
	public WebElement promoCode ()
	{
		return driver.findElement(promoCode );
	}
	
	public WebElement applyPromo ()
	{
		return driver.findElement(applyPromo );
	}
	
	public WebElement tipPercent ()
	{
		return driver.findElement(tipPercent );
	}
	
	public WebElement tipBox ()
	{
		return driver.findElement(tipBox );
	}
	
	public WebElement salesTax ()
	{
		return driver.findElement(salesTax );
	}
	
	public WebElement invoiceTotal ()
	{
		return driver.findElement(invoiceTotal );
	}
	
	public WebElement continueButton ()
	{
		return driver.findElement(continueButton );
	}
	
	public WebElement confirmOrder ()
	{
		return driver.findElement(confirmOrder );
	}
	
	public WebElement chefName ()
	{
		return driver.findElement(chefName );
	}
	
	public WebElement chefImage ()
	{
		return driver.findElement(chefImage );
	}
	
	public WebElement confirmOrderDetails ()
	{
		return driver.findElement(confirmOrderDetails );
	}
	
	public WebElement confirmOrderContinueButton ()
	{
		return driver.findElement(confirmOrderContinueButton );
	}
	
	public WebElement secondEntreeQTY()
	{
		return driver.findElement(secondEntreeQTY);
	}
	
	
	public WebElement drinksOptionOne()
	{
		return driver.findElement(drinksOptionOne);
	}
	
	public WebElement desertsOptionOne()
	{
		return driver.findElement(desertsOptionOne);
	}
	
	
	 
	 public WebElement backButtonCheckoutPage()
	
	{
		return driver.findElement(backButtonCheckoutPage);
	}
	
	

}
