package Pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class ProductsPage {
    private Page page;
    private Locator productsTitle;
    private Locator hamburgerMenu;
    private Locator logoutLink;

    public ProductsPage(Page page) {
        this.page = page;
        this.productsTitle = page.locator("span.title");
        this.hamburgerMenu = page.locator("#react-burger-menu-btn");
        this.logoutLink = page.locator("#logout_sidebar_link");
    }

    public void logout(){
        hamburgerMenu.click();
        logoutLink.click();
    }
    public boolean isProductsHeadingDisplayed(){
        return productsTitle.isVisible();
    }

    public String getProductsPageHeading(){
        return productsTitle.textContent();
    }


}
