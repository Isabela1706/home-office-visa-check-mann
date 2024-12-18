Feature: Verify the countries available in the country dropdown list

  Scenario: Verify the following countries available in the country dropdown list
    Given I am on the home page
    When I click on start button
    Then I can see the following countries in the dropdown:
      | albania                  |
      | bhutan                   |
      | british-protected-person |
      | haiti                    |
      | kazakhstan               |
      | mozambique               |
      | norway                   |
      | portugal                 |
      | russia                   |
      | zambia                   |