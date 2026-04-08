package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CourseDetailPage {

    public WebDriver driver;

    public By AboutCourseSection = By.xpath("//*[contains(text(),'حول الدورة التدريبية')]");

    public By SubscribeBtn = By.xpath("//button[contains(.,'اشترك') or contains(.,'سجل') or contains(.,'enroll')] | //a[contains(@class,'enroll') or contains(@class,'subscribe')]");

    public CourseDetailPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean IsAboutSectionDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(AboutCourseSection)).isDisplayed();
    }

    public String GetPageTitle() {
        return driver.getTitle();
    }

    public void ClickSubscribe() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(SubscribeBtn));
        driver.findElement(SubscribeBtn).click();
    }

    public String GetCurrentUrl() {
        return driver.getCurrentUrl();
    }
}
