package com.qa.DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testNG_dataProvider {

	@Test(dataProvider="getData")
	public void LoginTest(String Email, String Password) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://ui.freecrm.com");
		
		driver.findElement(By.name("email")).sendKeys(Email);
		driver.findElement(By.name("password")).sendKeys(Password);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[3]")).click();
		
		}
		@DataProvider
		public Object[][] getData() {
			
			Object[][] data = new Object[3][2];
			
			//1st set
			data[0][0] = "riyazshaik219@gmail.com";
			data[0][1] = "Test123";
			
			//2nd set
			data[1][0] = "akram123@gmail.com";
			data[1][1] = "Pass123";
			
			//3rd set
					data[2][0] = "fahed123@gmail.com";
					data[2][1] = "Fail123";
			return data;
		}
}
