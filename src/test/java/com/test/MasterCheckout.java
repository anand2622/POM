package com.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.ProductPage;
import com.utilities.Action;
import com.utilities.Action.Links;
import com.utilities.Utilities;

public class MasterCheckout extends Utilities {
		
	@BeforeTest	
	public void openBrowser() throws Throwable{
	getdriver();
	}
	@AfterTest
	public void tearDown() throws Throwable{
		Action.close();
	}
	@Test()
	public void visaCheckoutGuestUser() throws Throwable{
		HomePage.searchProduct("89622006", driver);
		ProductPage.addToCart(driver);
		Thread.sleep(2000);
		ProductPage.addToCartAddressPage(driver);
				//Action.clickLink(Links.Ladies.toString());
		
	
	}	
//	@Test(priority=1)
//	public void visaCheckout1GuestUser() throws Throwable{
//		Action.clickLink(Links.Men.toString());
//	
//	}

}
