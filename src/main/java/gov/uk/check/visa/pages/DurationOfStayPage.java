package gov.uk.check.visa.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DurationOfStayPage {

    private static final Logger log = LogManager.getLogger(DurationOfStayPage.class.getName());


    @CacheLookup
    @FindBy (xpath = "//input[@id='response-1']")//(id = "length-of-stay")
    WebElement lengthOfStay;

    @CacheLookup
    @FindBy (xpath = "//button[normalize-space()='Continue']")//(id = "next-step")
    WebElement continueButton2;



    public void selectLengthOfStay(String longerThanSixMonths) {
        lengthOfStay.click();
        log.info("Click on '" +  lengthOfStay + "' tab");
    }

    public void clickNextStepButton() {
        continueButton2.click();
        log.info("Click on '" + continueButton2 + "' tab");
    }
}
