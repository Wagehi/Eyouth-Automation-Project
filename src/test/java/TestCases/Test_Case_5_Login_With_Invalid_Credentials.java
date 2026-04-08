package TestCases;

import Base.BaseTest;
import Pages.LoginPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Test_Case_5_Login_With_Invalid_Credentials extends BaseTest {

    @Test
    public void Login_With_Invalid_Credentials() {

        LoginPage loginPage = homePage.ClickLogin();

        loginPage.LoginWith("invalid_user_xyz@test.com", "WrongPass!999");

        assertTrue(loginPage.IsErrorMessageDisplayed(),
                "Error message should be displayed for invalid credentials !!");
    }
}
