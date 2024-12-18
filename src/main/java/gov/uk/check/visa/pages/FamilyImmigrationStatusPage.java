package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FamilyImmigrationStatusPage extends Utility {

    private static final Logger log = LogManager.getLogger(FamilyImmigrationStatusPage.class.getName());
    @CacheLookup
    @FindBy(id = "immigration-status-yes")
    WebElement yes;

    @CacheLookup
    @FindBy(id = "immigration-status-no")
    WebElement no;

    @CacheLookup
    @FindBy(id = "next-step")
    WebElement nextStepButton;

    public void selectImmigrationStatus(String status) {
        switch (status.toLowerCase()) {
            case "yes":
                clickOnElement(yes);
                break;
            case "no":
                break;
            default:
                System.out.println("No valid answer enter");
        }
    }

    public void clickNextStepButton() {
        clickOnElement(nextStepButton);
        log.info("Click on '" + nextStepButton + "' tab");
    }
}
