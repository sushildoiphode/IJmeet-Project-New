package com.ijmeet.functionaltests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ijmeet.keywords.Keywords;
import com.ijmeet.pages.HomePage;
import com.ijmeet.keywords.FEKeywords;
import com.ijmeet.util.Constant;
import com.ijmeet.util.FileUtil;
import com.ijmeet.util.TestBase;
import com.ijmeet.util.WaitFor;



public class HomePageTests extends TestBase {
	private static Logger log = Logger.getLogger(HomePageTests.class);
	private HomePage home;
	
	@BeforeMethod
	private void intializePage() {
		home=new HomePage();

	}

	@Test
	public void verifyIsHomePageVisible() {
		String actual_Url=Constant.driver.getCurrentUrl();
		String expected_Url="https://ijmeet.com/";
		Assert.assertEquals(expected_Url,actual_Url);
		log.info("IJMEET_HomePage is visible");

	}

	@Test
	public void verifyIsLogoPresent() {

		boolean flag=FEKeywords.isElementDisplayed(FileUtil.getLocator("homepage.logo")[0],FileUtil.getLocator("homepage.logo")[1]);
		log.info("logo is present"+flag);
		Assert.assertTrue(flag);
	}

	@Test
	public void verifyTitleOnHomePage() {

		String actualTitle=Constant.driver.getTitle();
		String expectedTitle="IJmeet";
		log.info("Title name: "+actualTitle);
		Assert.assertEquals(expectedTitle,actualTitle);

	}

	@Test
	public void verifyPresenceOfAllMenuItems() {

		boolean menuItemsVisible=FEKeywords.displayListOfItems(FileUtil.getLocator("homepage.menu-items")[0],FileUtil.getLocator("homepage.menu-items")[1], "a");
		Assert.assertTrue(menuItemsVisible);
	}

	@Test
	public  void verifyIsJoinMeetingPageAvailable(){
		FEKeywords.clickOnElement(FileUtil.getLocator("homepage.joinmeeting")[0],FileUtil.getLocator("homepage.joinmeeting")[1]);
		String actualUrl=Constant.driver.getCurrentUrl();
		System.out.println(actualUrl);
		String expectedUrl ="https://ijmeet.com/app";
		Assert.assertEquals(expectedUrl,actualUrl);
	}

	@Test
	public void verifyIsHostMeetingPageAvailable() {
		FEKeywords.clickOnElement(FileUtil.getLocator("homepage.hostmeeting")[0],FileUtil.getLocator("homepage.hostmeeting")[1]);
		String actualUrl=Constant.driver.getCurrentUrl();
		String expectedUrl ="https://ijmeet.com/host_meeting";
		Assert.assertEquals(expectedUrl,actualUrl);
	}

	@Test
	public void verifyIsContactSalesPageAvailable() {
		FEKeywords.clickOnElement(FileUtil.getLocator("homepage.hostmeeting")[0],FileUtil.getLocator("homepage.hostmeeting")[1]);
		String actualUrl=Constant.driver.getCurrentUrl();
		String expectedUrl ="https://ijmeet.com/host_meeting";
		Assert.assertEquals(expectedUrl,actualUrl);
	}

	@Test
	public void verifyIsSignInPageAvailable() {
		FEKeywords.clickOnElement(FileUtil.getLocator("homepage.sign_in")[0],FileUtil.getLocator("homepage.sign_in")[1]);
		String actualUrl=Constant.driver.getCurrentUrl();
		String expectedUrl ="https://ijmeet.com/login";
		Assert.assertEquals(expectedUrl,actualUrl);
	}

	@Test
	public void verifyIsSignUpPageAvailable() {
		FEKeywords.clickOnElement(FileUtil.getLocator("homepage.sign_up")[0],FileUtil.getLocator("homepage.sign_up")[1]);
		String actualUrl=Constant.driver.getCurrentUrl();
		String expectedUrl ="https://ijmeet.com/register";
		Assert.assertEquals(expectedUrl,actualUrl);
	}
	@Test
	public void verifyAppsIconVisibleOnHomePage() {

		boolean menuItemsVisible=FEKeywords.displayListOfItems(FileUtil.getLocator("homepage.icons")[0],FileUtil.getLocator("homepage.icons")[1], "a");
		Assert.assertTrue(menuItemsVisible);
	}
	@Test
	public void verifyIsAndroidAppStorePageVisible()  {
		
	}

}


