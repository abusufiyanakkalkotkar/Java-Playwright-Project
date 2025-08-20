package base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ExtentManager;
import utils.ScreenshotUtil;

import java.lang.reflect.Method;

public class BaseTest {
    protected Playwright playwright;
    protected Browser browser;
    protected Page page;
    protected ExtentReports extent;
    protected ExtentTest test;

    @BeforeMethod
    public void setUP(Method method){
        //Report setup
        extent = ExtentManager.getInstance();
        test = extent.createTest(method.getName());
        //Playwright setup
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
        page = browser.newPage();

    }
    @AfterMethod
    public void tearDown(ITestResult result){
        //Reporting logic
        if (result.getStatus() == ITestResult.FAILURE){
            test.fail(result.getThrowable());
            //Capture screenshot
            String screenshotPath = ScreenshotUtil.takeScreenshot(page, result.getName());

            System.out.println("Screenshot saved at: " + screenshotPath);
            String projectPath = System.getProperty("user.dir");
            String absoluteScreenshotPath = projectPath + "/" + screenshotPath;
            System.out.println("Absolute screenshot path: " + absoluteScreenshotPath);

            test.addScreenCaptureFromPath(absoluteScreenshotPath, "Screenshot");
            test.addScreenCaptureFromBase64String(absoluteScreenshotPath, "Screenshot");
        }else if (result.getStatus() == ITestResult.SUCCESS){
            test.pass("Test passed");
        }else {
            test.skip("Test skipped");
        }
        extent.flush();
        // Browser cleanup
        if(browser!= null) browser.close();
        if(playwright!= null) playwright.close();
    }
}
