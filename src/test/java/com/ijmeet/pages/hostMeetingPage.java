package com.ijmeet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class hostMeetingPage {
	@FindBy(xpath = "//div[@id='navbarContent']/ul/li[2]/a")
	WebElement HostMeeting;

	@FindBy(xpath = "/html/body/div[1]/section[2]/div/div/div[2]/div/div/div[1]")
	WebElement SignUp;
	
	@FindBy(xpath = "/html/body/div[1]/section[2]/div/div/div[2]/div/div/div[2]")
	WebElement info_SignUp;

	public void clickOn() {
		HostMeeting.click();
	}

	public String getText() {
		return SignUp.getText();
	}

	public String getPara() {
		return info_SignUp.getText();

	}
}
