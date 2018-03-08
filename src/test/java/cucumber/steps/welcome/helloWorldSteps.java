package cucumber.steps.welcome;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class helloWorldSteps {
	@Given("^that site adress is \'(.*)\'$")
	public void thatSiteAdressIs(String url) {
		
	}

	@When("^I run front page$")
	public void iRunFrontPage(){
		
	}

	@Then("^site will be contain text \'(.*)\'$")
	public void siteWillBeContainText(String message){
		
	}
}