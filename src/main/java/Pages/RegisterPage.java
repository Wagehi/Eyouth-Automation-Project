package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage {

    public WebDriver driver;

    public By UsernameField      = By.xpath("//input[@name='username' or @id='username']");
    public By EmailField         = By.xpath("//input[@name='email' or @type='email']");
    public By PasswordField      = By.xpath("//input[@name='password' or @type='password']");
    public By ConfirmPassField   = By.xpath("//input[@name='password_confirm' or @name='confirm_password']");
    public By CreateBtn          = By.xpath("//button[@type='submit' or contains(.,'انشاء')]");

    public By UsernameError      = By.xpath("//*[contains(text(),'اسم المستخدم مطلوب')]");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void EnterEmail(String email) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(EmailField));
        driver.findElement(EmailField).sendKeys(email);
    }

    public void EnterPassword(String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(PasswordField));
        driver.findElement(PasswordField).sendKeys(password);
    }

    public void EnterConfirmPassword(String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(ConfirmPassField));
        driver.findElement(ConfirmPassField).sendKeys(password);
    }

    public void ClickCreate() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(CreateBtn));
        driver.findElement(CreateBtn).click();
    }

    public boolean IsUsernameErrorDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(UsernameError)).isDisplayed();
    }

    public String GetUsernameErrorText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(UsernameError)).getText();
    }

    public String GetCurrentUrl() {
        return driver.getCurrentUrl();
    }
}
