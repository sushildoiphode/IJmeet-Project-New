package com.ijmeet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class hostMeetingPage {
<<<<<<< HEAD
=======

>>>>>>> 9fdecb915193ab87cce0ed62c3cf42b34c42508c
	@FindBy(xpath = "//div[@id='navbarContent']/ul/li[2]/a")
	WebElement HostMeeting;

	@FindBy(xpath = "/html/body/div[1]/section[2]/div/div/div[2]/div/div/div[1]")
	WebElement SignUp;
<<<<<<< HEAD
	
	@FindBy(xpath = "/html/body/div[1]/section[2]/div/div/div[2]/div/div/div[2]")
	WebElement info_SignUp;
=======
>>>>>>> 9fdecb915193ab87cce0ed62c3cf42b34c42508c

	public void clickOn() {
		HostMeeting.click();
	}

	public String getText() {
		return SignUp.getText();
	}
<<<<<<< HEAD

	public String getPara() {
		return info_SignUp.getText();

	}
=======
>>>>>>> 9fdecb915193ab87cce0ed62c3cf42b34c42508c
}
