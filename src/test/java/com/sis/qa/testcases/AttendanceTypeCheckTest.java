package com.sis.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sis.qa.base.TestBase; 
import com.sis.qa.pages.ApplyNowPage;
import com.sis.qa.pages.AttendanceTypeCheck;

public class AttendanceTypeCheckTest extends TestBase {
	
AttendanceTypeCheck attendancetypecheck;
	
	public AttendanceTypeCheckTest(){
		super();  
	}   
	
	@BeforeClass 
	public void setUp() throws InterruptedException{
		initialization(); 
		//attendancetypecheck =new AttendanceTypeCheck();   
	}
	
	@Test(priority=1)
	public void Enterusernametest() {
		attendancetypecheck =new AttendanceTypeCheck(); 
	attendancetypecheck.enterusername();    

}
	@Test(priority=2)
	public void enterpasswordtest() {
		attendancetypecheck.enterpassword(); 

}
	@Test(priority=3) 
	public  void ClikcLoginButtontest() {
		attendancetypecheck.ClikcLoginButton();
	} 
	@Test(priority=4)
	public void ClickonAttendanceMenuTest() throws InterruptedException {
		attendancetypecheck.ClickonAttendanceMenu();  
	}  
	
	@Test(priority=5)
	public void ClickoncrndropdownTest() throws InterruptedException {
		attendancetypecheck.Clickoncrndropdown();  
	}  
	@Test(priority=6)
	public void selectcrnTest() throws InterruptedException {
		
		attendancetypecheck.selectcrn();
    	} 
	
	@Test(priority=7)
	public void selectAttendanceTypeTest()  {
		
		attendancetypecheck.selectAttendanceType();
	}  	
	 
	@Test(priority=8)
	public void AttendanceTypelistTest() throws Exception  {
	String attendancetype =	attendancetypecheck.AttendanceTypelist(); 
	attendancetype=attendancetype.replace("\n"," "); 
	String[] arr=attendancetype.split(" "); 
	String str="";
	for (String string : arr) { 
		str=str+" "+string; 
	}
//System.out.print(str.trim());
Assert.assertEquals(str, " P A NC EX LR", "AttendanceTypelist not Matched");

	} 
//@AfterClass
//public void tearDown(){
	//driver.quit(); 
		//	}	 
}
	
	

