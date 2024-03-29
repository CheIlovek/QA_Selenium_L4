package utils;

import org.openqa.selenium.By;

public interface Locators {

    interface MainPage {

        By STARTUP_BTN =                    By.xpath("//a[@href='/enterprise/startups'][1]");
        By SOLUTION_BTN =                   By.xpath("//button[normalize-space() = 'Solutions'][1]");
        By SIGNUP_BTN =                     By.xpath("//a[@href='/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home'][1]");
        By PRICING_BTN =                    By.xpath("//a[@href='/pricing'][1]");
        By SUBSCRIBE_BTN =                  By.xpath("//a[@href='https://resources.github.com/newsletter/'][1]");
    }

    interface SubscribePage{
        By HEADER_TXT =                     By.xpath("//h1[1]");
        By SUB_HEADER_TXT =                 By.xpath("//p[1]");
    }

    interface SignUpPage {
        By EMAIL_INPUT =                    By.xpath("//input[@id='email']");
        By ERROR_MSG =                      By.xpath("//p[@id='email-err']/child::p[1]");
    }


    interface StartUpPage{
        By APPLY_BTN =                      By.xpath("//summary[normalize-space() = 'Apply now'][1]");
    }
    interface PricingPage{
        By MONTHLY_BTN =                    By.xpath("//*[@role='radiogroup']/label[1]");
        By RECOMMENDED_TXT =                By.xpath("//p[normalize-space() = 'Recommended'][1]");
        By FAQ_PAYMENT_METHODS_HEADER_TXT = By.xpath("//*[@id = 'what-payment-methods-are-accepted']");
        By FAQ_COPILOT_FREE_HEADER_TXT =    By.xpath("//*[@id = 'i-work-on-open-source-projects-can-i-get-access-to-github-copilot-for-free']");
        By FAQ_PAYMENT_METHODS_BODY_TXT =   By.xpath("//*[@id = 'what-payment-methods-are-accepted']//p[1]");
        By FAQ_COPILOT_FREE_BODY_TXT =      By.xpath("//*[@id = 'i-work-on-open-source-projects-can-i-get-access-to-github-copilot-for-free']//p[1]");




    }


}
