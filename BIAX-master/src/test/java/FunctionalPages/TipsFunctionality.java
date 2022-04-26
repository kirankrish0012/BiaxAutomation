package FunctionalPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;

public class TipsFunctionality extends PageObject{
	
	public void Click_On_Tips() {

		$(By.xpath("/html/body/div/header/div[2]/div/nav/ul/li[3]/a")).click();
		WebElement Element = getDriver().findElement(By.xpath("//a[@class='back-to-top']"));

		// This will scroll the page till the element is found
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView();", Element);

	}
	
	public void Click_On_At_filling_Station() {

		$(By.xpath("/html/body/div/div[4]/aside/nav/ul/li[2]/a")).click();
		WebElement Element = getDriver().findElement(By.xpath("//a[@class='back-to-top']"));

		// This will scroll the page till the element is found
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView();", Element);

	}
	
	public void Click_On_Preparing_of_Holiday() {

		$(By.xpath("/html/body/div/div[4]/aside/nav/ul/li[3]/a")).click();
		WebElement Element = getDriver().findElement(By.xpath("//a[@class='back-to-top']"));

		// This will scroll the page till the element is found
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView();", Element);

	}
	
	public void Click_On_Luggage_and_Loading() {

		$(By.xpath("/html/body/div/div[4]/aside/nav/ul/li[4]/a")).click();
		WebElement Element = getDriver().findElement(By.xpath("//a[@class='back-to-top']"));

		// This will scroll the page till the element is found
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView();", Element);

	}
	
	public void Click_On_Ice_and_Snow() {

		$(By.xpath("/html/body/div/div[4]/aside/nav/ul/li[5]/a")).click();
		WebElement Element = getDriver().findElement(By.xpath("//a[@class='back-to-top']"));

		// This will scroll the page till the element is found
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView();", Element);

	}
	
	public void Click_On_Help_in_the_Event_Of_a_Breakdown() {

		$(By.xpath("/html/body/div/div[4]/aside/nav/ul/li[6]/a")).click();
		WebElement Element = getDriver().findElement(By.xpath("//a[@class='back-to-top']"));

		// This will scroll the page till the element is found
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView();", Element);

	}
	
	public void Click_On_Expert_tips() {

		$(By.xpath("/html/body/div/div[4]/aside/nav/ul/li[7]/a")).click();
		WebElement Element = getDriver().findElement(By.xpath("//a[@class='back-to-top']"));

		// This will scroll the page till the element is found
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView();", Element);

	}


}
