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
	
	public void isNameTextBoxClickableTest() {
		
	}

}
