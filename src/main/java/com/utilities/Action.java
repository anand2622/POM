package com.utilities;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Action extends Utilities {
	

	private static final String LINK_TEMPLATE = "//a[contains(.,'%1$s')]";
	
	public enum Links{
		
		
		United_Kingdom("United Kingdom"),
		Ladies("Ladies"),
		Men("Men");
		
	
		private String link;

        /**
         * Define Links
         * @param link - value of link
         */
		private Links(String link) {
            this.link = link;
        }

        /**
         * Get value of link
         * @return link
         */
        public String link() {
            return link;
		
	}
	}
	
	
	public void clickElementByXpath(String xpath) throws Throwable{
		//WebDriver driver = new FirefoxDriver();
		WebElement element = driver.findElement(By.xpath(xpath));
		element.click();
	}
	
	public static void clickLink(String linkValue) throws Throwable {
		
		WebElement link = driver.findElement(By.xpath(String.format(LINK_TEMPLATE, linkValue)));
		link.click();
	}
	
	public static void close(){
    driver.close();
	}
		
}
