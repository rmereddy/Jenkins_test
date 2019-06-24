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

public class HomePage {

	private WebDriver driver;

	WaitHelper waitHelper;

	By home = By.cssSelector(".basic-link");
	By login = By.xpath("//*[@id=\"app\"]/div/div[2]/header/nav/div[6]/a");
    By aboutUs = By.xpath("//*[@id=\"app\"]/div/div[2]/header/nav/div[4]/p");
    By orderInDC = By.xpath("//a[contains(text(),'See Menus in D.C. Metro Area')]");
    By orderInPA = By.id("marketplace-nav-button(2)");
    By homepageZipCode = By.id("zipcode");
    By seeMenusButton = By.cssSelector("button.cta.shadow-md");
	By callMeNowLink = By.linkText("Call Me Now");
	By menus = By.cssSelector("p.basic-link");
	By menusDC = By.xpath("//a[contains(text(),'Washington, DC')]");
	By menusPA = By.cssSelector(".menu-dropdown__inner > a:nth-child(2)");
	By mission = By.xpath("//a[text() = 'Mission']");
	By media = By.xpath("//a[text() = 'Media']");
	By faq = By.linkText("FAQ");
	By testimonials = By.cssSelector("#app > div > div.homepage-container > header > nav > div:nth-child(4) > div > a:nth-child(4)");
	By callUs = By.cssSelector("#app > div > div.homepage-container > header > nav > div:nth-child(5) > a");
	By contactUs = By.xpath("//a[contains(text(),'Contact Us')]");
	By chat = By.tagName("button");
	By termsOfUse = By.linkText("Terms of Use & Privacy Policy");
	By email = By.linkText("hello@tryhungry.com");
	By emailInputBox = By.id("mce-EMAIL");
	By subscribe = By.cssSelector("#mc-embedded-subscribe");
	By links = By.tagName("a");
	By images = By.tagName("img");
	By chef1 = By.xpath("(//img[@class='teaser-food'])[1]");
	By chef2 = By.xpath("(//img[@class='teaser-food'])[2]");
	By chef3 = By.xpath("(//img[@class='teaser-food'])[3]");
	By chef4 = By.xpath("(//img[@class='teaser-food'])[4]");
	By chef5 = By.xpath("(//img[@class='teaser-food'])[5]");
	By chef6 = By.xpath("(//img[@class='teaser-food'])[6]");
	By openMenuIcon = By.cssSelector(".hamburger-nav-icon");
	By openMenuDCMenus = By.cssSelector(".nav-container-hamburger__inner-link-container > div:nth-child(2) > a:nth-child(1)");
	By openMenuPAMenus = By.cssSelector(".nav-container-hamburger__inner-link-container > div:nth-child(3) > a:nth-child(1)");
	By openMenusMission = By.cssSelector(".nav-container-hamburger__inner-link-container > div:nth-child(4) > a:nth-child(1)");
	By openMenuPress = By.cssSelector(".nav-container-hamburger__inner-link-container > div:nth-child(4) > a:nth-child(1)");
	By openMenuFAQS = By.cssSelector(".nav-container-hamburger__inner-link-container > div:nth-child(6) > a:nth-child(1)");
	By openMenuTestimonials = By.cssSelector(".nav-container-hamburger__inner-link-container > div:nth-child(7) > a:nth-child(1)");
	By openMenuContactNumber = By.cssSelector(".phone-link");
	By openMenuLogin = By.cssSelector(".nav-container-hamburger__inner-link-container > div:nth-child(9) > a:nth-child(1)");
	By homepageDateField = By.className("react-datepicker-wrapper");
	By selectedDate = By.xpath("//div[@class='react-datepicker__day react-datepicker__day--thu react-datepicker__day--keyboard-selected']");
	By homepageTimeField = By.className("form-control");
	By timeArrows = By.className("rdtBtn");
	By timeDigits = By.className("rdtCount");
	
	

	
	


	public HomePage(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}
	public WebElement homepageDateField()
	{
		return driver.findElement(homepageDateField);
	}
	
	public WebElement selectedDate()
	{
		return driver.findElement(selectedDate);
	}
	
	public WebElement homepageTimeField()
	{
		return driver.findElement(homepageTimeField);
	}
	
	public List<WebElement> timeArrows()
	{
		return driver.findElements(timeArrows);
	}
	
	public List<WebElement> timeDigits()
	{
		return driver.findElements(timeDigits);
	}
	
	
	public WebElement openMenuLogin()
	{
		return driver.findElement(openMenuLogin);
	}
	
	public WebElement openMenuContactNumber()
	{
		return driver.findElement(openMenuContactNumber);
	}
	
	public WebElement openMenuTestimonials()
	{
		return driver.findElement(openMenuTestimonials);
	}
	
	public WebElement openMenuFAQS()
	{
		return driver.findElement(openMenuFAQS);
	}
	
	public WebElement openMenuPress()
	{
		return driver.findElement(openMenuPress);
	}
	
	
	public WebElement seeMenusButton()
	{
		return driver.findElement(seeMenusButton);
	}
	
	public WebElement openMenusMission()
	{
		return driver.findElement(openMenusMission);
	}
	
	public WebElement openMenuPAMenus()
	{
		return driver.findElement(openMenuPAMenus);
	}
	
	public WebElement openMenuDCMenus()
	{
		return driver.findElement(openMenuDCMenus);
	}
	
	public WebElement openMenuIcon()
	{
		return driver.findElement(openMenuIcon);
	}
	
	public WebElement homeButton()
	{
		return driver.findElement(home);
	}

	
	public WebElement loginSignUpButton()
	{
		return driver.findElement(login);
	}
	
	public WebElement orderInPA()
	{
		return driver.findElement(orderInPA);
	}
	
	
	public WebElement orderInDC()
	{
		return driver.findElement(orderInDC);
	}
	
	public WebElement aboutUs()
	{
		return driver.findElement(aboutUs);
	}
	
	
	public WebElement callMeNowLink()
	{
		return driver.findElement(callMeNowLink);
	}
	
	public WebElement menusButton()
	{
		return driver.findElement(menus);
	}
	
	public WebElement menusDC()
	{
		return driver.findElement(menusDC);
	}
	
	
	public WebElement homepageZipCode()
	{
		return driver.findElement(homepageZipCode);
	}
	
	
	
	public WebElement menusPA()
	{
		return driver.findElement(menusPA);
	}
	
	public WebElement missionButton()
	{
		return driver.findElement(mission);
	}
	
	public WebElement mediaButton()
	{
		return driver.findElement(media);
	}
	
	public WebElement faqButton()
	{
		return driver.findElement(faq);
	}
	
	
//	public WebElement testimonialsButton()
//	{
//		return driver.findElement(testimonials);
//	}
	
	
	public WebElement callUsButton()
	{
		return driver.findElement(callUs);
	}

	public WebElement contactUsButton()
	{
		return driver.findElement(contactUs);
	}
	
	public WebElement chatFeature()
	{
		return driver.findElement(chat);
	}

	public WebElement termsOfUseLink()
	{
		return driver.findElement(termsOfUse);
	}

	public WebElement emailLink()
	{
		return driver.findElement(email);
	}

	public WebElement emailInputBox()
	{
		return driver.findElement(emailInputBox);
	}
	
	public WebElement subscribeLink()
	{
		return driver.findElement(subscribe);
	}
	
	public WebElement chef1()
	{
		return driver.findElement(chef1);
	}
	
	public WebElement chef2()
	{
		return driver.findElement(chef2);
	}
	
	public WebElement chef3()
	{
		return driver.findElement(chef3);
	}
	
	public WebElement chef4()
	{
		return driver.findElement(chef4);
	}
	
	public WebElement chef5()
	{
		return driver.findElement(chef5);
	}
	
	public WebElement chef6()
	{
		return driver.findElement(chef6);
	}
	
	public List<WebElement> links()
	{
		return driver.findElements(links);
	}
	
	public List<WebElement> images()
	{
		return driver.findElements(images);
	}

	public WebElement testimonialsButton() {
		// TODO Auto-generated method stub
		return driver.findElement(testimonials);
	}


	
	
}
