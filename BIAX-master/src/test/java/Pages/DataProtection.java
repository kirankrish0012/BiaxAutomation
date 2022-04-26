package Pages;


import FunctionalPages.DataProtectionFunctionality;
import FunctionalPages.HomePageFunctional;
import net.thucydides.core.annotations.Step;

public class DataProtection {
	
	DataProtectionFunctionality datapro;
	HomePage homepage;
	HomePageFunctional homeFunPAge;
	
	
	
	
	@Step
	public void Click_on_the_DataProtection_link() throws Exception {
		
		homeFunPAge.open();
		homeFunPAge.Close_the_Cookies();
		homeFunPAge.Accept_the_Disclaimer();
		homeFunPAge.PageRefresh();
		
		datapro.ClickOn_DataProtection();
		
	}
	
	@Step
	public void Click_On_Provider_And_Take_SS() throws InterruptedException {
		
		
		datapro.Click_On_Provider();
		
		
	}
	@Step
	public void Click_On_LegalNotice_And_Take_SS() throws InterruptedException {
		
		datapro.Click_On_LegalNotice();
		
		
		
	}
	@Step
	public void Click_On_Cookies_And_Take_SS() throws InterruptedException {
		
		
		datapro.Click_On_Cookies();
		
		
	}
	@Step
	public void Click_On_DataProtection_And_Take_SS() throws InterruptedException {
		
		
		datapro.Click_On_DataProtection();
		
		
	}
	@Step
	public void Click_On_Contacts_And_Take_SS() throws InterruptedException {
		
		datapro.Click_On_Contacts();
		
		
		
	}
	
	@Step
	public void Close_Close_Model() {
		
		datapro.Close_the_Model();
		
		
	}
	
	

}
