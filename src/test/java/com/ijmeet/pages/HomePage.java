package com.ijmeet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ijmeet.util.Constant;

public class HomePage {
	public HomePage() {
		PageFactory.initElements(Constant.driver, this);
	}

	@FindBy(xpath="//span[contains(text(),'عربى')]")
	public static WebElement Arebic_Language;

	@FindBy(css="img[src=\"https://ijmeet.com/images/profile_img/android.png\"]")
	public static WebElement android_icon;

	@FindBy(css="img[src=\"https://ijmeet.com/images/profile_img/ios.png\"]")
	public static WebElement apple_icon;

	@FindBy(css="img[src=\"https://ijmeet.com/images/profile_img/windows.png\"]")
	public static WebElement windows_icon;

	@FindBy(css="a#back2Top")
	public static WebElement backToTop_Arrow;


	public void clickOnLanguageTab() {
		Arebic_Language.click();

	}
	public void clickOnAndroidAppStore() {
		android_icon.click();

	}
	public void clicOnkAppleAppStore() {
		apple_icon.click();

	}
	public void clickOnWindowsWebStore() {
		windows_icon.click();

	}
	
	public boolean isBacktoTopArrowVisible() {
		return backToTop_Arrow.isDisplayed();
	}


}
