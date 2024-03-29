package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Locators;

import java.time.Duration;

public class SubscribePage {
    private final WebDriver browser;

    public SubscribePage(WebDriver browser){
        this.browser = browser;
    }

    public String getHeaderTXT() {
        WebDriverWait webDriverWait = new WebDriverWait(browser, Duration.ofSeconds(10));
        return webDriverWait.until(
                ExpectedConditions.visibilityOfElementLocated(Locators.SubscribePage.HEADER_TXT)
        ).getText();
    }

    public String getSubHeaderTXT() {
        WebDriverWait webDriverWait = new WebDriverWait(browser, Duration.ofSeconds(10));
        return webDriverWait.until(
                ExpectedConditions.visibilityOfElementLocated(Locators.SubscribePage.SUB_HEADER_TXT)
        ).getText();
    }
}
