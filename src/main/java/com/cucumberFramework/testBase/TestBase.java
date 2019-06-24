package com.cucumberFramework.testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import com.cucumberFramework.enums.Browsers;
import com.cucumberFramework.enums.OS;


public class TestBase {

	public  static WebDriver driver;

	protected int time = 2000;
	protected int time1 = 1000;
	protected int time2 = 500;
	protected String adminStaging = "https://admin.staging.tryhungry.com/" ;
	protected String marketPlaceStaging = "https://staging.tryhungry.com/";
	protected String opsSite = "https://ops.staging.tryhungry.com/";

	public String orderAmount;
	
	public WebDriver selectBrowser(String browser) {
		if (System.getProperty("os.name").toLowerCase().contains(OS.WINDOW.name().toLowerCase())) {
			if (browser.equalsIgnoreCase(Browsers.CHROME.name())) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
				//System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

				
				ChromeOptions options = new ChromeOptions();
				options.addArguments("disable-infobars");
				options.addArguments("start-maximized");
				options.addArguments("enable-automation");
				options.addArguments("--headless");
				options.addArguments("--window-size=1920,1080");
				options.addArguments("--no-sandbox");
				options.addArguments("--disable-extensions");
				options.addArguments("--dns-prefetch-disable");
				options.addArguments("--disable-gpu");
				options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
				options.addArguments("--disable-browser-side-navigation");

				driver = new ChromeDriver(options);
				//driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				System.out.println(driver.manage().window().getSize());
				driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);	
				
				
			} else if (browser.equalsIgnoreCase(Browsers.FIREFOX.name())) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
		} else if (System.getProperty("os.name").toLowerCase().contains(OS.MAC.name().toLowerCase())) {
			if (browser.equalsIgnoreCase(Browsers.CHROME.name())) {
				System.setProperty("webdriver.gecko.driver", "/Users/tahirnas/Downloads/geckodriver");
				

				FirefoxOptions options = new FirefoxOptions();
				options.addPreference("dom.disable_beforeunload", true);
				driver = new FirefoxDriver(options);
				
				
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				System.out.println(driver.manage().window().getSize());
				driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);	

				
				
				} else if (browser.equalsIgnoreCase(Browsers.FIREFOX.name())) {
				System.setProperty("webdriver.firefox.marionette", "/Users/tahirnas/Downloads/geckodriver");
				
				FirefoxOptions options = new FirefoxOptions();
				options.addArguments("disable-infobars");
				
				driver = new FirefoxDriver(options);

				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				System.out.println(driver.manage().window().getSize());
				driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);	
				
			}
		}
		
		return driver;
	}
}
