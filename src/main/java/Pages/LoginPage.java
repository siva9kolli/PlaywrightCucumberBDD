package Pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class LoginPage {
    private Page page;
    private Locator userNameInputBox;
    private Locator passwordInputBox;
    private Locator loginButton;

    public LoginPage(Page page) {
        this.page = page;
        this.userNameInputBox = page.locator("[name='user-name']");
        this.passwordInputBox = page.locator("#password");
        this.loginButton = page.locator(".submit-button.btn_action");
    }

    public void login(String username, String password){
        userNameInputBox.fill(username);
        passwordInputBox.fill(password);
        loginButton.click();
    }



}
