import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class DriverUtil {
	
	 static WebDriver driver;
	  

	 @BeforeTest
	 public void beforeTest() {
		 // System.setProperty("webdriver.chrome.driver", "/Users/Vysakh.Prasanth/Downloads/chromedriver");
		  WebDriverManager.chromedriver().setup();
	 	  driver = new ChromeDriver();
	 }
	 
	 @AfterTest
	  public void afterTest() {
		  
		 driver.quit();
	  }

}
