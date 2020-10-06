package com.ijmeet.functionaltests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ijmeet.pages.SignInpage;
import com.ijmeet.util.Constant;
import com.ijmeet.util.TestBase;

public class SignInPageTest extends TestBase{
	@BeforeMethod
	private void clickOnSignInBtn() {
		Constant.driver.findElement(By.xpath("//a[@href='https://ijmeet.com/login']")).click();;
	}
	
	@Test
	public void verifySignInTextVisibility() {
		SignInpage sign=PageFactory.initElements(Constant.driver, SignInpage.class);
		String actualText=sign.isSignInText();
		String expectedText= "Sign In";
		Assert.assertEquals(actualText, expectedText,"Text not match");
	}

}
