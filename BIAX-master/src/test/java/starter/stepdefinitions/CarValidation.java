package starter.stepdefinitions;

import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CarValidation {
	
	@Steps
	HomePage homepage;
	
	@Given("Biax is launched")
	public void biax_is_launched() throws Exception {
		homepage.LaunchBiax();
		
	}

	@When("Get the car name and Car model year")
	public void get_the_car_name_and_car_model_year() {
		homepage.Get_The_Car_Name();
		homepage.Get_The_ModelYear();
		
	}

	@Then("Take screenshot of HomePage")
	public void take_screenshot_of_home_page() {
	  
		
		
	}
	
	

}
