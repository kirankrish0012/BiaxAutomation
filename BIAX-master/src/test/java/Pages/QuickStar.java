package Pages;

import FunctionalPages.HomePageFunctional;
import FunctionalPages.QuickStarFunctionality;
import net.thucydides.core.annotations.Step;

public class QuickStar {

	HomePageFunctional homeFunPAge;
	QuickStarFunctionality qucikStartfun;

	@Step
	public void Click_On_QuickStart() {

		homeFunPAge.open();
		homeFunPAge.Close_the_Cookies();
		homeFunPAge.Accept_the_Disclaimer();
		homeFunPAge.waitForWithRefresh();
		qucikStartfun.Click_On_QuickStart();

	}

	@Step
	public void Lights_windscreen_wipers() {
		
		qucikStartfun.Click_On_Lights();

	}

	@Step
	public void Click__Electric_Parking() {

		qucikStartfun.Click_On_Electric();
	}

	@Step
	public void Direct_Select() {
		
		qucikStartfun.Click_On_Direct();

	}

	@Step
	public void Connecting_Mobile_Phone() {

		qucikStartfun.Click_On_Connecting();
	}
	
	@Step
	public void ECO_Start_Stop_Function() {

		qucikStartfun.Click_On_ECO_Start();
	}
	
	@Step
	public void Children_in_The_Vechicle() {

		qucikStartfun.Click_On_Children_in_Vechicle();
	}
	
	@Step
	public void Hybrid() {

		qucikStartfun.Click_On_Hybrid();
	}
	
	@Step
	public void Destination_Entry_Navigation() {

		qucikStartfun.Click_On_Destination_Entry_Navigation();
	}


}
