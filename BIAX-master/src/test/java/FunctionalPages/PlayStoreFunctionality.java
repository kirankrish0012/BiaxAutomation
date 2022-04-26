package FunctionalPages;

import java.util.ArrayList;

import org.junit.Assert;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class PlayStoreFunctionality extends PageObject {

	public void Click_On_PlayStore() {

		$(By.id("linkGoogleStoreA")).click();

		ArrayList<String> newTab = new ArrayList(getDriver().getWindowHandles());
		getDriver().switchTo().window(newTab.get(1));
		$(By.id("gbqfq")).click();
		String PageTile = getDriver().getTitle();
		System.out.println("Page Tile is =>"+""+PageTile);
		$(By.xpath("//h1[@class='AHFaub']")).isDisplayed();
		getDriver().switchTo().window(newTab.get(0));

	}

	public void Click_On_AppStore() {

		$(By.id("linkAppStoreA")).click();

		ArrayList<String> newTab = new ArrayList(getDriver().getWindowHandles());
		getDriver().switchTo().window(newTab.get(2));
		String AppStorePage = getDriver().getTitle();
		System.out.println("Page Tile is =>"+""+AppStorePage);
		$(By.xpath("//h1[@class='product-header__title app-header__title']")).isDisplayed();
		

	}

}
