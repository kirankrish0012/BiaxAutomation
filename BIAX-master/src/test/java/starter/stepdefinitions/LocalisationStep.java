package starter.stepdefinitions;

import Pages.Languages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class LocalisationStep {
	
	
	@Steps
	Languages langs;
	
	@Given("Click on the Language dropdown")
	public void click_on_the_language_dropdown() {
		langs.Click_On_Language();
		
		
	}

	@Then("Check on each Language and Take a Screen shot")
	public void check_on_each_language_and_take_a_screen_shot() throws InterruptedException {
	    
		langs.List_of_Languages();
		
	}

}
