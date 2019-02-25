package com.sis.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sis.qa.base.TestBase;
import com.sis.qa.pages.HomePage;
import com.sis.qa.pages.LoginPage;
import com.sis.qa.util.TestUtil;

public class LoginPageTest extends TestBase {
	
	 LoginPage loginPage;
	HomePage homePage;
   TestUtil testutil;
// String SheetName="Login";
 

	public LoginPageTest(){
		super(); 
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
	loginPage = new LoginPage();	
	homePage = new HomePage(); 
	
	} 
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "SMAX - A Smart Campus Solution");    
	}
	
	@Test(priority=2) 
	public void SmaxLogoImageTest(){
		boolean flag = loginPage.validateSmaxImage();    
		Assert.assertTrue(flag);        
		 
	} 
	
	@DataProvider
	public  Object [][] getsisTestData() {		
//	Object data[][] = TestUtil.getTestData(SheetName);     
	Object data[][] = TestUtil.getTestData("Login");    
	
		
		return data;      
	} 
	 
	@Test(priority=3, dataProvider="getsisTestData")
	public void loginTest(String username, String password) throws Exception  {
	//homePage= loginPage.login(prop.getProperty("username"), prop.getProperty("password"));    
	loginPage.login(username, password);  
		   
	}  
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit(); 
	} 
	
}
