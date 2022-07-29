package StepDefinitions;

import Hooks.WebDriverHooks;
import Pages.HomePage;
import org.openqa.selenium.WebDriver;

public class CommonStepDefs {

    HomePage homePage;
    public CommonStepDefs(WebDriverHooks webDriverHooks) {

        WebDriver driver = webDriverHooks.getDriver();
        homePage = new HomePage(driver);

    }
}
