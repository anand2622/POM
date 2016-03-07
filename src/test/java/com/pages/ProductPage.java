package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
	
	String changeQuantity = ".//*[@id='quantity']";
	static String addToCart = ".//*[@id='quantAddToCart']/button";
	static String miniCart = ".//*[@id='miniCheckoutNow']";
	String fullCart = ".//*[@id='miniViewFullCart']";
	
	public static void addToCart(WebDriver driver){
		//driver.findElement(By.xpath("changeQuantity")).sendKeys(quantity);
		driver.findElement(By.xpath(addToCart)).click();
	}	
	public static void addToCartAddressPage(WebDriver driver){
		driver.findElement(By.xpath(miniCart)).click();
	}	
	public void addToCartProductPage(WebDriver driver){
		driver.findElement(By.xpath(fullCart)).click();
		
	}
		
	}
		
	

