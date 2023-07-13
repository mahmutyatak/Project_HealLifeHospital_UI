Feature: US_005 As a user, I would like to have the "Featured Services" section of the hospital on the home page of the site.

  Scenario: TC_001 Verify that the text "Featured Services" is visible on the main page.
    Given Start browser , go  to 'homepageURL'
    And The page is scrolled down until the text Featured Services is visible by the user
    And Featured Services text visibility verified by user
    Then Browser Closed

    Scenario: TC_002 Verify that the Medical Treatment, Emergency Help, Qualified Doctors,
    Medical professionals information boards are visible under the Featured Services heading.
      Given Start browser, go to 'homepageURL'
      And The page is scrolled down until the Subject headings are visible under the Featured Services text by the user.
      And User verifies that Topic titles are visible under Featured Services
      Then Browser Closed