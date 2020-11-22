package javaSeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/Reddy/eclipse-workspace/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com");
		//System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//a[@id='gb_70']")).click();
		//System.out.println(driver.findElement(By.xpath("//*[@jsname='l4eHX']")).getText());
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("jdevreddy2020@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("XXXXXXXXXXXX");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[2]")).click();
		
		
		//driver.quit();
		
	}

}
