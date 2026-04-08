package TestCases;

import Base.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;

import static org.testng.Assert.assertTrue;

public class Test_Case_10_Verify_YouTube_Link extends BaseTest {

    @Test
    public void Verify_YouTube_Link() {

        homePage.ClickYoutube();

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList<String> tabs = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(1));

        String currentUrl = getDriver().getCurrentUrl();

        assertTrue(currentUrl.contains("youtube.com"),
                "URL should contain youtube.com but was: " + currentUrl);
    }
}
