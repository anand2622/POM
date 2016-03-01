package com.pages;

import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utilities.Utilities;


public class HomePage {
	static String searchField = ".//*[@id='main-search']";
	static String searchButton = ".//*[@id='search-field']/span";
	 
	public static void searchProduct(String productid, WebDriver driver) throws IOException {
		driver.get(Utilities.getProperty("url"));
		driver.findElement(By.xpath(searchField)).sendKeys(".0352060001");
		driver.findElement(By.xpath(searchButton)).click();
	}
	  
	       
	    }

	


