package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import com.Pages.Register_Pages;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {
	
	
	public WebDriver driver;
	public Register_Pages rps;
	
	@Before
	void setUp() {
		driver = new ChromeDriver();
		rps= new Register_Pages(driver);
	}
	
	@After
	void tearDown() {
		driver.quit();
	}
	
	@When("user enter opens url")
	public void user_enter_opens_url() {
	    driver.get("file:///C:/Users/ADMIN/Documents/Selenium%20Softwares/Offline%20Website/pages/examples/register.html");
	}

	@When("user enter name as {string} in name field")
	public void user_enter_name_as_in_name_field(String name) {
	    rps.name(name);
	}

	@And("user enter mobile number as {string} in mobile field")
	public void user_enter_mobile_number_as_in_mobile_field(String mobile) {
	    rps.mobile(mobile);
	}

	@And("user enter email as {string} in email field")
	public void user_enter_email_as_in_email_field(String email) {
	   rps.email(email);
	}

	@And("user enter password as {string} in password field")
	public void user_enter_password_as_in_password_field(String password) {
	    rps.password(password);
	}

	@And("user click on SignIn button")
	public void user_click_on_sign_in_button() {
	    rps.clickbutton();
	}

	@Then("verify registered successfully or not")
	public void verify_registered_successfully_or_not() {
	    String ActualAlert=rps.alertWindow(driver);
	    Assert.assertEquals(ActualAlert, "User registered successfully.");
	}

}
