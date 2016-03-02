package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Utilities {
static Properties prop;	
protected static WebDriver driver;

public static String getProperty(String Property) throws IOException{
Properties prop = new Properties();
//System.out.println(System.getProperty("user.dir") + "\\src\\test\\resources\\env.properties");
FileInputStream Fis = new FileInputStream(new File("C:\\Users\\shubham.kushwah\\workspace\\POM\\src\\test\\resources\\env.properties"));
prop.load(Fis);
return prop.getProperty(Property);
}

public static void getdriver() throws Throwable {

	try {
		String browser = Utilities.getProperty("browser");
		
		switch(browser)
		{
		
		case "FireFox":
			driver = new FirefoxDriver();
			driver.get(Utilities.getProperty("url"));
			//return driver;
			
		/*case "chrome":
			System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
			driver=new ChromeDriver();
			//return driver;
			
	    case "IE":
			System.setProperty("webdriver.ie.driver","D:/IEDriverServer.exe");
			//driver=new InternatexploreDriver();
			//return driver;
*/		}
						
	} catch (WebDriverException e) {
		System.out.println(e.getMessage());
	  }
	//return null;

}
	
}

	/*public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		Utilities.driver = driver;
	}}*/