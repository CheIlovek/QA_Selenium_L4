package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Locators;

import java.time.Duration;

public class StartUpPage {

    private final WebDriver browser;
    public StartUpPage(WebDriver browser) {
        this.browser = browser;
    }

    public boolean isApplyBtnDisplayed() {
        WebDriverWait webDriverWait = new WebDriverWait(browser, Duration.ofSeconds(10));
        return webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(Locators.StartUpPage.APPLY_BTN)).isDisplayed();
    }
}
