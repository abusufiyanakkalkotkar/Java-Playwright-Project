package tests;

import base.BaseTest;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.options.MouseButton;
import org.testng.annotations.Test;

import java.util.regex.Pattern;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class PandaTest extends BaseTest {
    @Test
    public void test() {
        page.navigate("https://admin.pandavapor.shop/");
        page.getByText("Panda StoreAdmin").click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Email")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Email")).fill("pandavaporuae@gmail.com");
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).fill("Panda@123");
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).click();
        page.getByRole(AriaRole.BUTTON).filter(new Locator.FilterOptions().setHasText(Pattern.compile("^$"))).click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Toggle theme")).click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Toggle theme")).click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
        // assertThat(page.locator("tspan").filter(new Locator.FilterOptions().setHasText("Orders"))).isVisible();
        // assertThat(page.getByRole(AriaRole.APPLICATION).first()).isVisible();
        // assertThat(page.getByRole(AriaRole.APPLICATION).nth(1)).isVisible();
        // assertThat(page.locator("g:nth-child(5) > .recharts-layer.recharts-bar-rectangles > g > g:nth-child(2) > .recharts-rectangle")).isVisible();
        // assertThat(page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^1,125Visitors$"))).first()).isVisible();
        // assertThat(page.getByRole(AriaRole.APPLICATION).filter(new Locator.FilterOptions().setHasText("JanFebMarAprMayJun"))).isVisible();
        // assertThat(page.getByRole(AriaRole.LIST)).containsText("Dashboard");
        // page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Brands")).click();
        // page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add New Brand")).click();
        // page.getByText("Brand Name").click(new Locator.ClickOptions()
        //         .setButton(MouseButton.RIGHT));
        // page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Close")).click();
        // page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Categories").setExact(true)).click();
        // page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Subcategories")).click();
        // page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Products")).click();
        // page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("All Products")).click();
        // page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Attributes")).click();
        // page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Orders")).click();
        // page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("All Orders")).click();
        // page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Add New Order")).click();
        // page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Shipping Charges")).click();
        // page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Discounts")).click();
        // page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Reviews")).click();
        // page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Customers")).click();
        // page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Pages")).click();
        // page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("City Pages")).click();
        // page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Other Pages")).click();
        // page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Information Cards")).click();
        // page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Logout")).click();
        // page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Logout")).click();
    }
}
