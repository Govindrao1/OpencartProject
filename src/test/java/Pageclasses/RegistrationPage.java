package Pageclasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class RegistrationPage {
	private RemoteWebDriver driver;
	private FluentWait<RemoteWebDriver> wait;
	
	@FindBy(name="firstname")
	@CacheLookup
	private WebElement firstName;
	
	@FindBy(name="lastname")
	@CacheLookup
	private WebElement lastName;
	
	@FindBy(name="email")
	@CacheLookup
	private WebElement emailele;
	
	@FindBy(name="password")
	@CacheLookup
	private WebElement passWord;
	
	@FindBy(xpath="//input[@type='checkbox']")
	@CacheLookup
	private WebElement checkButton;
	
	@FindBy(xpath="//button[text()='Continue']")
	@CacheLookup
	private WebElement continueButton;
 
	public RegistrationPage(RemoteWebDriver driver,FluentWait<RemoteWebDriver> wait) {
	  this.driver=driver;
	  this.wait=wait;
	  PageFactory.initElements(driver, this);
	}
	
	public void firstnameMethod(String st) {
		wait.until(ExpectedConditions.visibilityOf(firstName)).sendKeys(st);
	}
	
	public void lastnameMethod(String st) {
		wait.until(ExpectedConditions.visibilityOf(lastName)).sendKeys(st);
	}
	public void emailMethod(String st) {
		wait.until(ExpectedConditions.visibilityOf(emailele)).sendKeys(st);
		
	}
	public void passwordMethod(String st) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(passWord)).sendKeys(st);
		driver.executeScript("window.scrollBy(0,document.body.scrollHeight);");
	}
	public void checkButtonMethod() throws InterruptedException {
	 wait.until(ExpectedConditions.visibilityOf(checkButton)).click();
		
		
	}
	public void continueButtonMethod() {
		wait.until(ExpectedConditions.visibilityOf(continueButton)).click();
		
	}
}
