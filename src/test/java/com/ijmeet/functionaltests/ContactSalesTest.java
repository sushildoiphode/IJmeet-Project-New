package com.ijmeet.functionaltests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ijmeet.pages.ContactSalesPage;
import com.ijmeet.util.Constant;
import com.ijmeet.util.TestBase;

/**
 * 
 *@author Deepak Dude
 * Project-IJmeet
 */

public class ContactSalesTest extends TestBase {
	ContactSalesPage contact;
	
	@BeforeMethod
	public void initializePage() {
		contact = new ContactSalesPage();
		Constant.driver.findElement(By.xpath("//*[@id=\"navbarContent\"]/ul/li[3]/a")).click();;
	}
	
	@Test
	public void verifyContactSalesPageTest() {
		String actualtitle = Constant.driver.getTitle();
		String expectedTitle = "IJmeet";
		Assert.assertEquals(expectedTitle, actualtitle);
//		log.info("HomePage is available for IJmeet");

	}
	@Test
	public void isNameTextBoxAvailableTest() {
		boolean verify=contact.isUserNameCheckBoxVisible();
		Assert.assertTrue(verify);
	}
	@Test
	public void isNameTextBoxClickableTest() throws InterruptedException {
		contact.sendTextToUserNameCheckBox();
		Thread.sleep(10000);
		String actualValue=contact.getValueFromTextbox();
		String expectedValue="Deepak Dude";
		System.out.println(actualValue);
		Assert.assertEquals(actualValue, expectedValue);
		
	}
	@Test
	public void isEmailTextBoxAvailableTest() {
		boolean verify=contact.isEmailCheckBoxVisible();
		Assert.assertTrue(verify);
	}
	@Test
	public void isEmailTextBoxClickableTest() throws InterruptedException {
		contact.sendTextToEmailCheckBox();
		Thread.sleep(10000);
		String actualValue=contact.getValueFromEmailTextbox();
		String expectedValue="deepakdude938@gmail.com";
		System.out.println(actualValue);
		Assert.assertEquals(actualValue, expectedValue);
		
	}

}
