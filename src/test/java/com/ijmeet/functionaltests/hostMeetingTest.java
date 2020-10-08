package com.ijmeet.functionaltests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ijmeet.keywords.Keywords;
import com.ijmeet.pages.hostMeetingPage;
import com.ijmeet.util.Constant;

import junit.framework.Assert;

public class hostMeetingTest extends Keywords {
	@BeforeMethod
	private void setUp() {
		openBrowser("chrome");
		launchUrl("https://ijmeet.com/");
		maximizeBrowser();

	}

	@Test
	private void verifyIsSignUpTextPresent() throws InterruptedException {
		hostMeetingPage home = PageFactory.initElements(Constant.driver, hostMeetingPage.class);
		String expectedText = "Sign Up";
		home.clickOn();
		Keywords.getWindowHandles();
		Assert.assertEquals(home.getText(), expectedText);
	}

	@AfterMethod
	private void closeBrowserWindow() {
		Constant.driver.quit();
	}
}
