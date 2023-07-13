Feature: US_051 "As an admin, I want a page in the dashboard sidebar to manage finances."
  @ilk
  Scenario: TC_001 When you click on the Finance link on the Dashboard sidebar, the income and expenses sections should be visible
    Given Start browser, go to 'adminLoginURL'
    And User fill 'adminFurkan' and 'passwordFurkan' textBoxes
    And User click sign in button
    Given Click on the Finance link in the Dashboard sidebar
    And Visibility of the income icon is tested
    And Expenses icon visibility is tested
    Then Browser   closed

  Scenario: TC_002 .....
    Given Start browser  go to 'adminLoginURL'
    And User fill 'adminFurkan' and 'passwordFurkan' textBoxes
    And User click sign in button

    Then Browser   closed