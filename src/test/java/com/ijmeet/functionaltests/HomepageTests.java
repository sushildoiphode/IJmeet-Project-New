package com.ijmeet.functionaltests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ijmeet.keywords.Keywords;
import com.ijmeet.util.Constant;
import com.ijmeet.util.FileUtil;
import com.ijmeet.util.TestBase;


public class HomepageTests extends TestBase {

	@Test
	public void verifyIsLogoPresent() {

		boolean flag=Keywords.isElementDisplayed(FileUtil.getLocator("homepage.logo")[0],FileUtil.getLocator("homepage.logo")[1]);
		System.out.println("logo is present: "+flag);
		Assert.assertTrue(flag);
	}
	
	@Test
	public void verifyTitle() {

		String actualTitle=Constant.driver.getTitle();
		String expectedTitle="IJmeet";
		Assert.assertEquals(expectedTitle,actualTitle);

	}
}
