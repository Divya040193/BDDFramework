package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver;

	@Given("user should open chrome browser")
	public void user_should_open_chrome_browser() {
	   driver =new ChromeDriver();
	    driver.get("file:///C:/Users/ADMIN/Documents/Selenium%20Softwares/Offline%20Website/index.html");
	}

	@When("user enter valid username")
	public void user_enter_valid_username() {
	   driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	}

	@And("user enter valid passsword")
	public void user_enter_valid_passsword() {
		driver.findElement(By.id("email")).sendKeys("123456");
	}

	@And("user click on login button")
	public void user_click_on_login_button() {
	    driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	}

	@Then("Page should be navigated to home page")
	public void page_should_be_navigated_to_home_page() {
		String title=driver.getTitle();
	  Assert.assertEquals(title, "JavaByKiran | Log in");
	}

	@And("Close the browser")
	public void close_the_browser() {
	    driver.quit();
	}
	
	@When("user enter invalid username")
	public void user_enter_invalid_username() {
		driver.findElement(By.id("email")).sendKeys("kin@gmail.com");
	}

	@When("user enter invalid passsword")
	public void user_enter_invalid_passsword() {
		driver.findElement(By.id("email")).sendKeys("123456");
	}

	@Then("Error message should be displayed")
	public void error_message_should_be_displayed() {
	    String text=driver.findElement(By.id("email_error")).getText();
	    Assert.assertEquals(text, "Please enter valid email.");
	}

}
