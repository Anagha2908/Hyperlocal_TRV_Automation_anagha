package org.testcases;

import org.base.BaseClass;
import org.openqa.selenium.Dimension;
import org.pageobjects.BuyPage;
import org.pageobjects.SellPage;
import org.testng.annotations.Test;

public class TestCase_BuyPage extends BaseClass {

	BuyPage Buy; // headermenu
	
	@Test
	public void Buy() throws InterruptedException {

		Buy = new BuyPage(driver);
		Buy.buybutton();
        Buy.truevaluecertified();
        Buy.removebookedcars();
        Buy.budget();
        Buy.bodytype();
        Buy.brand();
        Buy.carage();
        Buy.owner();
        Buy.kmsdriven();
        Buy.fueltype();
        Buy.color();
        Buy.transmission();
        Buy.reset();
        //Buy.dropdown();
		Buy.emi();
		Buy.buybutton();
		Buy.TestDrive();
        
        
        
        Thread.sleep(4000);
	

}
}
