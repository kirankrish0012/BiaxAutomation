package starter.stepdefinitions;

import Pages.PlayStore;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class PlayStoresSteps {
	
	@Steps
	PlayStore playstore;
	@Given("Click on the Google App Store link and verify its redirection")
	public void click_on_the_google_app_store_link_and_verify_its_redirection() {
		playstore.Validation_of_playstore();
		
	}

	@Given("Click on the App Store link and verify its redirection")
	public void click_on_the_app_store_link_and_verify_its_redirection() {
		playstore.Validation_of_App_Store();
		
	}

}
