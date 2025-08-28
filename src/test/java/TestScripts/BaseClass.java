package TestScripts;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class BaseClass {
	
	protected WebDriver driver; 

	@BeforeClass
	@Parameters("browser")
	public  void launch(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")){
			System.setProperty("webdriver.edge.driver", "C:\\Users\\prasa\\OneDrive\\Desktop\\JarFolder\\msedgedriver.exe");
			driver = new EdgeDriver();
		}else if(browser.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}else {
            throw new IllegalArgumentException("Invalid browser: " + browser);
        }

		driver.get("https://qainterview.pythonanywhere.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	}
	@AfterClass
	public void closeInst() {	
		
            driver.close();; // Quit closes all tabs & driver instance
      
	}

}
