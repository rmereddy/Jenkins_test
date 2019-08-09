package com.cucumberFramework.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumberFramework.helper.WaitHelper;

public class adminSalesPage {
	private WebDriver driver;

	WaitHelper waitHelper;
	
	By salesLink = By.xpath("//a[contains(text(),'Sales')]");
	By pageTitle = By.cssSelector(".page-title");
	By salesPagePrepopulatedOrder1 = By.cssSelector("div.card-container:nth-child(2) > div:nth-child(1)");
	By salesPagePrepopulatedOrder2 = By.cssSelector("div.card-container:nth-child(2) > div:nth-child(2)");
	By addNewOrderButton = By.cssSelector(".add-new-button");
	By newOrderPageHeader = By.cssSelector("#contained-modal-title-lg");
	By orderSalesRepDropdown = By.cssSelector(".modal-body > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)");
	By orderSalesRepDropdownFirstSelection = By.cssSelector(".modal-body > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(3) > li:nth-child(1)");
	By orderCustomerAccountDropdown = By.cssSelector("body > div:nth-child(4) > div > div.fade.in.modal > div > div > div.modal-body > div.columns-container > div:nth-child(1) > div:nth-child(3) > div > div > div > div > input[type=\"text\"]");
	By orderCustomerAccountDropdownFirstSelection = By.cssSelector("body.modal-open:nth-child(2) div.fade.in.modal div.menuConceptModal.order-modal.modal-dialog div.modal-content div.modal-body div.columns-container:nth-child(2) div.columns-container__single:nth-child(1) div.form-field-container:nth-child(3) div.form-field-container__columns div.dropdown:nth-child(2) div:nth-child(1) div:nth-child(1) ul:nth-child(3) > li:nth-child(1)");
	By orderCustomerAccountDropdownSecondSelection = By.cssSelector(".modal-body > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(3) > li:nth-child(2)");
	By orderCustomerAccountDropdownThirdSelection = By.cssSelector(".modal-body > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(3) > li:nth-child(3)");
	By orderDeliveryAddressDropdownSelect = By.cssSelector("div.form-field-container:nth-child(4) > div:nth-child(1) > div:nth-child(2) > select:nth-child(1)");
	By orderDeliveryDateDropdown = By.cssSelector("body > div:nth-child(4) > div > div.fade.in.modal > div > div > div.modal-body > div:nth-child(3) > div > div:nth-child(1) > div > div:nth-child(1) > div > div > input");
	By orderDeliveryDateDay5 = By.cssSelector(".open > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > span:nth-child(7)");
	By orderDeliveryDateDay10 = By.cssSelector(".open > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > span:nth-child(12)");
	By orderDeliveryDateDay20 = By.cssSelector(".open > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > span:nth-child(22)");
	By deliveryDayToday = By.xpath("//span[@class='flatpickr-day today']");
	By deliveryDays = By.xpath("//span[@class='flatpickr-day ']");
	By nextMonthDays = By.xpath("//span[@class='flatpickr-day nextMonthDay']");
	By prevMonthDays = By.xpath("//span[@class='flatpickr-day prevMonthDay']");
	By orderSetupCompleteBy = By.xpath("//body[@class='modal-open']/div/div[@role='dialog']/div[@class='fade in modal']/div[@class='menuConceptModal order-modal modal-dialog']/div[@class='modal-content']/div[@class='modal-body']/div/div[@class='columns-container']/div[@class='columns-container__single']/div[@class='form-field-container']/div[2]/div[1]/div[1]/input[1]");
	By orderSetupCompleteByHours = By.xpath("//div[@class='flatpickr-time']//div[1]//input[1]");
	By orderSetupCompleteByMinutes = By.cssSelector(".open > div:nth-child(1) > div:nth-child(3) > input:nth-child(1)");
	By orderSetupCompleteByPmAm = By.cssSelector(".open > div:nth-child(1) > span:nth-child(4)");
	By orderServiceInstructions = By.cssSelector(".modal-body > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > textarea:nth-child(2)");
	By orderChargeDate = By.cssSelector("input.flatpickr.flatpickr-input.form-control.input");
	By orderChargeDateDay18 = By.cssSelector(".open > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > span:nth-child(20)");
	By orderChargeDateDay28 = By.cssSelector("body > div:nth-child(4) > div > div.fade.in.modal > div > div > div.modal-body > div:nth-child(3) > div > div:nth-child(1) > div > div:nth-child(4) > div > div > div > div.flatpickr-innerContainer > div > div.flatpickr-days > div:nth-child(2) > span:nth-child(29)");
	By orderCateringPOCselect = By.cssSelector(".modal-body > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > select:nth-child(1)");
	By orderInvoicePOCselect = By.cssSelector(".modal-body > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > select:nth-child(1)");
	By orderReceiptPOC = By.cssSelector(".modal-body > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > select:nth-child(1)");
	By orderChoosePayment = By.cssSelector("div.false:nth-child(1) > div:nth-child(1) > select:nth-child(1)");
	By orderNumberOfPeople = By.cssSelector(".modal-body > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)");
	By orderMealTypeSelect = By.cssSelector(".modal-body > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > select:nth-child(1)");
	By orderPresentationType = By.cssSelector(".modal-body > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > select:nth-child(1)");
	By orderSelectPrimaryChef = By.cssSelector(".order-items-column > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)");
	By orderSelectPrimaryChefFirstSelection = By.cssSelector(".order-items-column > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(3) > li:nth-child(1)");
	By orderSelectAddOnChef = By.cssSelector(".spacing-top-small > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)");
	By orderSelectAddOnChefFirstSelection = By.cssSelector(".spacing-top-small > div:nth-child(1) > div:nth-child(1) > ul:nth-child(3) > li:nth-child(1)");
	By orderAddCustomEntree = By.cssSelector(".menu-items-container > div:nth-child(2) > div:nth-child(1) > ul:nth-child(2) > div:nth-child(1) > div:nth-child(2) > span:nth-child(1)");
	By orderFirstEntree = By.cssSelector(".menu-items-container > div:nth-child(2) > div:nth-child(1) > ul:nth-child(2) > div:nth-child(2) > div:nth-child(2) > span:nth-child(1)");
	By orderSecondEntree = By.cssSelector(".menu-items-container > div:nth-child(2) > div:nth-child(1) > ul:nth-child(2) > div:nth-child(3) > div:nth-child(2) > span:nth-child(1)");
	By orderThirdEntree = By.cssSelector(".menu-items-container > div:nth-child(2) > div:nth-child(1) > ul:nth-child(2) > div:nth-child(4) > div:nth-child(2) > span:nth-child(1)");
	By orderFourthEntree = By.cssSelector(".menu-items-container > div:nth-child(2) > div:nth-child(1) > ul:nth-child(2) > div:nth-child(5) > div:nth-child(2) > span:nth-child(1)");
	By orderFifthEntree = By.cssSelector(".menu-items-container > div:nth-child(2) > div:nth-child(1) > ul:nth-child(2) > div:nth-child(4) > div:nth-child(2) > span:nth-child(1)");
	By orderAddCustomSides = By.cssSelector(".menu-items-container > div:nth-child(2) > div:nth-child(2) > ul:nth-child(2) > div:nth-child(1) > div:nth-child(2) > span:nth-child(1)");
	By orderFirstSides = By.cssSelector(".menu-items-container > div:nth-child(2) > div:nth-child(2) > ul:nth-child(2) > div:nth-child(2) > div:nth-child(2) > span:nth-child(1)");
	By orderSecondSides = By.cssSelector(".menu-items-container > div:nth-child(2) > div:nth-child(2) > ul:nth-child(2) > div:nth-child(3) > div:nth-child(2) > span:nth-child(1)");
	By orderAddCustomDesert = By.cssSelector(".menu-items-container > div:nth-child(2) > div:nth-child(3) > ul:nth-child(2) > div:nth-child(1) > div:nth-child(2) > span:nth-child(1)");
	By orderAddCustomDrinkItem = By.cssSelector(".menu-items-container > div:nth-child(2) > div:nth-child(4) > ul:nth-child(2) > div:nth-child(1) > div:nth-child(2) > span:nth-child(1)");
	By orderAddCustomAppertizer = By.cssSelector(".menu-items-container > div:nth-child(2) > div:nth-child(5) > ul:nth-child(2) > div:nth-child(1) > div:nth-child(2) > span:nth-child(1)");
	By orderFirstAppertizer = By.cssSelector(".menu-items-container > div:nth-child(2) > div:nth-child(5) > ul:nth-child(2) > div:nth-child(2) > div:nth-child(2) > span:nth-child(1)");
	By orderAddCustomEquipment = By.cssSelector(".menu-items-container > div:nth-child(2) > div:nth-child(6) > ul:nth-child(2) > div:nth-child(1) > div:nth-child(2) > span:nth-child(1)");
	By orderFirstItemQTY = By.cssSelector(".menu-item-table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(3) > div:nth-child(1) > input:nth-child(1)");
	By orderSecondItemQTY = By.cssSelector(".menu-item-table > tbody:nth-child(3) > tr:nth-child(1) > td:nth-child(3) > div:nth-child(1) > input:nth-child(1)");
	By orderThirdItemQTY = By.cssSelector("body > div:nth-child(4) > div > div.fade.in.modal > div > div > div.modal-body > div:nth-child(4) > div.columns-container > div:nth-child(2) > div:nth-child(1) > div > table > tbody:nth-child(4) > tr > td:nth-child(3) > div > input[type=\"text\"]");
	By orderChildItemQTY = By.cssSelector("tr.menu-item-table__input-fields:nth-child(2) > td:nth-child(3) > div:nth-child(1) > input:nth-child(1)");
	By orderFirstItemMinusSign = By.className("minus-sign");
	By orderFirstItemRow = By.cssSelector("table.menu-item-table:nth-child(2) > tbody:nth-child(2) > tr:nth-child(1)");
	By orderItemRow = By.className("menu-item-table__input-fields");
	By orderChefNotes = By.className("textarea-notes");
	By orderFirstItemChefPrice = By.cssSelector("table.menu-item-table:nth-child(2) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(4) > input:nth-child(1)");
	By orderFirstItemClientPrice = By.cssSelector("table.menu-item-table:nth-child(2) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(5) > input:nth-child(1)");
	By orderFirstItemTotal = By.cssSelector("table.menu-item-table:nth-child(2) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(6) > input:nth-child(1)");
	By orderSecondItemTotal = By.cssSelector("table.menu-item-table:nth-child(2) > tbody:nth-child(3) > tr:nth-child(1) > td:nth-child(6) > input:nth-child(1)");
	By orderThirdItemTotal = By.cssSelector("table.menu-item-table:nth-child(2) > tbody:nth-child(4) > tr:nth-child(1) > td:nth-child(6) > input:nth-child(1)");
	By orderSubtotal = By.cssSelector(".subtotal");
	By orderDiscountSelect = By.cssSelector("div.container-space-between:nth-child(2) > div:nth-child(2) > select:nth-child(1)");
	By orderPercentageBox = By.cssSelector("div.container-space-between:nth-child(2) > div:nth-child(2) > input:nth-child(2)");
	By orderFreeDeliveryCheckBox = By.cssSelector("div.container-space-between:nth-child(3) > div:nth-child(1) > input:nth-child(1)");
	By orderDeliveryFeeInputBox = By.cssSelector("body > div:nth-child(5) > div > div.fade.in.modal > div > div > div.modal-body > div:nth-child(4) > div.columns-container > div:nth-child(2) > div.total-section > div > div:nth-child(1) > div:nth-child(3) > input[type=\"text\"]");
	By orderSalesTax = By.cssSelector("div.container-space-between:nth-child(4)");
	By orderTipBox = By.cssSelector("div.container-space-between:nth-child(5) > input:nth-child(2)");
	By orderTipPercentButton = By.cssSelector("button.tip-button:nth-child(3)");
	By orderTotal = By.cssSelector(".total > span:nth-child(1)");
	By orderSaveButton = By.cssSelector("button.button-primary:nth-child(1)");
	By orderCancel = By.cssSelector(".button-container > button:nth-child(2)");
	By orderDetailsOrangeSendInvoicePanel = By.cssSelector(".proposal-panel > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)");
	By orderDetailsOrangeChargeClientPanel = By.cssSelector(".charge-panel > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)");
	By orderDetailsOrangeChargeClientPanel1 = By.xpath("//*[@id=\'showOrderOverviewDiv\']/div[1]/div[1]/div[2]/div[1]/div/a/p");
	By orderDetailsOrangeSendOrderDetailsToChefsPanel = By.cssSelector("#showOrderOverviewDiv > div.alert-banner-container > div:nth-child(1) > div.action-panel.chef-panel.panel.panel-warning > div.panel-heading > div > a");
	By orderDetailsOrangeSendOrderDetailsToChefsPanel1= By.xpath("//*[@id=\"showOrderOverviewDiv\"]/div[1]/div[1]/div[3]/div[1]/div/a");
	By orderDetailsOrangeSendOrderDetailsToChefsPanel2= By.xpath("#showOrderOverviewDiv > div.alert-banner-container > div:nth-child(1) > div.action-panel.chef-panel.panel.panel-success > div.panel-heading > div > a");
	By salesPageTitle = By.cssSelector(".page-title");
	By orderDetailsOrderNumber = By.cssSelector("div.tab-content-column__single:nth-child(1) > div:nth-child(1) > span:nth-child(2) > span:nth-child(2)");
	By orderDetailsStatusSelect = By.className("form-control");
	By cancelConfirmation = By.cssSelector("div:nth-child(1) div.alert-container:nth-child(1) div:nth-child(1) div.alert-container__inner.alert-success.false > p:nth-child(1)");
	By createdFromCancelConf = By.cssSelector("div:nth-child(1) div.alert-container:nth-child(1) div:nth-child(1) div.alert-container__inner.alert-success.false > p:nth-child(1)");		
	By orderDetailsEditButton = By.cssSelector(".page > center:nth-child(1) > button:nth-child(1)");
	By orderDetailsCopyButton = By.cssSelector(".page > center:nth-child(1) > button:nth-child(2)");
	By orderDetailsDeleteButton = By.cssSelector(".button-alert");
	By orderDetailsOrangeSendSerDetailsToCatCaptainPanel = By.cssSelector(".services-panel > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)");
	By orderDetailsSendSurveyToClient = By.cssSelector(".survey-panel > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)");
	By orderDetailsChefName = By.cssSelector("div.tab-content-column__single:nth-child(2) > div:nth-child(1) > div:nth-child(1) > span:nth-child(2) > span:nth-child(2)");
	By orderDetailsInstructions = By.cssSelector("div.tab-content-column__single:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > pre:nth-child(5)");
	By orderDetailsChefInstructions = By.cssSelector("div.tab-content-column__single:nth-child(2) > div:nth-child(4) > div:nth-child(1) > div:nth-child(2)");
	By orderDetailsChefPricing = By.cssSelector("div.list-group:nth-child(5) > span:nth-child(2) > span:nth-child(2)");
	By orderDetailsSubTotal = By.cssSelector("div.list-group:nth-child(6) > span:nth-child(2) > span:nth-child(2)");
	By orderDetailsDiscount = By.cssSelector("div.list-group:nth-child(6) > span:nth-child(3) > span:nth-child(2)");
	By orderDetailsDeliveryFee = By.cssSelector("div.list-group:nth-child(6) > span:nth-child(4) > span:nth-child(2)");
	By orderDetailsTax = By.cssSelector("div.list-group:nth-child(6) > span:nth-child(5) > span:nth-child(2)");
	By orderDetailsTip = By.cssSelector("div.list-group:nth-child(6) > span:nth-child(6) > span:nth-child(2)");
	By orderOverviewTotal = By.xpath("//*[@id=\"showOrderOverviewDiv\"]/div[2]/div[2]/div[5]/span[6]/span[2]");
	By orderDetailsInvoicePDF = By.cssSelector(".download-pdf");
	By orderDetailsInvoiceLink = By.cssSelector("#showOrderOverviewDiv > div.alert-banner-container > div:nth-child(1) > div.action-panel.proposal-panel.panel.panel-warning > div.panel-collapse.collapse.in > div > div:nth-child(1) > a.link");
	By orderDetailsInvoiceLink1 = By.xpath("//*[@id=\"showOrderOverviewDiv\"]/div[1]/div[1]/div[1]/div[2]/div/div[1]/a[2]");
	By orderDetailsInvoiceLink2 = By.cssSelector("#showOrderOverviewDiv > div.alert-banner-container > div:nth-child(1) > div.action-panel.proposal-panel.panel.panel-success > div.panel-collapse.collapse.in > div > div:nth-child(1) > a.link");
	By orderDetailsFinalizeInvoiceCheckBox = By.xpath("//*[@id=\"showOrderOverviewDiv\"]/div[1]/div[1]/div[1]/div[2]/div/div[2]/center/span[1]/div/label/input");
	By orderDetailsEmailInvoiceButton = By.cssSelector(".in > div:nth-child(1) > div:nth-child(2) > center:nth-child(1) > span:nth-child(2) > button:nth-child(1)");
	By selectPaymentSourceSelect = By.cssSelector(".in > div:nth-child(1) > div:nth-child(5) > center:nth-child(1) > div:nth-child(2) > select:nth-child(1)");
	By orderDetailsPayViaExtMethodButton = By.id("pay-external-method");
	By invoiceLinkInvoiceTitle = By.cssSelector(".invoice-title");
	By invoiceLinkInvoiceSubtitle = By.cssSelector(".invoice-subtitle");
	By invoiceLinkInvoiceOrderNumber = By.cssSelector("div.invoice-container__content-order-details__group:nth-child(1) > div:nth-child(1) > span:nth-child(2)");
	By invoiceLinkFirstItemPrice = By.cssSelector(".invoice-table > tr:nth-child(2) > td:nth-child(2)");
	By invoiceLinkSecondItemPrice = By.cssSelector(".invoice-table > tr:nth-child(3) > td:nth-child(2)");
	By invoiceLinkThirdItemPrice = By.cssSelector(".invoice-table > tr:nth-child(4) > td:nth-child(2)");
	By invoiceLinkFirstItemQTY = By.cssSelector(".invoice-table > tr:nth-child(2) > td:nth-child(3)");
	By invoiceLinkSecondItemQTY = By.cssSelector(".invoice-table > tr:nth-child(3) > td:nth-child(3)");
	By invoiceLinkThirdItemQTY = By.cssSelector(".invoice-table > tr:nth-child(4) > td:nth-child(3)");
	By invoiceLinkFirstItemTotal = By.cssSelector(".invoice-table > tr:nth-child(2) > td:nth-child(4)");
	By invoiceLinkSecondItemTotal = By.cssSelector(".invoice-table > tr:nth-child(3) > td:nth-child(4)");
	By invoiceLinkThirdtemTotal = By.cssSelector(".invoice-table > tr:nth-child(4) > td:nth-child(4)");
	By invoiceLinkSubtotal = By.cssSelector(".container-total > table:nth-child(1) > tr:nth-child(1) > td:nth-child(2)");
	By invoiceLinkDeliveryFee = By.cssSelector(".container-total > table:nth-child(1) > tr:nth-child(2) > td:nth-child(2)");
	By invoiceLinkTax = By.cssSelector(".container-total > table:nth-child(1) > tr:nth-child(3) > td:nth-child(2)");
	By invoiceLinkTip = By.cssSelector(".container-total > table:nth-child(1) > tr:nth-child(4) > td:nth-child(2) > div:nth-child(1) > p:nth-child(1)");
	By invoiceLinkAddTioButton = By.cssSelector("button.invoice-button:nth-child(2)");
	By invoiceLinkTotal = By.cssSelector(".violet");
	By invoiceLinkLogin = By.cssSelector(".login");
	By invoiceLinkNameOnCard = By.cssSelector("#cardholder-name");
	By invoiceLinkPaymentFrame = By.cssSelector("#braintree-hosted-field-number");
	By invoiceLinkCardNumber = By.cssSelector("#credit-card-number");
	By invoiceLinkCardExpDate = By.cssSelector("#expiration");
	By invoiceLinkCardCvv = By.cssSelector("#cvv");
	By invoiceLinkPayInvoiceButton = By.cssSelector("#app > div > div.invoice-container > div.invoice-container__inner > div.invoice-payment-container > div.payment-button-container > button");
	By invoiceLinkChooseCardSelect = By.cssSelector(".Select-value");
	By invoiceLinkPaidInvoiceConfirmationMessage = By.cssSelector(".thankyou-container__inner > p:nth-child(2)");
	By invoiceEmailSendConfirmationOKButton = By.cssSelector(".modal-footer > button:nth-child(1)");
	By orderList1 = By.cssSelector("div.list-item:nth-child(1)");
	By orderSearchField = By.cssSelector("#app > div > div:nth-child(2) > div > div > div > div > div.page-columns > div:nth-child(1) > div > div.search-field > div > input");
	By chargeClientPanelChangePaymentMethod = By.cssSelector("button.button-neutral:nth-child(4)");
	By chargeClientPanelChargeClient = By.cssSelector("button.button-primary:nth-child(6)");
	By chargeClientPanelAmount = By.cssSelector(".blue-text");
	By chargeClientPanelCCInfo = By.cssSelector(".charge-client > p:nth-child(3)");
	By chargeClientPanelChooseCCSelectDropDown = By.cssSelector(".false > div:nth-child(1) > select:nth-child(1)");
	By chargeClientPanelAddPaymentMethod = By.cssSelector(".add-button");
	By chargeClientPanelCancelButton = By.cssSelector("div.form-field-container:nth-child(4) > button:nth-child(2)");
	By chargeClientPanelSaveButton = By.cssSelector("button.button-primary:nth-child(3)");
	By chargeClientPanelCardHolderName = By.cssSelector(".open-arrow > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)");
	By chargeClientPanelCCNumber = By.cssSelector(".dropdown-form > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)");
	By chargeClientPanelEXPDate = By.cssSelector(".dropdown-form > div:nth-child(3) > div:nth-child(2) > input:nth-child(1)");
	By chargeClientPanelCVV = By.cssSelector(".dropdown-form > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)");
	By chargeCLientPanelAddPaymentCancel = By.cssSelector(".cancel-button");
	By chargeClientPanelAddPaymentSave = By.cssSelector(".add-button");
	By sendChefPanelChefSelect = By.cssSelector("div.field:nth-child(2) > select:nth-child(1)");
	By chargeClientPanelNoPaymentMethodText = By.cssSelector("#showOrderOverviewDiv > div.alert-banner-container > div:nth-child(1) > div.action-panel.charge-panel.panel.panel-warning > div.panel-collapse.collapse.in > div > div > p:nth-child(5)");
	By chargeClientPanelPaymentConfirmation = By.xpath("//*[@id=\"showOrderOverviewDiv\"]/div[1]/div[1]/div[2]/div[2]/div/div/h3");
	By sendChefPanelEmailSelectedChefButton = By.cssSelector(".in > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > button:nth-child(2)");
	By sendChefPanelEmailAllChefButton = By.cssSelector("#showOrderOverviewDiv > div.alert-banner-container > div:nth-child(1) > div.action-panel.chef-panel.panel.panel-success > div.panel-collapse.collapse.in > div > div > div > button:nth-child(3)");
	By okButton = By.cssSelector(".modal-footer > button:nth-child(1)");
	By successBoxSuccessMessage = By.cssSelector(".confirmation-text");
	By sendServicesPanelCatCaptainField = By.cssSelector("div.dropdown:nth-child(2) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)");
	By sendServPanelCatCaptainFirstChoice = By.cssSelector("div.dropdown:nth-child(2) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(3) > li:nth-child(1)");
	By sendServPanelSaveButton = By.cssSelector(".button-primary");
	By emailCatCaptainButton = By.cssSelector(".form-field-container > div:nth-child(6) > button:nth-child(1)");
	By emailCatCaptainSurvey = By.cssSelector(".form-field-container > div:nth-child(6) > button:nth-child(2)");
	By sendSurveyPanelEmailOrderSurveyButton = By.cssSelector(".in > div:nth-child(1) > div:nth-child(1) > button:nth-child(2)");
	By orderOverviewEditButton = By.cssSelector(".page > center:nth-child(1) > button:nth-child(1)");
	By orderOverviewCopyButton = By.cssSelector(".page > center:nth-child(1) > button:nth-child(2)");
	By orderOverviewDeleteButton = By.cssSelector(".button-alert");
	By deleteConfirmationNoButton = By.cssSelector("button.button-alert:nth-child(1)");
	By deleteConfirmationYesButton = By.cssSelector("button.button-primary:nth-child(2)");
	By deleteWarningMessage = By.cssSelector(".confirmation-text");
	By calendarMonth = By.className("cur-month");
	By calenderYear = By.cssSelector("body > div:nth-child(5) > div > div.fade.in.modal > div > div > div.modal-body > div:nth-child(3) > div > div:nth-child(1) > div > div:nth-child(1) > div > div > div > div.flatpickr-month > span.flatpickr-current-month > div > input");
	By nextMonthArrow = By.className("flatpickr-next-month");
	By calenderDay = By.className("flatpickr-day");
	By orderOverviewClientName = By.cssSelector("div.list-group:nth-child(2) > span:nth-child(2) > span:nth-child(2)");
	By orderOverviewClientName1 = By.cssSelector("div.list-group:nth-child(3) > span:nth-child(2) > span:nth-child(2)");
	By selectCapSaveButton = By.xpath("//*[@id=\"showOrderOverviewDiv\"]/div[1]/div[2]/div[1]/div[2]/div/div/button");
	By orderOverviewServiceInstructions = By.cssSelector("div.tab-content-column__single:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > pre:nth-child(5)");
	By dayOfMenuEmailPanel = By.cssSelector("#showOrderOverviewDiv > div.alert-banner-container > div:nth-child(2) > div.action-panel.chef-panel.panel.panel-warning > div.panel-heading");
	By emailclientUpComOrderButton = By.cssSelector("#showOrderOverviewDiv > div.alert-banner-container > div:nth-child(2) > div.action-panel.chef-panel.panel.panel-warning > div.panel-collapse.collapse.in > div > div > button:nth-child(3)");
	By dayOfMenuInputBox = By.xpath("//input[@name='recipients']");
	By dayOfMenuSendEmailButton = By.xpath("//input[@value='Send Emails']");
	By orderOverviewOrderNumber = By.cssSelector("#showOrderOverviewDiv > div.tab-content-column-container > div:nth-child(1) > div:nth-child(1) > span:nth-child(2) > span:nth-child(2)");
	By customEntree = By.cssSelector("span.menu-item");
	By customEntreeName = By.cssSelector("input.custom-field");
	By customSide = By.xpath("//span[contains(text(),'Add Custom Side Item')]");
	By customDesert = By.xpath("//span[contains(text(),'Add Custom Dessert Item')]");
	By customDrink = By.xpath("//span[contains(text(),'Add Custom Drink Item')]");
	By customServiceItem = By.xpath("//span[contains(text(),'Add Custom Service Item')]");
	By minusSign = By.className("minus-sign");	

	
	
	public adminSalesPage(WebDriver driver) {
		this.driver = driver;
		waitHelper = new WaitHelper(driver);
	}
	
	
	public WebElement chargeClientPanelNoPaymentMethodText  ()
	{
		return driver.findElement(chargeClientPanelNoPaymentMethodText  );
	}
	
	
	public WebElement cancelConfirmation  ()
	{
		return driver.findElement(cancelConfirmation  );
	}
	
	public WebElement createdFromCancelConf  ()
	{
		return driver.findElement(createdFromCancelConf  );
	}
	
	
	public WebElement customEntree  ()
	{
		return driver.findElement(customEntree  );
	}
	
	public List<WebElement> customEntreeName  ()
	{
		return driver.findElements(customEntreeName  );
	}
	
	public WebElement customSide  ()
	{
		return driver.findElement(customSide  );
	}
	
	public WebElement customDesert  ()
	{
		return driver.findElement(customDesert  );
	}
	
	public WebElement customDrink  ()
	{
		return driver.findElement(customDrink  );
	}
	
	public WebElement customServiceItem  ()
	{
		return driver.findElement(customServiceItem  );
	}
	
	public WebElement minusSign  ()
	{
		return driver.findElement(minusSign  );
	}
	
	
	
	public WebElement orderOverviewOrderNumber()
	{
		return driver.findElement(orderOverviewOrderNumber);
	}
	
	
	public WebElement dayOfMenuSendEmailButton()
	{
		return driver.findElement(dayOfMenuSendEmailButton);
	}
	
	
	public WebElement dayOfMenuInputBox()
	{
		return driver.findElement(dayOfMenuInputBox);
	}
	
	
	
	public WebElement emailclientUpComOrderButton()
	{
		return driver.findElement(emailclientUpComOrderButton);
	}
	
	
	
	public WebElement dayOfMenuEmailPanel()
	{
		return driver.findElement(dayOfMenuEmailPanel);
	}
	
	public List<WebElement> deliveryDays()
	{
		return driver.findElements(deliveryDays);
	}
	
	
	
	
	public WebElement deliveryDayToday()
	{
		return driver.findElement(deliveryDayToday);
	}
	
	public List<WebElement> nextMonthDays()
	{
		return driver.findElements(nextMonthDays);
	}
	
	
	public List<WebElement> prevMonthDays()
	{
		return driver.findElements(prevMonthDays);
	}
	
	
	public WebElement selectCapSaveButton  ()
	{
		return driver.findElement(selectCapSaveButton  );
	}
	
	
	public WebElement orderOverviewClientName  ()
	{
		return driver.findElement(orderOverviewClientName  );
	}
	
	public WebElement orderOverviewClientName1  ()
	{
		return driver.findElement(orderOverviewClientName1  );
	}
	
	public WebElement orderOverviewServiceInstructions  ()
	{
		return driver.findElement(orderOverviewServiceInstructions  );
	}
	
	public List<WebElement> calenderDay  ()
	{
		return driver.findElements(calenderDay  );
	}
	public List<WebElement> nextMonthArrow  ()
	{
		return driver.findElements(nextMonthArrow  );
	}
	
	public WebElement calenderYear  ()
	{
		return driver.findElement(calenderYear  );
	}
	
	public WebElement calendarMonth  ()
	{
		return driver.findElement(calendarMonth  );
	}
	
	public WebElement salesLink  ()
	{
		return driver.findElement(salesLink  );
	}
	
	
	public WebElement pageTitle   ()
	{
		return driver.findElement(pageTitle   );
	}

	
	public WebElement salesPagePrepopulatedOrder1   ()
	{
		return driver.findElement(salesPagePrepopulatedOrder1   );
	}

	
	public WebElement salesPagePrepopulatedOrder2   ()
	{
		return driver.findElement(salesPagePrepopulatedOrder2   );
	}

	
	public WebElement addNewOrderButton   ()
	{
		return driver.findElement(addNewOrderButton   );
	}

	
	public WebElement newOrderPageHeader   ()
	{
		return driver.findElement(newOrderPageHeader   );
	}

	
	public WebElement orderSalesRepDropdown   ()
	{
		return driver.findElement(orderSalesRepDropdown   );
	}

	
	public WebElement orderSalesRepDropdownFirstSelection   ()
	{
		return driver.findElement(orderSalesRepDropdownFirstSelection   );
	}

	
	public WebElement orderCustomerAccountDropdown   ()
	{
		return driver.findElement(orderCustomerAccountDropdown   );
	}

	
	public WebElement orderCustomerAccountDropdownFirstSelection   ()
	{
		return driver.findElement(orderCustomerAccountDropdownFirstSelection   );
	}
	
	public WebElement orderCustomerAccountDropdownSecondSelection   ()
	{
		return driver.findElement(orderCustomerAccountDropdownSecondSelection   );
	}
	
	
	public WebElement orderCustomerAccountDropdownThirdSelection   ()
	{
		return driver.findElement(orderCustomerAccountDropdownThirdSelection   );
	}

	
	public WebElement orderDeliveryAddressDropdownSelect   ()
	{
		return driver.findElement(orderDeliveryAddressDropdownSelect   );
	}

	
	public WebElement orderDeliveryDateDropdown   ()
	{
		return driver.findElement(orderDeliveryDateDropdown   );
	}

	
	public WebElement orderDeliveryDateDay5   ()
	{
		return driver.findElement(orderDeliveryDateDay5   );
	}

	
	public WebElement orderDeliveryDateDay10   ()
	{
		return driver.findElement(orderDeliveryDateDay10   );
	}

	
	public WebElement orderDeliveryDateDay20   ()
	{
		return driver.findElement(orderDeliveryDateDay20   );
	}

	
	public WebElement orderSetupCompleteBy   ()
	{
		return driver.findElement(orderSetupCompleteBy   );
	}

	
	public WebElement orderSetupCompleteByHours   ()
	{
		return driver.findElement(orderSetupCompleteByHours   );
	}

	
	public WebElement orderSetupCompleteByMinutes   ()
	{
		return driver.findElement(orderSetupCompleteByMinutes   );
	}
	
	public WebElement orderSetupCompleteByPmAm   ()
	{
		return driver.findElement(orderSetupCompleteByPmAm   );
	}
	
	
	public WebElement orderServiceInstructions   ()
	{
		return driver.findElement(orderServiceInstructions   );
	}

	
	public List<WebElement> orderChargeDate   ()
	{
		return driver.findElements(orderChargeDate   );
	}

	
	public WebElement orderChargeDateDay18   ()
	{
		return driver.findElement(orderChargeDateDay18   );
	}

	
	public WebElement orderChargeDateDay28   ()
	{
		return driver.findElement(orderChargeDateDay28   );
	}

	
	public WebElement orderCateringPOCselect   ()
	{
		return driver.findElement(orderCateringPOCselect   );
	}

	
	public WebElement orderInvoicePOCselect   ()
	{
		return driver.findElement(orderInvoicePOCselect   );
	}

	
	public WebElement orderReceiptPOC   ()
	{
		return driver.findElement(orderReceiptPOC   );
	}

	
	public WebElement orderChoosePayment   ()
	{
		return driver.findElement(orderChoosePayment   );
	}

	
	public WebElement orderNumberOfPeople   ()
	{
		return driver.findElement(orderNumberOfPeople   );
	}
	
	public WebElement orderMealTypeSelect   ()
	{
		return driver.findElement(orderMealTypeSelect   );
	}
	
	
	public WebElement orderPresentationType   ()
	{
		return driver.findElement(orderPresentationType   );
	}

	
	public WebElement orderSelectPrimaryChef   ()
	{
		return driver.findElement(orderSelectPrimaryChef   );
	}

	
	public WebElement orderSelectPrimaryChefFirstSelection   ()
	{
		return driver.findElement(orderSelectPrimaryChefFirstSelection   );
	}

	
	public WebElement orderSelectAddOnChef   ()
	{
		return driver.findElement(orderSelectAddOnChef   );
	}

	
	public WebElement orderSelectAddOnChefFirstSelection   ()
	{
		return driver.findElement(orderSelectAddOnChefFirstSelection   );
	}

	
	public WebElement orderAddCustomEntree   ()
	{
		return driver.findElement(orderAddCustomEntree   );
	}

	
	public WebElement orderFirstEntree   ()
	{
		return driver.findElement(orderFirstEntree   );
	}

	
	public WebElement orderSecondEntree   ()
	{
		return driver.findElement(orderSecondEntree   );
	}

	
	public WebElement orderThirdEntree   ()
	{
		return driver.findElement(orderThirdEntree   );
	}
	
	public WebElement orderFourthEntree   ()
	{
		return driver.findElement(orderFourthEntree   );
	}
	
	
	public WebElement orderFifthEntree   ()
	{
		return driver.findElement(orderFifthEntree   );
	}

	
	public WebElement orderAddCustomSides   ()
	{
		return driver.findElement(orderAddCustomSides   );
	}

	
	public WebElement orderFirstSides   ()
	{
		return driver.findElement(orderFirstSides   );
	}

	
	public WebElement orderSecondSides   ()
	{
		return driver.findElement(orderSecondSides   );
	}

	
	public WebElement orderAddCustomDesert   ()
	{
		return driver.findElement(orderAddCustomDesert   );
	}

	
	public WebElement orderAddCustomDrinkItem   ()
	{
		return driver.findElement(orderAddCustomDrinkItem   );
	}

	
	public WebElement orderAddCustomAppertizer   ()
	{
		return driver.findElement(orderAddCustomAppertizer   );
	}

	
	public WebElement orderFirstAppertizer   ()
	{
		return driver.findElement(orderFirstAppertizer   );
	}

	
	public WebElement orderAddCustomEquipment   ()
	{
		return driver.findElement(orderAddCustomEquipment   );
	}
	
	public WebElement orderFirstItemQTY   ()
	{
		return driver.findElement(orderFirstItemQTY   );
	}
	
	
	public WebElement orderSecondItemQTY   ()
	{
		return driver.findElement(orderSecondItemQTY   );
	}

	
	public WebElement orderThirdItemQTY   ()
	{
		return driver.findElement(orderThirdItemQTY   );
	}

	
	public WebElement orderChildItemQTY   ()
	{
		return driver.findElement(orderChildItemQTY   );
	}

	
	public WebElement orderFirstItemMinusSign   ()
	{
		return driver.findElement(orderFirstItemMinusSign   );
	}

	
	public WebElement orderFirstItemRow   ()
	{
		return driver.findElement(orderFirstItemRow   );
	}

	
	public WebElement orderItemRow   ()
	{
		return driver.findElement(orderItemRow   );
	}

	
	public WebElement orderChefNotes   ()
	{
		return driver.findElement(orderChefNotes   );
	}

	
	public WebElement orderFirstItemChefPrice   ()
	{
		return driver.findElement(orderFirstItemChefPrice   );
	}

	
	public WebElement orderFirstItemClientPrice   ()
	{
		return driver.findElement(orderFirstItemClientPrice   );
	}
	
	public WebElement orderFirstItemTotal   ()
	{
		return driver.findElement(orderFirstItemTotal   );
	}
	
	
	public WebElement orderSecondItemTotal   ()
	{
		return driver.findElement(orderSecondItemTotal   );
	}

	
	public WebElement orderThirdItemTotal   ()
	{
		return driver.findElement(orderThirdItemTotal   );
	}

	
	public WebElement orderSubtotal   ()
	{
		return driver.findElement(orderSubtotal   );
	}

	
	public WebElement orderDiscountSelect   ()
	{
		return driver.findElement(orderDiscountSelect   );
	}

	
	public WebElement orderPercentageBox   ()
	{
		return driver.findElement(orderPercentageBox   );
	}

	
	public WebElement orderFreeDeliveryCheckBox   ()
	{
		return driver.findElement(orderFreeDeliveryCheckBox   );
	}

	
	public WebElement orderDeliveryFeeInputBox   ()
	{
		return driver.findElement(orderDeliveryFeeInputBox   );
	}

	
	public WebElement orderSalesTax   ()
	{
		return driver.findElement(orderSalesTax   );
	}

	
	public WebElement orderTipBox   ()
	{
		return driver.findElement(orderTipBox   );
	}
	
	public WebElement orderTipPercentButton   ()
	{
		return driver.findElement(orderTipPercentButton   );
	}
	
	
	public WebElement orderTotal   ()
	{
		return driver.findElement(orderTotal   );
	}

	
	public WebElement orderSaveButton   ()
	{
		return driver.findElement(orderSaveButton   );
	}

	
	public WebElement orderCancel   ()
	{
		return driver.findElement(orderCancel   );
	}

	
	public WebElement orderDetailsOrangeSendInvoicePanel   ()
	{
		return driver.findElement(orderDetailsOrangeSendInvoicePanel   );
	}

	
	public WebElement orderDetailsOrangeChargeClientPanel   ()
	{
		return driver.findElement(orderDetailsOrangeChargeClientPanel   );
	}

	public WebElement orderDetailsOrangeChargeClientPanel1  ()
	{
		return driver.findElement(orderDetailsOrangeChargeClientPanel1   );
	}
	
	public WebElement orderDetailsOrangeSendOrderDetailsToChefsPanel   ()
	{
		return driver.findElement(orderDetailsOrangeSendOrderDetailsToChefsPanel   );
	}
	
	public WebElement orderDetailsOrangeSendOrderDetailsToChefsPanel1  ()
	{
		return driver.findElement(orderDetailsOrangeSendOrderDetailsToChefsPanel1   );
	}

	public WebElement orderDetailsOrangeSendOrderDetailsToChefsPanel2  ()
	{
		return driver.findElement(orderDetailsOrangeSendOrderDetailsToChefsPanel2   );
	}
	
	public WebElement salesPageTitle   ()
	{
		return driver.findElement(salesPageTitle   );
	}

	
	public WebElement orderDetailsOrderNumber   ()
	{
		return driver.findElement(orderDetailsOrderNumber   );
	}

	
	public WebElement orderDetailsStatusSelect   ()
	{
		return driver.findElement(orderDetailsStatusSelect   );
	}
	
	public WebElement orderDetailsEditButton   ()
	{
		return driver.findElement(orderDetailsEditButton   );
	}
	
	
	public WebElement orderDetailsCopyButton   ()
	{
		return driver.findElement(orderDetailsCopyButton   );
	}

	
	public WebElement orderDetailsDeleteButton   ()
	{
		return driver.findElement(orderDetailsDeleteButton   );
	}

	
	public WebElement orderDetailsOrangeSendSerDetailsToCatCaptainPanel   ()
	{
		return driver.findElement(orderDetailsOrangeSendSerDetailsToCatCaptainPanel   );
	}

	
	public WebElement orderDetailsSendSurveyToClient   ()
	{
		return driver.findElement(orderDetailsSendSurveyToClient   );
	}

	
	public WebElement orderDetailsChefName   ()
	{
		return driver.findElement(orderDetailsChefName   );
	}

	
	public WebElement orderDetailsInstructions   ()
	{
		return driver.findElement(orderDetailsInstructions   );
	}

	
	public WebElement orderDetailsChefInstructions   ()
	{
		return driver.findElement(orderDetailsChefInstructions   );
	}

	
	public WebElement orderDetailsChefPricing   ()
	{
		return driver.findElement(orderDetailsChefPricing   );
	}

	
	public WebElement orderDetailsSubTotal   ()
	{
		return driver.findElement(orderDetailsSubTotal   );
	}
	
	public WebElement orderDetailsDiscount   ()
	{
		return driver.findElement(orderDetailsDiscount   );
	}
	
	
	public WebElement orderDetailsDeliveryFee   ()
	{
		return driver.findElement(orderDetailsDeliveryFee   );
	}

	
	public WebElement orderDetailsTax   ()
	{
		return driver.findElement(orderDetailsTax   );
	}

	
	public WebElement orderDetailsTip   ()
	{
		return driver.findElement(orderDetailsTip   );
	}

	
	public WebElement orderOverviewTotal   ()
	{
		return driver.findElement(orderOverviewTotal   );
	}

	
	public WebElement orderDetailsInvoicePDF   ()
	{
		return driver.findElement(orderDetailsInvoicePDF   );
	}

	
	public WebElement orderDetailsInvoiceLink   ()
	{
		return driver.findElement(orderDetailsInvoiceLink   );
	}
	
	public WebElement orderDetailsInvoiceLink1   ()
	{
		return driver.findElement(orderDetailsInvoiceLink1   );
	}
	
	public WebElement orderDetailsInvoiceLink2   ()
	{
		return driver.findElement(orderDetailsInvoiceLink2   );
	}

	
	public WebElement orderDetailsFinalizeInvoiceCheckBox   ()
	{
		return driver.findElement(orderDetailsFinalizeInvoiceCheckBox   );
	}

	
	public WebElement orderDetailsEmailInvoiceButton   ()
	{
		return driver.findElement(orderDetailsEmailInvoiceButton   );
	}

	
	public WebElement selectPaymentSourceSelect   ()
	{
		return driver.findElement(selectPaymentSourceSelect   );
	}
	
	public WebElement orderDetailsPayViaExtMethodButton   ()
	{
		return driver.findElement(orderDetailsPayViaExtMethodButton   );
	}
	
	
	public WebElement invoiceLinkInvoiceTitle   ()
	{
		return driver.findElement(invoiceLinkInvoiceTitle   );
	}

	
	public WebElement invoiceLinkInvoiceSubtitle   ()
	{
		return driver.findElement(invoiceLinkInvoiceSubtitle   );
	}

	
	public WebElement invoiceLinkInvoiceOrderNumber   ()
	{
		return driver.findElement(invoiceLinkInvoiceOrderNumber   );
	}

	
	public WebElement invoiceLinkFirstItemPrice   ()
	{
		return driver.findElement(invoiceLinkFirstItemPrice   );
	}

	
	public WebElement invoiceLinkSecondItemPrice   ()
	{
		return driver.findElement(invoiceLinkSecondItemPrice   );
	}

	
	public WebElement invoiceLinkThirdItemPrice   ()
	{
		return driver.findElement(invoiceLinkThirdItemPrice   );
	}

	
	public WebElement invoiceLinkFirstItemQTY   ()
	{
		return driver.findElement(invoiceLinkFirstItemQTY   );
	}

	
	public WebElement invoiceLinkSecondItemQTY   ()
	{
		return driver.findElement(invoiceLinkSecondItemQTY   );
	}

	
	public WebElement invoiceLinkThirdItemQTY   ()
	{
		return driver.findElement(invoiceLinkThirdItemQTY   );
	}
	
	public WebElement invoiceLinkFirstItemTotal   ()
	{
		return driver.findElement(invoiceLinkFirstItemTotal   );
	}
	
	
	public WebElement invoiceLinkSecondItemTotal   ()
	{
		return driver.findElement(invoiceLinkSecondItemTotal   );
	}

	
	public WebElement invoiceLinkThirdtemTotal   ()
	{
		return driver.findElement(invoiceLinkThirdtemTotal   );
	}

	
	public WebElement invoiceLinkSubtotal   ()
	{
		return driver.findElement(invoiceLinkSubtotal   );
	}

	
	public WebElement invoiceLinkDeliveryFee   ()
	{
		return driver.findElement(invoiceLinkDeliveryFee   );
	}

	
	public WebElement invoiceLinkTax   ()
	{
		return driver.findElement(invoiceLinkTax   );
	}

	
	public WebElement invoiceLinkTip   ()
	{
		return driver.findElement(invoiceLinkTip   );
	}

	
	public WebElement invoiceLinkAddTioButton   ()
	{
		return driver.findElement(invoiceLinkAddTioButton   );
	}

	
	public WebElement invoiceLinkTotal   ()
	{
		return driver.findElement(invoiceLinkTotal   );
	}

	
	public WebElement invoiceLinkLogin   ()
	{
		return driver.findElement(invoiceLinkLogin   );
	}
	
	public WebElement invoiceLinkNameOnCard   ()
	{
		return driver.findElement(invoiceLinkNameOnCard   );
	}
	
	
	public WebElement invoiceLinkPaymentFrame   ()
	{
		return driver.findElement(invoiceLinkPaymentFrame   );
	}

	
	public WebElement invoiceLinkCardNumber   ()
	{
		return driver.findElement(invoiceLinkCardNumber   );
	}

	
	public WebElement invoiceLinkCardExpDate   ()
	{
		return driver.findElement(invoiceLinkCardExpDate   );
	}

	
	public WebElement invoiceLinkCardCvv   ()
	{
		return driver.findElement(invoiceLinkCardCvv   );
	}

	
	public WebElement invoiceLinkPayInvoiceButton   ()
	{
		return driver.findElement(invoiceLinkPayInvoiceButton   );
	}

	
	public WebElement invoiceLinkChooseCardSelect   ()
	{
		return driver.findElement(invoiceLinkChooseCardSelect   );
	}

	
	public WebElement invoiceLinkPaidInvoiceConfirmationMessage   ()
	{
		return driver.findElement(invoiceLinkPaidInvoiceConfirmationMessage   );
	}

	
	public WebElement invoiceEmailSendConfirmationOKButton   ()
	{
		return driver.findElement(invoiceEmailSendConfirmationOKButton   );
	}

	
	public WebElement orderList1   ()
	{
		return driver.findElement(orderList1   );
	}
	
	public WebElement orderSearchField   ()
	{
		return driver.findElement(orderSearchField   );
	}
	
	
	public WebElement chargeClientPanelChangePaymentMethod   ()
	{
		return driver.findElement(chargeClientPanelChangePaymentMethod   );
	}

	
	public WebElement chargeClientPanelChargeClient   ()
	{
		return driver.findElement(chargeClientPanelChargeClient   );
	}

	
	public WebElement chargeClientPanelAmount   ()
	{
		return driver.findElement(chargeClientPanelAmount   );
	}

	
	public WebElement chargeClientPanelCCInfo   ()
	{
		return driver.findElement(chargeClientPanelCCInfo   );
	}

	
	public WebElement chargeClientPanelChooseCCSelectDropDown   ()
	{
		return driver.findElement(chargeClientPanelChooseCCSelectDropDown   );
	}

	
	public WebElement chargeClientPanelAddPaymentMethod   ()
	{
		return driver.findElement(chargeClientPanelAddPaymentMethod   );
	}

	
	public WebElement chargeClientPanelCancelButton   ()
	{
		return driver.findElement(chargeClientPanelCancelButton   );
	}

	
	public WebElement chargeClientPanelSaveButton   ()
	{
		return driver.findElement(chargeClientPanelSaveButton   );
	}

	
	public WebElement chargeClientPanelCardHolderName   ()
	{
		return driver.findElement(chargeClientPanelCardHolderName   );
	}
	
	public WebElement chargeClientPanelCCNumber   ()
	{
		return driver.findElement(chargeClientPanelCCNumber   );
	}
	
	
	public WebElement chargeClientPanelEXPDate   ()
	{
		return driver.findElement(chargeClientPanelEXPDate   );
	}

	
	public WebElement chargeClientPanelCVV   ()
	{
		return driver.findElement(chargeClientPanelCVV   );
	}

	
	public WebElement chargeCLientPanelAddPaymentCancel   ()
	{
		return driver.findElement(chargeCLientPanelAddPaymentCancel   );
	}

	
	public WebElement chargeClientPanelAddPaymentSave   ()
	{
		return driver.findElement(chargeClientPanelAddPaymentSave   );
	}

	
	public WebElement sendChefPanelChefSelect   ()
	{
		return driver.findElement(sendChefPanelChefSelect   );
	}

	
	public WebElement chargeClientPanelPaymentConfirmation   ()
	{
		return driver.findElement(chargeClientPanelPaymentConfirmation   );
	}

	
	public WebElement sendChefPanelEmailSelectedChefButton   ()
	{
		return driver.findElement(sendChefPanelEmailSelectedChefButton   );
	}

	
	public List<WebElement> sendChefPanelEmailAllChefButton   ()
	{
		return driver.findElements(sendChefPanelEmailAllChefButton   );
	}

	
	public WebElement okButton   ()
	{
		return driver.findElement(okButton   );
	}
	
	public WebElement successBoxSuccessMessage   ()
	{
		return driver.findElement(successBoxSuccessMessage   );
	}
	
	
	public WebElement sendServicesPanelCatCaptainField   ()
	{
		return driver.findElement(sendServicesPanelCatCaptainField   );
	}

	
	public WebElement sendServPanelCatCaptainFirstChoice   ()
	{
		return driver.findElement(sendServPanelCatCaptainFirstChoice   );
	}

	
	public WebElement sendServPanelSaveButton   ()
	{
		return driver.findElement(sendServPanelSaveButton   );
	}

	
	public WebElement emailCatCaptainButton   ()
	{
		return driver.findElement(emailCatCaptainButton   );
	}

	
	public WebElement emailCatCaptainSurvey   ()
	{
		return driver.findElement(emailCatCaptainSurvey   );
	}

	
	public WebElement sendSurveyPanelEmailOrderSurveyButton   ()
	{
		return driver.findElement(sendSurveyPanelEmailOrderSurveyButton   );
	}

	
	public WebElement orderOverviewEditButton   ()
	{
		return driver.findElement(orderOverviewEditButton   );
	}

	
	public WebElement orderOverviewCopyButton   ()
	{
		return driver.findElement(orderOverviewCopyButton   );
	}

	
	public WebElement deleteConfirmationNoButton   ()
	{
		return driver.findElement(deleteConfirmationNoButton   );
	}
	
	public WebElement deleteConfirmationYesButton    ()
	{
		return driver.findElement(deleteConfirmationYesButton    );
	}

	
	public WebElement deleteWarningMessage    ()
	{
		return driver.findElement(deleteWarningMessage    );
	}


}
