Feature: As a user (patient), I would like to have a sidebar with menus in order to be able to operate on the menus on my dashboard.

  Background:
    Given Start browser, go to "userLoginURL"
    And User fills 'patientAli' and 'passwordAli' textBoxes
    And User clicks sign in button

  Scenario: [TC_001-->US_021] Dashboard should have the title Dashboard in the sidebar and when clicked it should refresh the main page of the dashboard panel
    And User click dashboard logo and it is verified that the page is refreshed

  Scenario: [TC_002-->US_021] Dashboard sidebar should have My Appointments menu title and when clicked it should redirect to the "appointment" page
    And User clicks appointment Link and it is verified that the page navigated

  Scenario: [TC_003-->US_021] Dashboard sidebar should have OPD menu title and when clicked it should redirect to "opdprofile" page
    And User clicks opdLink and it is verified that the page navigated

  Scenario: [TC_004-->US_021] Dashboard sidebar should have IPD menu title and when clicked it should redirect to "ipdprofile" page
    And User clicks ipdLink and it is verified that the page navigated

  Scenario: [TC_005-->US_021] The Dashboard sidebar should have the Pharmacy menu title and when clicked it should redirect to the "pharmacy" page.
    And User clicks the Pharmacy link and it is verified that the page navigated

  Scenario: [TC_006-->US_021] The Dashboard sidebar should have the Pathology menu title and when clicked it should redirect to the "pathology" page.
    And User clicks the Pathology link and it is verified that the page navigated

  Scenario: [TC_007-->US_021] The Dashboard sidebar should have the Radiology menu title and when clicked it should redirect to the "radiology" page.
    And User clicks the Radiology link and it is verified that the page navigated

  Scenario: [TC_008-->US_021] The Dashboard sidebar should have the Ambulance menu title and when clicked, it should redirect to the "ambulance" page.
    And User clicks the Ambulance link and it is verified that the page navigated

  Scenario: [TC_009-->US_021] There should be a Bloodbank menu title in the Dashboard sidebar and when clicked, it should redirect to the "bloodbank" page.
    And User clicks the Bloodbank link and it is verified that the page navigated

  Scenario: [TC_010-->US_021] The dashboard sidebar should close and open when the menu icon (three lines one below the other) is clicked on the Dashboard navbar.
    And User clicks the menu icon (three lines one below the other) and it is verified that the mini logo is displayed
    And User clicks the menu icon (three lines one below the other) and it is verified that the Heal Life Hospital logo is displayed







