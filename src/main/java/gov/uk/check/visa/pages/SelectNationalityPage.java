package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SelectNationalityPage extends Utility {

    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
   WebElement nationalityDropDownList;

   @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement Continue;

    public void selectNationality(String nationality) {
        selectByVisibleTextFromDropDown(nationalityDropDownList, nationality);
        log.info("Click on '" + nationalityDropDownList + "' tab");
    }

    public void clickNextStepButton() {
       clickOnElement(Continue);
        log.info("Click on '" + Continue + "' tab");
    }

//    public boolean isCountryInDropdown(String country) {
//        List<WebElement> countries = driver.findElements((By) nationalityDropDownList);
//        for (WebElement countryElement : countries) {
//            if (countryElement.getText().equalsIgnoreCase(country)) {
//                return true;
//            }
//        }
//        return false;
//    }
}
