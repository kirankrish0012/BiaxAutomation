package FunctionalPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class VideoFunctionality extends PageObject{
	
	
	Actions action = new Actions(getDriver());
	
	
	public void click_on_animation() {
	
		
		WebElementFacade ele = $(By.xpath("//a[@class='dropdown']"));

		//Creating object of an Actions class
		

		//Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		
		$(By.xpath("//nav[@class='submenu noMarginRight']//ul//li//a")).click();
		
		
	}
	
	public void Click_on_video() throws InterruptedException {
		
		
		//Clicks on Videos
		$(By.xpath("//*[@id=\'highlightGrid\']/div/table/tbody/tr[1]/td[1]/div/a")).click();
		Thread.sleep(10000);
		
		
		//*[@id="mep_0"]/div/div[2]/div[4]
		//Pass the video
		$(By.xpath("//button[@aria-label='Pause']")).click();
		Thread.sleep(2000);
		$(By.xpath("//button[@aria-label='Play']")).click();
		
		
//		//Mute for 4000 seconds
//		$(By.xpath("//*[@id=\"mep_0\"]/div/div[3]/div[5]/button")).click();
//		Thread.sleep(4000);
//		$(By.xpath("//*[@id=\"mep_0\"]/div/div[3]/div[5]/button")).click();
//		Thread.sleep(4000);
	}
	
	public void Click_on_FullSreenMode() throws InterruptedException  {
		
		$(By.xpath("//*[@id=\"mep_0\"]/div/div[3]/div[4]/button")).click();
		Thread.sleep(3000);
		Actions action = new Actions(getDriver());
		action.sendKeys(Keys.ESCAPE).build().perform();
		$(By.xpath("//div[@class='breadcrumb']//ul//li/a")).click();
		
	}
	
	//*[@id="highlightGrid"]/div/table/tbody/tr[1]/td[3]/div/a
	public void Click_on_Second_video() throws InterruptedException  {
		$(By.xpath("//*[@id=\"highlightGrid\"]/div/table/tbody/tr[1]/td[2]/div/a")).click();
		Thread.sleep(10000);
		
		
		//*[@id="mep_0"]/div/div[2]/div[4]
		//Pass the video
		$(By.xpath("//button[@aria-label='Pause']")).click();
		Thread.sleep(2000);
		$(By.xpath("//button[@aria-label='Play']")).click();
		$(By.xpath("//*[@id=\"mep_0\"]/div/div[3]/div[4]/button")).click();
		Thread.sleep(3000);
		Actions action = new Actions(getDriver());
		action.sendKeys(Keys.ESCAPE).build().perform();
		$(By.xpath("//div[@class='breadcrumb']//ul//li/a")).click();
		
	}
	
	
	
	
	
	
}
