package com.cucumberFramework.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumberFramework.helper.WaitHelper;

public class ChefDashPageObjects {

	private WebDriver driver;
    WaitHelper waitHelper;
    
    
    By username = By.id("login_email-input-d");
    By password = By.id("login_password-input-d");
    By loginButton = By.id("login_submit-btn-d");
    By forgotPasswordLink = By.id("login_forgot-pwd-btn-d");
    By requestPasswordEmail = By.id("request-pwd_email-input-d");
    By requestPasswordSendEmail = By.id("request-pwd_submit-btn-d");
    By hungryLogo = By.id("navbar_logo-btn-d");
    By dateField = By.id("navbar_date-picker-d");
    By dateToday = By.id("react-datepicker__day react-datepicker__day--012 react-datepicker__day--keyboard-selected react-datepicker__day--today");
    By day15 = By.id("react-datepicker__day react-datepicker__day--015");
    By dateWeek = By.id("react-datepicker__week");
    By day1 = By.id("react-datepicker__day react-datepicker__day--001");
    By day31 = By.id("react-datepicker__day react-datepicker__day--031");
    By cancelSortDate = By.id("cancel-x");
    By logOut = By.id("navbar_logout-btn-d");
    By orderNumber = By.id("order-number");
    By orderDate = By.id("date");
    By mealType = By.id("meal-type");
    By lightFonts = By.className("font-light");
    By changes = By.className("font-bold");
    By headCount = By.id("head-count");
    By menuItems = By.className("font-regular mt-2 block");
    By specialInstructions = By.id("special-instructions");
    By totalColumn = By.className("text-lg font-regular");
    By viewButton = By.id("print");
    By orderDetailsMealTypeHeader = By.id("mealId");
    By repName = By.id("salesRep");
    By captainName = By.id("captain");
    By scheduleConflictContact = By.id("scheduleConflictId");
    By orderDetailsMenuItems = By.id("itemNum");
    By orderDetailsDietaryRestric = By.id("pt-1 text-blue font-semibold text-sm");
    By orderDetailsServingSize = By.id("servingNum");
    By orderDetailsChefPayOut = By.id("totalPayAmount");
    By orderDetailsPDFbutton = By.id("print");
    By orderDetailsBackLink = By.id("backButtonId");
    By confirmCancelOrderButton = By.id("print");
    By acceptChangesButton = By.id("acceptId");
    By replacedSpecialInstructions = By.className("line-through");
    By newSpecialInstructions = By.className("font-semibold");
    By repPhoneNumber = By.cssSelector("div.flex.flex-col.items-center.justify-center div.h-screen.max-w-5xl.w-full.items-center.flex-col.flex.px-10 div.mt-10.max-w-3xl.w-full div.bg-white.my-5.rounded.shadow-lg.flex.mt-12 div.relative.border-r-2.border-grey.border-solid.w-400 div.p-4.pt-6 p.font-regular.text-base.mt-3.flex.items-center:nth-child(6) a.tooltip-container.items-center.no-underline.text-black div.font-light.flex.items-center div.relative > div.tooltip.absolute.z-10.bg-blue.text-white.p-3.rounded-sm.text-center.whitespace-no-wrap.w-200.font-bold");
    By captainPhoneNumber = By.cssSelector("div.flex.flex-col.items-center.justify-center div.h-screen.max-w-5xl.w-full.items-center.flex-col.flex.px-10 div.mt-10.max-w-3xl.w-full div.bg-white.my-5.rounded.shadow-lg.flex.mt-12 div.relative.border-r-2.border-grey.border-solid.w-400 div.p-4.pt-6 p.font-regular.text-base.mt-3.flex.items-center:nth-child(7) a.tooltip-container.flex.items-center.no-underline.text-black span.font-light.flex.items-center div.relative > div.tooltip.absolute.z-10.bg-blue.text-white.p-3.rounded-sm.text-center.w-200.whitespace-no-wrap.font-bold");
    
    
    
    
    public ChefDashPageObjects(WebDriver driver) {
        this.driver = driver;
        waitHelper = new WaitHelper(driver);
    }
    
    public WebElement username() {
        
        return driver.findElement(username);
    }
    
    
    public List<WebElement> changes() {
        
        return driver.findElements(changes);
    }
    
    
    public WebElement password() {
        
        return driver.findElement(password);
    }
    
    public WebElement loginButton() {
        
        return driver.findElement(loginButton);
    }
    public WebElement forgotPasswordLink() {
        
        return driver.findElement(forgotPasswordLink);
    }
    
    public WebElement requestPasswordEmail() {
        
        return driver.findElement(requestPasswordEmail);
    }
    
    public WebElement requestPasswordSendEmail() {
        
        return driver.findElement(requestPasswordSendEmail);
    }
    public WebElement hungryLogo() {
        
        return driver.findElement(hungryLogo);
    }
    
    public WebElement dateField() {
        
        return driver.findElement(dateField);
    }
    
    public WebElement dateToday() {
        
        return driver.findElement(dateToday);
    }
    public WebElement day15() {
        
        return driver.findElement(day15);
    }
    
    public WebElement dateWeek() {
        
        return driver.findElement(dateWeek);
    }
    
    public WebElement day1() {
        
        return driver.findElement(day1);
    }
    public WebElement day31() {
        
        return driver.findElement(day31);
    }
    
    public WebElement cancelSortDate() {
        
        return driver.findElement(cancelSortDate);
    }
    
    public WebElement logOut() {
        
        return driver.findElement(logOut);
    }
    public WebElement orderNumber() {
        
        return driver.findElement(orderNumber);
    }
    
    public WebElement orderDate() {
        
        return driver.findElement(orderDate);
    }
    
    public WebElement mealType() {
        
        return driver.findElement(mealType);
    }
    
    public List<WebElement> lightFonts() {
        
        return driver.findElements(lightFonts);
    }
    
    public WebElement headCount() {
        
        return driver.findElement(headCount);
    }
    
    public WebElement menuItems() {
        
        return driver.findElement(menuItems);
    }
    public WebElement specialInstructions() {
        
        return driver.findElement(specialInstructions);
    }
    
    public WebElement totalColumn() {
        
        return driver.findElement(totalColumn);
    }
    
    public WebElement viewButton() {
        
        return driver.findElement(viewButton);
    }
    public WebElement orderDetailsMealTypeHeader() {
        
        return driver.findElement(orderDetailsMealTypeHeader);
    }
    
    public WebElement repName() {
        
        return driver.findElement(repName);
    }
    
    
    public WebElement captainName() {
        
        return driver.findElement(captainName);
    }
    
    
    public WebElement scheduleConflictContact() {
        
        return driver.findElement(scheduleConflictContact);
    }
    public WebElement orderDetailsMenuItems() {
        
        return driver.findElement(orderDetailsMenuItems);
    }
    
    public WebElement orderDetailsDietaryRestric() {
        
        return driver.findElement(orderDetailsDietaryRestric);
    }
    
    public WebElement orderDetailsServingSize() {
        
        return driver.findElement(orderDetailsServingSize);
    }
    public WebElement orderDetailsChefPayOut() {
        
        return driver.findElement(orderDetailsChefPayOut);
    }
    
    public WebElement orderDetailsPDFbutton() {
        
        return driver.findElement(orderDetailsPDFbutton);
    }
    
    public WebElement orderDetailsBackLink() {
        
        return driver.findElement(orderDetailsBackLink);
    }
    public WebElement confirmCancelOrderButton() {
        
        return driver.findElement(confirmCancelOrderButton);
    }
    
    public WebElement acceptChangesButton() {
        
        return driver.findElement(acceptChangesButton);
    }
    
    public WebElement replacedSpecialInstructions() {
        
        return driver.findElement(replacedSpecialInstructions);
    }  
    public WebElement newSpecialInstructions() {
        
        return driver.findElement(newSpecialInstructions);
    } 
    public WebElement repPhoneNumber() {
        
        return driver.findElement(repPhoneNumber);
    } 
    
    public WebElement CaptainPhoneNumber() {
        
        return driver.findElement(captainPhoneNumber);
    } 
}
