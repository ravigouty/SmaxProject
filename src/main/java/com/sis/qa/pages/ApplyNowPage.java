package com.sis.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.sis.qa.base.TestBase;
import com.sis.qa.util.TestUtil;

public class ApplyNowPage extends TestBase {

	TestUtil testutil;
	String text;
	JavascriptExecutor js = (JavascriptExecutor) driver;  
	ApplyNowPage applynowpage;

	@FindBy(xpath = "//button[@aria-label='Language']")
	WebElement changeArab;

	@FindBy(xpath = "//span[text()='English']")
	WebElement ChangeEng;

	@FindBy(xpath = "//strong[text()='Apply Now']")
	WebElement ApplyNowButton;

//	@FindBy(xpath="//button[@aria-label='Language']")
//	WebElement changeArab;

	// Initializing the Page Objects:

	public ApplyNowPage() {
		PageFactory.initElements(driver, this); 
		
	
		
	}

	// Actions

	public void arabiclang() {
		changeArab.click();
	}

	public void Englang() throws InterruptedException {
		Thread.sleep(3000);
		ChangeEng.click();
	}

	public void Clickapplynow() {
		ApplyNowButton.click();
	}

	public String validateCreateAccountTitle() {
		return driver.findElement(By.xpath("//span[contains(text(), 'Create Account')]")).getText(); 
	}

	public void EnterFirstName() {
		// String Username=prop.getProperty("firstname");
//	 driver.findElement(By.xpath("//input[@ng-model='account.firstName']")).sendKeys(Username);    

		driver.findElement(By.xpath("//input[@ng-model='account.firstName']")).sendKeys(prop.getProperty("firstname"));   

	}

	public void EnterMiddleName() {
		driver.findElement(By.xpath("//input[@ng-model='account.middleName']")) 
				.sendKeys(prop.getProperty("middlename"));
	}

	public void EnterGrandFatherName() {
		driver.findElement(By.xpath("//input[@ng-model='account.gfname']"))
				.sendKeys(prop.getProperty("grandfathername")); 
		
		
	}

	public void EnterFamilyName() {
		
		driver.findElement(By.xpath("//input[@ng-model='account.lastname']")).sendKeys(prop.getProperty("familyname"));
	}

	public void EnterDOB() {
		driver.findElement(By.xpath("//input[@class='md-datepicker-input md-input']"))
				.sendKeys(prop.getProperty("dateofbirth"));  
	}

	public void EnterNationalId() {
		driver.findElement(By.name("NationalId")).sendKeys(prop.getProperty("nationalid"));
	}

	public void EnterEmailid() {
		driver.findElement(By.name("emailid")).sendKeys(prop.getProperty("emailid"));
	}

	public void EnterMobileNumber() {
		driver.findElement(By.name("mobileno")).sendKeys(prop.getProperty("mobilenumber"));
	}

	public void EnterAltNumber() {
		driver.findElement(By.name("anmobileno")).sendKeys(prop.getProperty("alternatemobilenumber"));
	}

	public void EnterApplyNowUsername() {
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("applynowusername"));  
	}

//adding scroll

	public void scrolldown1() {
		WebElement element1 = driver.findElement(By.name("password"));
		js.executeScript("arguments[0].scrollIntoView();", element1);  
	}

	public void EnterApplyNowPassword() {
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("applynowpassword"));
	}

	public void EnterApplyNowConfirmPassword() {
		driver.findElement(By.name("confirmpassword")).sendKeys(prop.getProperty("applynowconfirmpassword"));
	
	}

	public void DropdownDegree() {
		driver.findElement(By.xpath("//md-select[@placeholder='Degree And Application Type']")).click();
		
		
	}

	public void SelectDegreeType() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(), 'Bachelor - Freshman')]")).click();
	}

	public void TermDropdown() {
		driver.findElement(By.xpath("//md-select[@placeholder='Select Term']")).click(); 
	}
	
	
	public void SelectTerm() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(), 'Spring 2018-2019')]")).click();
	}

	public void FirstPerferencedropdown() {
		driver.findElement(By.xpath("//md-select[@name='firstpref']")).click(); 
	}

	public void SelectFirstPerferencedProgram() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//md-option[@id='select_option_252']")).click();
	}

	public void SecondPerferencedropdown() {
		driver.findElement(By.xpath("//md-select[@ng-model='user1.pref2']")).click();
	}

	public void SelectSecondPerferencedProgram() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//md-option[@id='select_option_260']")).click();
	}

// To scrollDownC:\Users\SyngyMaxim\Desktop\images.png
	
	public void scrolldown2() throws InterruptedException {
		Thread.sleep(3000);
		WebElement element2 = driver.findElement(By.xpath("//input[@name='minimumScore0']"));
		js.executeScript("arguments[0].scrollIntoView();", element2);  
	}

	public void EnterAbilitiesTestScore() {
		driver.findElement(By.xpath("//input[@name='minimumScore0']")).sendKeys(prop.getProperty("AbilitiesTest"));
	}

	public void EnterMeasurementTestScore() {
		driver.findElement(By.xpath("//input[@name='minimumScore1']")).sendKeys(prop.getProperty("MeasurementTest"));
	}

	public void EnterGradPercentageScore() {
		driver.findElement(By.xpath("//input[@name='minimumGrade0']")).sendKeys(prop.getProperty("MeasurementTest"));
	}

	public void ClickonNationalAttachment() {
		driver.findElement(By.xpath("//input[@ng-model='fileName'][1]")).click(); 
	}

//UPLOADING IMAGE

	public void uploadAttachment() throws InterruptedException, AWTException {
		Robot r = new Robot();
		StringSelection st = new StringSelection("C:\\Users\\SyngyMaxim\\Desktop\\images.png");

		Thread.sleep(3000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(st, null);

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	
	// To scrollDown
		public void scrolldown3() throws InterruptedException {
			Thread.sleep(3000); 
			WebElement element3 = driver.findElement(By.xpath("//button[@ng-click='save()']"));
			js.executeScript("arguments[0].scrollIntoView();", element3);
		}
public void ClickonCreateMyAccount() {
driver.findElement(By.xpath("//button[@ng-click='save()']")).click();
}
	
//Click on YES Button in Confirmation Message //
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@ng-disabled ='dialog.required && !dialog.result']")));
//driver.findElement(By.xpath("//button[@ng-disabled ='dialog.required && !dialog.result']")).click();
//Thread.sleep(8000);	
}
