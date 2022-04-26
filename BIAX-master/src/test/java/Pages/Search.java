package Pages;

import FunctionalPages.HomePageFunctional;
import FunctionalPages.SearchFunctionality;
import net.thucydides.core.annotations.Step;

public class Search {
	
	
	HomePageFunctional homeFunPAge;
	SearchFunctionality searchfun;
	
	@Step
	public void Click_on_SearchBar() {
		
		homeFunPAge.open();
		homeFunPAge.Close_the_Cookies();
		homeFunPAge.Accept_the_Disclaimer();
		homeFunPAge.waitForWithRefresh();
		
		searchfun.Click_on_SearchBar();
	}
	
	@Step
	public void Enter_Some_Random_text() {
	
		searchfun.Enter_Some_Random_Text();
		
		
	}
	
	@Step
	public void validate_Search_results() {
		
		searchfun.KeyWords_Validation();
		
	}
	
	

}
