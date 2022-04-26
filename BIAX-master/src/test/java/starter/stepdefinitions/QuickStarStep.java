package starter.stepdefinitions;

import Pages.QuickStar;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class QuickStarStep {
	
	
	@Steps
	QuickStar quickstart;
	
	
	@Given("Click on Quick Start")
	public void click_on_quick_start() {
	    
		quickstart.Click_On_QuickStart();
		
	}

	@Given("Click on Lights, Windscreen wipes")
	public void click_on_lights_windscreen_wipes() {
	    
		quickstart.Lights_windscreen_wipers();
		
	}

	@Given("Click on electric parking")
	public void click_on_electric_parking() {
		quickstart.Click__Electric_Parking();
	   
	}

	@Given("Click on Direct select")
	public void click_on_direct_select() {
		quickstart.Direct_Select();
	    
	}

	@Given("Click on Connecting a mobile phone")
	public void click_on_connecting_a_mobile_phone() {
		quickstart.Connecting_Mobile_Phone();
		
	   
	}

	@Given("Click on ECO start")
	public void click_on_eco_start() {
		quickstart.ECO_Start_Stop_Function();
	    
	}

	@Given("Click on Children in the Vechicle")
	public void click_on_children_in_the_vechicle() {
		quickstart.Children_in_The_Vechicle();
	   
	}

	@Given("Click on Hybrid")
	public void click_on_hybrid() {
		quickstart.Hybrid();
	   
	}

	@Given("Click on Destination entry")
	public void click_on_destination_entry() {
		quickstart.Destination_Entry_Navigation();
	   
	}

}
