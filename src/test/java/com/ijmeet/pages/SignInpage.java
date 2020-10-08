package com.ijmeet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ijmeet.keywords.Keywords;

public class SignInpage {
	 
	@FindBy(xpath="//h4[text()=' Sign In ']")
	private static WebElement signInText;
	@FindBy(xpath="//label[@for='email']")
	private static WebElement emailAddressLabel;
	@FindBy(xpath="//label[@for='password']")
	private static WebElement PasswordLabel;
	@FindBy(css = "input#email")
	private static WebElement emailAddressTextbox;
	@FindBy(css = "input#password")
	private static WebElement passwordTextbox;
	
	
	public static String isSignInTextVisible() {
		return signInText.getText();
	}
	public static String isEmailAddresslabelvisible() {
		return emailAddressLabel.getText();
	}
	public static String isPasswordlabelvisible() {
		return PasswordLabel.getText();
	}
	public static boolean isEmailAddressTextboxVisible() {
		return emailAddressTextbox.isDisplayed();
	}
	public static boolean isPasswordTextboxVisible() {
		return passwordTextbox.isDisplayed();
	}
	

}
