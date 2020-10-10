package com.ijmeet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ijmeet.keywords.Keywords;
import com.ijmeet.util.Constant;



/**
 * 
 * @author Deepak Dude
 * Project-IJmeet
 *
 */
public class ContactSalesPage {
	
	public ContactSalesPage() {
		PageFactory.initElements(Constant.driver, this);
	}
	
	@FindBy(xpath="//input[@name='user_email']")
	public static WebElement email;
	
	@FindBy(xpath="//input[@name='user_message']")
	public static WebElement message;
	
	@FindBy(xpath="//input[@name='user_name']")
	public static WebElement userName;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-primary1 com-md-3 w-100 m-0']")
	public static WebElement sendButton;
	
	 public static boolean isUserNameCheckBoxVisible() {
		boolean verify= Keywords.isElementDisplayed("XPATH", userName);
		return verify;
	 }
	 
	public void sendTextToUserNameCheckBox() {
		userName.sendKeys("Deepak Dude");
		
	}
	public static String getValueFromTextbox() {
		return	userName.getAttribute("value");
		}
	
	 public static boolean isEmailCheckBoxVisible() {
			boolean verify= Keywords.isElementDisplayed("XPATH", email);
			return verify;
		 }
	public void sendTextToEmailCheckBox() {
		email.sendKeys("deepakdude938@gmail.com");
		
	}
	public static String getValueFromEmailTextbox() {
		return	email.getAttribute("value");
		}
	
	

}
