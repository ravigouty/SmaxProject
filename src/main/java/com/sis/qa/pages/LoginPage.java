package com.sis.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sis.qa.base.TestBase;

public class LoginPage extends TestBase {

	
	//Page Factory - OR:
// Enter username	
	
	@FindBy(name="UserName")
	WebElement username;
	
// Enter password	
	@FindBy(name="Password")
	WebElement password;
	
// Click on Login Button	
	@FindBy(id= "loginbtn")
	WebElement loginBtn;
	
// to get Smax logo
	@FindBy(xpath="//img[@style='height:50px;padding-left: 20px;']")
	WebElement smaxlogo;
	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);   
		
		
			
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle(); 
	}
	
	public  boolean validateSmaxImage(){
		return smaxlogo.isDisplayed();  
	
	}
	
	public HomePage login(String un, String pwd) throws Exception {
	
		Thread.sleep(5000);
		username.sendKeys(un); 
		password.sendKeys(pwd);
		loginBtn.click();   
		 	    	
		return new HomePage();   
				
	}
}
