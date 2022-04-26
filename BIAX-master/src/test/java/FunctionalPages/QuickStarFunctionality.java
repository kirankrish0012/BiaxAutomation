package FunctionalPages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;

public class QuickStarFunctionality extends PageObject {

	public void Click_On_QuickStart() {

		$(By.xpath("/html/body/div/header/div[2]/div/nav/ul/li[2]/a")).click();
		WebElement Element = getDriver().findElement(By.xpath("//a[@class='back-to-top']"));

		// This will scroll the page till the element is found
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
		boolean verifyContext = $(By.xpath("//div[@class='cos-quickstart']")).isDisplayed();
		Assert.assertTrue("Expected Context is not displayed in QuickStart", verifyContext);

	}

	public void Click_On_Lights() {

		$(By.xpath("/html/body/div/div[4]/aside/nav/ul/li[2]/a")).click();
		WebElement Element = getDriver().findElement(By.xpath("//a[@class='back-to-top']"));

		// This will scroll the page till the element is found
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView();", Element);
		boolean verifyContext = $(By.xpath("//div[@class='cos-quickstart']")).isDisplayed();
		Assert.assertTrue("Expected Context is not displayed in On Ligts Section", verifyContext);


	}
	
	public void Click_On_Electric() {

		$(By.xpath("/html/body/div/div[4]/aside/nav/ul/li[3]/a")).click();
		WebElement Element = getDriver().findElement(By.xpath("//a[@class='back-to-top']"));

		// This will scroll the page till the element is found
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView();", Element);
		boolean verifyContext = $(By.xpath("//div[@class='cos-quickstart']")).isDisplayed();
		Assert.assertTrue("Expected Context is not displayed in electric parking section", verifyContext);


	}
	
	public void Click_On_Direct() {

		$(By.xpath("/html/body/div/div[4]/aside/nav/ul/li[4]/a")).click();
		WebElement Element = getDriver().findElement(By.xpath("//a[@class='back-to-top']"));

		// This will scroll the page till the element is found
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView();", Element);
		boolean verifyContext = $(By.xpath("//div[@class='cos-quickstart']")).isDisplayed();
		Assert.assertTrue("Expected Context is not displayed in Direct Section", verifyContext);


	}
	
	public void Click_On_Connecting() {

		$(By.xpath("/html/body/div/div[4]/aside/nav/ul/li[5]/a")).click();
		WebElement Element = getDriver().findElement(By.xpath("//a[@class='back-to-top']"));

		// This will scroll the page till the element is found
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView();", Element);
		boolean verifyContext = $(By.xpath("//div[@class='cos-quickstart']")).isDisplayed();
		Assert.assertTrue("Expected Context is not displayed in Connecting section", verifyContext);


	}
	
	public void Click_On_ECO_Start() {

		$(By.xpath("/html/body/div/div[4]/aside/nav/ul/li[6]/a")).click();
		WebElement Element = getDriver().findElement(By.xpath("//a[@class='back-to-top']"));

		// This will scroll the page till the element is found
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView();", Element);
		boolean verifyContext = $(By.xpath("//div[@class='cos-quickstart']")).isDisplayed();
		Assert.assertTrue("Expected Context is not displayed in ECO Start section", verifyContext);


	}
	
	public void Click_On_Children_in_Vechicle() {

		$(By.xpath("/html/body/div/div[4]/aside/nav/ul/li[7]/a")).click();
		WebElement Element = getDriver().findElement(By.xpath("//a[@class='back-to-top']"));

		// This will scroll the page till the element is found
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView();", Element);
		boolean verifyContext = $(By.xpath("//div[@class='cos-quickstart']")).isDisplayed();
		Assert.assertTrue("Expected Context is not displayed in Children in vechicles", verifyContext);


	}
	
	public void Click_On_Hybrid() {

		$(By.xpath("/html/body/div/div[4]/aside/nav/ul/li[8]/a")).click();
		WebElement Element = getDriver().findElement(By.xpath("//a[@class='back-to-top']"));

		// This will scroll the page till the element is found
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView();", Element);
		boolean verifyContext = $(By.xpath("//div[@class='cos-quickstart']")).isDisplayed();
		Assert.assertTrue("Expected Context is not displayed in Hybrid section", verifyContext);


	}
	
	public void Click_On_Destination_Entry_Navigation() {

		$(By.xpath("/html/body/div/div[4]/aside/nav/ul/li[9]/a")).click();
		WebElement Element = getDriver().findElement(By.xpath("//a[@class='back-to-top']"));

		// This will scroll the page till the element is found
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView();", Element);
		boolean verifyContext = $(By.xpath("//div[@class='cos-quickstart']")).isDisplayed();
		Assert.assertTrue("Expected Context is not displayed in Destination_Entry_Navigation", verifyContext);


	}
	
	
	

}
