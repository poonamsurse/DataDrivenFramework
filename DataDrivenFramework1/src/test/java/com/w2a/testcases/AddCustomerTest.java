package com.w2a.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class AddCustomerTest extends TestBase {

	
	@Test(dataProvider = "getdata")
	
	public void addCustomer(String FirstName, String LastName,String PostCode)
	{
		driver.findElement(By.cssSelector(OR.getProperty("addCustBtn"))).click();
		driver.findElement(By.cssSelector(OR.getProperty("firstname"))).sendKeys(FirstName);
		driver.findElement(By.cssSelector(OR.getProperty("lastname"))).sendKeys(LastName);

		driver.findElement(By.cssSelector(OR.getProperty("postcode"))).sendKeys(PostCode);

		//driver.findElement(By.cssSelector(OR.getProperty("addbtn"))).click();

	}
	
	
	@DataProvider
	public Object[][] getdata()
	{
		String sheetName="AddCustomerTest";
		int rows=excel.getRowCount(sheetName);
		int cols=excel.getColumnCount(sheetName);
				
				Object[][] data=new Object[rows-1][cols-1];
		for(int rowNum = 2;rowNum <= rows; rowNum++)
		{
			for(int colNum=0; colNum < cols; colNum++)
			{
				data[rowNum - 2][colNum]=excel.getCellData(sheetName,colNum,rowNum);
			}
		}
		return data;
		
	}
	
}
