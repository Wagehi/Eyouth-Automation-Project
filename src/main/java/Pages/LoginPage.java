package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    public WebDriver driver;

    public By UsernameField  = By.xpath("//input[@name='username' or @name='email' or @type='email']");
    public By PasswordField  = By.xpath("//input[@name='password' or @type='password']");
    public By LoginBtn       = By.xpath("//button[@type='submit' or contains(.,'تسجيل الدخول') or contains(.,'دخول')]");

    public By ErrorMessage   = By.xpath("//*[contains(@class,'error') or contains(@class,'alert') or contains(@class,'invalid')]");

    public By ValidationError = By.xpath("//*[contains(@class,'error') or contains(@class,'required') or contains(@class,'invalid')]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void EnterUsername(String username) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(UsernameField));
        driver.findElement(UsernameField).sendKeys(username);
    }

    public void EnterPassword(String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(PasswordField));
        driver.findElement(PasswordField).sendKeys(password);
    }

    public void ClickLogin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(LoginBtn));
        driver.findElement(LoginBtn).click();
    }

    public void LoginWith(String username, String password) {
        EnterUsername(username);
        EnterPassword(password);
        ClickLogin();
    }

    public boolean IsErrorMessageDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(ErrorMessage)).isDisplayed();
    }

    public boolean IsValidationErrorDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(ValidationError)).isDisplayed();
    }

    public String GetCurrentUrl() {
        return driver.getCurrentUrl();
    }
}
