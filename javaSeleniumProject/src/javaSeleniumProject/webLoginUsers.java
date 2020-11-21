package javaSeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webLoginUsers {

	public static void main(String[] args) {
		
		//new FirefoxDriver();
	   /*System.setProperty("webdriver.gecko.driver", "/Users/Reddy/eclipse-workspace/geckodriver");	
		WebDriver driver = new FirefoxDriver();
		driver.get("https://salesforce.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();*/
		
		System.setProperty("webdriver.chrome.driver", "/Users/Reddy/eclipse-workspace/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
	}

}
