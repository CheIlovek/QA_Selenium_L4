package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Locators;

import java.time.Duration;

public class PricingPage {

    private final WebDriver browser;

    public PricingPage(WebDriver browser){
        this.browser = browser;
    }

    public boolean isRecommendedLoaded() {
        WebDriverWait webDriverWait = new WebDriverWait(browser, Duration.ofSeconds(10));
        return webDriverWait.until(
                ExpectedConditions.visibilityOfElementLocated(Locators.PricingPage.RECOMMENDED_TXT)
        ).isDisplayed();
    }

    public PricingPage clickMonthlyPayment() {
        WebDriverWait webDriverWait = new WebDriverWait(browser, Duration.ofSeconds(10));
        webDriverWait.until(
                ExpectedConditions.visibilityOfElementLocated(Locators.PricingPage.MONTHLY_BTN)
        ).click();
        return this;
    }

    public PricingPage showFAQPaymentMethodsBodyTXT() {
        WebDriverWait webDriverWait = new WebDriverWait(browser, Duration.ofSeconds(10));
        webDriverWait.until(
                ExpectedConditions.visibilityOfElementLocated(Locators.PricingPage.FAQ_PAYMENT_METHODS_HEADER_TXT)
        ).click();
        return this;
    }

    public String getFAQPaymentMethodsBodyTXT() {
        WebDriverWait webDriverWait = new WebDriverWait(browser, Duration.ofSeconds(10));
        return webDriverWait.until(
                ExpectedConditions.visibilityOfElementLocated(Locators.PricingPage.FAQ_PAYMENT_METHODS_BODY_TXT)
        ).getText();
    }

    public PricingPage showFAQCopilotFreeBodyTXT() {
        WebDriverWait webDriverWait = new WebDriverWait(browser, Duration.ofSeconds(10));
        webDriverWait.until(
                ExpectedConditions.visibilityOfElementLocated(Locators.PricingPage.FAQ_COPILOT_FREE_HEADER_TXT)
        ).click();
        return this;
    }

    public String getFAQCopilotFreeBodyTXT() {
        WebDriverWait webDriverWait = new WebDriverWait(browser, Duration.ofSeconds(10));
        return webDriverWait.until(
                ExpectedConditions.visibilityOfElementLocated(Locators.PricingPage.FAQ_COPILOT_FREE_BODY_TXT)
        ).getText();
    }
}
