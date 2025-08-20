package tests;

import base.BaseTest;
import com.microsoft.playwright.junit.UsePlaywright;
import org.testng.SkipException;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

@UsePlaywright
public class LoginTest2 extends BaseTest {
    @Test
    public void loginTest1() {

        LoginPage loginPage = new LoginPage(page);
        HomePage homePage = new HomePage(page);

        test.info("Navigating to the login page");
        page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        test.info("Adding username and password");
        loginPage.addUsername("Admin");
        loginPage.addPassword("admin123");

        test.info("Clicking on login button");
        loginPage.clickLoginButton();

        System.out.println("Test completed");

        test.info("Verifying the home page title");
        homePage.clickOnTimeLink();

        test.info("All page completed");
        //OR: Use the login method in the LoginPage class
        //loginPage.login("Admin", "admin123");
    }

    @Test
    public void loginTest2() {

        test.skip("Test case is skipped");
        throw new SkipException("Skipping this test");

    }

    @Test
    public void loginTest3() {

        LoginPage loginPage = new LoginPage(page);
        HomePage homePage = new HomePage(page);

        test.info("Navigating to the login page");
        page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        test.info("Adding username and password");
        loginPage.addUsername("Admin");
        loginPage.addPassword("admin123");

        test.info("Clicking on login button");
        loginPage.clickLoginButton();

        System.out.println("Test completed");

        test.info("Verifying the home page title");
        homePage.clickOnTimeLink();

        test.info("All page completed");

    }
}
