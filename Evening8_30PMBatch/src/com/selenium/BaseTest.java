package com.selenium;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class BaseTest 
{
	public static WebDriver driver;
	static String projectPath=System.getProperty("user.dir");
	public static Properties p;
	
	public static void init() throws Exception
	{
		FileInputStream fis=new FileInputStream(projectPath+"//data.properties");
		p=new Properties();
		p.load(fis);
	}
	
	public static void launch(String browser)
	{
		if(p.get(browser).equals("chrome"))
		{
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Driver\\chromedriver.exe");
			System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, projectPath+"//drivers//chromedriver.exe");
			
			ChromeOptions option=new ChromeOptions();
			option.addArguments("user-data-dir=C:\\Users\\DELL\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 8");
			
			option.addArguments("--disable-notifications");
			option.addArguments("--disable-infobars");
			option.addArguments("--start-maximized");
			
			//Proxy IP Configuration
			//option.addArguments("--proxy-server=http://192.168.90.84:1234");
			
			
			driver=new ChromeDriver(option);
		}
		else if(p.get(browser).equals("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", projectPath+"//drivers//geckodriver.exe");
			
			FirefoxOptions option=new FirefoxOptions();
			
			ProfilesIni p=new ProfilesIni();
			FirefoxProfile profile = p.getProfile("eveningprofile");
			
			//notifications
			profile.setPreference("dom.webnotifications.enabled", false);
			
			
			/*//proxy servers
			profile.setPreference("network.proxy.type", 1);
			profile.setPreference("network.proxy.socks", "192.168.90.54");
			profile.setPreference("network.proxy.socks_port", 1744);*/
			
			
			
			option.setProfile(profile);
			driver=new FirefoxDriver(option);
		}
	}
	
	public static void navigateUrl(String url)
	{
		//driver.get(p.getProperty(url));
		driver.navigate().to(p.getProperty(url));
	}
	

}
