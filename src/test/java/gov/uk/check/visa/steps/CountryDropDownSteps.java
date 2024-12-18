package gov.uk.check.visa.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

import java.util.List;

public class CountryDropDownSteps {
    @Then("I can see the following countries in the dropdown:")
    public void iCanSeeTheFollowingCountriesInTheDropdown(DataTable dataTable) {
        List<List<String>> country = dataTable.asLists(String.class);
        for (List<String> list : country) {
            System.out.println(list);
        }

    }
}
