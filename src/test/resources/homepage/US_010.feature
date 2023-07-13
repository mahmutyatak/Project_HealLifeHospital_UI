Feature: US_010 As a user, I would like to have a "Complain" section where I can report my requests and complaints.

  Scenario: US_001 Verify that the "Complain" title and icon are visible in the home page bottom bar.
    Given Start browser, go to 'homepageURL'
    And The user scrolls down to the bottom of the page.
    And User verifies that the Complain title and icon are visible in the footer of the page
    Then Browser closed

  Scenario: US_002 It should be verified that the "Complain" title and icon in the bottom bar of the home page are directed to the relevant page when clicked.
    Given Start browser, go to 'homepageURL'
    And The user scrolls down to the bottom of the page.
    And When the user clicks on the Complain title and icon at the bottom of the page, it redirects to the correct page.
    Then Browser closed