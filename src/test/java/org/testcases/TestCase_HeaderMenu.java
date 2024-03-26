package org.testcases;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.pageobjects.HeaderMenu;
import org.testng.annotations.Test;

public class TestCase_HeaderMenu extends BaseClass{
	
	HeaderMenu header; // headermenu
	
		@Test
		public void header() throws InterruptedException {

			header = new HeaderMenu(driver);
			    header.Finance();
				header.Insurance();
				header.outlet();
				header.privacy_policy();
				header.Call_us();
				header.Enquire_Now();
				header.enterName();
				
				HeaderMenu headermenu = new HeaderMenu(driver);
				headermenu.Enquire_Now();
				Thread.sleep(1500);
				headermenu.enterName();
				Thread.sleep(1500);
				headermenu.enterMobileNumber();
				Thread.sleep(1500);
				driver.findElement(By.cssSelector("input#inpemail")).sendKeys("anagha@gmail.com");
				Thread.sleep(1500);
				WebElement lookingForDropdown = driver.findElement(By.cssSelector("select#ddltype"));
				Thread.sleep(1500);
				
				Select selectLookingForValue = new Select(lookingForDropdown);
				selectLookingForValue.selectByVisibleText("Buy");
				Thread.sleep(1500);
				
				WebElement outletDropdown = driver.findElement(By.cssSelector("select#Model"));
				Select selectOutlet = new Select(outletDropdown);
				selectOutlet.selectByVisibleText("true value of 18/1 Mathura Road");
				Thread.sleep(1500);
				
				driver.findElement(By.cssSelector("input#conditionId")).click();
				
				WebElement header = driver.findElement(By.xpath("//div[@class='col-md-4 col-5 align-self-center']"));
				Actions act = new Actions(driver);
				act.scrollToElement(header).perform();
				Thread.sleep(3000);
				this.header.Homebutton();
				
				Thread.sleep(5000);
				
		}
		public void finance() {
		header.Finance();
	}
		public void outlet() throws InterruptedException {
	         
				header.outlet();
		}
				public void p_policy() throws InterruptedException {
			          
						header.privacy_policy(); 
						
					
				}}
