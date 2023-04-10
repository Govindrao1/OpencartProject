package StepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrollup {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.firefoxdriver().setup();
	RemoteWebDriver driver=new FirefoxDriver();
	driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
	Thread.sleep(3000);
	driver.executeScript("window.scrollBy(0,document.body.scrollHeight);");
	Thread.sleep(5000);
	
	
	
}
}
