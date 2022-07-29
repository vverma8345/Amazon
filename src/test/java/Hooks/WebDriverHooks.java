package Hooks;

import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebDriverHooks {

    private WebDriver driver;


    public WebDriver getDriver() {
        return driver;
    }

    @Before
    public void setup( )
    {
        System.setProperty("webdriver.chrome.driver","src/test/Resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @After
    public void tearDown( )
    {
        driver.quit();
    }

}
