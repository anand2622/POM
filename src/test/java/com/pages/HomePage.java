package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HomePage {
	static String searchField = ".//*[@id='keywords']";
	static String searchButton = ".//*[@id='search']/div/a";
	 

	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        //System.setProperty("webdriver.firefox.bin", "c:\\path\\to\\firefox.exe");

	        WebDriver driver = new FirefoxDriver();
	        driver.get(prop.getProperty("username"));
	        driver.findElement(By.xpath(searchField)).sendKeys("");
	        driver.findElement(By.xpath(searchButton)).click();
	        driver.quit();
	    }

	}

//	String searchField = ".//*[@id='keywords']";
//	String searchButton = ".//*[@id='search']/div/a";
//	
//	public void searchProduct(String productid, WebDriver driver) {
//	}
//	Webdriver.driver1 = new FireFoxDriver();
//	driver.findElement(By.xpath(searchField)).sendkeys()
//	
//}
