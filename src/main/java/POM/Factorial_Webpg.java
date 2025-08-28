package POM;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Factorial_Webpg {
	
	public WebDriver driver;
	
	@FindBy (xpath = "//*[@id=\"number\"]")  private WebElement textbox;
	@FindBy (xpath = "//*[@id=\"getFactorial\"]")  private WebElement calculate;
	@FindBy (xpath = "//*[@href=\"/about\"]")  private WebElement about;
	@FindBy (xpath = "//*[@href=\"/terms\"]")  private WebElement privacy;
	@FindBy (xpath = "//*[@href=\"/privacy\"]")  private WebElement terms;
	@FindBy (xpath = "@FindBy (xpath = \"//*[@href=\\\"/privacy\\\"]\")  private WebElement terms;")  private WebElement qfx2;
	@FindBy (xpath = "//*[@id=\"resultDiv\"]")  private WebElement result;
	
	public Factorial_Webpg(WebDriver driver){		
		PageFactory.initElements(driver, this);
	}
	
	// Validation methods for the WebElements
	
	public boolean isTextDis() {
		return textbox.isDisplayed();
	}
	
	public boolean isTextClickable() {
		return textbox.isEnabled();
	}
	
	public boolean isCalDis() {
		return calculate.isDisplayed();
	}
	
	public boolean isAbtClickable() {
		return calculate.isEnabled();
	}
	
	public boolean isAbtDis() {
		return about.isDisplayed();
	}
	
	public boolean isCalClickable() {
		return about.isEnabled();
	}
	
	public boolean isPrvDis() {
		return privacy.isDisplayed();
	}
	
	public boolean isPrvClickable() {
		return privacy.isEnabled();
	}
	
	public boolean isTermsDis() {
		return privacy.isDisplayed();
	}
	
	public boolean isTermsClickable() {
		return privacy.isEnabled();
	}
	

	// Actions methods for WebElement 
	
	public void enterInt(int a) {
		textbox.clear();
		textbox.sendKeys(String.valueOf(a));
	}
	
	public void clickCal() {	
		calculate.click();;
	}
	
	public void clickAbout() {	
		about.click();;
	}
	
	
	public void clickPrivacy() {		
		privacy.click();;
	}
	
	public void clickTerms() {	
		terms.click();;
	}
	
	public void resultPrint(int number) {	
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofMillis(5000));
		
		String expectedText = "The factorial of " + number + " is: " + factorial(number);
        w.until(ExpectedConditions.textToBePresentInElement(result, expectedText));
		
		String factorial = result.getText();
		
		System.out.println(factorial);
	}
	
	private int factorial(int n) { //for checking the factorial value of integer we are passing
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
	
	// Methods returning 
	public WebElement textbox() {	
		return textbox;
	}
	public WebElement calculate() {	
		return calculate;
	}
	public WebElement about() {	
		return about;
	}
	
	public WebElement terms() {	
		return terms;
	}
	
	public WebElement privacy() {	
		return privacy;
	}
	
}
