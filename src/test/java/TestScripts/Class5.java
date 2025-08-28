package TestScripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.Factorial_Webpg;

public class Class5 extends BaseClass {
	
	
	
	Factorial_Webpg fa;
		
	@BeforeMethod
	public void setup() {
		fa =  new Factorial_Webpg(driver);
	}
	
	@Test
	public void clickPrivacy() {
		
		fa.clickPrivacy();
		
		String ctitle = driver.getTitle();
		
		Assert.assertEquals(ctitle, "");
		
		String curl = driver.getCurrentUrl();
		
		Assert.assertEquals(curl, "https://qainterview.pythonanywhere.com/privacy" , "The link is not matching");
		
		
	}
	
	@Test
	public void clickTerms() {
		
		fa.clickTerms();
		
		String ctitle = driver.getTitle();
		
		Assert.assertEquals(ctitle, "");
		
		String curl = driver.getCurrentUrl();
		
		Assert.assertEquals(curl, "https://qainterview.pythonanywhere.com/terms" , "The link is not matching");
		
		
	}

}
