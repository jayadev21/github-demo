package javaSeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/Reddy/eclipse-workspace/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.quit();
		
	}

}
