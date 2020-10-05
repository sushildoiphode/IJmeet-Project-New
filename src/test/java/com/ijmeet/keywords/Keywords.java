package com.ijmeet.keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

import com.ijmeet.util.Constant;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Keywords {
	public static void openBrowser(String browser) {

		switch(browser) 
		{
		     case "chrome":
			 WebDriverManager.chromedriver().setup();
			 Constant.driver = new ChromeDriver();
			 break;
		     case "firefox":
			 WebDriverManager.firefoxdriver().setup();
			 Constant.driver = new FirefoxDriver();
			 break;
		     case "IE":
			 WebDriverManager.iedriver().setup();
			 Constant.driver = new InternetExplorerDriver();
			 break;
		
		     default:
			System.out.println("Open url successfully");
		}
	}
	
}
