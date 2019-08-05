package com.test.qa.pageobjects.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.test.qa.pageobjects.utils.PageBase;

/**
 * HomePage.java - class to verify Home Page functions Created by SrirankanK on
 * 10/3/2018.
 */
public class HomePage extends PageBase {

	private static final Logger LOGGER = Logger.getLogger(HomePage.class);

	private static By hdrWelcome = By.xpath("//div[@class = 'logo']");
    private static By companyManu = By.xpath("//span[text()=\"Company\"]");


	public static boolean isHomePageDisplayed() {
		staticWait(4);
		return getDriver().findElement(hdrWelcome).isDisplayed();
	}
	public static void clickCompanyMenu(){
		getDriver().findElement(companyManu).click();
	}

}
