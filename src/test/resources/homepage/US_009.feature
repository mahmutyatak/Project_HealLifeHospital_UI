Feature: US_009 As a user, I want the contact information to be on the main page in order to be able to communicate with the hospital.

  Scenario: TC_001 It should be verified that the contact information of the hospital (phone, e-mail and address) is visible at the bottom of the home page.
    Given Start browser, go to 'homepageURL'
    And The user scrolls down to the bottom of the page.
    And The user confirms that the hospital's contact information (phone, mail, address) is visible
    Then Browser closed

  Scenario: TC_002 When the contact information of the hospital (phone, e-mail and address) is clicked on the bottom bar of the home page,
  it should be verified that the relevant action is taken.
    Given Start browser, go to 'homepageURL'
    And The user scrolls down to the bottom of the page.
    And When the user clicks on the hospital contact information, he confirms that he has taken the relevant action
    Then Browser closed

