package com.ijmeet.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtil {
	public static void main(String[] args) {
		getLocator("homepage.menu-items");
	}
	/**
	 * This method will open ObjectRepository.properties and will return value asociated with key
	 * @param locatorName
	 * @return value in form of{@code String}
	 */
	public static String[] getLocator(String locatorName) {

		String value=null;
		String path=System.getProperty("user.dir");
		String[] locator=new String[2];
		System.out.println(path);
		try {

			FileInputStream file=new FileInputStream(path+"src/test/resources/ObjectRepository.propertie");
			Properties prop=new Properties();
			prop.load(file);
			locator[0]=prop.getProperty(locatorName).split("##")[0];
			locator[1]=prop.getProperty(locatorName).split("##")[1];
			System.out.println("locator0 "+locator[0]);
			System.out.println("locator1 "+locator[1]);
			return locator;
		}catch(FileNotFoundException e) {
			return null;


		}catch(IOException e)	{
			return null;

		}

	}
}

