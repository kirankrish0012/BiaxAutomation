package Pages;

import FunctionalPages.HomePageFunctional;
import net.thucydides.core.annotations.Step;


public class HomePage{
	
	HomePageFunctional homeFunPAge;
	
	
	@Step("Launch the BiaX")
	public void LaunchBiax() throws Exception {
		
		homeFunPAge.open();
		homeFunPAge.Close_the_Cookies();
		homeFunPAge.Accept_the_Disclaimer();
		homeFunPAge.waitForWithRefresh();
		
	}
	
	@Step("get the carname")
	public void Get_The_Car_Name() {
		
		homeFunPAge.getCarName();
		
		
	}
	
	@Step
	public void Get_The_ModelYear() {
		
		homeFunPAge.getModelYear();
	}

}
