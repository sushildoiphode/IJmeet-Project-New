package com.ijmeet.functionaltests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ijmeet.keywords.Keywords;
import com.ijmeet.pages.hostMeetingPage;
import com.ijmeet.util.Constant;
import com.ijmeet.util.TestBase;


public class hostMeetingTest extends TestBase {
	@Test
	private void verifyIsSignUpTextPresent() throws InterruptedException {
		hostMeetingPage home = PageFactory.initElements(Constant.driver, hostMeetingPage.class);
		String expectedText = "Sign Up";
		home.clickOn();
		Keywords.getWindowHandles();
		Assert.assertEquals(home.getText(), expectedText,"Text is present");
	}

	@Test
	private void verifyIsParagraphAvailable() {
		hostMeetingPage home = PageFactory.initElements(Constant.driver, hostMeetingPage.class);
		String para = "Sign up to IJmeet to access the meetings. Enter minimum details to use all the features.";
		home.clickOn();
		Keywords.getWindowHandles();
		Assert.assertEquals(home.getPara(), para, "paragraph is displayed successfully");

	}
}
