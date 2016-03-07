package com.pages;

import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utilities.Utilities;


public class HomePage {
	static String searchField = ".//*[@id='search-header']";
	static String searchButton = ".//*[@id='searchGo']";
	 
	public static void searchProduct(String productid, WebDriver driver) throws IOException {
		//driver.get(Utilities.getProperty("url"));
		driver.findElement(By.xpath(searchField)).sendKeys(productid);
		driver.findElement(By.xpath(searchButton)).click();
	}
	  
	       
	    }

	


