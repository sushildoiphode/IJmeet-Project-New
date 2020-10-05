package com.ijmeet.keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import com.ijmeet.util.Constant;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keywords {
	public static void openBrowser(String browser) {

<<<<<<< HEAD
		switch(browser) 
		{
		     case "chrome":
			 WebDriverManager.chromedriver().setup();
			 Constant.driver = new ChromeDriver();
			 break;
		     case "firefox":
			 WebDriverManager.firefoxdriver().setup();
			 Constant.driver = new FirefoxDriver();
			 break;
		     case "IE":
			 WebDriverManager.iedriver().setup();
			 Constant.driver = new InternetExplorerDriver();
			 break;
		
		     default:
			System.out.println("Open url successfully");
		}
=======
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			Constant.driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			Constant.driver = new FirefoxDriver();
			break;
		case "IE":
			WebDriverManager.iedriver().setup();
			Constant.driver = new InternetExplorerDriver();
			break;

		default:
			System.out.println("Open url successfully");
		}
	}

	public static void launchUrl(String url) {
		Constant.driver.get(url);
	}

	public static WebElement getWebElement(String locatorType, String locatorValue) {
		WebElement element = null;
		switch (locatorType) {

		case "XPATH":
			element = Constant.driver.findElement(By.xpath(locatorValue));
			break;

		case "CSS":
			element = Constant.driver.findElement(By.cssSelector(locatorValue));
			break;

		case "ID":
			element = Constant.driver.findElement(By.id(locatorValue));
			break;

		case "LINKTEXT":
			element = Constant.driver.findElement(By.linkText(locatorValue));
			break;

		case "PARTIALLINKTEXT":
			element = Constant.driver.findElement(By.partialLinkText(locatorValue));
			break;
		default:
			System.err.println("Invalid Locator Type");
		}

		return element;
	}

	public static void enterText(String locatorType, String locatorValue, String textToEnter) {
		getWebElement(locatorType, locatorValue).sendKeys(textToEnter);
	}

	public static void clickOnElement(String locatorType, String locatorValue) {
		getWebElement(locatorType, locatorValue).click();
	}

	public static void selectValueFromDropdown(String locatorType, String locatorValue, String textToSelect) {
		WebElement element = getWebElement(locatorType, locatorValue);
		Select select = new Select(element);
		select.selectByVisibleText(textToSelect);
	}

	public static boolean isElementDisplayed(String locatorType, String locatorValue) {
		return getWebElement(locatorType, locatorValue).isDisplayed();
	}

	public static void closeBrowser() {
		Constant.driver.close();
	}

	public static void quitBrowser() {
		Constant.driver.quit();
>>>>>>> 015dbf5bc2964fe3522f0e216ad7fedc8abb5835
	}
	
}
