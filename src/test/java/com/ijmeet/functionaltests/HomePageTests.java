package com.ijmeet.functionaltests;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ijmeet.keywords.Keywords;
import com.ijmeet.util.Constant;
import com.ijmeet.util.FileUtil;
import com.ijmeet.util.TestBase;


public class HomePageTests extends TestBase {
	private static Logger log = Logger.getLogger(HomePageTests.class);
	

	@Test
	public void verifyIsLogoPresent() {

		boolean flag=Keywords.isElementDisplayed(FileUtil.getLocator("homepage.logo")[0],FileUtil.getLocator("homepage.logo")[1]);
		
		log.info("logo is present"+flag);
		Assert.assertTrue(flag);
	}
	
	@Test
	public void verifyTitle() {

		String actualTitle=Constant.driver.getTitle();
		String expectedTitle="IJmeet";
		Assert.assertEquals(expectedTitle,actualTitle);

	}
	
}
