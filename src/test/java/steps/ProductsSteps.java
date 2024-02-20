package steps;

import Pages.ProductsPage;
import PlaywrightBase.PlaywrightFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ProductsSteps extends PlaywrightFactory {
    public ProductsPage productsPage;


    @Then("User navigated to products page")
    public void user_navigated_to_products_page() {
        productsPage = new ProductsPage(page);
        Assert.assertTrue(productsPage.isProductsHeadingDisplayed());
        Assert.assertEquals(productsPage.getProductsPageHeading(), "Products");
    }

    @And("User logout")
    public void user_logout(){
        productsPage.logout();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
