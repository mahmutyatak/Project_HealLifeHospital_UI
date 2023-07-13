Feature: US_006 As a user, I want the doctors section on the main page to see the doctors serving in the hospital.

  Scenario: TC_001
  It should be verified that the photo, name, surname and title of 6 doctors
  are visible under the title "Our Doctors" on the main page.
    Given Start browser, go to 'homepageURL'
    And The page is scrolled down until the doctors under the Our Doctors section are visible by the user.
    And User verified that doctors are visible under Our Doctors section
    Then Browser closed