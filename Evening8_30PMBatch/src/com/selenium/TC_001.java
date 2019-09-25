package com.selenium;

public class TC_001 extends BaseTest
{

	public static void main(String[] args) 
	{
		
		launch("firefox");
		
		navigateUrl("https://www.bestbuy.com");
	}

}
