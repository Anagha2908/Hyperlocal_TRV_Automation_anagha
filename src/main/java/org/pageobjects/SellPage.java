package org.pageobjects;

import javax.management.loading.PrivateClassLoader;

import org.action.ActionClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.trvConfigs.ConfigReader;

public class SellPage extends ActionClass {

	public WebDriver driver;
	public ActionClass act;
	ConfigReader config = new ConfigReader();
	
	public SellPage(WebDriver driver) {
		super(driver);
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='nav-link'][normalize-space()='Sell']")
	private WebElement sellbuttonElement;
	
	@FindBy(xpath = "//input[@id='Name']")
	private WebElement nameElement;
	
	@FindBy(xpath = "//input[@id='MobileNumber']")
	private WebElement mobileElement;
	
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement emailElement;
	
	@FindBy(xpath = "//select[@id='ddltype']")
	private WebElement carmodelElement;
	
	@FindBy(xpath = "//input[@id='RegistrationNumber']")
	private WebElement registrationElement;
	
	@FindBy(xpath = "//select[@name=\"Model\"]")
	private WebElement outletElement;
	
	@FindBy(xpath = "//input[@id='conditionId']")
	private WebElement consentElement;
	
//	@FindBy(xpath = "//button[@id='btnsubmit']")
//	private WebElement submitbuttonElement;
	
	@FindBy(xpath = "//div[@class='marutilogo d-none d-md-block']")
    WebElement homebuttonElement;
	
	public void sellbutton() {
		try {
			Thread.sleep(2000);

			sellbuttonElement.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void namefield() {
		try {
			Thread.sleep(2000);

	      nameElement.sendKeys("Anagha");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void mobilefield() {
		try {
			Thread.sleep(2000);

	      mobileElement.sendKeys("9850006543");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void emailfield() {
		try {
			Thread.sleep(2000);

	      emailElement.sendKeys("anagha.kapse@adglobal360.com");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public void carmodel() {
		try {
			Thread.sleep(2000);

	      Select s = new Select(carmodelElement);
	      s.selectByIndex(1);
	      

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Regnumber() {
		try {
			Thread.sleep(2000);

	     registrationElement.sendKeys("HR26F2428");
	      

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Outlet() {
		try {
			Thread.sleep(2000);

	   Select s1= new Select(outletElement);
	   s1.selectByIndex(1);
	   
	      

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void consent() {
		try {
			Thread.sleep(2000);

	   consentElement.click();
	      

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Homebutton() {
		try {
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,-350)", "");
		//	Actions actions = new Actions(driver);
		//    actions.scrollToElement(homebuttonElement).perform();
			homebuttonElement.click();
			Thread.sleep(6000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}