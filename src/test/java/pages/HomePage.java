package pages;
import com.microsoft.playwright.Page;
public class HomePage {
    private final Page page;
    //private final String timeLink = "getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(\"Admin\"))";
    //private final String timeLink = "oxd-text oxd-text--span oxd-main-menu-item--name";
    private final String timeLink = "span[class='oxd-text oxd-text--span oxd-main-menu-item--name']";

    public HomePage(Page page) {
        this.page = page;
    }
    public void clickOnTimeLink() {
        page.click(timeLink);
        //page.locator(timeLink).click();
    }
}