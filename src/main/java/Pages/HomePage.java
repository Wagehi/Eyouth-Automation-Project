package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private WebDriver driver;

    public By SearchBar = By.xpath("//input[@placeholder='بحث عن الدورات التدريبية']");
    public By SearchResult = By.xpath("//a[@class='hover:bg-primary-base flex w-full items-center gap-3 p-3 transition-colors']");
    public By AllCoursesLink = By.xpath("//a[@class='font-light']");
    public By JoinUsBtn = By.cssSelector("body > div:nth-child(4) > main:nth-child(2) > div:nth-child(1) > section:nth-child(8) > div:nth-child(2) > a:nth-child(3)");
    public By LoginBtn = By.cssSelector("a[class='relative inline-flex items-center justify-center gap-2 whitespace-nowrap duration-300 cursor-pointer text-base font-bold transition-colors focus-visible:outline-none focus-visible:ring-0 focus-visible:ring-ring disabled:pointer-events-none disabled:opacity-50 [&_svg]:pointer-events-none [&_svg]:shrink-0 border border-border-default bg-transparent hover:bg-primary-mainBlue text-primary-mainBlue hover:text-white py-3 h-10 rounded px-3 max-md:px-1 [&_svg]:size-6']");
    public By FacebookIcon     = By.xpath("//*[name()='path' and contains(@d,'M26.0063 1')]");
    public By LinkedinIcon     = By.xpath("///*[name()='path' and contains(@d,'M23.2914 3')]");
    public By YoutubeIcon      = By.xpath("//*[name()='path' and contains(@d,'M23.2914 3')]");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void SearchOnTitle(String Title) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(SearchBar));
        driver.findElement(SearchBar).sendKeys(Title);
    }

    public how_to_join_a_bank_Page OpenSearchResult() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(SearchResult));
        driver.findElement(SearchResult).click();
        return new how_to_join_a_bank_Page(driver);
    }

    public CoursesPage GoToAllCourses() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(AllCoursesLink));
        driver.findElement(AllCoursesLink).click();
        return new CoursesPage(driver);
    }

    public RegisterPage ClickJoinUs() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(JoinUsBtn));
        driver.findElement(JoinUsBtn).click();
        return new RegisterPage(driver);
    }

    public LoginPage ClickLogin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(LoginBtn));
        driver.findElement(LoginBtn).click();
        return new LoginPage(driver);
    }

    public void ClickFacebook() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        ((org.openqa.selenium.JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
        wait.until(ExpectedConditions.elementToBeClickable(FacebookIcon));
        driver.findElement(FacebookIcon).click();
    }

    public void ClickLinkedin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        ((org.openqa.selenium.JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
        wait.until(ExpectedConditions.elementToBeClickable(LinkedinIcon));
        driver.findElement(LinkedinIcon).click();
    }

    public void ClickYoutube() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        ((org.openqa.selenium.JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
        wait.until(ExpectedConditions.elementToBeClickable(YoutubeIcon));
        driver.findElement(YoutubeIcon).click();
    }
}
