package TestCases;

import Base.BaseTest;
import Pages.LoginPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Test_Case_6_Login_With_Empty_Fields extends BaseTest {

    @Test
    public void Login_With_Empty_Fields() {

        LoginPage loginPage = homePage.ClickLogin();

        // Click login without entering any data
        loginPage.ClickLogin();

        assertTrue(loginPage.IsValidationErrorDisplayed(),
                "Validation messages should appear when login form submitted empty !!");
    }
}
