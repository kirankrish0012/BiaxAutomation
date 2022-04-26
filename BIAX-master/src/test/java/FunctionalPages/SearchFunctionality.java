package FunctionalPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.ensure.Ensure;

public class SearchFunctionality extends PageObject{
	
	String KeywordsVisiable = "air bag";
	String KeyWordNotVisible = "Breaks";
	
	public void Click_on_SearchBar() {
		
		
		$(By.xpath("/html/body/div/header/div[2]/div/nav/ul/li[2]/a")).click();
		//$(By.id("searchBox")).click();
		
		
	}
	
	public void Enter_Some_Random_Text() {
		
		
		$(By.id("searchBox")).typeAndEnter(KeywordsVisiable);
		
	}
	
	public void KeyWords_Validation() {
		
		WebElementFacade resultSet = $(By.xpath("//div[@class='searchResultContainer']/ul"));
		resultSet.findElements(By.tagName("li"));
		
		List<WebElement> p = getDriver().findElements(By.xpath("/html/body/div/main/div[2]/ul/li"));
			      //iterate through list
			      for( WebElement i: p){
			    	  
			         String Resutls = i.getText();
			         System.out.println(Resutls);
			        // boolean isPresent =  Resutls.contains(KeywordsVisiable.toLowerCase());  
			         Ensure.that(KeywordsVisiable).isSubstringOf(Resutls);
			       
       }
			      
		      
	}
	
	
	
	

}
