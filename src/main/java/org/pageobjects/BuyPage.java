package org.pageobjects;

import java.net.http.WebSocket;
import java.util.Iterator;
import java.util.List;

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

public class BuyPage extends ActionClass {
	
	public WebDriver driver;
	public ActionClass act;
	ConfigReader config = new ConfigReader();
	
	public BuyPage(WebDriver driver) {
		super(driver);
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='nav-link'][normalize-space()='Buy']")
	private WebElement buybuttomElement;
	
	@FindBy(xpath = "//label[@for='trueValue1']")
	private WebElement trueValueCertifiedcheckboxElement;
	
	@FindBy(xpath = "//label[@for='trueValue2']")
	private WebElement removeBookedCarscheckboxElement;
	
	@FindBy (xpath = "//a[text()='4 L - 6 L']")
	private WebElement rangefilterElement;
	
	@FindBy (xpath = "//a[@data-value='hatchback']")
	private WebElement bodytypefilterElement;

	@FindBy (xpath = "//label[@for='brand0']")
	private WebElement brandcheckboxElement;
	
	@FindBy (xpath = "//a[@data-min='3']")
	private WebElement carageElement;
	
	@FindBy (xpath = "//label[@for='owner1']")
	private WebElement numberofownersElement;
	
	@FindBy (xpath = "//a[text()=' <25K km']")
	private  WebElement kmsdrivenElement;
	
	@FindBy (xpath = "//label[@for='fuel0']")
	private WebElement fueltypElement;
	
	@FindBy (xpath = "//span[@data-value='silver']")
	private WebElement colorElement;
	
	@FindBy (xpath = "//label[@for='transmission0']")
	private WebElement transmissionElement;
	
	@FindBy(xpath = "//a[text()='Reset']")
	private WebElement resetElement;
	
	@FindBy(xpath = "//span[@class='select2-selection select2-selection--single']")
	private WebElement dropdownElement;
	
	@FindBy(xpath = "//li[@id='select2-1jkt-result-akcz-priceasc']")
	private WebElement dropdownElement1;
	
	@FindBy(xpath = "//li[@id='select2-1jkt-result-ket8-Pricedsc']")
	private WebElement dropdownElement2;
	
	@FindBy(xpath = "//li[@id='select2-1jkt-result-usi1-Kmasc']")
	private WebElement dropdownElement3;
	
	@FindBy(xpath = "//li[@id='select2-1jkt-result-taus-kmdsc']")
	private WebElement dropdownElement4;
	
	@FindBy(xpath = "//li[@id='select2-1jkt-result-njr9-introductiondateasc']")
	private WebElement dropdownElement5;
	
	@FindBy(xpath = "//li[@id='select2-1jkt-result-ce94-introductiondatedesc']")
	private WebElement dropdownElement6;
	
	@FindBy(xpath = "//a[@class='emicalculate']")
	private WebElement emiElement;
	
	@FindBy(xpath = "//a[text()='Book a Test Drive']")
	private WebElement testdriveElement;
	
	@FindBy(xpath = "//input[@placeholder='Full Name*']")
	private WebElement fullnameElement;
	
	@FindBy(xpath = "//input[@placeholder='Mobile Number*']")
	private WebElement phoneElement;
	
	@FindBy(xpath = "//input[@placeholder='Email*']")
	private WebElement emailElement;
	
	@FindBy(xpath = "//input[@class='disclamer form-check-input']")
	private WebElement checkboxElement;
	
	public void buybutton() {
		try {
			Thread.sleep(2000);

			buybuttomElement.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void truevaluecertified() {
		try {
			Thread.sleep(2000);

			trueValueCertifiedcheckboxElement.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void removebookedcars() {
		try {
			Thread.sleep(2000);

			removeBookedCarscheckboxElement.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void budget() {
		try {
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)", "");
			Thread.sleep(2000);
			rangefilterElement.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	public void bodytype() {
			try {
				Thread.sleep(2000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,500)", "");
				Thread.sleep(2000);
				bodytypefilterElement.click();

			} catch (Exception e) {
				e.printStackTrace();
			}
		
	}
	
	public void brand() {
		try {
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)", "");
			Thread.sleep(2000);
			brandcheckboxElement.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void carage() {
		try {
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,900)", "");
			Thread.sleep(2000);
			carageElement.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void owner() {
		try {
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)", "");
			Thread.sleep(2000);
			numberofownersElement.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void kmsdriven() {
		try {
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)", "");
			Thread.sleep(2000);
			kmsdrivenElement.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void fueltype() {
		try {
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1500)", "");
			Thread.sleep(2000);
			fueltypElement.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void color() {
		try {
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1500)", "");
			colorElement.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void transmission() {
		try {
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,2000)", "");
			Thread.sleep(2000);
			transmissionElement.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void reset() {
		try {
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,-1000)", "");
			resetElement.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//public void dropdown() {}
		
			
			
			/* Select select = new Select(dropdownElement);
			 select.selectByVisibleText("SORT BY");
			 Thread.sleep(2000);
			 select.selectByVisibleText("Price (Low to High)");
			 Thread.sleep(2000);
			 select.selectByVisibleText("Price (High to Low)");
			 Thread.sleep(2000);
			 select.selectByVisibleText("Km (Low to High)");
			Thread.sleep(2000);
			select.selectByVisibleText("Km (High to Low)");
			Thread.sleep(2000);
			select.selectByVisibleText("Year Ascending");
			Thread.sleep(2000);
			select.selectByVisibleText("Year Descending");
			Thread.sleep(2000);*/
			/*dropdownElement.click();
			Thread.sleep(2000);
			dropdownElement1.click();
			Thread.sleep(2000);
			dropdownElement.click();
			Thread.sleep(2000);
			dropdownElement2.click();
			Thread.sleep(2000);
			dropdownElement.click();
			Thread.sleep(2000);
			dropdownElement3.click();
			Thread.sleep(2000);
			dropdownElement.click();
			Thread.sleep(2000);
			dropdownElement4.click();
			Thread.sleep(2000);
			dropdownElement.click();
			Thread.sleep(2000);
			dropdownElement5.click();
			Thread.sleep(2000);
			dropdownElement.click();
			Thread.sleep(2000);
			dropdownElement6.click();
			Thread.sleep(2000);*/
			/*dropdownElement.click();
       List <WebElement> values = driver.findElements(By.xpath("//li[@class='select2-results__option']"));
       
      /* for (Integer i=2;i<=6;i++) {
   		WebElement dropdown0 = driver.findElement(By.xpath("//li[@class='select2-results__option'][i]"));
   		dropdown0.click();/
		
	}*/
			
			public void emi() {
				try {
					Thread.sleep(2000);
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,500)", "");
				    emiElement.click();
				    js.executeScript("window.scrollBy(0,-500)", "");
				    Thread.sleep(2000);
				 
					
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
			
			public void TestDrive() {
				try {
					Thread.sleep(2000);
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,500)", "");
					Thread.sleep(2000);
					testdriveElement.click();
					Thread.sleep(2000);
					fullnameElement.sendKeys("Anagha");
					Thread.sleep(2000);
					phoneElement.sendKeys("9850008106");
					Thread.sleep(2000);
					emailElement.sendKeys("anagha.kapse@addglobal360.com");
					Thread.sleep(2000);
					checkboxElement.click();
					Thread.sleep(2000);
					buybuttomElement.click();
					Thread.sleep(2000);
					

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	
}
