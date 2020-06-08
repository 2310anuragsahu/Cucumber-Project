package Cucumber.Demo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefs{
	
	@Given("^You are on facebook page$")
	public void you_are_on_facebook_page() {
		System.out.println("a");
	    
	}

	@When("you enter username")
	public void you_enter_username() {
		System.out.println("b");
	  
	}

	@When("uoi enter password")
	public void uoi_enter_password() {
		System.out.println("c");
	    
	}

	@Then("user should be at homepage")
	public void user_should_be_at_homepage() {
		System.out.println("d");
	   
	}

	@When("you enter username {string}") // or \"(.*)\" or \"([^\"]*)\"
	public void you_enter_username(String username) {
		System.out.println(username);
	   
	}

	@When("uou enter password {string}")
	public void uou_enter_password(String password) {
		System.out.println(password);
	}

}
