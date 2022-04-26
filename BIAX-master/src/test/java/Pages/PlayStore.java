package Pages;

import FunctionalPages.HomePageFunctional;
import FunctionalPages.PlayStoreFunctionality;
import net.thucydides.core.annotations.Step;

public class PlayStore {
	
	HomePageFunctional homeFunPAge;
	PlayStoreFunctionality playstorefun;
	
	@Step
	public void Validation_of_playstore() {
		
		homeFunPAge.open();
		homeFunPAge.Close_the_Cookies();
		homeFunPAge.Accept_the_Disclaimer();
		homeFunPAge.waitForWithRefresh();
		
		playstorefun.Click_On_PlayStore();
	}
	
	@Step
	public void Validation_of_App_Store() {
		
		playstorefun.Click_On_AppStore();
		
	}
	
	

}
