package TestCases;

import Base.BaseTest;
import Pages.CoursesPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Test_Case_11_Verify_Course_Card_UI extends BaseTest {

    @Test
    public void Verify_Course_Card_UI() {

        CoursesPage coursesPage = homePage.GoToAllCourses();

        assertTrue(coursesPage.IsFirstCourseImageDisplayed(),
                "Course card should display a course image !!");

        assertTrue(coursesPage.IsFirstCourseTitleDisplayed(),
                "Course card should display a course title !!");

        assertTrue(coursesPage.IsFirstInstructorNameDisplayed(),
                "Course card should display an instructor name !!");

        assertTrue(coursesPage.IsFirstSubscribeBtnDisplayed(),
                "Course card should display a subscribe button !!");
    }
}
