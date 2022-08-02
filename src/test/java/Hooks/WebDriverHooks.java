package Hooks;

import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import support.BrowserFactory;

import java.time.Duration;

public class WebDriverHooks {

    private WebDriver driver;
    String driverLocation = "src/test/Resources/drivers/";
    String chromeDriver = driverLocation + "chromedriver.exe";
    String edgeDriver = driverLocation + "msedgedriver.exe";


    public WebDriver getDriver() {
        return driver;
    }

    @Before
    public void setup() {


        System.out.println("**** Test running on Chrome browser ****");
        System.setProperty("webdriver.chrome.driver", chromeDriver);
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
