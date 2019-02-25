package com.sis.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sis.qa.base.TestBase;
import com.sis.qa.pages.HomePage;
import com.sis.qa.pages.LoginPage;
import com.sis.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
	public HomePageTest(){
		super();   

	}
	
	@BeforeMethod
	public  void setUp() throws Exception{
		initialization();
		loginPage = new LoginPage();	  
		homePage= loginPage.login(prop.getProperty("username"), prop.getProperty("password"));           
		
	} 
	
	
	@Test(priority=1)
	public void verifyHomePageTitleTest() throws InterruptedException {
    String UsernameTitile= homePage.ValidateUserName();
    Assert.assertEquals(UsernameTitile, "Azhar", "UserName Title not Matched");       
    
	}
	
	@Test(priority=2)
	public void ValidateUserRoleTest(){
	String RoleName=homePage.ValidateUserRole();
	Assert.assertEquals(RoleName, "Registrar officer", "RoleName Title not Matched");	   
		
	} 
	 
	@AfterMethod

	public void tearDown(){
		driver.quit(); 
    
	} 
	
}
