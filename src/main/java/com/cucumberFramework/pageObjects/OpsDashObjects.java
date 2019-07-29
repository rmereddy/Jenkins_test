package com.cucumberFramework.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumberFramework.helper.WaitHelper;

public class OpsDashObjects {
	
	private WebDriver driver;

	WaitHelper waitHelper;
	
	
	
	By email = By.xpath("//input[@placeholder='Email']");
	By password = By.xpath("//input[@placeholder='Password']");
	By locationDropdown = By.className("login-selector");
	By loginButton = By.className("login-button");
	By updatesAlert = By.className("mobile-container__inner image-slider-container update-modal");
	By closeUpdatesAlert = By.className("close");
	By topTaps = By.className("react-tabs__tab");
	By cateringsTab = By.id("react-tabs-0");
	By dateBox = By.className("flatpickr-input");
	By currentMonth = By.className("cur-month");
	By currentYear = By.className("numInput cur-year");
	By nextMonthArrow = By.className("arrowUp");
	By previousMonthArrow = By.className("arrowDown");
	By today = By.cssSelector("span.flatpickr-day.today");
	By todaySelected = By.cssSelector("span.flatpickr-day.today.selected");
	By prevMonthDay = By.className("flatpickr-day prevMonthDay");
	By days = By.className("flatpickr-day");
	By nextMonthDay = By.className("flatpickr-day nextMonthDay");
	By orderPanel = By.className("//*[@id=\"react-tabs-1\"]/div/table/tbody/tr[2]");
	By orderColumn = By.cssSelector("td.order-column.p-t-10.p-r-10");
	By orderNumber = By.id("order-number");
	By PDFs = By.className("download-pdf");
	By emailChefButton = By.className("button-blue m-bottom-s small-padding");
	By checkbox = By.className("checkbox");
	By serviceNotes = By.id("service-text");
	By pointOfAccessPanel = By.className("p-r-10");
	By setupByTime = By.className("time-container nowrap gray");
	By recalcTimes = By.className("calculate-service-times");
	By catptainSelects = By.className("dropdown");
	By locationPanel = By.className("inner-table location");
	By numberOfCaterings = By.cssSelector("#react-tabs-1 > div > div.desktop-button-container > div.calendar-container > p");
	By orderRow = By.id("order-row");
	By clientName = By.id("client-name");
	By emailChefsButton = By.id("button-blue m-bottom-s small-padding");
	By pdfDocuments = By.id("download-pdf");
	By VIPcheckbox = By.id("checkbox");
	By headCount = By.xpath("//p[contains(text(),'30')]");
	By salesRep = By.id("sales-rep");
	By callOnArrival = By.id("call-on-arrival");
	By buildingAccess = By.id("building-access");
	By pointOfAccess = By.id("point-of-access");
	By setUpTime = By.id("time-container nowrap gray");
	By calculateServiceTimes = By.className("link");
	By calcRouteClientName = By.className("google-time-title");
	By BufferMinutes = By.cssSelector("#react-tabs-1 > div > div.google-time-form-container > div > form > div.form-with-label.default-buffer.m-r-10 > input[type=number]");
	By numberOfCateringCaptains = By.xpath("//input[@name='cateringCaptainNumber']");
	By hubfirstCheckbox = By.xpath("//input[@name='hubFirst']");
	By calcRouteButton = By.className("button-orange");
	By captainRoutes = By.className("single-captain-route");
	By captainNumber = By.className("captain-separator");
	By locations = By.className("route-list-item");
	By locationNames = By.className("column-1");
	By locationAddresses = By.className("column-3");
	By saveTimesButton = By.className("button-blue");
	By recalculateTimes = By.className("calculate-service-times");
	By suppliesLocations = By.className("supplies");
	By chefNames = By.id("chef-name");
	By routeClientNames = By.className("client-name");
	By orderOverviewRow = By.className("table-row");
	By orderOverviewClientName = By.className("overview-client");
	By orderOverviewOrderNumber = By.xpath("//p[@class='bold overview-number']");
	By orderDetails = By.xpath("//p[contains(text(),'Details')]");
	
	
	
	
	
	
	
	
	
	public OpsDashObjects(WebDriver driver) {
		this.driver = driver;
		waitHelper = new WaitHelper(driver);
	}
	
	
	public List<WebElement> orderOverviewRow ()
	{
		return driver.findElements(orderOverviewRow   );
	}
	
	public WebElement updatesAlert ()
	{
		return driver.findElement(updatesAlert   );
	}
	
	public List<WebElement> orderOverviewOrderNumber ()
	{
		return driver.findElements(orderOverviewOrderNumber   );
	}
	
	public List<WebElement> orderOverviewClientName ()
	{
		return driver.findElements(orderOverviewClientName   );
	}
	

	public List<WebElement> orderRow ()
	{
		return driver.findElements(orderRow   );
	}
	
	public WebElement closeUpdatesAlert ()
	{
		return driver.findElement(closeUpdatesAlert  );
	}
	
	
	public WebElement order ()
	{
		return driver.findElement(orderRow  );
	}
	
	public WebElement orderDetails ()
	{
		return driver.findElement(orderDetails  );
	}
	
	public WebElement cateringsTab ()
	{
		return driver.findElement(cateringsTab   );
	}
	
	
	public List<WebElement> clientName ()
	{
		return driver.findElements(clientName   );
	}
	
	
	public WebElement emailChefsButton ()
	{
		return driver.findElement(emailChefsButton   );
	}
	
	
	public List<WebElement> pdfDocuments ()
	{
		return driver.findElements(pdfDocuments   );
	}
	
	
	public WebElement VIPcheckbox ()
	{
		return driver.findElement(VIPcheckbox   );
	}
	
	
	public List<WebElement> headCount ()
	{
		return driver.findElements(headCount   );
	}
	
	
	public List<WebElement> salesRep ()
	{
		return driver.findElements(salesRep   );
	}
	
	
	public WebElement callOnArrival ()
	{
		return driver.findElement(callOnArrival   );
	}
	
	
	public WebElement buildingAccess ()
	{
		return driver.findElement(buildingAccess   );
	}
	
	
	public WebElement pointOfAccess ()
	{
		return driver.findElement(pointOfAccess   );
	}
	
	
	public WebElement setUpTime ()
	{
		return driver.findElement(setUpTime   );
	}
	
	
	public WebElement calculateServiceTimes ()
	{
		return driver.findElement(calculateServiceTimes   );
	}
	
	
	public WebElement calcRouteClientName ()
	{
		return driver.findElement(calcRouteClientName   );
	}
	
	
	public WebElement BufferMinutes ()
	{
		return driver.findElement(BufferMinutes   );
	}
	
	
	public WebElement numberOfCateringCaptains ()
	{
		return driver.findElement(numberOfCateringCaptains   );
	}
	
	
	
	public WebElement hubfirstCheckbox ()
	{
		return driver.findElement(hubfirstCheckbox   );
	}
	
	
	public WebElement calcRouteButton ()
	{
		return driver.findElement(calcRouteButton   );
	}
	
	
	public List<WebElement> captainRoutes ()
	{
		return driver.findElements(captainRoutes   );
	}
	
	
	public List<WebElement> captainNumber ()
	{
		return driver.findElements(captainNumber  );
	}
	
	
	public List<WebElement> locations ()
	{
		return driver.findElements(locations   );
	}
	
	
	public List<WebElement> locationNames ()
	{
		return driver.findElements(locationNames   );
	}
	
	
	public List<WebElement> locationAddresses ()
	{
		return driver.findElements(locationAddresses   );
	}
	
	
	public WebElement saveTimesButton ()
	{
		return driver.findElement(saveTimesButton   );
	}
	
	
	public WebElement recalculateTimes ()
	{
		return driver.findElement(recalculateTimes   );
	}
	
	
	public List<WebElement> suppliesLocations ()
	{
		return driver.findElements(suppliesLocations   );
	}
	
	
	public List<WebElement> chefNames ()
	{
		return driver.findElements(chefNames   );
	}
	
	
	public List<WebElement> routeClientNames ()
	{
		return driver.findElements(routeClientNames   );
	}
	
	
	
	public WebElement numberOfCaterings ()
	{
		return driver.findElement(numberOfCaterings   );
	}
	

	public WebElement locationPanel ()
	{
		return driver.findElement(locationPanel   );
	}
	

	public List<WebElement> catptainSelects ()
	{
		return driver.findElements(catptainSelects );
	}
	

	public WebElement recalcTimes ()
	{
		return driver.findElement(recalcTimes   );
	}
	

	public WebElement setupByTime ()
	{
		return driver.findElement(setupByTime   );
	}
	

	public WebElement pointOfAccessPanel ()
	{
		return driver.findElement(pointOfAccessPanel   );
	}
	

	public WebElement serviceNotes ()
	{
		return driver.findElement(serviceNotes   );
	}
	

	public List<WebElement> checkbox ()
	{
		return driver.findElements(checkbox   );
	}
	

	public WebElement emailChefButton ()
	{
		return driver.findElement(emailChefButton   );
	}
	

	public List<WebElement> PDFs ()
	{
		return driver.findElements(PDFs   );
	}
	
	

	public List<WebElement> orderNumber ()
	{
		return driver.findElements(orderNumber   );
	}
	
	

	public WebElement orderColumn ()
	{
		return driver.findElement(orderColumn   );
	}
	

	public WebElement orderPanel ()
	{
		return driver.findElement(orderPanel   );
	}
	

	public WebElement nextMonthDay ()
	{
		return driver.findElement(nextMonthDay   );
	}
	

	public List<WebElement> days ()
	{
		return driver.findElements(days   );
	}
	

	public WebElement prevMonthDay ()
	{
		return driver.findElement(prevMonthDay   );
	}
	

	public WebElement todaySelected ()
	{
		return driver.findElement(todaySelected   );
	}
	

	public WebElement today ()
	{
		return driver.findElement(today   );
	}
	

	public WebElement previousMonthArrow ()
	{
		return driver.findElement(previousMonthArrow   );
	}
	

	public WebElement nextMonthArrow ()
	{
		return driver.findElement(nextMonthArrow   );
	}
	

	public WebElement currentYear ()
	{
		return driver.findElement(currentYear   );
	}
	
	

	public WebElement currentMonth ()
	{
		return driver.findElement(currentMonth   );
	}
	
	

	public WebElement dateBox ()
	{
		return driver.findElement(dateBox   );
	}
	

	public List<WebElement> topTaps ()
	{
		return driver.findElements(topTaps);
	}
	

	public WebElement loginButton ()
	{
		return driver.findElement(loginButton   );
	}
	


	public WebElement locationDropdown ()
	{
		return driver.findElement(locationDropdown   );
	}
	

	public WebElement password ()
	{
		return driver.findElement(password   );
	}
	
	

	public WebElement email ()
	{
		return driver.findElement(email   );
	}

}
