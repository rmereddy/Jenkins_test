package com.cucumberFramework.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumberFramework.helper.WaitHelper;

public class NetAndMultiOrderPage {
	
	private WebDriver driver;

	WaitHelper waitHelper;
	
	
	By multinetOrderLink = By.xpath("//a[contains(text(),'Multi & Net Orders')]");
	By pageTitle = By.xpath("//h2[@class='page-title']");
	By addNewMultiNetOrder = By.xpath("//a[@class='add-new-button']");
	By orderTypeDropdown = By.xpath("//div[@class='status-search']//select");
	By searchOrder = By.xpath("//input[@placeholder='MULT-, acct name, start/end date']");
	By firstOrderNumber = By.cssSelector("div.body-container div.children-container div.children-container__inner div.page-columns div.page-buttons-container div.search-field div:nth-child(1) div.search-input-field__results div.list-item:nth-child(1) div:nth-child(1) > span.extra-bold:nth-child(1)");
	By firstOrder = By.xpath("//div[@class='search-input-field__results']//div[1]//div[1]");
	By orderOverviewOrderNumber = By.xpath("//span[@class='list-group-item']//span[contains(text(),'MWAS003')]");
	By salesRepName = By.id("account-executive");
	By clientName = By.id("client-name");
	By overviewSubtotal = By.xpath("div.body-container div.children-container div.children-container__inner div.page-columns div.tabs-container:nth-child(3) div.details-tab div.tabs div.tab-content div.tab-pane.active div.tab-content-column-container:nth-child(3) div.tab-content-column__single:nth-child(2) div.list-group:nth-child(21) span.list-group-item:nth-child(2) > span:nth-child(2)");
	By overviewDeliveryfee = By.xpath("div.body-container div.children-container div.children-container__inner div.page-columns div.tabs-container:nth-child(3) div.details-tab div.tabs div.tab-content div.tab-pane.active div.tab-content-column-container:nth-child(3) div.tab-content-column__single:nth-child(2) div.list-group:nth-child(21) span.list-group-item:nth-child(3) > span:nth-child(2)");
	By overviewTax = By.xpath("div.body-container div.children-container div.children-container__inner div.page-columns div.tabs-container:nth-child(3) div.details-tab div.tabs div.tab-content div.tab-pane.active div.tab-content-column-container:nth-child(3) div.tab-content-column__single:nth-child(2) div.list-group:nth-child(21) span.list-group-item:nth-child(4) > span:nth-child(2)");
	By overviewTip = By.xpath("div.body-container div.children-container div.children-container__inner div.page-columns div.tabs-container:nth-child(3) div.details-tab div.tabs div.tab-content div.tab-pane.active div.tab-content-column-container:nth-child(3) div.tab-content-column__single:nth-child(2) div.list-group:nth-child(21) span.list-group-item:nth-child(5) > span:nth-child(2)");
	By overviewTotal = By.xpath("div.body-container div.children-container div.children-container__inner div.page-columns div.tabs-container:nth-child(3) div.details-tab div.tabs div.tab-content div.tab-pane.active div.tab-content-column-container:nth-child(3) div.tab-content-column__single:nth-child(2) div.list-group:nth-child(21) span.list-group-item:nth-child(6) > span:nth-child(2)");
	By editButton = By.id("edit-order");
	By deleteButton = By.id("delete-order");
	By customerAccountDropDown = By.xpath("//div[@class='dropdown']//div//div//input[@type='text']");
	By customerAccountFirstSelect = By.xpath("//li[contains(text(),'Test Company Tahiru')]");
	By AddNewAccount = By.xpath("//button[contains(text(),'Add New Account')]");
	By startDate = By.xpath("//body[@class='modal-open']/div/div[@role='dialog']/div[@class='fade in modal']/div[@class='menuConceptModal order-modal modal-dialog']/div[@class='modal-content']/div[@class='modal-body']/div/div[@class='columns-container']/div[@class='columns-container__single']/div[@class='form-field-container']/div[1]/div[1]/div[1]/input[1]");
	By day6 = By.cssSelector("body > div:nth-child(4) > div > div.fade.in.modal > div > div > div.modal-body > div:nth-child(3) > div > div:nth-child(1) > div > div:nth-child(1) > div > div > div > div.flatpickr-innerContainer > div > div.flatpickr-days > div.dayContainer.slideLeftNew > span:nth-child(7)");
	By endDate = By.xpath("//body[@class='modal-open']/div/div[@role='dialog']/div[@class='fade in modal']/div[@class='menuConceptModal order-modal modal-dialog']/div[@class='modal-content']/div[@class='modal-body']/div/div[@class='columns-container']/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]");
	By endDay28 = By.cssSelector("body > div:nth-child(4) > div > div.fade.in.modal > div > div > div.modal-body > div:nth-child(3) > div > div:nth-child(1) > div > div:nth-child(2) > div > div > div > div.flatpickr-innerContainer > div > div.flatpickr-days > div.dayContainer.slideLeftNew > span:nth-child(29)");
	By netOffSet = By.xpath("//body[@class='modal-open']/div/div[@role='dialog']/div[@class='fade in modal']/div[@class='menuConceptModal order-modal modal-dialog']/div[@class='modal-content']/div[@class='modal-body']/div/div[@class='columns-container']/div[@class='columns-container__single']/div[@class='form-field-container']/div[@class='form-field-container__columns']/div/input[1]");
	By choosePaymentDropDown = By.xpath("//div[@class='dropdown false']//div//select");
	By POreferenceInputBox = By.xpath("//div[@class='form-field-container__columns']//textarea");
	By searchOrderInEdit = By.xpath("//input[@placeholder='Search by order number...']");
	By plusSign = By.xpath("//*[@id=\"add-bundled-order\"]/span");
	By minusSign = By.className("minus-sign");
	By editSubtotal = By.className("subtotal");
	By editDeliveryFee = By.cssSelector("body > div:nth-child(5) > div > div.fade.in.modal > div > div > div.modal-body > div:nth-child(4) > div > div.columns-container__single > div > div > div:nth-child(1) > div:nth-child(2) > input[type=\"text\"]");
	By editTip = By.cssSelector("body > div:nth-child(5) > div > div.fade.in.modal > div > div > div.modal-body > div:nth-child(4) > div > div.columns-container__single > div > div > div:nth-child(1) > div:nth-child(4) > input[type=\"text\"]");
	By editTotal = By.cssSelector("body.modal-open:nth-child(2) div.fade.in.modal div.menuConceptModal.order-modal.modal-dialog div.modal-content div.modal-body div.columns-container div.columns-container__single:nth-child(2) div.total-section div.total-section__inner div:nth-child(1) div.total:nth-child(5) > span:nth-child(1)");
	By saveButton = By.id("save-order");
	By cancelButton =  By.cssSelector("//button[contains(text(),'Cancel')]");
	By sendInvoiceProposalPanel = By.cssSelector("#showOrderOverviewDiv > div.action-panel.undefined.panel.panel-warning > div.panel-heading > div");
	By sendInvoiceProposalPanel2 = By.className("panel-arrow");
	By chargeClientPanel = By.cssSelector("div.body-container div.children-container div.children-container__inner div.page-columns div.tabs-container:nth-child(3) div.details-tab div.tabs div.tab-content div.tab-pane.active div:nth-child(1) div.action-panel.undefined.panel.panel-warning:nth-child(2) > div.panel-heading");
	By chargeClientPanel2 = By.className("//body/div[@id='app']/div/div/div[@class='body-container']/div[@class='children-container']/div[@class='children-container__inner']/div/div[@class='page-columns']/div[@class='tabs-container']/div[@class='details-tab']/div[@id='batch_order_tab']/div[@class='tab-content']/div[@id='batch_order_tab-pane-#overview']/div[@id='showOrderOverviewDiv']/div[2]/div[1]	");
	By PDFlink = By.xpath("//a[@class='download-pdf']");
	By invoiceLink = By.xpath("//a[@class='link']");
	By invoiceCheckBox = By.xpath("//input[@value='false']");
	By emailInvoice = By.xpath("//button[contains(text(),'Email Invoice')]");
	By ExtPaymentDropDown = By.xpath("//div[@class='panel-body']//div//center//div//select");
	By payViaExtButton = By.xpath("//button[contains(text(),'Pay Via External Method')]");
	By changePaymentMethodButton = By.xpath("//button[contains(text(),'Change Payment Method')]");
	By chargeClientButton = By.xpath("//button[@class='button-primary']");
	By paymentConfirmation = By.xpath("//h3[contains(text(),'Order has been paid!')]");
	By clienteditpage = By.className("modal-content");

	
	
	
	
	
	
	
	
	public NetAndMultiOrderPage(WebDriver driver) {
		this.driver = driver;
		waitHelper = new WaitHelper(driver);
	}
	
	public WebElement chargeClientPanel2()
	{
		return driver.findElement( chargeClientPanel2);
	}
	
	public WebElement clienteditpage()
	{
		return driver.findElement( clienteditpage);
	}

public WebElement multinetOrderLink()
{
	return driver.findElement( multinetOrderLink);
}

public WebElement pageTitle()
{
	return driver.findElement( pageTitle);
}

public WebElement addNewMultiNetOrder()
{
	return driver.findElement(addNewMultiNetOrder);
}


public WebElement orderTypeDropdown()
{
	return driver.findElement(orderTypeDropdown);
}

public WebElement searchOrder()
{
	return driver.findElement(searchOrder);
}


public WebElement firstOrderNumber()
{
	return driver.findElement(firstOrderNumber);
}

public WebElement firstOrder()
{
	return driver.findElement(firstOrder);
}

public WebElement orderOverviewOrderNumber()
{
	return driver.findElement(orderOverviewOrderNumber);
}


public WebElement salesRepName()
{
	return driver.findElement(salesRepName);
}

public WebElement clientName()
{
	return driver.findElement(clientName);
}


public WebElement overviewSubtotal()
{
	return driver.findElement(overviewSubtotal);
}

public WebElement overviewDeliveryfee()
{
	return driver.findElement(overviewDeliveryfee);
}

public WebElement overviewTax()
{
	return driver.findElement(overviewTax);
}


public WebElement overviewTip()
{
	return driver.findElement(overviewTip);
}

public WebElement overviewTotal()
{
	return driver.findElement(overviewTotal);
}


public WebElement editButton()
{
	return driver.findElement(editButton);
}

public WebElement deleteButton()
{
	return driver.findElement(deleteButton);
}

public WebElement customerAccountDropDown()
{
	return driver.findElement(customerAccountDropDown);
}


public WebElement customerAccountFirstSelect()
{
	return driver.findElement(customerAccountFirstSelect);
}

public WebElement AddNewAccount()
{
	return driver.findElement(AddNewAccount);
}


public WebElement startDate()
{
	return driver.findElement(startDate);
}

public WebElement day6()
{
	return driver.findElement(day6);
}

public WebElement endDate()
{
	return driver.findElement(endDate);
}


public WebElement endDay28()
{
	return driver.findElement(endDay28);
}

public WebElement netOffSet()
{
	return driver.findElement(netOffSet);
}


public WebElement choosePaymentDropDown()
{
	return driver.findElement(choosePaymentDropDown);
}

public WebElement POreferenceInputBox()
{
	return driver.findElement(POreferenceInputBox);
}

public WebElement searchOrderInEdit()
{
	return driver.findElement(searchOrderInEdit);
}


public List<WebElement> plusSign()
{
	return driver.findElements(plusSign);
}



public WebElement minusSign()
{
	return driver.findElement(minusSign);
}


public WebElement editSubtotal()
{
	return driver.findElement(editSubtotal);
}

public WebElement editDeliveryFee()
{
	return driver.findElement(editDeliveryFee);
}

public WebElement editTip()
{
	return driver.findElement(editTip);
}


public WebElement editTotal()
{
	return driver.findElement(editTotal);
}

public WebElement saveButton()
{
	return driver.findElement(saveButton);
}


public WebElement cancelButton()
{
	return driver.findElement(cancelButton);
}

public WebElement sendInvoiceProposalPanel()
{
	return driver.findElement(sendInvoiceProposalPanel);
}

public WebElement sendInvoiceProposalPanel2()
{
	return driver.findElement(sendInvoiceProposalPanel2);
}

public WebElement chargeClientPanel()
{
	return driver.findElement(chargeClientPanel);
}


public WebElement PDFlink()
{
	return driver.findElement(PDFlink);
}

public WebElement invoiceLink()
{
	return driver.findElement(invoiceLink);
}


public WebElement invoiceCheckBox()
{
	return driver.findElement(invoiceCheckBox);
}

public WebElement emailInvoice()
{
	return driver.findElement(emailInvoice);
}

public WebElement ExtPaymentDropDown()
{
	return driver.findElement(ExtPaymentDropDown);
}


public WebElement payViaExtButton()
{
	return driver.findElement(payViaExtButton);
}

public WebElement changePaymentMethodButton()
{
	return driver.findElement(changePaymentMethodButton);
}


public WebElement chargeClientButton()
{
	return driver.findElement(chargeClientButton);
}

public WebElement paymentConfirmation()
{
	return driver.findElement(paymentConfirmation);
}
	

}
