@regression
Feature: Visa confirmation test

  @sanity
  Scenario: an Australian coming to UK for Tourism
    Given I am on the home page
    When I click on start button
    And I select a nationality "Australia"
    And I click on Continue button
    And I select reason "Tourism"
    And I Click on Continue button after reason
    Then I should see the result message "You will not need a visa to come to the UK"

  Scenario: a Chilean coming to the UK for work and plans on staying for longer than six months
    Given I am on the home page
    When I click on start button
    And I select a nationality "Chile"
    And I click on Continue button
    And I select reason "Work, academic visit or business"
    And I click on Continue button
    And I select length of stay "longer than 6 months"
    And I click on Continue button
    Then I should see the result message "You need a visa to work in health and care"

  Scenario: a Colombian national coming to the UK to join a partner for a long stay and they do have an Article 10 or 20 card
    Given I am on the home page
    When I click on start button
    And I select a Nationality to "Colombia"
    And I click on Continue button
    And I select reason "Join partner or family for a long stay"
    And I click on Continue button
    And I select My partner or family member have UK immigration status "yes"
    And I click on Continue button
    Then I should see the result message "You’ll need a visa to join your family or partner in the UK"

