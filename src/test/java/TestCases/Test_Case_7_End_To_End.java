package TestCases;

import Base.BaseTest;
import Pages.CoursesPage;
import Pages.CourseDetailPage;
import Pages.LoginPage;
import Pages.MyCoursesPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class Test_Case_7_End_To_End extends BaseTest {

    // ⚠️ Replace with your valid credentials
    private final String VALID_EMAIL    = "your_email@example.com";
    private final String VALID_PASSWORD = "your_password";

    @Test
    public void End_To_End_Login_And_Subscribe_Course() {

        // Step 1: Login
        LoginPage loginPage = homePage.ClickLogin();
        loginPage.LoginWith(VALID_EMAIL, VALID_PASSWORD);

        // Wait until redirected away from login page
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.not(ExpectedConditions.urlContains("login")));

        // Step 2: Go to All Courses
        CoursesPage coursesPage = homePage.GoToAllCourses();

        // Step 3: Click first course and subscribe
        CourseDetailPage courseDetailPage = coursesPage.ClickFirstCourse();
        courseDetailPage.ClickSubscribe();

        // Step 4: Go to My Courses and assert course is there
        MyCoursesPage myCoursesPage = new MyCoursesPage(getDriver());
        myCoursesPage.GoToMyCourses();

        assertTrue(myCoursesPage.HasAtLeastOneCourse(),
                "My courses should contain the subscribed course !!");
    }
}
