package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class how_to_join_a_bank_Page {

    public WebDriver driver;

    public By SearchResultTitle = By.cssSelector(".text-3xl.font-semibold.text-white");

    public how_to_join_a_bank_Page(WebDriver driver) {
        this.driver = driver;
    }

    public String GetTextMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(SearchResultTitle));
        return driver.findElement(SearchResultTitle).getText();
    }
}
