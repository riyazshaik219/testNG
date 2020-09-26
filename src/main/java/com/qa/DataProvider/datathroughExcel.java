package com.qa.DataProvider;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datathroughExcel {
	
	@Test(dataProvider="getData")
	public void LoginTest(String Email, String Password) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://ui.freecrm.com");
		
		driver.findElement(By.name("email")).sendKeys(Email);
		driver.findElement(By.name("password")).sendKeys(Password);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[3]")).click();
		
		}
		@DataProvider
		public Object[][] getData() throws Exception {
			
			FileInputStream file = new FileInputStream("D:\\Automation\\testNG\\src\\main\\java\\com\\qa\\testData\\myData.xls");
			
			HSSFWorkbook workbook = new HSSFWorkbook(file);
			
			HSSFSheet sheet = workbook.getSheet("testData");
			
			int rowcount = sheet.getPhysicalNumberOfRows();
			
			Object[][] data = new Object[rowcount][2];
			
			for(int i=0; i<rowcount; i++) {
				
				HSSFRow row = sheet.getRow(i);
				
				HSSFCell Email = row.getCell(0);
				if(Email==null)
					
				data[i][0] = "";
				else {
					Email.setCellType(CellType.STRING);
					data[i][0] = Email.getStringCellValue();
				}
				
				HSSFCell Password = row.getCell(1);
				if(Password==null)
				data[i][1] ="";
				else {
					Password.setCellType(CellType.STRING);
					data[i][1] = Password.getStringCellValue();
				}
				
				
				
				
			
			}
			return data;
}

}
