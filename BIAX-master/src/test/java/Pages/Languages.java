package Pages;

import FunctionalPages.HomePageFunctional;
import FunctionalPages.LocalisationFunctionality;
import net.thucydides.core.annotations.Step;

public class Languages {
	
	HomePageFunctional homeFunPAge;
	LocalisationFunctionality langFuns;

	
	@Step
	public void Click_On_Language() {
		
		homeFunPAge.open();
		homeFunPAge.Close_the_Cookies();
		homeFunPAge.Accept_the_Disclaimer();
		homeFunPAge.waitForWithRefresh();
		langFuns.Click_on_Languages();
	}

	@Step
	public void List_of_Languages() throws InterruptedException {

		langFuns.Select_Different_Languages();
	}

}
