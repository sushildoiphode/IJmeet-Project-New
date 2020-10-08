package com.ijmeet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ijmeet.util.Constant;

public class HomePage {
	public HomePage() {
		PageFactory.initElements(Constant.driver, this);
	}
	@FindBy(xpath="//a[contains(text(),'Join Meeting')]")	
	public WebElement joinMeeting;

	@FindBy(xpath="//a[contains(text(),'Host Meeting')]")
	public WebElement hostMeeting;

	@FindBy(xpath="//a[contains(text(),'Contact sales')]")
	public WebElement contactSales;

	@FindBy(xpath="//a[contains(text(),'Sign In')]")
	public WebElement signIn;

	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	public WebElement signUp;

	public void clickOnJoinMeeting() {
		joinMeeting.click();
	}
	public void clickOnHostMeeting() {
		hostMeeting.click();
	}
	public void clickcOntactSales() {
		contactSales.click();
	}
	public void clickOnSignIn() {
		signIn.click();
	}
	public void clickOnSignUp() {
		signUp.click();
	}
}
