package com.selenium;

import org.openqa.selenium.By;

public class TC_002 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		launch("chromebrowser");
		
		navigateUrl("hdfcurl");
		
		driver.manage().window().maximize();
		
		/*String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.manage().deleteAllCookies();
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.navigate().forward();
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();*/
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//img[@class='popupCloseButton']")).click();
		
		driver.findElement(By.xpath("//a[@id='loginsubmit']")).click();
		
		
		//driver.close();
		
		driver.quit();
		

	}

}
