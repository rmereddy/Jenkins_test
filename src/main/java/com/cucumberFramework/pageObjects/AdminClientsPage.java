package com.cucumberFramework.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumberFramework.helper.WaitHelper;

public class AdminClientsPage {
	private WebDriver driver;

	WaitHelper waitHelper;

	By addNewCient = By.className("add-new-button");
	By accountNameInputBox = By.id("account-name");
	By numberOfEmployeesInputBox = By.id("number-of-employees");
	By averagePricePerPersonInputBox = By.xpath("//input[@value='$0']");
	By taxExemptCheckBox = By.id("isTaxExempt");
	By netPaymentCheckBox = By.id("netPayment");
	By payByCheckCheckBox = By.id("payByCheck");
	By callOnArrivalCheckBox = By.id("callOnArrival");
	By needUtensilsNoRadioButton = By.id("needs-napkins-and-plates-No");
	By needUtensilsYesRadioButton = By.id("needs-napkins-and-plates-Yes");
	By needsServingUtensilsYesRadio = By.id("needs-serving-utensils-Yes");
	By needsServingUtensilsNoRadio = By.id("needs-serving-utensils-No");
	By parkingInstructions = By.xpath("//div[@class='form-field-container__columns']//textarea");
	By addressLine1 = By.id("address-line-1");
	By addressLine2 = By.id("address-line-2");
	By city = By.id("city");
	By state = By.id("state");
	By zipcode = By.id("zipcode");
	By buildingInstructions = By.id("building-instructions");
	By addAnotherAddressLink = By.xpath("//*[@id=\'add-another-address\']");
	By title = By.id("title");
	By firstName = By.id("first-name");
	By lastName = By.id("last-name");
	By phoneNumber = By.id("phone-number");
	By email = By.id("email");
	By purchaserTaxStatus = By.id("purchaser-tax-status");
	By addNewContactLink = By.id("add-new-contact");
	By addExistingContactLink = By.id("add-existing-contact");
	By cardHolderName = By.id("cardholder-name");
	By cardNumber = By.id("card-number");
	By expirationDate = By.id("expiration-date");
	By cvv = By.id("cvv");
	By addAnotherPaymentMethod = By.id("add-another-payment-method");
	By overviwAccountName = By.id("account-name");
	By overviewAveragePricePerPerson = By.id("average-price-per-person");
	By overviewTaxExempt = By.id("isTaxExempt");
	By overviewCallOnArrival = By.id("callOnArrival");
	By overviewNeedsUtensils = By.id("needs-utensils");
	By overviewNeedUtensilsNapkins = By.id("needs-napkins-and-plates");
	By overviewParkingInstructions = By.id("parking-instructions");
	By overviwAddress = By.id("addresses");
	By overviewPaymentMethods = By.id("payment-methods");
	By contacts = By.id("contacts");
	By promoCodesTab = By.id("//*[@id=\'account-tabs-tab-#promo\']");
	By clientsLink = By.xpath("//a[contains(text(),'Clients')]");
	By recurringPaymentPeriodSelect = By.id("recurring-payment-period");
	By paymentPeriodLenght = By.id("payment-period-length");
	By net = By.id("net");
	
	
	

	
	
	
	
	public AdminClientsPage(WebDriver driver) {
		this.driver = driver;
		waitHelper = new WaitHelper(driver);
	}
	
	public WebElement net ()
	{
		return driver.findElement(net   );
	}
	
	public WebElement paymentPeriodLenght ()
	{
		return driver.findElement(paymentPeriodLenght   );
	}
	
	public WebElement recurringPaymentPeriodSelect ()
	{
		return driver.findElement(recurringPaymentPeriodSelect   );
	}
	
	
	public WebElement clientsLink ()
	{
		return driver.findElement(clientsLink   );
	}
	
	
	public WebElement addNewCient ()
	{
		return driver.findElement(addNewCient   );
	}
	
	public WebElement accountNameInputBox   ()
	{
		return driver.findElement(accountNameInputBox   );
	}
	
	public WebElement numberOfEmployeesInputBox   ()
	{
		return driver.findElement(numberOfEmployeesInputBox   );
	}
	
	public WebElement averagePricePerPersonInputBox   ()
	{
		return driver.findElement(averagePricePerPersonInputBox   );
	}
	
	public WebElement taxExemptCheckBox   ()
	{
		return driver.findElement(taxExemptCheckBox   );
	}
	
	public WebElement netPaymentCheckBox   ()
	{
		return driver.findElement(netPaymentCheckBox   );
	}
	
	public WebElement payByCheckCheckBox   ()
	{
		return driver.findElement(payByCheckCheckBox   );
	}
	
	public WebElement callOnArrivalCheckBox   ()
	{
		return driver.findElement(callOnArrivalCheckBox   );
	}
	
	public WebElement needUtensilsNoRadioButton   ()
	{
		return driver.findElement(needUtensilsNoRadioButton   );
	}
	
	public WebElement needUtensilsYesRadioButton   ()
	{
		return driver.findElement(needUtensilsYesRadioButton   );
	}
	
	public WebElement needsServingUtensilsYesRadio   ()
	{
		return driver.findElement(needsServingUtensilsYesRadio   );
	}
	
	public WebElement needsServingUtensilsNoRadio   ()
	{
		return driver.findElement(needsServingUtensilsNoRadio   );
	}
	
	public WebElement parkingInstructions   ()
	{
		return driver.findElement(parkingInstructions   );
	}
	
	public WebElement addressLine1   ()
	{
		return driver.findElement(addressLine1   );
	}
	
	public WebElement addressLine2    ()
	{
		return driver.findElement(addressLine2   );
	}
	
	public WebElement city    ()
	{
		return driver.findElement(city   );
	}
	
	public WebElement state  ()
	{
		return driver.findElement(state  );
	}
	
	public WebElement zipcode  ()
	{
		return driver.findElement(zipcode  );
	}
	
	public WebElement buildingInstructions   ()
	{
		return driver.findElement(buildingInstructions   );
	}
	
	public WebElement addAnotherAddressLink   ()
	{
		return driver.findElement(addAnotherAddressLink   );
	}
	
	public WebElement title   ()
	{
		return driver.findElement(title   );
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
	
	public WebElement purchaserTaxStatus    ()
	{
		return driver.findElement(purchaserTaxStatus    );
	}
	
	public WebElement addNewContactLink   ()
	{
		return driver.findElement(addNewContactLink   );
	}
	
	public WebElement addExistingContactLink   ()
	{
		return driver.findElement(addExistingContactLink   );
	}
	
	public WebElement cardHolderName   ()
	{
		return driver.findElement(cardHolderName   );
	}
	
	public WebElement cardNumber   ()
	{
		return driver.findElement(cardNumber   );
	}
	
	public WebElement expirationDate    ()
	{
		return driver.findElement(expirationDate    );
	}
	
	public WebElement cvv   ()
	{
		return driver.findElement(cvv  );
	}
	
	public WebElement addAnotherPaymentMethod   ()
	{
		return driver.findElement(addAnotherPaymentMethod   );
	}
	
	public WebElement overviwAccountName   ()
	{
		return driver.findElement(overviwAccountName   );
	}
	
	public WebElement overviewAveragePricePerPerson   ()
	{
		return driver.findElement(overviewAveragePricePerPerson   );
	}
	
	public WebElement overviewTaxExempt   ()
	{
		return driver.findElement(overviewTaxExempt   );
	}
	
	public WebElement overviewCallOnArrival   ()
	{
		return driver.findElement(overviewCallOnArrival   );
	}
	
	public WebElement overviewNeedsUtensils   ()
	{
		return driver.findElement(overviewNeedsUtensils );
	}
	
	public WebElement overviewNeedUtensilsNapkins   ()
	{
		return driver.findElement(overviewNeedUtensilsNapkins   );
	}
	
	public WebElement overviewParkingInstructions   ()
	{
		return driver.findElement(overviewParkingInstructions   );
	}
	
	public WebElement overviwAddress   ()
	{
		return driver.findElement(overviwAddress   );
	}
	
	public WebElement overviewPaymentMethods   ()
	{
		return driver.findElement(overviewPaymentMethods   );
	}
	
	public WebElement contacts   ()
	{
		return driver.findElement(contacts   );
	}
	
	public WebElement promoCodesTab   ()
	{
		return driver.findElement(promoCodesTab   );
	}
	

	public WebElement emaiil   ()
	{
		return driver.findElement(email   );
	}

}
