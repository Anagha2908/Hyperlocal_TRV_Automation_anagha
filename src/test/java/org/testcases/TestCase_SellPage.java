package org.testcases;

import javax.swing.Action;

import org.apache.logging.log4j.core.appender.rolling.action.AbstractAction;
import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.pageobjects.HeaderMenu;
import org.pageobjects.HomePage;
import org.pageobjects.SellPage;
import org.testng.annotations.Test;

public class TestCase_SellPage extends BaseClass {
	

	
	SellPage sell; // headermenu
	
	@Test
	public void sell() throws InterruptedException {

		sell = new SellPage(driver);

	//	SellPage sell = new SellPage(driver);
		sell.sellbutton();
		sell.namefield();
		sell.mobilefield();
		sell.emailfield();
		sell.carmodel();
		sell.Regnumber();
		sell.Outlet();
		Thread.sleep(2000);
		sell.consent();
		Thread.sleep(2000);

		sell.Homebutton();
		Thread.sleep(4000);

	}
}