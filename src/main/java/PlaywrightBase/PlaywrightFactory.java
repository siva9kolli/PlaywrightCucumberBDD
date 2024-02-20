package PlaywrightBase;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import java.nio.file.Paths;

public class PlaywrightFactory {

    public static Playwright playwright;
    public static Page page;
    public static Browser browser;

    public void firstSampleTest() {
        playwright = Playwright.create();
        //new BrowserType.LaunchOptions().setHeadless(true)
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(5));
        page = browser.newPage();
        page.navigate("https://www.saucedemo.com/");
        System.out.println("Title ====" + page.title());
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("example.png")));

    }

    public static void initializeBrowsers(String browserName){
        switch (browserName){
            case "chromium":
                playwright = Playwright.create();
                //new BrowserType.LaunchOptions().setHeadless(true)
                browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(5));
                page = browser.newPage();
                break;
            case "firefox":
                playwright = Playwright.create();
                 browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(5));
                page = browser.newPage();
                break;

            default:
                System.out.println("Enter valid browsername");
        }
    }

    public static void launchApplication(String url){
        page.navigate(url);;
    }

    public static void killSession(){
        browser.close();
    }
}
