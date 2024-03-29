import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

public class SmokeTest {

    private WebDriver browser;



    @Before
    public void precondition() {
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("https://github.com/");
    }

    //-----


    @Test
    public void signUpEmailNegativeValidation() {
        final String validationErrorText = "Email is invalid or already taken";

        MainPage mainPage = new MainPage(browser);
        SignUpPage signUpPage = mainPage.clickSignUpBtn();
        String errorText = signUpPage
                .enterEmail("test")
                .getErrorMsg();

        Assert.assertEquals(validationErrorText, errorText);
    }

    @Test
    public void checkStartUpApplyBtn() {
        MainPage mainPage = new MainPage(browser);

        StartUpPage startUpPage = mainPage
                .clickSolutionBtn()
                .clickStartUpBtn();

        Assert.assertTrue(startUpPage.isApplyBtnDisplayed());
    }

    @Test
    public void checkIsRecommendedLoaded() {
        MainPage mainPage = new MainPage(browser);
        PricingPage pricingPage = mainPage.clickPricingBtn();
        Assert.assertTrue(pricingPage.isRecommendedLoaded());
        pricingPage.clickMonthlyPayment();
        Assert.assertTrue(pricingPage.isRecommendedLoaded());
    }

    @Test
    public void checkPricingFAQPaymentMethodsBodyTXT() {
        final String validationFAQTextPayment = "You can pay for GitHub Pro, Team, and Enterprise with a credit card, debit card, or with a PayPal account. We also support invoice payments for the Enterprise plan.";
        final String validationFAQTextCopilot = "People who maintain popular open source projects receive a credit to have 12 months of GitHub Copilot access for free. A maintainer of a popular open source project is defined as someone who has write or admin access to one or more of the most popular open source projects on GitHub. Simply visit the GitHub Copilot subscription page to see if you are one of the open source maintainers that meet our criteria for a complimentary subscription. If you do, you should see that you can add GitHub Copilot for no charge. If you see a charge on the purchase page then this means that you do not qualify at this time. Once awarded, if you are still a maintainer of a popular open source project when your initial 12 months subscription expires then you will be able to renew your subscription for free.";
        MainPage mainPage = new MainPage(browser);
        PricingPage pricingPage = mainPage.clickPricingBtn();
        String FAQTextPayment = pricingPage
                .showFAQPaymentMethodsBodyTXT()
                .getFAQPaymentMethodsBodyTXT();

        String FAQTextCopilot = pricingPage
                .showFAQCopilotFreeBodyTXT()
                .getFAQCopilotFreeBodyTXT();

        Assert.assertEquals(validationFAQTextPayment, FAQTextPayment);
        Assert.assertEquals(validationFAQTextCopilot, FAQTextCopilot);
    }


    @Test
    public void checkSubscribePageHeaderTXT() {
        final String validationSubHeaderText =  "Get tips, technical guides, and best practices. Twice a month. Right in your inbox.";
        final String validationHeaderText =     "Subscribe to our developer newsletter";

        MainPage mainPage = new MainPage(browser);
        SubscribePage subscribePage = mainPage.clickSubscribeBtn();
        String headerText = subscribePage.getHeaderTXT();
        String subHeaderText = subscribePage.getSubHeaderTXT();

        Assert.assertEquals(validationHeaderText, headerText);
        Assert.assertEquals(validationSubHeaderText, subHeaderText);
    }

    @After
    public void closeBrowser() {
        browser.quit();
    }





}
