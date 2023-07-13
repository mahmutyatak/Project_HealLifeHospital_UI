Feature: As a user (patient), I would like to have functions in the navbar of my dashboard so that I can manage the panel more easily

  Background:
    Given Start browser, go to "userLoginURL"
    And User fills 'patientAli' and 'passwordAli' textBoxes
    And User clicks sign in button

  Scenario: [TC_001-->US_020] When the heallife hospital logo on the Dashboard navbar is clicked, it should lead to the panel home page.
    And User click dashboard logo and it leaded to the panel homepage

  Scenario: [TC_002-->US_020] The language option of the panel can be changed from the Dashboard navbar
    And User clicks English Flag and cliks Turkish Flag and verifies that Turkish Flag is visible

  Scenario: [TC_003-->US_020] Notifications should be accessible by clicking on the notification icon in the Dashboard navbar
    And User clicks notifications icon and verifies that Notifications text is visible

  Scenario: [TC_004-->US_020] All notifications should be displayed in the notification list on the systemnotifications page and notifications can be deleted
    And User clicks notifications icon and verifies that notification list on the systemnotifications page is displayed and notifications are deleted

  Scenario: [TC_005-->US_020] When you click on the profile picture in the Dashboard navbar, the user name, title and profile picture should be displayed in the tab that opens.
    And User clicks on the profile picture in the Dashboard navbar, the user name, title and profile picture are displayed in the tab that opens.

  Scenario: [TC_006-->US_020] The registered password can be changed from the tab that opens when the profile picture on the Dashboard navbar is clicked, and logout can be made (taken) from the system

    And User cliks profile icon and cliks change password link
    And User fills related text boxes and clicks change password button
    And User cliks profile icon and cliks logout button


  Scenario: [TC_007-->US_020] Dashboard navbar should have "Heal Life Hospital & Research Center" text
    And User clicks Dasboard navbar and verifies that Heal Life Hospital & Research Center text is displayed

  Scenario: [TC_008-->US_020] The dashboard sidebar should close and open when the menu icon (three lines one below the other) is clicked on the Dashboard navbar.
    And User clicks the menu icon (three lines one below the other) and it is verified that the mini logo is displayed
    And User clicks the menu icon (three lines one below the other) and it is verified that the Heal Life Hospital logo is displayed

