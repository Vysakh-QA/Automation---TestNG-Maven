import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerTest.class)
public class GoogleTest {

    DriverUtil driverUtil = new DriverUtil();
    WebDriver driver = new ChromeDriver();
    @BeforeTest()
        public void beforeTest() {


        }

        @Test
    public void getURL(){
        DriverUtil.driver.get("https://www.google.com");
        DriverUtil.driver.findElement(By.name("q")).sendKeys("Michael Jackson");
        }

        @Test
        public void checkLogin(){

        }
}
