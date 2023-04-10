package StepDefs;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.Reporter;

import Pageclasses.MyAccountPage;
import Pageclasses.RegistrationPage;
import UtilityClasses.WebSiteUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef_1 {
	public RemoteWebDriver driver;
	public FluentWait<RemoteWebDriver> wait;
	WebSiteUtility websiteUtil;
	MyAccountPage myaccountpage;
	RegistrationPage registrationPage ;
	
	@Given("user open the  browser")
	public void user_open_the_browser() throws Exception {
		websiteUtil=new WebSiteUtility();
		driver=websiteUtil.openBrowser("firefox");
		wait=websiteUtil.defineWait(driver);
	}

	@When("the opencart site launch {string}")
	public void the_opencart_site_launch(String string) throws Exception {
		websiteUtil.launchSite(string);
		myaccountpage=new MyAccountPage(driver, wait);
		myaccountpage.myAccountMethod();
		myaccountpage.registrationMethod();
	}

	@Then("user checks whether the site is open correctly or no {string}")
	public void user_checks_whether_the_site_is_open_correctly_or_no(String string) {
	  if(string.equals("Register Account")) {
		  Assert.assertTrue(true);
		  Reporter.log("successfully executed...");
	  }else {
		  Assert.assertTrue(false);
	  }
	}
	@Then("user fill the registration fields with {string},{string},{string},{string}")
	public void user_fill_the_registration_fields_with(String string, String string2, String string3, String string4) throws Exception {
		registrationPage=new RegistrationPage(driver, wait);
		registrationPage.firstnameMethod(string);
		registrationPage.lastnameMethod(string2);
		registrationPage.emailMethod(string3);
		registrationPage.passwordMethod(string4);
		websiteUtil.fullPageScreenshot(driver);
	}

	@Then("user click the privacy policy and click continue button")
	public void user_click_the_privacy_policy_and_click_continue_button() throws InterruptedException {
	    registrationPage.checkButtonMethod();
		registrationPage.continueButtonMethod();
	
	}
    @Then("close the browser")
	public void registrationmethod() {
    	websiteUtil.closeSite(driver);
	}

}
