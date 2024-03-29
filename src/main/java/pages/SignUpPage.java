package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Locators;

import java.time.Duration;

public class SignUpPage {

    private final WebDriver browser;

    public SignUpPage(WebDriver browser) {
        this.browser = browser;
    }

    public SignUpPage enterEmail(String email){
        WebDriverWait webDriverWait = new WebDriverWait(browser, Duration.ofSeconds(10));
        WebElement emailField =  webDriverWait.until(
                ExpectedConditions.visibilityOfElementLocated(Locators.SignUpPage.EMAIL_INPUT)
        );
        emailField.sendKeys(email);
        emailField.sendKeys(Keys.RETURN);
        return this;
    }

    public boolean isErrorMsgDisplayed(){
        WebDriverWait webDriverWait = new WebDriverWait(browser, Duration.ofSeconds(10));
        return webDriverWait.until(
                ExpectedConditions.visibilityOfElementLocated(Locators.SignUpPage.ERROR_MSG)
        ).isDisplayed();
    }

    public String getErrorMsg(){
        WebDriverWait webDriverWait = new WebDriverWait(browser, Duration.ofSeconds(10));
        return webDriverWait.until(
                ExpectedConditions.visibilityOfElementLocated(Locators.SignUpPage.ERROR_MSG)
        ).getText();
    }


}
