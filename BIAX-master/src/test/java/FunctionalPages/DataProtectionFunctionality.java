package FunctionalPages;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;

public class DataProtectionFunctionality extends PageObject {

	public void ClickOn_DataProtection() throws InterruptedException {

		$(By.id("privacyHref")).waitUntilVisible().click();
		String Model_heading = $(
				By.xpath("//h2[@class='dialog-title']")).getText();
		Thread.sleep(3000);
		boolean data = $(By.xpath("//h2[@class='dialog-title']")).isDisplayed();
		Assert.assertTrue("Title didnt displayed", data);
		

	}


	public void Click_On_Provider() throws InterruptedException {

		$(By.xpath("//ul[@class='privacy-link']//li[1]")).click();
		
		

	}

	public void Click_On_LegalNotice() throws InterruptedException {

		$(By.xpath("//ul[@class='privacy-link']//li[2]")).click();
		//Thread.sleep(100);
		
	}

	public void Click_On_Cookies() throws InterruptedException {

		$(By.xpath("//ul[@class='privacy-link']//li[3]")).click();
		
	}

	public void Click_On_DataProtection() throws InterruptedException {

		$(By.xpath("//ul[@class='privacy-link']//li[4]")).click();
	
	}

	public void Click_On_Contacts() throws InterruptedException {

		$(By.xpath("//ul[@class='privacy-link']//li[5]")).click();
		
	}

	public void Close_the_Model() {

		$(By.id("close-button")).click();
	}

}
