Feature: US_013 As a user, I would like a gallery page with pictures of the hospital to get a closer look and get to know the hospital better.
  Background:
    Given Start browser, go to 'homepageURL'

  Scenario: TC_001 There should be a redirect from the main page to the Gallery page.
    And User clicks Gallery link in homepage top bar
    And User verifies that the URL of the visited page contains gallery

  Scenario: TC_002 Gallery page (Health & Wellness,Hospitals and Directions,Specialties,Recreation Centre,Your Health)There should be pictures divided into surgery sections.
    And User clicks Gallery link in homepage top bar
    And The user must verify that the images of the specified sections (divided into Health & Wellness, Hospitals and Directions, Specialties, Recreation Centre, Your Health, Surgery sections) are visible on the page they go to.