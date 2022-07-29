package StepDefinitions;


import Hooks.WebDriverHooks;
import Pages.HomePage;
import io.cucumber.java.en.*;
import io.cucumber.messages.types.Hook;


public class AmazonStepDef extends CommonStepDefs {


    public AmazonStepDef(WebDriverHooks webDriverHooks) {
        super(webDriverHooks);
    }

    @Given("I navigate to the Amazon homepage")
    public void i_navigate_to_the_amazon_homepage() {
        homePage.verifyPage("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");

    }

    @And("I Search for {string} product and product get listed")
    public void i_search_for_product_and_product_get_listed(String product) {

        homePage.inputText(HomePage.searchBar,product);
        homePage.click(HomePage.searchButton);

      /*  driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);
        driver.findElement(By.id("nav-search-submit-button")).click();
*/



    }

    @And("I click on the product on the page")
    public void i_click_on_the_product_on_the_page() {
       //driver.findElement(By.xpath("//img[@alt='Sponsored Ad - 2020 Apple MacBook Air Laptop: Apple M1 chip, 13.3-inch/33.74 cm Retina Display, 8GB RAM, 512GB SSD Storag...']")).click();

        homePage.click(homePage.product);
        homePage.switchWindow();

    }

    @And("I add the product to the cart")
    public void i_add_the_product_to_the_cart() {

//        driver.findElement(By.id("add-to-cart-button")).click();
        homePage.click(HomePage.addToCartBtn);
    }

    @Then("I click on checkout button")

    public void i_click_on_checkout_button() {

        homePage.click(HomePage.checkOutBtn);

        /*WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='attach-sidesheet-checkout-button']/span/input")));*/
//        driver.findElement(By.xpath("//span[@id='attach-sidesheet-checkout-button']/span/input")).click();

    }
}


