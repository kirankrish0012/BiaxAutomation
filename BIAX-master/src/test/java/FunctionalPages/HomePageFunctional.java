package FunctionalPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;

public class HomePageFunctional extends PageObject {
	
	
	public void PageRefresh() {
		
		getDriver().navigate().refresh();
	}
	
	public void Close_the_Cookies() {
		
		$(By.id("close_link")).click();
		
	}
	
	public void Accept_the_Disclaimer() {
		
		$(By.id("accept_link")).click();
	}
	
	public void getCarName() {
		
		WebElement CarDetails = $(By.xpath("//ul[@class='first-topMenu']"));
		List<WebElement> options = CarDetails.findElements(By.tagName("li"));
		String carname = options.get(1).getText();
		System.out.println("**************************************************************************");
		System.out.println(carname);
		System.out.println("**************************************************************************");
		
		
	}
	
    public void getModelYear() {
		
    	WebElement ModelYear = $(By.xpath("//ul[@class='first-topMenu']"));
		List<WebElement> options = ModelYear.findElements(By.tagName("li"));
		String modelyear = options.get(2).getText();
		System.out.println("**************************************************************************");
		System.out.println(modelyear);
		System.out.println("**************************************************************************");
	} 


}
