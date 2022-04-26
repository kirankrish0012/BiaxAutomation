package starter.stepdefinitions;

import Pages.Tips;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class TipsStep {
	
	@Steps
	Tips tips;
	
	@Given("Click on Tips Section")
	public void click_on_tips_section() {
	    
		tips.Click_OnTips();
		
	}

	@Given("Click on At the filling station")
	public void click_on_at_the_filling_station() {
	    
		tips.At_the_Filling_Station();
	}

	@Given("Click on Preparing for a holiday")
	public void click_on_preparing_for_a_holiday() {
	    
		tips.Preparing_for_a_Holiday();
	}

	@Given("Click on Luggage and loading")
	public void click_on_luggage_and_loading() {
	    
		tips.Luggage_and_Loading();
	}

	@Given("Click on Ice and Snow")
	public void click_on_ice_and_snow() {
	    
		tips.Ice_and_Snow();
	}

	@Given("Click on Help in the event of a breakdown")
	public void click_on_help_in_the_event_of_a_breakdown() {
	    
		tips.Help_in_the_event_of_a_breakdown();
	}

	@Given("Click on Expert tips")
	public void click_on_expert_tips() {
	    
		tips.Expert_tips();
	}

}
