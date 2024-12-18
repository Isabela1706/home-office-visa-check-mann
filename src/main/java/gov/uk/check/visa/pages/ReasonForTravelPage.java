package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ReasonForTravelPage extends Utility {

    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());


    @CacheLookup
    @FindBy(xpath = "//input[@value='tourism']")
    WebElement tourismOrVisitingFamily;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement workAcademicVisit;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-4']")
    WebElement joinPartnerorFamily;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement ContinueButton1;



    public void selectReasonForVisit() {
        clickOnElement(tourismOrVisitingFamily);
        log.info("Click on '" + tourismOrVisitingFamily + "' tab");
    }

    public void selectedReasonForVisit() {
        clickOnElement(workAcademicVisit);
        log.info("Click on '" + workAcademicVisit + "' tab");
    }

    public void reasonForVisit(){
        clickOnElement(joinPartnerorFamily);
        log.info("Click on '" + joinPartnerorFamily + "' tab");

    }

    public void clickNextStepButton() {
        clickOnElement(ContinueButton1);
        log.info("Click on '" + ContinueButton1 + "' tab");
    }
}
