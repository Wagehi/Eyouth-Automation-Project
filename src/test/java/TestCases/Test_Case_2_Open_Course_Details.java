package TestCases;

import Base.BaseTest;
import Pages.CoursesPage;
import Pages.CourseDetailPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Test_Case_2_Open_Course_Details extends BaseTest {

    @Test
    public void Open_Course_Details() {

        CoursesPage coursesPage = homePage.GoToAllCourses();

        CourseDetailPage courseDetailPage = coursesPage.ClickFirstCourse();

        assertTrue(courseDetailPage.IsAboutSectionDisplayed(),
                "Section 'حول الدورة التدريبية' is Not Displayed !!");
    }
}
