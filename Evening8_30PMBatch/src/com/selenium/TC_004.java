package com.selenium;

import org.apache.log4j.Logger;

public class TC_004 extends BaseTest
{
	private static final Logger log=Logger.getLogger(TC_004.class.getName());
	

	public static void main(String[] args) throws Exception 
	{
		init();
		log.info("Initializing data , Or  & Log4j files.....");
		
		launch("chromebrowser");
		log.info("Launched the browser :" + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		log.info("Navigated to url :"+ p.getProperty("amazonurl"));
		
		selectOption("amazondropdown_id","amazondropvalue");
		log.info("Selected the item :" + or.getProperty("amazondropvalue") + " by using the locator : "+ or.getProperty("amazondropdown_id"));
			
		typevalue("amazonsearchtextbox_id","amazonsearchtextvalue");
		log.info("Entered the text :" + or.getProperty("amazonsearchtextvalue") + " by using the locator :" + or.getProperty("amazonsearchtextbox_id"));
		
		clickElement("amazonsearchbutton_xpath");
		log.info("Clicked on amazon searchButton by using the locator : "+ or.getProperty("amazonsearchbutton_xpath"));
		
		/*driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
		
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();*/
		
	
	}

	
}
