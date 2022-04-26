package Pages;

import java.io.IOException;

import FunctionalPages.HomePageFunctional;
import FunctionalPages.VideoFunctionality;
import FunctionalPages.VideoStatusValidation;
import net.thucydides.core.annotations.Step;

public class Videos {

	HomePageFunctional homeFunPAge;
	VideoFunctionality videosFun;
	VideoStatusValidation videostatus;
	@Step
	public void Click_on_AnimationSection() {

		homeFunPAge.open();
		homeFunPAge.Close_the_Cookies();
		homeFunPAge.Accept_the_Disclaimer();
		homeFunPAge.waitForWithRefresh();

		videosFun.click_on_animation();

	}

	@Step
	public void Click_on_any_Video() throws InterruptedException {
		
		videosFun.Click_on_video();

	}

	@Step
	public void Play_in_Full_Screen_Mode() throws InterruptedException {
		
		videosFun.Click_on_FullSreenMode();

	}
	
	@Step
	public void Click_on_second_Video() throws InterruptedException {
		
		videosFun.Click_on_Second_video();
	}
	
	@Step
	public void video_Status_validation() throws InterruptedException, IOException {
		videostatus.OutputFiles();
		videostatus.readURLFromFile();
		videostatus.getResponseCode(null);
		
	}
	

}
