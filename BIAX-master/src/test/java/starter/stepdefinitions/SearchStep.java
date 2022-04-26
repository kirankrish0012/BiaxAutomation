package starter.stepdefinitions;


import Pages.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class SearchStep {
	
	@Steps
	Search srchh;
	

	@Given("Click on the search bar")
	public void click_on_the_search_bar() {
		
		
		srchh.Click_on_SearchBar();

	}

	@Then("Enter some random text in search bar and Click on search icon")
	public void enter_some_random_text_in_search_bar_and_click_on_search_icon() {
	    
		srchh.Enter_Some_Random_text();
	}

	@Then("Verify the results are matching with search key word.")
	public void verify_the_results_are_matching_with_search_key_word() {
		srchh.validate_Search_results();
		
	}


}
