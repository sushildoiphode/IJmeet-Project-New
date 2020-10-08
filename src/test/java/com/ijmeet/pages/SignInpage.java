package com.ijmeet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ijmeet.keywords.Keywords;

public class SignInpage {
	 
	@FindBy(xpath="//h4[text()=' Sign In ']")
	private static WebElement signInText;
	
	public String isSignInText() {
		return signInText.getText();
	}

}
