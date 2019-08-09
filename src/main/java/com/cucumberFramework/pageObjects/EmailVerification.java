package com.cucumberFramework.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumberFramework.helper.WaitHelper;

public class EmailVerification {
	
		private WebDriver driver;

		WaitHelper waitHelper;
		
		By username = By.id("username");
		By password = By.id("password");
		By loginButton = By.id("login_btn");
		By inbox = By.className("navigationItem-title");
		By firstEmail = By.cssSelector("span.subject-text.ellipsis");
		By emailText = By.cssSelector("#conversationHeader");
		By emailBody = By.cssSelector("#message0 > div:nth-child(2) > div.frame.message-frame > div");
		By emailCheckbox = By.xpath("//*[@id=\"conversation-list-columns\"]/section/div/div[1]");
		By emailDelete = By.xpath("//div[@class='pm_buttons moveElement-container']//button[1]");
		By surveyEmailBody = By.cssSelector("body.appConfigBody-is-mac.secure.appConfigBody-is-free:nth-child(2) div.conversationView-container section.conversation-container article.message.hasSender.open div.frame.message-frame div.bodyDecrypted.email.message-body-container th:nth-child(3) table:nth-child(1) tbody:nth-child(1) tr:nth-child(1) > th:nth-child(1)");
		By loadMessageBody = By.cssSelector("button.displayContentBtn-button.pm_button");
		By submitSurveyPage = By.xpath("//h1[text()=\"Please provide your feedback on today's chef/food?\"]");
		By star = By.className("star");
		By chefReviewBox = By.cssSelector("#app > div > div > div:nth-child(1) > div > div > div.textarea-container > textarea");
		By okCaptainRating = By.cssSelector("#app > div > div > div:nth-child(2) > div > div > div.radio-button-container > div:nth-child(3) > label:nth-child(3)");
		By commentsForCaptain = By.cssSelector("#app > div > div > div:nth-child(2) > div > div > div.textarea-container > textarea");
		By questionBox = By.cssSelector("#app > div > div > div:nth-child(3) > div > div > div > textarea");
		By feedbackBox = By.cssSelector("#app > div > div > div:nth-child(4) > div > div > div > textarea");
		By submitSurveyButton = By.className("submit-survey");
		By surveyCompleted = By.cssSelector("#app > div > div > div > h1");
		
		
		
		
		
		
		
		
		
		public EmailVerification(WebDriver driver) {
			this.driver = driver;
			waitHelper = new WaitHelper(driver);
		}
		

		
		
		public WebElement loadMessageBody()
		{
			return driver.findElement(loadMessageBody);
		}
		
		public WebElement surveyCompleted()
		{
			return driver.findElement(surveyCompleted);
		}
		
		
		public WebElement surveyEmailBody()
		{
			return driver.findElement(surveyEmailBody);
		}
		
		
		public WebElement submitSurveyPage()
		{
			return driver.findElement(submitSurveyPage);
		}
		
		public WebElement star()
		{
			return driver.findElement(star);
		}
		
		public WebElement chefReviewBox()
		{
			return driver.findElement(chefReviewBox);
		}
		
		public WebElement okCaptainRating()
		{
			return driver.findElement(okCaptainRating);
		}
		
		public WebElement commentsForCaptain()
		{
			return driver.findElement(commentsForCaptain);
		}
		
		public WebElement questionBox()
		{
			return driver.findElement(questionBox);
		}
		
		public WebElement feedbackBox()
		{
			return driver.findElement(feedbackBox);
		}
		
		public WebElement submitSurveyButton()
		{
			return driver.findElement(submitSurveyButton);
		}
		
		public WebElement emailCheckbox()
		{
			return driver.findElement(emailCheckbox);
		}
		
		public WebElement emailDelete()
		{
			return driver.findElement(emailDelete);
		}
		
		
		public WebElement emailBody  ()
		{
			return driver.findElement(emailBody  );
		}
		
		public WebElement username  ()
		{
			return driver.findElement(username  );
		}
		
		
		public WebElement password  ()
		{
			return driver.findElement(password  );
		}
		
		
		public WebElement loginButton  ()
		{
			return driver.findElement(loginButton  );
		}
		
		
		public WebElement inbox  ()
		{
			return driver.findElement(inbox  );
		}
		
		
		public WebElement firstEmail  ()
		{
			return driver.findElement(firstEmail  );
		}
		
		
		public WebElement emailText  ()
		{
			return driver.findElement(emailText  );
		}
		
}
