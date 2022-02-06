package step_defenitions;

import org.junit.internal.runners.statements.Fail;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Driver;

public class AmazonLoginSteps {
	
	@Given("I am on the Amazon home page")
	public void i_am_on_the_amazon_home_page() {
		

	}
	@Given("The sign in button displays")
	public void the_sign_in_button_displays() {
	    System.out.println("Given");

	}
	@When("I click on the sign in button")
	public void i_click_on_the_sign_in_button() {
	    System.out.println("when");

	}
	@Then("I should be directed to login page.")
	public void i_should_be_directed_to_login_page() {
	    System.out.println("then");

	}


}
