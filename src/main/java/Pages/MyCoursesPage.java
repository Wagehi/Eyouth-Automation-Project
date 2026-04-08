package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MyCoursesPage {

    public WebDriver driver;

    public By MyCoursesLink  = By.xpath("//a[contains(@href,'my-courses') or contains(@href,'dashboard') or contains(.,'دوراتي')]");
    public By EnrolledCourses = By.xpath("//div[contains(@class,'my-course') or contains(@class,'enrolled-course')]");

    public MyCoursesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void GoToMyCourses() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(MyCoursesLink));
        driver.findElement(MyCoursesLink).click();
    }

    public boolean HasAtLeastOneCourse() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(EnrolledCourses));
        List<org.openqa.selenium.WebElement> courses = driver.findElements(EnrolledCourses);
        return !courses.isEmpty();
    }
}
