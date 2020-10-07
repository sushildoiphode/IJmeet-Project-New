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
	
	@FindBy(xpath="//input[@name='user_name']")
	public static WebElement userName;
	 public static boolean isUserNameCheckBoxVisible() {
		boolean verify= Keywords.isElementDisplayed("XPATH", userName);
		return false;
		 
	 }
	
	

}
