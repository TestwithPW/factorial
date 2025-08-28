package TestScripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POM.Factorial_Webpg;

public class Case1 extends BaseClass{
	
	
	Factorial_Webpg fa ;
	
	@BeforeMethod
	public void setup() {
		fa =  new Factorial_Webpg(driver);
	}
	
	@Test
	public void valUIisDisplayed() {
		
		//Using SoftAssert
		SoftAssert s = new SoftAssert();
		
		s.assertTrue(fa.isTextDis(), "Textbox is displayed");
		s.assertTrue(fa.isCalDis(), "Calculate button is displayed");
		s.assertTrue(fa.isAbtDis(), "Calculate button is displayed");
		s.assertTrue(fa.isPrvDis(), "Calculate button is displayed");
		s.assertTrue(fa.isTermsDis(), "Calculate button is displayed");
		
		s.assertAll();
	}
	
	@Test 
	public void valUIisEnabled() {
		
		Factorial_Webpg fa = new Factorial_Webpg(driver);
		
		//using Hard Assert
		Assert.assertEquals(fa.isTextClickable(), true);
		Assert.assertTrue(fa.isCalClickable(), "The Calculate button is clickable");
		Assert.assertEquals(!fa.isAbtClickable(), false);
		Assert.assertEquals(fa.isPrvClickable(), true);
		Assert.assertTrue(fa.isTermsClickable(), "The Terms link is clickable");

	}

}
