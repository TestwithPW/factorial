package TestScripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.Factorial_Webpg;

public class Case2 extends BaseClass{

	Factorial_Webpg fa ;
	
	@BeforeMethod
	public void setup() {
		fa =  new Factorial_Webpg(driver);
	}	
	
	@Test
	public void valPlaceholder() {
		 // Enter an integer	
		String placeholder = fa.textbox().getDomAttribute("placeholder");
		Assert.assertEquals(placeholder, "Enter an integer");	
	}
	
	@Test
	public void valTitle() {
		String title = driver.getTitle();	
		Assert.assertEquals(title, "Factorial"); // Factoriall
		
	}
	
	@Test
	public void valUrlconatins() {
		String url = driver.getCurrentUrl();	
		boolean urlContains = url.contains("https");	
		Assert.assertEquals(urlContains, true);
		
	}

}
