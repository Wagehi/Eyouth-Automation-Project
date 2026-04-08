package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CoursesPage {

    public WebDriver driver;

    public By FirstCourseCard      = By.xpath("(//div[contains(@class,'course-card') or contains(@class,'course-item')]//a)[1]");

    public By FirstCourseImage     = By.xpath("(//div[contains(@class,'course-card') or contains(@class,'course-item')]//img)[1]");
    public By FirstCourseTitle     = By.xpath("(//div[contains(@class,'course-card') or contains(@class,'course-item')]//h3 | //div[contains(@class,'course-card')]//h2)[1]");
    public By FirstInstructorName  = By.xpath("(//div[contains(@class,'course-card') or contains(@class,'course-item')]//*[contains(@class,'instructor') or contains(@class,'author')])[1]");
    public By FirstSubscribeBtn    = By.xpath("(//div[contains(@class,'course-card') or contains(@class,'course-item')]//button | //div[contains(@class,'course-card')]//a[contains(@class,'enroll') or contains(@class,'subscribe')])[1]");

    public CoursesPage(WebDriver driver) {
        this.driver = driver;
    }

    public CourseDetailPage ClickFirstCourse() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(FirstCourseCard));
        driver.findElement(FirstCourseCard).click();
        return new CourseDetailPage(driver);
    }

    public boolean IsFirstCourseImageDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(FirstCourseImage)).isDisplayed();
    }

    public boolean IsFirstCourseTitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(FirstCourseTitle)).isDisplayed();
    }

    public boolean IsFirstInstructorNameDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(FirstInstructorName)).isDisplayed();
    }

    public boolean IsFirstSubscribeBtnDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(FirstSubscribeBtn)).isDisplayed();
    }

    public String GetCurrentUrl() {
        return driver.getCurrentUrl();
    }
}
