package TestCases;

import Base.BaseTest;
import Pages.RegisterPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Test_Case_3_Open_Registration_Page extends BaseTest {

    @Test
    public void Open_Registration_Page() {

        RegisterPage registerPage = homePage.ClickJoinUs();

        String currentUrl = registerPage.GetCurrentUrl();

        assertTrue(currentUrl.contains("signup") || currentUrl.contains("register"),
                "URL should contain /signup but was: " + currentUrl);
    }
}
