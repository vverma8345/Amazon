package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserFactory {



    String driverLocation = "src/test/Resources/drivers/";
    String chromeDriver = driverLocation + "chromedriver.exe";
    String edgeDriver = driverLocation + "msedgedriver.exe";




    public void initDriver(String browserName,WebDriver driver) {


        switch (browserName) {
            case "chrome":
                System.out.println("**** Test running on Chrome browser ****");
                System.setProperty("webdriver.chrome.driver", chromeDriver);
                 driver = new ChromeDriver();

            case "edge":
                System.out.println("**** Test running on Edge browser ****");
                System.setProperty("webdriver.edge.driver", edgeDriver);
                 driver = new EdgeDriver();

            default:
                System.out.println("\n [ERROR] Unsupported browser - '" + browserName + "'! Use 'chrome', 'firefox' or 'ie'.");

        }

    }
}
