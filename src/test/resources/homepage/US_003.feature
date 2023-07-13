Feature:As a user, I would like to have a slider with photos of the hospital on the home page of the site to present the hospital.

Scenario: It should be verified that there are pictures in the home page slider and that the pictures change at certain intervals.
Given Start browser, go to 'homepageURL'
  And User verifies slidebar has images and changes with time intervals
  Then Browser closed

  Scenario:It should be verified that image transitions can be made by clicking the icon next to the photos on the Home Page Slider.
    Given Start browser, go to 'homepageURL'
    And By clicking the icons next to the photos in the slider, it is verified that the image entries have been made.
    Then Browser closed
