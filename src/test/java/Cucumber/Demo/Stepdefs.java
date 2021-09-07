package Cucumber.Demo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefs extends RunCucumberTest{
	
	@Given("You are on facebook page")
	public void you_are_on_facebook_page() {
	    System.out.println("You are on facebook page");
	}
	
	@When("you enter username and password")
	public void you_enter_username_and_password() {
		System.out.println("you enter username and password");
	}
	
	@When("you enter username {string}")
	public void you_enter_username(String string) {
		System.out.println("you enter username");
	}
	
	@When("you enter password {string}")
	public void you_enter_password(String string) {
		System.out.println("you enter password");
	}
	
	@Then("user should be at homepage")
	public void user_should_be_at_homepage() {
		System.out.println("user should be at homepage");
	}
}
