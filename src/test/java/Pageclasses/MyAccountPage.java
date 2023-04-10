package Pageclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class MyAccountPage {
	private RemoteWebDriver driver;
	private FluentWait<RemoteWebDriver> wait;
	
	
	@FindBy(xpath="//span[text()='My Account']")
    @CacheLookup
    private WebElement myAccount;
	
	@FindBy(xpath="//a[text()='Register']")
    @CacheLookup
    private WebElement registration;
	
	public MyAccountPage(RemoteWebDriver driver,FluentWait<RemoteWebDriver> wait) {
		  this.driver=driver;
		  this.wait=wait;
		  PageFactory.initElements(driver, this);
		}
	public void myAccountMethod() {
		wait.until(ExpectedConditions.visibilityOf(myAccount)).click();
	}
	
	public void registrationMethod() {
		wait.until(ExpectedConditions.visibilityOf(registration)).click();
	}
	
}
