package com.cucumberFramework.pageObjects;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberFramework.helper.Constants;
import com.cucumberFramework.helper.WaitHelper;

public class chooseMenuPage {
	
	private WebDriver driver;

	WaitHelper waitHelper;
	
	By menuPageTitle = By.cssSelector(".current-point");
	By menuPageLinks = By.tagName("a");
	By hungryHomeLogo = By.className("progress-bar-container");
	By eventDetails = By.xpath("//span[text() = 'Event Details']");
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
	By categories = By.xpath("//span[text() = 'Categories']");
	By mostOrdered = By.cssSelector(".Collapsible:nth-child(2) div:nth-child(1) > .checkbox-label");
	By topPicks = By.cssSelector(".Collapsible:nth-child(2) div:nth-child(2) > .checkbox-label");
	By mealTypes = By.cssSelector(".Collapsible:nth-child(4) > .Collapsible__trigger");
	By breakFastCheckBox = By.cssSelector(".Collapsible:nth-child(4) div:nth-child(1) > .checkbox-label");
    By happyHourCheckBox = By.cssSelector(".Collapsible:nth-child(4) div:nth-child(3) > .checkbox-label");
	By chefs = By.cssSelector(".Collapsible:nth-child(5) > .Collapsible__trigger");
    By chefBeverlyCheckBox =By.cssSelector(".Collapsible:nth-child(5) div:nth-child(1) > .checkbox-label");
    By chefGuruCheckBox = By.cssSelector(".Collapsible:nth-child(5) div:nth-child(2) > .checkbox-label");
    By chefJestCheckBox = By.cssSelector(".Collapsible:nth-child(5) div:nth-child(5) > .checkbox-label");
	By price = By.cssSelector(".Collapsible:nth-child(6) > .Collapsible__trigger");
	By priceHighToLow = By.cssSelector(".Collapsible:nth-child(6) div:nth-child(1) > .checkbox-label");
	By priceLowToHigh = By.cssSelector(".Collapsible:nth-child(6) div:nth-child(2) > .checkbox-label");
	By below6 = By.cssSelector(".Collapsible:nth-child(6) div:nth-child(3) > .checkbox-label");
	By above6 = By.cssSelector(".Collapsible:nth-child(6) div:nth-child(3) > .checkbox-label");
	By Rating = By.cssSelector(".Collapsible:nth-child(7) > .Collapsible__trigger");
	By fiveStars = By.cssSelector(".Collapsible:nth-child(7) div:nth-child(1) > .checkbox-label");
	By fourStars = By.cssSelector(".Collapsible:nth-child(7) div:nth-child(2) > .checkbox-label");
	By threeStars = By.cssSelector(".Collapsible:nth-child(7) div:nth-child(3) > .checkbox-label");
	By twoStars = By.cssSelector(".Collapsible:nth-child(7) div:nth-child(4) > .checkbox-label");
	By oneStar = By.cssSelector(".Collapsible:nth-child(7) div:nth-child(5) > .checkbox-label");
	By ratingsHtoL = By.cssSelector(".Collapsible:nth-child(7) div:nth-child(6) > .checkbox-label");
	By ratingsLtoH = By.cssSelector(".Collapsible:nth-child(7) div:nth-child(7) > .checkbox-label");
	By dietaryPref = By.cssSelector(".Collapsible:nth-child(8) > .Collapsible__trigger");
	By vegan = By.cssSelector(".Collapsible:nth-child(8) div:nth-child(2) > .checkbox-label");
	By vegetarian = By.cssSelector(".Collapsible:nth-child(8) div:nth-child(4) > .checkbox-label");
	By searchBox = By.cssSelector(".search-field > input:nth-child(1)");
	By matchingResults = By.cssSelector(".search-bar > p:nth-child(2)");
	By clearFilters = By.cssSelector(".clear-filter");
	By firstMenuCard = By.cssSelector("div.menu-card:nth-child(1)");
	By menuCard = By.cssSelector("div.menu-card");
	By menuCardImages = By.cssSelector(".menu-card-cover-image-container");
	By firstMenuCoverImage = By.cssSelector("div.menu-card:nth-child(1) > div:nth-child(1)");
	By menuEntreeDisplay = By.cssSelector("div.menu-card:nth-child(1) > div:nth-child(1) > div:nth-child(2)");
	By menuCuisineType = By.cssSelector("div.menu-card:nth-child(1) > div:nth-child(2) > p:nth-child(1)");
	By cuisineType = By.cssSelector(".Collapsible:nth-child(3) > .Collapsible__trigger");
	By americancuisine = By.cssSelector(".Collapsible:nth-child(3) div:nth-child(1) > .checkbox-label");
	By chefRatings = By.cssSelector("div.menu-card:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > span:nth-child(6)");
	By chefPicture = By.cssSelector("div.menu-card:nth-child(1) > img:nth-child(3)");
	By chefAvPrice = By.cssSelector("div.menu-card:nth-child(1) > div:nth-child(2) > p:nth-child(3)");
	By chefName = By.cssSelector("div.menu-card:nth-child(1) > div:nth-child(2) > div:nth-child(2) > p:nth-child(2)");
	By customizeMenu = By.cssSelector(".back-button");
	By clearCuisineTab = By.cssSelector("button.show-all-button");
	By clearMealTypeTab = By.cssSelector(".Collapsible:nth-child(3) .show-all-button");
	By clearchefsTab = By.cssSelector(".Collapsible:nth-child(4) .show-all-button");
	By clearRatingsTab = By.cssSelector(".Collapsible:nth-child(6) .show-all-button");
	By clearDietaryTab = By.cssSelector(".Collapsible:nth-child(7) .show-all-button");
	By closeSortingTab = By.cssSelector("span.Collapsible__trigger.is-open");
	By showAllButton = By.className("show-all-button");



	
	
			
	
	
	
	
	
	
	
	
	public chooseMenuPage(WebDriver driver) {
		this.driver = driver;
		waitHelper = new WaitHelper(driver);
	}
	
	
	
	public WebElement showAllButton ()
	{
		return driver.findElement(showAllButton );
	}
	
	
	public WebElement categories ()
	{
		return driver.findElement(categories );
	}
	
	
	public WebElement mostOrdered ()
	{
		return driver.findElement(mostOrdered );
	}
	
	
	public WebElement topPicks ()
	{
		return driver.findElement(topPicks );
	}
	
	
	public WebElement above6 ()
	{
		return driver.findElement(above6 );
	}
	
	public WebElement below6 ()
	{
		return driver.findElement(below6 );
	}
	
	
	public WebElement hungryHomeLogo ()
	{
		return driver.findElement(hungryHomeLogo );
	}

	
	public List<WebElement> menuPageLinks ()
	{
		return driver.findElements(menuPageLinks );
	}
	
	
	
	public WebElement eventDetails  ()
	{
		return driver.findElement(eventDetails  );
	}
	
	public WebElement zipCode  ()
	{
		return driver.findElement(zipCode  );
	}
	
	public WebElement date  ()
	{
		return driver.findElement(date  );
	}
	
	public WebElement previousMonth  ()
	{
		return driver.findElement(previousMonth  );
	}
	
	public WebElement nextMonth  ()
	{
		return driver.findElement(nextMonth  );
	}
	
	public WebElement dayOne  ()
	{
		return driver.findElement(dayOne  );
	}
	
	public WebElement dayTen  ()
	{
		return driver.findElement(dayTen );
	}
	
	public WebElement dayFifteen  ()
	{
		return driver.findElement(dayFifteen  );
	}
	
	public WebElement dayThirtyFirst  ()
	{
		return driver.findElement(dayThirtyFirst  );
	}
	
	public WebElement howMany  ()
	{
		return driver.findElement(howMany  );
	}
	
	public WebElement setUpTime  ()
	{
		return driver.findElement(setUpTime  );
	}
	
	public WebElement setUpHoursUp  ()
	{
		return driver.findElement(setUpHoursUp  );
	}
	
	public WebElement setUpHoursDown  ()
	{
		return driver.findElement(setUpHoursDown  );
	}
	
	public WebElement setUpMinutesUp  ()
	{
		return driver.findElement(setUpMinutesUp  );
	}
	
	public WebElement setUpMinutesDown  ()
	{
		return driver.findElement(setUpMinutesDown  );
	}
	
	public WebElement setUpAmPm  ()
	{
		return driver.findElement(setUpAmPm  );
	}
	
	public WebElement setUpAmPmText  ()
	{
		return driver.findElement(setUpAmPmText  );
	}
	
	public WebElement mealTypes  ()
	{
		return driver.findElement(mealTypes  );
	}
	
	public WebElement breakFastCheckBox  ()
	{
		return driver.findElement(breakFastCheckBox);
	}
	
	public WebElement happyHourCheckBox  ()
	{
		return driver.findElement(happyHourCheckBox  );
	}
	
	public WebElement chefs  ()
	{
		return driver.findElement(chefs  );
	}
	
	public WebElement chefBeverlyCheckBox  ()
	{
		return driver.findElement(chefBeverlyCheckBox  );
	}
	
	public WebElement chefGuruCheckBox  ()
	{
		return driver.findElement(chefGuruCheckBox  );
	}
	
	public WebElement chefJestCheckBox  ()
	{
		return driver.findElement(chefJestCheckBox  );
	}
	
	public WebElement price  ()
	{
		return driver.findElement(price  );
	}
	
	public WebElement priceHighToLow  ()
	{
		return driver.findElement(priceHighToLow  );
	}
	
	
	public WebElement priceLowToHigh  ()
	{
		return driver.findElement(priceLowToHigh  );
	}

	
	public WebElement Rating()
	{
		return driver.findElement(Rating);
	}
	
	public WebElement fiveStars  ()
	{
		return driver.findElement(fiveStars  );
	}
	
	public WebElement fourStars  ()
	{
		return driver.findElement(fourStars  );
	}
	
	public WebElement threeStars  ()
	{
		return driver.findElement(threeStars  );
	}
	
	public WebElement twoStars  ()
	{
		return driver.findElement(twoStars   );
	}
	
	public WebElement oneStar  ()
	{
		return driver.findElement(oneStar  );
	}
	
	public WebElement ratingsHtoL  ()
	{
		return driver.findElement(ratingsHtoL  );
	}
	
	public WebElement ratingsLtoH  ()
	{
		return driver.findElement(ratingsLtoH  );
	}
	
	public WebElement dietaryPref  ()
	{
		return driver.findElement(dietaryPref  );
	}
	
	public WebElement vegan  ()
	{
		return driver.findElement(vegan  );
	}
	
	public WebElement vegetarian  ()
	{
		return driver.findElement(vegetarian  );
	}
	
	public WebElement searchBox  ()
	{
		return driver.findElement(searchBox  );
	}
	
	public WebElement matchingResults  ()
	{
		return driver.findElement(matchingResults  );
	}
	
	public WebElement clearFilters  ()
	{
		return driver.findElement(clearFilters  );
	}
	
	public WebElement firstMenuCard  ()
	{
		return driver.findElement(firstMenuCard  );
	}
	
	public WebElement menuCard  ()
	{
		return driver.findElement(menuCard  );
	}
	
	public WebElement menuCardImages  ()
	{
		return driver.findElement(menuCardImages  );
	}
	
	public WebElement firstMenuCoverImage  ()
	{
		return driver.findElement(firstMenuCoverImage  );
	}
	
	public WebElement menuEntreeDisplay  ()
	{
		return driver.findElement(menuEntreeDisplay  );
	}
	
	
	public WebElement cuisineType  ()
	{
		return driver.findElement(cuisineType  );
	}
	
	
	public WebElement menuCuisineType  ()
	{
		return driver.findElement(menuCuisineType  );
	}
	
	public WebElement americanCuisine  ()
	{
		return driver.findElement(americancuisine);
	}
	
	public WebElement chefRatings  ()
	{
		return driver.findElement(chefRatings  );
	}
	
	public WebElement chefPicture  ()
	{
		return driver.findElement(chefPicture  );
	}
	
	public List<WebElement> chefPictures  ()
	{
		return driver.findElements(chefPicture  );
	}
	
	
	
	public WebElement chefAvPrice  ()
	{
		return driver.findElement(chefAvPrice  );
	}
	
	public WebElement chefName  ()
	{
		return driver.findElement(chefName  );
	}
	
	public WebElement clearCuisineTab  ()
	{
		return driver.findElement(clearCuisineTab  );
	}
	
	public WebElement closeSortingTab  ()
	{
		return driver.findElement(closeSortingTab  );
	}
	
	public WebElement clearMealTypeTab  ()
	{
		return driver.findElement(clearMealTypeTab  );
	}
	
	public WebElement clearChefsTab  ()
	{
		return driver.findElement(clearchefsTab  );
	}
	
	public WebElement clearRatingsTab  ()
	{
		return driver.findElement(clearRatingsTab  );
	}
	
	public WebElement clearDietaryTab  ()
	{
		return driver.findElement(clearDietaryTab  );
	}
	
	public WebElement menuPageTitle  ()
	{
		return driver.findElement(menuPageTitle);
	}
	
	public WebElement cuztomizeMenuBackButton  ()
	{
		return driver.findElement(customizeMenu);
	}
	
	
}
