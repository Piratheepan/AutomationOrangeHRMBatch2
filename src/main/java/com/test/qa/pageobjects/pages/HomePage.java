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


	private static String commonLinkString = "//a[@href='LINK']";
	private static String commonLink = "//div[@class='THANU']";
	public static boolean isHomePageDisplayed() {
		staticWait(4);
		return getDriver().findElement(hdrWelcome).isDisplayed();
	}
	public static void clickLink(String link) {
		getDriver().findElement(By.xpath(commonLinkString.replace("LINK", link))).click();
		LOGGER.info("Link " + link + " Clicked");
		staticWait(3);
	}
	public static void clickLinks(String link1) {
		getDriver().findElement(By.xpath(commonLink.replace("THANU", link1))).click();
		LOGGER.info("Link " + link1 + " Clicked");
		staticWait(3);
	}
}
