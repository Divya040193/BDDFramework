package StepDefination;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login1_Steps {

	@When("user enter valid username {string} and enter password {string}")
	public void user_enter_valid_username_and_enter_password(String unm, String pwd) {
	    System.out.println(unm + " " + pwd);
	    
	   
	}
	
	@Then("Page should be navigated to home page or else show error message")
	public void page_should_be_navigated_to_home_page_or_else_show_error_message() {
	    
	}
}
