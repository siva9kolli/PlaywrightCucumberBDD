package steps;

import PlaywrightBase.PlaywrightFactory;
import io.cucumber.java.*;

public class Hooks {

    @BeforeAll
    public static void initializeBrowsers() {
        PlaywrightFactory.initializeBrowsers("chromium");
        PlaywrightFactory.launchApplication("https://www.saucedemo.com/");
    }

    @AfterAll
    public static void killSession() {
        PlaywrightFactory.killSession();
    }

    @Before
    public static void beforeScenario() {
        System.out.println("Before Scenario");
    }

    @After
    public static void afterScenario() {
        System.out.println("After Scenario");
    }

    @BeforeStep
    public static void beforeStep() {
        System.out.println("Before Step");
    }

    @AfterStep
    public static void afterStep() {
        System.out.println("After Step");
    }
}
