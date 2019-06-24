package com.cucumberFramework.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumberFramework.helper.WaitHelper;

public class adminChefPage {
	
	private WebDriver driver;

	WaitHelper waitHelper;
	
By chefsButton = By.xpath("//a[contains(text(),'Chefs')]");
By activeChefImage = By.cssSelector("div.dashboard-card:nth-child(1) > div:nth-child(1)");
By activeChefName = By.cssSelector("div.dashboard-card:nth-child(1) > div:nth-child(1) > div:nth-child(3)");
By activeChefTextOverLay = By.cssSelector("div.dashboard-card:nth-child(1) > div:nth-child(1) > div:nth-child(2)");
By pageTitle = By.cssSelector(".page-title");
By sideBarButton = By.cssSelector(".sidebar-button");
By sideBarButtonPageTitle = By.cssSelector(".page-title");
By chefTitle = By.cssSelector("div.dashboard-card:nth-child(1) > div:nth-child(1) > div:nth-child(3)");
By chefImage = By.cssSelector("div.dashboard-card:nth-child(1)");
By chefText = By.cssSelector("div.dashboard-card:nth-child(1) > div:nth-child(1) > div:nth-child(2)");
By chefProfileOverview = By.cssSelector("li.active > a:nth-child(1)");
By chefProfileOverView2 = By.cssSelector("#app > div > div:nth-child(2) > div > div > div > div > div.page-columns > div.tabs-container > div > div > div > ul > li:nth-child(1) > a");
By chefOverviewImage = By.cssSelector(".chef-image > img:nth-child(1)");
By chefOverviewEditButton = By.cssSelector(".button-neutral");
By chefSchedule = By.cssSelector(".nav > li:nth-child(2) > a:nth-child(1)");
By scheduleDisableRecurringScheduleButton = By.cssSelector(".btn-warning");
By scheduleSetAllRecurringButton = By.cssSelector("button.btn:nth-child(2)");
By scheduleTodayButton = By.cssSelector("span.rbc-btn-group:nth-child(1) > button:nth-child(1)");
By scheduleBackButton = By.cssSelector("span.rbc-btn-group:nth-child(1) > button:nth-child(2)");
By scheduleNextButton = By.cssSelector("span.rbc-btn-group:nth-child(1) > button:nth-child(3)");
By scheduleMonthAndYear = By.cssSelector(".rbc-toolbar-label");
By scheduleMonthButton = By.cssSelector(".rbc-active");
By scheduleWeekButton = By.cssSelector("span.rbc-btn-group:nth-child(3) > button:nth-child(2)");
By chefMenuItems = By.cssSelector(".nav > li:nth-child(3) > a:nth-child(1)");
By menuItemsItemNameColumn = By.cssSelector(".table > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(1)");
By menuItemsMealTypeColumn = By.cssSelector(".table > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(2)");
By menuItemsChefPriceColumn = By.cssSelector(".table > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(3)");
By menuItemsMarketPriceColumn = By.cssSelector(".table > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(4)");
By menuItemsLiveColumn = By.cssSelector(".table > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(5)");
By menuItemsApprovedColumn = By.cssSelector(".table > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(6)");
By menuItemsEnttree = By.cssSelector("tr.clickable:nth-child(1) > td:nth-child(1)");
By menuItemsEntree2 = By.cssSelector("tr.clickable:nth-child(2) > td:nth-child(1)");
By menuItemsNewItemButton = By.cssSelector(".button-neutral");
By chefServiceItemsTab = By.cssSelector(".nav > li:nth-child(4) > a:nth-child(1)");
By serviceItemsNameColumn = By.cssSelector(".table > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(1)");
By serviceItemsVendorPriceColumn = By.cssSelector(".table > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(2)");
By serviceItemsPriceColumn = By.cssSelector(".table > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(3)");
By serviceItemsLiveColumn = By.cssSelector(".table > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(4)");
By serviceItemsApprovedColumn = By.cssSelector(".table > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(5)");
By menuCards = By.cssSelector(".nav > li:nth-child(5) > a:nth-child(1)");
By menuCardsNameColumn = By.cssSelector(".table > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(1)");
By menuCardsCuisineTypeColumn = By.cssSelector(".table > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(2)");
By menuCardsDayPartColumn = By.cssSelector(".table > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(3)");
By menuCardsLiveColumn = By.cssSelector(".table > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(4)");
By menuCardApproved = By.cssSelector(".table > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(5)");
By menuCardAddNewMenuCardButton = By.cssSelector(".button-neutral");
By menuCardEntry = By.cssSelector("tr.clickable:nth-child(1) > td:nth-child(1)");
By contacts = By.cssSelector(".nav > li:nth-child(6)");
By contactsNameColumn = By.cssSelector(".table > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(1)");
By contactsRoleColumn = By.cssSelector(".table > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(2)");
By contactsEmailColumn = By.cssSelector(".table > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(3)");
By contactsPhoneNumberColumn = By.cssSelector(".table > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(4)");
By contactRolesColumn = By.cssSelector(".table > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(5)");
By contactEntryName = By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(1)");
By contactsNewContactButton = By.cssSelector(".button-neutral");
By chefOrders = By.cssSelector(".nav > li:nth-child(7) > a:nth-child(1)");
By ordersOrderNumberColumn = By.cssSelector(".table > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(1)");
By ordersEventDateColumn = By.cssSelector(".table > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(2)");
By ordersDescriptionColumn = By.cssSelector(".table > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(3)");
By ordersTotalColumn = By.cssSelector(".table > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(4)");
By ordersOrderEntries = By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(1)");
By closeSideBar = By.cssSelector(".sidebar-button > div:nth-child(1)");
By addNewChef = By.cssSelector(".add-new-button");
By firstName = By.cssSelector("div.columns-container__single:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)");
By lastName = By.cssSelector("div.columns-container__single:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > input:nth-child(1)");
By email = By.cssSelector("div.columns-container__single:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > input:nth-child(1)");
By phoneNumber = By.cssSelector("div.columns-container__single:nth-child(1) > div:nth-child(1) > div:nth-child(5) > div:nth-child(2) > input:nth-child(1)");
By rating = By.cssSelector("div.form-field-container:nth-child(4) > div:nth-child(3) > div:nth-child(2) > input:nth-child(1)");
By priorityTypeNone = By.cssSelector("#None");
By priorityTypeNew = By.cssSelector("#New");
By priorityTypeAnchor = By.cssSelector("#Anchor");
By accounTypeBusiness = By.cssSelector("#isBusiness");
By accountTypeVendor = By.cssSelector("#vendorOnly");
By statusSlelect = By.cssSelector("div.dropdown:nth-child(2) > select:nth-child(1)");
By accountName = By.cssSelector("div.form-field-container:nth-child(4) > div:nth-child(4) > div:nth-child(2) > input:nth-child(1)");
By awardBanner = By.cssSelector("div.form-field-container:nth-child(4) > div:nth-child(5) > div:nth-child(2) > textarea:nth-child(1)");
By yearsAsChef = By.cssSelector("div.form-field-container:nth-child(4) > div:nth-child(6) > div:nth-child(2) > input:nth-child(1)");
By hometown = By.cssSelector("div.form-field-container__columns:nth-child(7) > div:nth-child(2) > input:nth-child(1)");
By bio = By.cssSelector("div.form-field-container__columns:nth-child(8) > div:nth-child(2) > textarea:nth-child(1)");
By chefCapabilities = By.cssSelector("div.columns-container__single:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)");
By hoursOfAdvanceNotice = By.cssSelector("div.columns-container__single:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)");
By maximumIndPerSesson = By.cssSelector("div.columns-container__single:nth-child(2) > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > input:nth-child(1)");
By maximunBuffetPerSession = By.cssSelector("div.columns-container__single:nth-child(2) > div:nth-child(2) > div:nth-child(4) > div:nth-child(2) > input:nth-child(1)");
By onSiteFee = By.cssSelector("div.columns-container__single:nth-child(2) > div:nth-child(2) > div:nth-child(5) > div:nth-child(2) > input:nth-child(1)");
By address1 = By.cssSelector("div.form-field-container__columns:nth-child(1) > div:nth-child(2) > input:nth-child(1)");
By address2 = By.cssSelector("div.columns-container__single:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)");
By city = By.cssSelector("div.columns-container__single:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > input:nth-child(1)");
By state = By.cssSelector("div.columns-container__single:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(2) > input:nth-child(1)");
By zipCode = By.cssSelector("div.columns-container__single:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(5) > div:nth-child(2) > input:nth-child(1)");
By buildingInstructions = By.cssSelector(".flex-top > textarea:nth-child(2)");
By saveButton = By.cssSelector(".button-primary");
By cancelButton = By.cssSelector(".button-neutral");
By deleteButton = By.className("button-alert");
By deleteButton2 = By.xpath("//button[@class='button-alert']");
By deleteButton3 = By.cssSelector("body > div:nth-child(4) > div > div.fade.in.modal > div > div > div.modal-footer > button.button-alert");
By deleteButton4 = By.linkText("Delete");
By sideRadioButton = By.cssSelector("#Side");
By mainRadioButton = By.cssSelector("#Main");
By desertRadioButton = By.cssSelector("#Dessert");
By drinkRadioButton = By.cssSelector("#Drink");
By appertizerRadioButton = By.cssSelector("#Appetizer");
By MenuItemName = By.cssSelector("div.columns-container__single:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)");
By menuItemIngredients = By.cssSelector(".ReactTags__tagInputField");
By menuItemDescription = By.cssSelector("div.form-field-container__columns:nth-child(4) > div:nth-child(2) > textarea:nth-child(1)");
By servingsPerPackage = By.cssSelector("div.form-field-container__columns:nth-child(5) > div:nth-child(2) > input:nth-child(1)");
By servingUtensilsSelect = By.cssSelector("body > div:nth-child(4) > div > div.fade.in.modal > div > div > div.modal-body > div > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > div > div > div > select");
By chefPrice = By.cssSelector("div.columns-container__single:nth-child(1) > div:nth-child(3) > div:nth-child(2) > input:nth-child(2)");
By marketPrice = By.cssSelector("div.columns-container__single:nth-child(1) > div:nth-child(3) > div:nth-child(3) > input:nth-child(2)");
By vegetarianCheckBox = By.cssSelector("#vegetarian");
By veganCheckBox = By.cssSelector("#vegan");
By containsGlutenCheckBox = By.cssSelector("#contains\\ gluten");
By glutenFreeCheckBox = By.cssSelector("#gluten-free");
By diaryFreeCheckBox = By.cssSelector("#dairy-free");
By containsDiaryCheckBox = By.cssSelector("#contains\\ dairy");
By containsNutsCheckBox = By.cssSelector("#contains\\ nuts");
By containsShelfishCheckBox = By.cssSelector("#contains\\ shellfish");
By containsSoyCheckBox = By.cssSelector("#contains\\ soy");
By containsEggCheckBox = By.cssSelector("#contains\\ eggs");
By fullPanRadioButton = By.cssSelector("#Full\\ Pan");
By fourtyEightOzRadioButton = By.cssSelector("#\\34 8oz\\ Clear\\ Large\\ Toppings\\ Bowl");
By thirtyTwoOzRadioButton = By.cssSelector("#\\33 20oz\\ Clear\\ Large\\ Salad\\ Bowl");
By twelveInchPlatter = By.cssSelector("#\\31 2\\ inch\\ Platter");
By eighteenInchPlatter = By.cssSelector("#\\31 8\\ inch\\ Platter");
By sixteenInchPlatter = By.cssSelector("#\\31 6oz\\ Squeeze\\ Bottle");
By individualBoxedLunches = By.id("5c4c9b83-c4e9-4abd-bfa9-c50274fe7200");
By pieBox = By.id("bab7e881-0a94-4c53-8238-0bf1c8c92088");
By noPackaging = By.cssSelector("#No\\ Packaging");
By liveCheckBox = By.cssSelector("#isEnabled");
By approvedCheckBox = By.cssSelector("#isApproved");
By marketplaceAddOn = By.cssSelector("div.columns-container__single:nth-child(2) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)");
By noMinimumQTY = By.cssSelector("#noMinCartQty");
By newServiceItemsButton = By.cssSelector(".button-neutral");
By newServiceItemsName = By.cssSelector("div.columns-container__single:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)");
By newServiceItemDescription = By.cssSelector("div.form-field-container__columns:nth-child(3) > div:nth-child(2) > textarea:nth-child(1)");
By newServiceItemPriceRate = By.cssSelector("div.columns-container__single:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > input:nth-child(1)");
By newServiceItemLiveCheckBox = By.cssSelector("#isEnabled");
By newServiceItemApprovedCheckBox = By.cssSelector("#isApproved");
By newServiceItemVendorPrice = By.cssSelector("div.columns-container__single:nth-child(2) > div:nth-child(1) > div:nth-child(4) > input:nth-child(2)");
By newServiceItemMarketPrice = By.cssSelector("div.form-field-container__columns:nth-child(5) > input:nth-child(2)");
By newServiceItemSaveButon = By.cssSelector(".button-primary");
By newServiceItemCancelButton = By.cssSelector("button.button-neutral:nth-child(2)");
By ServiceItemsFirstItem = By.cssSelector(".clickable > td:nth-child(1)");
By serviceItemDeleteButton = By.cssSelector(".button-alert");
By deleteImageButton = By.cssSelector(".item > div:nth-child(1) > button:nth-child(2)");
By menuCardName = By.cssSelector("div.columns-container__single:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(2)");
By enabledCheckedBox = By.cssSelector("#isEnabled");
By breakfastRadioButton = By.cssSelector("div.radiobutton:nth-child(1) > input:nth-child(1)");
By lunchCheckBox = By.cssSelector("#lunch\\ \\/\\ dinner");
By happyHourCheckBox = By.cssSelector("#happy\\ hour");
By afghanCuisine = By.cssSelector("#afghan");
By asianCuisine = By.cssSelector("#asian");
By persianCuisine = By.cssSelector("#persian");
By pizza = By.cssSelector("#pizza");
By vegan = By.cssSelector("#vegan");
By featuredRanking = By.cssSelector(".error-container > input:nth-child(1)");
By nextImage = By.cssSelector(".glyphicon-chevron-right");
By previousImage = By.cssSelector(".glyphicon-chevron-left");
By addEntree = By.cssSelector("div.sort-container:nth-child(1) > a:nth-child(2)");
By newMenuCardMainDropdown = By.cssSelector("#react-select-2--value-item > div:nth-child(1) > h3:nth-child(1)");
By firstSelectChoice = By.cssSelector("div.Select-menu-outer");
By addSides = By.cssSelector("div.sort-container:nth-child(2) > a:nth-child(2)");
By selectSide = By.cssSelector("#react-select-11--value-item > div:nth-child(1) > h3:nth-child(1)");
By addAppertizers = By.cssSelector("a.add-button:nth-child(2)");
By Other = By.cssSelector("#react-select-12--value-item > div:nth-child(1) > h3:nth-child(1)");
By newContactName = By.cssSelector("div.form-field-container__columns:nth-child(1) > input:nth-child(2)");
By newContactRole = By.cssSelector("div.form-field-container__columns:nth-child(2) > input:nth-child(2)");
By newContactEmail = By.cssSelector("div.form-field-container__columns:nth-child(3) > input:nth-child(2)");
By newContactPhone = By.cssSelector("div.form-field-container__columns:nth-child(4) > input:nth-child(2)");
By newContactOrdersCheckbox = By.cssSelector("#orders");
By newContactConfirmationCheckboxx = By.cssSelector("#confirmations");
By newContactInvoivesCheckbox = By.cssSelector("#invoices");
By profileStatus = By.cssSelector("div.tab-content-column__single:nth-child(2) > div:nth-child(1) > div:nth-child(1) > span:nth-child(5) > span:nth-child(2)");
By chefPageStatusSelect = By.cssSelector(".status-search > select:nth-child(1)");
By chefSearchField = By.cssSelector(".search-field__input");
By chefList1 = By.cssSelector("div.list-item:nth-child(1)");
By chefList2 = By.cssSelector("div.list-item:nth-child(2)");
By yesButton = By.cssSelector(".alert-modal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)");
By yesButton1 = By.cssSelector(".button-primary");
By customItemTest = By.className("clickable");








	
	
	public adminChefPage(WebDriver driver) {
		this.driver = driver;
		waitHelper = new WaitHelper(driver);
	}
	
	public List<WebElement> customItemTest  ()
	{
		return driver.findElements(customItemTest);
	}
	
	
	public WebElement chefsButton  ()
	{
		return driver.findElement(chefsButton);
	}
	
	public WebElement chefServiceItemsTab  ()
	{
		return driver.findElement(chefServiceItemsTab);
	}
	
	
	public WebElement ServiceItemsFirstItem   ()
	{
		return driver.findElement(ServiceItemsFirstItem );
	}
	
	public WebElement serviceItemDeleteButton   ()
	{
		return driver.findElement(serviceItemDeleteButton );
	}
	
	public WebElement newServiceItemsButton   ()
	{
		return driver.findElement(newServiceItemsButton );
	}
	
	public WebElement newServiceItemsName   ()
	{
		return driver.findElement(newServiceItemsName );
	}
	
	public WebElement newServiceItemDescription   ()
	{
		return driver.findElement(newServiceItemDescription );
	}
	
	public WebElement newServiceItemPriceRate   ()
	{
		return driver.findElement(newServiceItemPriceRate );
	}
	
	public WebElement newServiceItemLiveCheckBox   ()
	{
		return driver.findElement(newServiceItemLiveCheckBox );
	}
	
	public WebElement newServiceItemApprovedCheckBox   ()
	{
		return driver.findElement(newServiceItemApprovedCheckBox );
	}
	
	public WebElement newServiceItemVendorPrice   ()
	{
		return driver.findElement(newServiceItemVendorPrice );
	}
	
	public WebElement newServiceItemMarketPrice   ()
	{
		return driver.findElement(newServiceItemMarketPrice );
	}
	public WebElement newServiceItemSaveButon   ()
	{
		return driver.findElement(newServiceItemSaveButon );
	}
	
	public WebElement newServiceItemCancelButton   ()
	{
		return driver.findElement(newServiceItemCancelButton );
	}
	
	
	public WebElement activeChefImage   ()
	{
		return driver.findElement(activeChefImage   );
	}
	
	public WebElement activeChefName   ()
	{
		return driver.findElement(activeChefName   );
	}
	
	public WebElement activeChefTextOverLay   ()
	{
		return driver.findElement(activeChefTextOverLay   );
	}
	
	public WebElement pageTitle   ()
	{
		return driver.findElement(pageTitle   );
	}
	
	public WebElement chefTitle   ()
	{
		return driver.findElement(chefTitle   );
	}
	
	public WebElement chefImage   ()
	{
		return driver.findElement(chefImage   );
	}
	
	public WebElement chefText   ()
	{
		return driver.findElement(chefText   );
	}

	
	public WebElement chefProfileOverview   ()
	{
		return driver.findElement(chefProfileOverview   );
	}
	
	
	public WebElement chefProfileOverview2   ()
	{
		return driver.findElement(chefProfileOverView2  );
	}
	
	
	public WebElement chefOverviewImage   ()
	{
		return driver.findElement(chefOverviewImage   );
	}
	
	public WebElement chefOverviewEditButton   ()
	{
		return driver.findElement(chefOverviewEditButton   );
	}
	
	public WebElement chefSchedule   ()
	{
		return driver.findElement(chefSchedule   );
	}
	
	public WebElement scheduleDisableRecurringScheduleButton   ()
	{
		return driver.findElement(scheduleDisableRecurringScheduleButton   );
	}
	
	public WebElement scheduleSetAllRecurringButton   ()
	{
		return driver.findElement(scheduleSetAllRecurringButton   );
	}
	
	public WebElement scheduleTodayButton   ()
	{
		return driver.findElement(scheduleTodayButton   );
	}
	
	public WebElement scheduleBackButton   ()
	{
		return driver.findElement(scheduleBackButton   );
	}
	
	public WebElement scheduleNextButton   ()
	{
		return driver.findElement(scheduleNextButton   );
	}
	
	public WebElement scheduleMonthAndYear   ()
	{
		return driver.findElement(scheduleMonthAndYear   );
	}
	
	public WebElement scheduleMonthButton   ()
	{
		return driver.findElement(scheduleMonthButton   );
	}
	
	public WebElement scheduleWeekButton   ()
	{
		return driver.findElement(scheduleWeekButton   );
	}
	
	public WebElement chefMenuItems   ()
	{
		return driver.findElement(chefMenuItems   );
	}
	
	public WebElement menuItemsItemNameColumn   ()
	{
		return driver.findElement(menuItemsItemNameColumn   );
	}
	
	public WebElement menuItemsMealTypeColumn   ()
	{
		return driver.findElement(menuItemsMealTypeColumn   );
	}
	
	public WebElement menuItemsChefPriceColumn   ()
	{
		return driver.findElement(menuItemsChefPriceColumn   );
	}
	
	public WebElement menuItemsMarketPriceColumn   ()
	{
		return driver.findElement(menuItemsMarketPriceColumn   );
	}
	
	public WebElement menuItemsLiveColumn   ()
	{
		return driver.findElement(menuItemsLiveColumn   );
	}
	
	public WebElement menuItemsApprovedColumn   ()
	{
		return driver.findElement(menuItemsApprovedColumn   );
	}
	
	public WebElement menuItemsEnttree   ()
	{
		return driver.findElement(menuItemsEnttree   );
	}
	
	public WebElement menuItemsEntree2   ()
	{
		return driver.findElement(menuItemsEntree2   );
	}
	
	public WebElement menuItemsNewItemButton   ()
	{
		return driver.findElement(menuItemsNewItemButton   );
	}
	
	public WebElement menuCards   ()
	{
		return driver.findElement(menuCards   );
	}
	
	public WebElement menuCardsNameColumn   ()
	{
		return driver.findElement(menuCardsNameColumn   );
	}
	
	public WebElement menuCardsCuisineTypeColumn   ()
	{
		return driver.findElement(menuCardsCuisineTypeColumn   );
	}
	
	public WebElement menuCardsDayPartColumn   ()
	{
		return driver.findElement(menuCardsDayPartColumn   );
	}
	
	public WebElement menuCardsLiveColumn   ()
	{
		return driver.findElement(menuCardsLiveColumn   );
	}
	
	public WebElement menuCardApproved   ()
	{
		return driver.findElement(menuCardApproved   );
	}
	
	public WebElement menuCardAddNewMenuCardButton   ()
	{
		return driver.findElement(menuCardAddNewMenuCardButton   );
	}
	
	
	public WebElement menuCardEntry   ()
	{
		return driver.findElement(menuCardEntry   );
	}
	
	public WebElement serviceItemsNameColumn   ()
	{
		return driver.findElement(serviceItemsNameColumn   );
	}
	
	public WebElement serviceItemsVendorPriceColumn   ()
	{
		return driver.findElement(serviceItemsVendorPriceColumn   );
	}
	
	public WebElement serviceItemsPriceColumn   ()
	{
		return driver.findElement(serviceItemsPriceColumn   );
	}
	
	public WebElement serviceItemsLiveColumn   ()
	{
		return driver.findElement(serviceItemsLiveColumn   );
	}
	
	public WebElement serviceItemsApprovedColumn   ()
	{
		return driver.findElement(serviceItemsApprovedColumn   );
	}
	
	
	
	public WebElement contacts   ()
	{
		return driver.findElement(contacts   );
	}
	
	public WebElement contactsNameColumn   ()
	{
		return driver.findElement(contactsNameColumn   );
	}
	
	public WebElement contactsRoleColumn   ()
	{
		return driver.findElement(contactsRoleColumn   );
	}
	
	public WebElement contactsEmailColumn   ()
	{
		return driver.findElement(contactsEmailColumn   );
	}
	
	public WebElement contactsPhoneNumberColumn   ()
	{
		return driver.findElement(contactsPhoneNumberColumn   );
	}
	
	public WebElement contactRolesColumn   ()
	{
		return driver.findElement(contactRolesColumn   );
	}
	
	public WebElement contactEntryName   ()
	{
		return driver.findElement(contactEntryName   );
	}
	
	public WebElement contactsNewContactButton   ()
	{
		return driver.findElement(contactsNewContactButton   );
	}
	
	public WebElement chefOrders   ()
	{
		return driver.findElement(chefOrders   );
	}
	
	public WebElement ordersOrderNumberColumn   ()
	{
		return driver.findElement(ordersOrderNumberColumn   );
	}
	
	public WebElement ordersEventDateColumn   ()
	{
		return driver.findElement(ordersEventDateColumn   );
	}
	
	public WebElement ordersDescriptionColumn   ()
	{
		return driver.findElement(ordersDescriptionColumn   );
	}
	
	public WebElement ordersTotalColumn   ()
	{
		return driver.findElement(ordersTotalColumn   );
	}
	
	public WebElement ordersOrderEntries   ()
	{
		return driver.findElement(ordersOrderEntries   );
	}
	
	public WebElement closeSideBar   ()
	{
		return driver.findElement(closeSideBar   );
	}
	
	public WebElement addNewChef   ()
	{
		return driver.findElement(addNewChef   );
	}
	
	public WebElement firstName   ()
	{
		return driver.findElement(firstName   );
	}
	
	public WebElement lastName   ()
	{
		return driver.findElement(lastName   );
	}
	
	public WebElement email   ()
	{
		return driver.findElement(email   );
	}
	
	public WebElement phoneNumber   ()
	{
		return driver.findElement(phoneNumber   );
	}
	
	public WebElement rating   ()
	{
		return driver.findElement(rating   );
	}
	
	public WebElement priorityTypeNone   ()
	{
		return driver.findElement(priorityTypeNone   );
	}
	
	public WebElement priorityTypeNew   ()
	{
		return driver.findElement(priorityTypeNew   );
	}
	
	public WebElement priorityTypeAnchor   ()
	{
		return driver.findElement(priorityTypeAnchor   );
	}
	
	public WebElement accounTypeBusiness   ()
	{
		return driver.findElement(accounTypeBusiness   );
	}
	
	public WebElement accountTypeVendor ()
	{
		return driver.findElement(accountTypeVendor  );
	}
	

	
	public WebElement statusSlelect   ()
	{
		return driver.findElement(statusSlelect   );
	}
	
	public WebElement accountName   ()
	{
		return driver.findElement(accountName   );
	}
	
	public WebElement awardBanner   ()
	{
		return driver.findElement(awardBanner   );
	}
	
	public WebElement yearsAsChef   ()
	{
		return driver.findElement(yearsAsChef   );
	}
	
	public WebElement hometown   ()
	{
		return driver.findElement(hometown   );
	}
	
	public WebElement bio   ()
	{
		return driver.findElement(bio   );
	}
	
	public WebElement chefCapabilities   ()
	{
		return driver.findElement(chefCapabilities   );
	}
	
	
	public WebElement hoursOfAdvanceNotice   ()
	{
		return driver.findElement(hoursOfAdvanceNotice   );
	}
	
	
	
	public WebElement maximumIndPerSesson   ()
	{
		return driver.findElement(maximumIndPerSesson   );
	}
	
	public WebElement maximunBuffetPerSession   ()
	{
		return driver.findElement(maximunBuffetPerSession   );
	}
	
	public WebElement onSiteFee   ()
	{
		return driver.findElement(onSiteFee   );
	}
	
	public WebElement address1   ()
	{
		return driver.findElement(address1   );
	}
	
	public WebElement address2   ()
	{
		return driver.findElement(address2   );
	}
	
	public WebElement city   ()
	{
		return driver.findElement(city   );
	}
	
	public WebElement state   ()
	{
		return driver.findElement(state   );
	}
	
	public WebElement zipCode   ()
	{
		return driver.findElement(zipCode   );
	}
	
	public WebElement buildingInstructions   ()
	{
		return driver.findElement(buildingInstructions   );
	}
	
	public WebElement saveButton   ()
	{
		return driver.findElement(saveButton   );
	}
	
	public WebElement cancelButton   ()
	{
		return driver.findElement(cancelButton   );
	}
	
	public WebElement deleteButton   ()
	{
		return driver.findElement(deleteButton   );
	}
	
	public WebElement deleteButton2   ()
	{
		return driver.findElement(deleteButton2   );
	}
	
	public WebElement deleteButton3   ()
	{
		return driver.findElement(deleteButton3   );
	}
	
	public WebElement deleteButton4   ()
	{
		return driver.findElement(deleteButton4   );
	}
	
	public WebElement sideRadioButton   ()
	{
		return driver.findElement(sideRadioButton   );
	}
	
	public WebElement mainRadioButton   ()
	{
		return driver.findElement(mainRadioButton   );
	}
	
	public WebElement desertRadioButton   ()
	{
		return driver.findElement(desertRadioButton   );
	}
	
	public WebElement drinkRadioButton   ()
	{
		return driver.findElement(drinkRadioButton   );
	}
	
	public WebElement appertizerRadioButton   ()
	{
		return driver.findElement(appertizerRadioButton   );
	}
	
	public WebElement MenuItemName   ()
	{
		return driver.findElement(MenuItemName   );
	}
	
	public WebElement menuItemIngredients   ()
	{
		return driver.findElement(menuItemIngredients   );
	}
	
	public WebElement menuItemDescription   ()
	{
		return driver.findElement(menuItemDescription   );
	}
	
	public WebElement servingsPerPackage   ()
	{
		return driver.findElement(servingsPerPackage   );
	}
	
	public WebElement servingUtensilsSelect   ()
	{
		return driver.findElement(servingUtensilsSelect   );
	}
	
	public WebElement chefPrice   ()
	{
		return driver.findElement(chefPrice   );
	}
	
	public WebElement marketPrice   ()
	{
		return driver.findElement(marketPrice   );
	}
	
	public WebElement vegetarianCheckBox   ()
	{
		return driver.findElement(vegetarianCheckBox   );
	}
	
	public WebElement veganCheckBox   ()
	{
		return driver.findElement(veganCheckBox   );
	}
	
	public WebElement containsGlutenCheckBox   ()
	{
		return driver.findElement(containsGlutenCheckBox   );
	}
	
	public WebElement glutenFreeCheckBox   ()
	{
		return driver.findElement(glutenFreeCheckBox   );
	}
	
	public WebElement diaryFreeCheckBox   ()
	{
		return driver.findElement(diaryFreeCheckBox   );
	}
	
	public WebElement containsDiaryCheckBox   ()
	{
		return driver.findElement(containsDiaryCheckBox   );
	}
	
	public WebElement containsNutsCheckBox   ()
	{
		return driver.findElement(containsNutsCheckBox   );
	}
	
	public WebElement containsShelfishCheckBox   ()
	{
		return driver.findElement(containsShelfishCheckBox   );
	}
	
	public WebElement containsSoyCheckBox   ()
	{
		return driver.findElement(containsSoyCheckBox   );
	}
	
	public WebElement containsEggCheckBox   ()
	{
		return driver.findElement(containsEggCheckBox   );
	}
	
	public WebElement fullPanRadioButton   ()
	{
		return driver.findElement(fullPanRadioButton   );
	}
	
	public WebElement fourtyEightOzRadioButton   ()
	{
		return driver.findElement(fourtyEightOzRadioButton   );
	}
	
	public WebElement thirtyTwoOzRadioButton   ()
	{
		return driver.findElement(thirtyTwoOzRadioButton   );
	}
	
	public WebElement twelveInchPlatter   ()
	{
		return driver.findElement(twelveInchPlatter   );
	}
	
	public WebElement eighteenInchPlatter   ()
	{
		return driver.findElement(eighteenInchPlatter   );
	}
	
	public WebElement sixteenInchPlatter   ()
	{
		return driver.findElement(sixteenInchPlatter   );
	}
	
	public WebElement individualBoxedLunches   ()
	{
		return driver.findElement(individualBoxedLunches   );
	}
	
	public WebElement pieBox   ()
	{
		return driver.findElement(pieBox   );
	}
	
	public WebElement noPackaging   ()
	{
		return driver.findElement(noPackaging   );
	}
	
	public WebElement liveCheckBox   ()
	{
		return driver.findElement(liveCheckBox   );
	}
	
	public WebElement approvedCheckBox   ()
	{
		return driver.findElement(approvedCheckBox   );
	}
	
	public WebElement marketplaceAddOn   ()
	{
		return driver.findElement(marketplaceAddOn   );
	}
	
	public WebElement noMinimumQTY   ()
	{
		return driver.findElement(noMinimumQTY   );
	}
	
	public WebElement deleteImageButton   ()
	{
		return driver.findElement(deleteImageButton   );
	}
	
	public WebElement menuCardName   ()
	{
		return driver.findElement(menuCardName   );
	}
	
	public WebElement enabledCheckedBox   ()
	{
		return driver.findElement(enabledCheckedBox   );
	}
	
	public WebElement breakfastRadioButton   ()
	{
		return driver.findElement(breakfastRadioButton   );
	}
	
	public WebElement lunchCheckBox   ()
	{
		return driver.findElement(lunchCheckBox   );
	}
	
	public WebElement happyHourCheckBox   ()
	{
		return driver.findElement(happyHourCheckBox   );
	}
	
	public WebElement afghanCuisine   ()
	{
		return driver.findElement(afghanCuisine   );
	}
	
	public WebElement asianCuisine   ()
	{
		return driver.findElement(asianCuisine   );
	}
	
	public WebElement persianCuisine   ()
	{
		return driver.findElement(persianCuisine   );
	}
	
	public WebElement pizza   ()
	{
		return driver.findElement(pizza   );
	}
	
	public WebElement vegan   ()
	{
		return driver.findElement(vegan   );
	}
	
	public WebElement featuredRanking   ()
	{
		return driver.findElement(featuredRanking   );
	}
	
	public WebElement nextImage   ()
	{
		return driver.findElement(nextImage   );
	}
	
	public WebElement previousImage   ()
	{
		return driver.findElement(previousImage   );
	}
	
	public WebElement addEntree   ()
	{
		return driver.findElement(addEntree   );
	}
	
	public WebElement newMenuCardMainDropdown   ()
	{
		return driver.findElement(newMenuCardMainDropdown   );
	}
	
	public WebElement firstSelectChoice   ()
	{
		return driver.findElement(firstSelectChoice   );
	}
	
	public WebElement addSides   ()
	{
		return driver.findElement(addSides   );
	}
	
	public WebElement selectSide   ()
	{
		return driver.findElement(selectSide   );
	}
	
	public WebElement addAppertizers   ()
	{
		return driver.findElement(addAppertizers   );
	}
	
	public WebElement Other   ()
	{
		return driver.findElement(Other   );
	}
	
	public WebElement newContactName   ()
	{
		return driver.findElement(newContactName   );
	}
	
	public WebElement newContactRole   ()
	{
		return driver.findElement(newContactRole   );
	}
	
	public WebElement newContactEmail   ()
	{
		return driver.findElement(newContactEmail   );
	}
	
	public WebElement newContactPhone   ()
	{
		return driver.findElement(newContactPhone   );
	}
	
	public WebElement newContactOrdersCheckbox   ()
	{
		return driver.findElement(newContactOrdersCheckbox   );
	}
	
	public WebElement newContactConfirmationCheckboxx   ()
	{
		return driver.findElement(newContactConfirmationCheckboxx   );
	}
	
	public WebElement newContactInvoivesCheckbox   ()
	{
		return driver.findElement(newContactInvoivesCheckbox   );
	}
	
	public WebElement profileStatus   ()
	{
		return driver.findElement(profileStatus   );
	}
	
	public WebElement chefPageStatusSelect   ()
	{
		return driver.findElement(chefPageStatusSelect   );
	}
	
	public WebElement chefSearchField   ()
	{
		return driver.findElement(chefSearchField   );
	}
	
	public WebElement chefList1   ()
	{
		return driver.findElement(chefList1   );
	}
	
	public WebElement chefList2   ()
	{
		return driver.findElement(chefList2   );
	}
	
	public WebElement yesButton   ()
	{
		return driver.findElement(yesButton   );
	}
	
	public WebElement yesButton1   ()
	{
		return driver.findElement(yesButton1   );
	}
	
	
}
