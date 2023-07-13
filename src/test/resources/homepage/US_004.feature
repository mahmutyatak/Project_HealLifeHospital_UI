Feature: As a user, I would like to have boards on the home page for easy access to hospital information.

  Scenario: Check that Insurance Plans, Pediatric Services, Lab Testing, Opening Hours boards are visible under the Home Page Slider.
    Given Start browser , go  to 'homepageURL'
    And Page scrolled down until Insurance Plans, Pediatric Services, Lab Testing, Opening Hours appeared
    And Insurance Plans, Pediatric Services, Lab Testing, Opening Hours visibility verified
    Then Browser closed


    Scenario: It should be verified that it redirects to the relevant page when the read more button is clicked under Insurance Plans, Pediatric Services,
    Lab Testing boards under the Home Page Slider.
      Given Start browser , go  to 'homepageURL'
      And  Page scrolled down until Insurance Plans, Pediatric Services, Lab Testing, Opening Hours appeared
      And User verified that the Read More link under Insurance Plans leads to the correct page
      And Return to old page
      And User verified that Read More link under Pediatric Services section leads to correct page
      And Return to old page
      And It has been verified by the user that the Read More link under the Lab Testing section leads to the correct page

      Then Browser Closed