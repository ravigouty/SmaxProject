package com.sis.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sis.qa.base.TestBase;

public class AttendanceTypeCheck extends TestBase {

	//WebElement webelement;
	
	// Enter username	
	@FindBy(name="UserName")
		WebElement username;
		
	// Enter password	
	@FindBy(name="Password")
		WebElement password;
		
	// Click on Login Button	
		@FindBy(id= "loginbtn") WebElement loginBtn;
			
	// Click on Attendance Page
		
		@FindBy(xpath="(//span[contains(text(), 'Attendance')])[1]")
		WebElement AttendanceMenu;
		
	//click on Attendace Crn Dropdown
		@FindBy(xpath="(//div[contains(text(), 'Please Select CRN')])[1]")
		WebElement crndropdown;
		
	//select one crn from the list	
	@FindBy(xpath="(//md-option[@value=\"20192020516\"])[2]")
	WebElement selectcrn;	
	
		
	// select dropdown of AttendanceType
		@FindBy(xpath="(//md-select[@name=\"Prefix\"])[1]")
		WebElement selectAttendanceType;
		
// get the AttendanceType list		
	@FindBy(xpath="//div[@class=\"md-select-menu-container md-default-theme md-active md-clickable\"]")		
	WebElement AttendanceTypelist;
		
/*	public void WebDriverWait() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeSelected(WebElement));
	}
	*/
	
	public AttendanceTypeCheck() {
		PageFactory.initElements(driver, this);   
	}

	public  void enterusername()
{
		 username.sendKeys(prop.getProperty("insusername"));  
		}
	
	public void enterpassword() {
	password.sendKeys(prop.getProperty("inspassword")); 
	
}
	public void ClikcLoginButton() {
		loginBtn.click(); 
		
	}

	public void ClickonAttendanceMenu() throws InterruptedException {
		Thread.sleep(2000);
		AttendanceMenu.click();
		
	}
	
public void Clickoncrndropdown()  {
		crndropdown.click();
	}

public void selectAttendanceType()  {
	selectAttendanceType.click(); 
}

public void selectcrn() throws InterruptedException  {
	Thread.sleep(2000);
	selectcrn.click(); 
}

public String AttendanceTypelist() throws Exception  {
	Thread.sleep(2000);
	return AttendanceTypelist.getText();
}

}
