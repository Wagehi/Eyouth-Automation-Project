package Base;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    private WebDriver driver;
    protected HomePage homePage;

    protected WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void Setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://eyouthlearning.com/ar");
        homePage = new HomePage(driver);
    }

    @AfterMethod
    public void after() {
        driver.quit();
    }
}
