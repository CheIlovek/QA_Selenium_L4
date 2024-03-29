package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Locators;

import java.time.Duration;

public class MainPage {

    private final WebDriver browser;

    public MainPage(WebDriver browser) {
        this.browser = browser;
    }

    public MainPage clickSolutionBtn() {
        WebDriverWait webDriverWait = new WebDriverWait(browser, Duration.ofSeconds(10));
        webDriverWait.until(
                ExpectedConditions.visibilityOfElementLocated(Locators.MainPage.SOLUTION_BTN)
        ).click();
        return this;
    }

    public SubscribePage clickSubscribeBtn() {
        WebDriverWait webDriverWait = new WebDriverWait(browser, Duration.ofSeconds(10));
        webDriverWait.until(
                ExpectedConditions.visibilityOfElementLocated(Locators.MainPage.SUBSCRIBE_BTN)
        ).click();
        return new SubscribePage(browser);
    }

    public SignUpPage clickSignUpBtn() {
        WebDriverWait webDriverWait = new WebDriverWait(browser, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(Locators.MainPage.SIGNUP_BTN)).click();
        return new SignUpPage(browser);
    }

    public StartUpPage clickStartUpBtn() {
        WebDriverWait webDriverWait = new WebDriverWait(browser, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(Locators.MainPage.STARTUP_BTN)).click();
        return new StartUpPage(browser);
    }

    public PricingPage clickPricingBtn() {
        WebDriverWait webDriverWait = new WebDriverWait(browser, Duration.ofSeconds(10));
        webDriverWait.until(
                ExpectedConditions.visibilityOfElementLocated(Locators.MainPage.PRICING_BTN)
        ).click();
        return new PricingPage(browser);
    }

}
