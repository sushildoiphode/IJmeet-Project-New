package com.ijmeet.package1;

import org.testng.annotations.Test;

import com.ijmeet.keywords.Keywords;
import com.ijmeet.pages.SignUppage;
import com.ijmeet.util.Constant;

public class SignUpTests {
	@Test
	public void launchBrowser()
	{
		Keywords.openBrowser("chrome");
		Constant.driver.get("https://ijmeet.com/register");
		System.out.println("Sign up page  open successfully");
	}

}
