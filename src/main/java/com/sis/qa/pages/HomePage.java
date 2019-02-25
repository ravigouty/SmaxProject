package com.sis.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sis.qa.base.TestBase;
import com.sis.qa.util.TestUtil;

public class HomePage extends TestBase { 
	
	
	
	@FindBy(xpath="//span[@class='username hide show-gt-sm ng-binding']")
	WebElement UserNameLabel;
	
	@FindBy(xpath="(//span[@class='h4 ng-binding'])[3]")
	WebElement UserRole;
	
	//Initializing the Page Objects:
	public HomePage(){
	PageFactory.initElements(driver, this); 
		
}

 // Actions 
	
	
	
	public String ValidateUserName() throws InterruptedException {
	Thread.sleep(3000);
	return UserNameLabel.getText();   
	} 
	
	public String ValidateUserRole(){
		return UserRole.getText();  
		
	}
	
	
}
