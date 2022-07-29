package Pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }


    public static final By searchBar = By.id("twotabsearchtextbox");
    public static final By searchButton = By.id("nav-search-submit-button");
    public static final By product = By.xpath("//img[@alt='Sponsored Ad - 2020 Apple MacBook Air Laptop: Apple M1 chip, 13.3-inch/33.74 cm Retina Display, 8GB RAM, 512GB SSD Storag...']");
    public static final By addToCartBtn = By.id("add-to-cart-button");
    public static final By checkOutBtn = By.xpath("//span[@id='attach-sidesheet-checkout-button']/span/input");




    public void verifyPage(String expectedTitle)
    {
        Assert.assertEquals(expectedTitle,driver.getTitle());

    }

     public void click(By element)
     {
         driver.findElement(element).click();
     }

    public void inputText(By element,String value)
    {
        driver.findElement(element).sendKeys(value);
    }


    public void switchWindow()
    { Set<String> windowHandles  = driver.getWindowHandles();
        for(String windowHandle : windowHandles)
        {
            if(driver.getWindowHandle()!=windowHandle)
            {
                driver.switchTo().window(windowHandle);
            }
        }
    }




}
