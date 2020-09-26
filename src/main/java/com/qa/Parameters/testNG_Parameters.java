package com.qa.Parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testNG_Parameters {
	
	WebDriver driver;

	@Test
	@Parameters({"url","username"})
	public void LoginTest(String url,String username) {
		driver = new FirefoxDriver();
		driver.get(url);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.name("signin")).click();
		
	}
}
