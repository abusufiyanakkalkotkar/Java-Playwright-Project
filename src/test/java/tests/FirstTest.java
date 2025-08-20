package tests;


import base.BaseTest;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {
    @Test
    public void verifyTitle(){
        page.navigate("https://www.facebook.com");
        if (page.isVisible("button:has-text('Accept all')")) {
            page.click("button:has-text('Accept all')");
        }
        System.out.println("facebook NCR opened successfully...!");
        System.out.println("Page title: " + page.title());
    }
    /*public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            Page page = browser.newPage();
            page.navigate("https://www.facebook.com/");
            System.out.println("Page title: " + page.title());
            browser.close();
        }
    }*/
}
