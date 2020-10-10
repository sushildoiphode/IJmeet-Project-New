package com.ijmeet.functionaltests;

import org.openqa.selenium.support.PageFactory;
<<<<<<< HEAD
import org.testng.Assert;
=======
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
>>>>>>> 9fdecb915193ab87cce0ed62c3cf42b34c42508c
import org.testng.annotations.Test;

import com.ijmeet.keywords.Keywords;
import com.ijmeet.pages.hostMeetingPage;
import com.ijmeet.util.Constant;
<<<<<<< HEAD
import com.ijmeet.util.TestBase;


public class hostMeetingTest extends TestBase {
=======

import junit.framework.Assert;

public class hostMeetingTest extends Keywords {
	@BeforeMethod
	private void setUp() {
		openBrowser("chrome");
		launchUrl("https://ijmeet.com/");
		maximizeBrowser();

	}

>>>>>>> 9fdecb915193ab87cce0ed62c3cf42b34c42508c
	@Test
	private void verifyIsSignUpTextPresent() throws InterruptedException {
		hostMeetingPage home = PageFactory.initElements(Constant.driver, hostMeetingPage.class);
		String expectedText = "Sign Up";
		home.clickOn();
		Keywords.getWindowHandles();
<<<<<<< HEAD
		Assert.assertEquals(home.getText(), expectedText,"Text is present");
	}

	@Test
	private void verifyIsParagraphAvailable() {
		hostMeetingPage home = PageFactory.initElements(Constant.driver, hostMeetingPage.class);
		String para = "Sign up to IJmeet to access the meetings. Enter minimum details to use all the features.";
		home.clickOn();
		Keywords.getWindowHandles();
		Assert.assertEquals(home.getPara(), para, "paragraph is displayed successfully");

=======
		Assert.assertEquals(home.getText(), expectedText);
	}

	@AfterMethod
	private void closeBrowserWindow() {
		Constant.driver.quit();
>>>>>>> 9fdecb915193ab87cce0ed62c3cf42b34c42508c
	}
}
