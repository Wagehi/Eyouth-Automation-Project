package TestCases;

import Base.BaseTest;
import Pages.RegisterPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Test_Case_4_Register_With_Empty_Username extends BaseTest {

    @Test
    public void Register_With_Empty_Username() {

        RegisterPage registerPage = homePage.ClickJoinUs();

        // Enter all fields EXCEPT username
        registerPage.EnterEmail("testuser@test.com");
        registerPage.EnterPassword("Test@1234");
        registerPage.EnterConfirmPassword("Test@1234");

        registerPage.ClickCreate();

        assertTrue(registerPage.IsUsernameErrorDisplayed(),
                "Username validation error should be displayed !!");

        assertEquals(registerPage.GetUsernameErrorText(), "اسم المستخدم مطلوب",
                "Error message text is incorrect !!");
    }
}
