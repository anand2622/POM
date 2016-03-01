package com.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utilities {
public static String getProperty(String Property) throws IOException{
Properties prop = new Properties();
FileInputStream Fis = new FileInputStream(System.getProperty("C:\\Users\\anand.pawar\\Workspace1\\POM\\src\\test\\resources\\env.properties"));
prop.load(Fis);
return prop.getProperty(Property);
}}
//    public static void Initialize(WebDriver driver) throws IOException {
//    driver = new FirefoxDriver();
//    driver.get(Utilities.getProperty1("url"));
//    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//}
//	public static String getProperty(String property) {
//		// TODO Auto-generated method stub
//		return null;

