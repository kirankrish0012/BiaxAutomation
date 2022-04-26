package starter.stepdefinitions;

import java.io.IOException;

import Pages.Videos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class VideosStep {
	
	
	@Steps
	Videos videos;
	
	@Given("Click on animation section")
	public void click_on_animation_section() {
		
		videos.Click_on_AnimationSection();
		
	}

	@Then("Click on any video and Verify the playback")
	public void click_on_any_video_and_verify_the_playback() throws InterruptedException {
	    
		videos.Click_on_any_Video();
		
	}

	@Then("Play in full screen mode")
	public void play_in_full_screen_mode() throws InterruptedException {
	    
		videos.Play_in_Full_Screen_Mode();
	}

	@Then("Click on cancel button and Play another video")
	public void click_on_cancel_button_and_play_another_video() throws InterruptedException, IOException {
	 
		videos.Click_on_second_Video();
		videos.video_Status_validation();
	}

}
