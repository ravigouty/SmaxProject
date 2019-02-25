package com.sis.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.awt.AWTException;
//import java.util.Properties;
import com.sis.qa.base.TestBase;
import com.sis.qa.pages.ApplyNowPage;
//import com.sis.qa.util.TestUtil;


public class ApplyNowPageTest extends TestBase{
	
ApplyNowPage applynowpage; 


	public ApplyNowPageTest(){
		super();    
	
}
	
	@BeforeClass
	public void setUp() throws InterruptedException{
		initialization();  
	} 
	 	
	@Test(priority=1)
	public void ClickonApplyNowTest() {
	applynowpage =new ApplyNowPage(); 
		applynowpage.Clickapplynow();    
	}  
	@Test(priority=2)
	public  void ChangeLanguageTest() {
		applynowpage=new ApplyNowPage();   
		applynowpage.arabiclang();
		} 
	@Test(priority=3)
		public void changeenglangTest() throws InterruptedException {
		applynowpage =new ApplyNowPage(); 
			applynowpage.Englang(); 
	}	
	@Test(priority=4)
	public void validateCreateAccountTitleTest() throws InterruptedException {		
   String ApplyTitile= applynowpage.validateCreateAccountTitle();
   Assert.assertEquals(ApplyTitile, "Create Account", "ApplyNowName Title not Matched"); 	    	 
	}		 
	
//	@Test(enabled=false)
	@Test(priority=5)
	public void EnterFirstNameTest()  {
		 applynowpage.EnterFirstName();    
		 
	}  
	
	@Test(priority=6)
	public void EnterMiddleNameTest()  {
		 applynowpage.EnterMiddleName();
	}
	@Test(priority=7)
	public void EnterGrandFatherNameTest()  {
		 applynowpage.EnterGrandFatherName();
	}
	
	@Test(priority=8)
	public void EnterFamilyNameTest()  {
		 applynowpage.EnterFamilyName(); 
	}	 

	@Test(priority=9)
	public void EnterDOBTest()  {
		 applynowpage.EnterDOB();  
	}	
	
	@Test(priority=10)
	public void EnterNationalIdTest()  {
		 applynowpage.EnterNationalId();
	}	 
	@Test(priority=11)
	public void EnterEmailidTest()  {
		 applynowpage.EnterEmailid(); 
	}	
	@Test(priority=12)
	public void EnterMobileNumberTest()  {
		 applynowpage.EnterMobileNumber();   
	}	
	@Test(priority=13)
	public void EnterAltNumberTest()  {
		 applynowpage.EnterAltNumber(); 
	}	

	@Test(priority=14)
	public void EnterApplyNowUsernameTest()  {
		 applynowpage.EnterApplyNowUsername(); 
	}	

	@Test(priority=15)
	public void scrolldownTest()  {
	 applynowpage.scrolldown1();
	}	
	
	@Test(priority=16)
	public void EnterApplyNowPasswordTest()  {
		 applynowpage.EnterApplyNowPassword();  
	}	 
	
	@Test(priority=17)
	public void EnterApplyNowConfirmPasswordTest()  {
		 applynowpage.EnterApplyNowConfirmPassword();   
	}	   
	@Test(priority=18)
	public void TermDropdownTest()  {
		 applynowpage.TermDropdown();   
	}
	@Test(priority=19)
	public void SelectTermTest() throws InterruptedException   {
		 applynowpage.SelectTerm();     
	}
	@Test(priority=20)
	public void DropdownDegreeTest()  {
		 applynowpage.DropdownDegree();  
	}	   
	
	
	@Test(priority=21)
	public void SelectDegreeTypeTest() throws InterruptedException  {
		 applynowpage.SelectDegreeType();  
	}	
	  
	
	@Test(priority=22)
	public void FirstPerferencedropdownTest()  {
		 applynowpage.FirstPerferencedropdown();    

	}
	@Test(priority=23)
	public void SelectFirstPerferencedProgramTest() throws InterruptedException  {
		 applynowpage.SelectFirstPerferencedProgram();        
	} 
	
	@Test(priority=24)
	public void SecondPerferencedropdownTest() throws InterruptedException  {
		 applynowpage.SecondPerferencedropdown();       
	} 
	@Test(priority=25)
	public void SelectSecondPerferencedProgramTest() throws InterruptedException  {
		 applynowpage.SelectSecondPerferencedProgram();       
	}   
	
	@Test(priority=26) 
	public void scrolldown2Test() throws InterruptedException  { 
		 applynowpage.scrolldown2();        
	} 
	@Test(priority=27)
	public void EnterAbilitiesTestScoreTest() throws InterruptedException  {
		 applynowpage.EnterAbilitiesTestScore();     
		 
	} 
	@Test(priority=28)
	public void EnterMeasurementTestScoreTest() throws InterruptedException  {
		 applynowpage.EnterMeasurementTestScore();        
	} 
	
	@Test(priority=29)
	public void EnterGradPercentageScoreTest() throws InterruptedException  {
		 applynowpage.EnterGradPercentageScore();        
	} 
	@Test(priority=29)
	public void ClickonNationalAttachmentTest() throws InterruptedException  {
		 applynowpage.ClickonNationalAttachment();   
	
	}
	
	@Test(priority=30)
	public void uploadAttachmentTest() throws InterruptedException, AWTException  {
		 applynowpage.uploadAttachment();   
	
	}
	@Test(priority=31)
	public void scrolldown3Test() throws InterruptedException, AWTException  {
		 applynowpage.scrolldown3();   
	
	}
	//@Test(priority=32)
	//public void ClickonCreateMyAccountTest() throws InterruptedException, AWTException  {
		// applynowpage.ClickonCreateMyAccount();   
	
//	}
	
	@AfterClass
	    public void tearDown() {
	    	//to write or update test information to reporter
		driver.quit();  
	        
	        
	        
	
/*	
 *   String UsernameTitile= homePage.ValidateUserName();
 
@AfterMethod
public void logout() {
	driver.close();  */
}
}
	
