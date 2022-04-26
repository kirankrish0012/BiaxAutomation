package FunctionalPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LocalisationFunctionality extends PageObject{
	
	public void Click_on_Languages() {
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		WebElement Element = getDriver().findElement(By.xpath("//a[@class='back-to-top']"));
        // Scrolling down the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element);
        getDriver().navigate().refresh();
        $(By.xpath("//div[@class='placeholder']")).waitUntilClickable().click();
		
		
		
		
	}
	
public void Select_Different_Languages() throws InterruptedException {
		
	
	
	List <WebElement> lang_List = getDriver().findElements(By.xpath("//div[@class='options']//div"));
   
//	
    for(int j = 1; j< lang_List.size(); j++) {
       
        
        String Listss = $(By.xpath("//*[@id=\'simpleselect_language\']/div[2]/div["+j+"]")).getText();
        $(By.xpath("//*[@id=\'simpleselect_language\']/div[2]/div["+j+"]")).click();
        Thread.sleep(4000);
    	$(By.xpath("/html/body/div/header/div[2]/div/nav/ul/li[2]/a")).click();
    	WebElementFacade button = $(By.xpath("//div[@class='placeholder']")).waitUntilClickable();
    	button.click();
    	
    	
    	
 
		
    }
		
	}

}
