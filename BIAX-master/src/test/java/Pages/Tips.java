package Pages;

import FunctionalPages.HomePageFunctional;
import FunctionalPages.TipsFunctionality;
import net.thucydides.core.annotations.Step;

public class Tips {

	TipsFunctionality TipsFuns;
	HomePageFunctional homeFunPAge;
	
	@Step
	public void Click_OnTips() {
		homeFunPAge.open();
		homeFunPAge.Close_the_Cookies();
		homeFunPAge.Accept_the_Disclaimer();
		homeFunPAge.waitForWithRefresh();
		TipsFuns.Click_On_Tips();
		
		
	}
	@Step
	public void At_the_Filling_Station() {
		

		TipsFuns.Click_On_At_filling_Station();
	}

	@Step
	public void Preparing_for_a_Holiday() {

		TipsFuns.Click_On_Preparing_of_Holiday();
	}

	@Step
	public void Luggage_and_Loading() {

		TipsFuns.Click_On_Luggage_and_Loading();
	}
	
	
	@Step
	public void Ice_and_Snow() {

		TipsFuns.Click_On_Ice_and_Snow();
	}

	@Step
	public void Help_in_the_event_of_a_breakdown() {
 
		TipsFuns.Click_On_Help_in_the_Event_Of_a_Breakdown();
	}
	
	@Step
	public void Expert_tips() {
		
		TipsFuns.Click_On_Expert_tips();
		
	}

}
