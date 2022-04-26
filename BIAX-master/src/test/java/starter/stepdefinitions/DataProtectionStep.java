package starter.stepdefinitions;

import Pages.DataProtection;
import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class DataProtectionStep {
	
	
	
	@Steps
	DataProtection data_protection;
	
	
	@Given("Click on the data protection link")
	public void click_on_the_data_protection_link() throws Exception {
	    
		data_protection.Click_on_the_DataProtection_link();
		
		
	}


	@Then("Click on provider and take screenshot")
	public void click_on_provider_and_take_screenshot() throws InterruptedException {
	    
		data_protection.Click_On_Provider_And_Take_SS();
	}

	@Then("Click on Legal Notice and take screenshot")
	public void click_on_legal_notice_and_take_screenshot() throws InterruptedException {
	   
		data_protection.Click_On_LegalNotice_And_Take_SS();
	}

	@Then("Click on Cookies and take screenshot")
	public void click_on_cookies_and_take_screenshot() throws InterruptedException {
	   
		data_protection.Click_On_Cookies_And_Take_SS();
	}

	@Then("Click on Data Protection Notice and take screenshot")
	public void click_on_data_protection_notice_and_take_screenshot() throws InterruptedException {
	   
		data_protection.Click_On_DataProtection_And_Take_SS();
	}

	@Then("Click on Contacts and take screenshot")
	public void click_on_contacts_and_take_screenshot() throws InterruptedException {
	   
		data_protection.Click_On_Contacts_And_Take_SS();
	}


	@Then("Close the model.")
	public void close_the_model() {
		
		data_protection.Close_Close_Model();
	   
	}

}
