package com.sis.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sis.qa.util.TestUtil;


public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public  static EventFiringWebDriver e_driver;
	
	public TestBase() { 
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("F://SyngyMaxim SIS//demosmaxtest//src//main//"
					+ "java//com//sis//qa//config//config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();        
			  
		}
	}
	
	
	public static void initialization(){
		String browserName = prop.getProperty("browser");
		
		
		if(browserName.equals("chrome")){
		System.setProperty("webdriver.chrome.driver", "F://chromedriver.exe");
			driver = new ChromeDriver(); 
		} 
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "D://Ravi//Firefox Driver//firefox//geckodriver");	
			driver = new FirefoxDriver();      
			 
		}
		
		
		driver.manage().window().maximize();
		
		
	/*	 Dimension d = new Dimension(800,480);
		//Resize current window to the set dimension
		        driver.manage().window().setSize(d); */

     
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
	 
 
		driver.get(prop.getProperty("url"));   
		

		
	
		

	}	  
	
	
}

