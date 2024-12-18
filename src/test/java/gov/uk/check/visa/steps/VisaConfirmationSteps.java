package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VisaConfirmationSteps {
    @Given("I am on the home page")
    public void iAmOnTheHomePage() {

    }

    @When("I click on start button")
    public void iClickOnStartButton() {
        new StartPage().clickStartNow();
    }

    @And("I select a nationality {string}")
    public void iSelectANationality(String nationality) {
        new SelectNationalityPage().selectNationality(nationality);
    }

    @And("I select reason {string}")
    public void iSelectReason(String reason) {
        new ReasonForTravelPage().selectReasonForVisit();

    }

    @Then("I should see the result message {string}")
    public void iShouldSeeTheResultMessage(String message) {
        Assert.assertEquals(new ResultPage().getResultMessage(), message);


    }

    @And("I select length of stay {string}")
    public void iSelectLengthOfStay(String stay) {
        new DurationOfStayPage().selectLengthOfStay(stay);
    }

    @And("I select a Nationality to {string}")
    public void iSelectANationalityTo(String national) {
        new SelectNationalityPage().selectNationality(national);
    }

    @And("I click on Continue button")
    public void iClickOnContinueButton() {
        new SelectNationalityPage().clickNextStepButton();
    }

    @And("I select My partner or family member have UK immigration status {string}")
    public void iSelectMyPartnerOrFamilyMemberHaveUKImmigrationStatus(String status) {
        new FamilyImmigrationStatusPage().selectImmigrationStatus(status);
    }

    @And("I Click on Continue button after reason")
    public void iClickOnContinueButtonAfterReason() {
        new ReasonForTravelPage().clickNextStepButton();
    }
}
