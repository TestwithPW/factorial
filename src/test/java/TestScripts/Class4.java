package TestScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.Factorial_Webpg;

public class Class4 extends BaseClass {
	
	Factorial_Webpg fa;
	
	@BeforeMethod
	public void setup() {
		fa =  new Factorial_Webpg(driver);
	}
	
	@Test
	public void validateNumOfLinks() {
		
		fa.clickAbout();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int nl = links.size();
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofMillis(5000));
		
		w.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.tagName("a"), 5));
		
		System.out.println("Total number of links : " + links.size()); 
		
		for(WebElement l: links) {
			
			System.out.println(l.getDomAttribute("href")); ;
			
		}
		
	}

}
