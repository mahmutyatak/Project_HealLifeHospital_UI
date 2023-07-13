Feature: As a user, I would like a 'Contact Us' page to be available to communicate with the hospital management.
  Background:
    Given Start browser, go to 'homepageURL'

    Scenario: TC_001 As a user, I would like a 'Contact Us' page to be available to communicate with the hospital management.
      And User clicks Contact US link in homepage top bar
      And  User verifies that the URL of the visited page contains contact us

    Scenario: TC_002  Name in the Let's Talk section of the Contact Us page,E-mail,subject,Description boxes should appear.
      And User clicks Contact US link in homepage top bar
      And The user confirms that the relevant textBoxes are visible in the Let's Talk section of the entered page.

    Scenario: TC_003 name,E-mail,subject,The message should be sent to the hospital management when the valid data is entered in the Description boxes and Submit is made.
      And  User clicks Contact US link in homepage top bar
      And User verifies that the message delivered alert is visible by filling out the lets talk section


    Scenario:TC_004 There should be a Map on the Contact Us page.
      And User clicks Contact US link in homepage top bar
      And The visible truths of the map on the User Contact US page
      And Browser closed