package com.ijmeet.pages;

import org.openqa.selenium.support.PageFactory;

import com.ijmeet.util.Constant;

public class Homepage {
	public Homepage() {
		PageFactory.initElements(Constant.driver, this);

	}

}
