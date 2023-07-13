
Feature: US_059 As a doctor, I want to list and manage OPD patients' data from the OPD page on the Dashboard Sidebar.

  Background:
    Given Start browser  go to "doctorLoginURL"
    Then User fill "doctorEmre" and "passwordEmre" textBoxes
    Then User click sign in button
    Then Click the OPD link in the Dashboard Sidebar

    Scenario:TC_001 When the OPD link in the Dashboard Sidebar is clicked, it should redirect to the corresponding page.

      Then Verify that clicking the OPD link in the Dashboard Sidebar is directed to the relevant page.
      And Browser   closed

    Scenario: TC_002 On the OPD page, the OPD Patient List (with columns Name, Patient ID, Guardian Name, Gender, Phone, Consultant, Last Visit, Total Recheckup) should be displayed.

      Then On the OPD page, verify that the OPD Patient List (with columns "Name, Patient Id, Guardian Name, Gender, Phone, Consultant, Last Visit, Total Recheckup") is displayed.
        And  Browser   closed

    Scenario: TC_003 There should be a search box to search within the OPD Patient List.

      Then A search box must be validated to easily search OPD Patient List contents
          And Browser   closed

    Scenario: TC_004 The contents of the OPD Patient List should be sortable by column headers.

      Then Let's verify that the contents of the OPD Patient List are sortable by column headings
      And Browser   closed

    Scenario: TC_005 The number of contents to be displayed per page in the OPD Patient List should be selectable (100 or All).

      Then Verify that the number of items displayed per page in the OPD List is selectable.
      And Browser Closed

    Scenario: TC_006 When the show button under the Total Recheckup column in the OPD Patient List is clicked, it should redirect to the page that shows the details of the content.

      Then It should be verified that when the show button under the title of Total Recheckup in the OPD Patient List is clicked, it redirects to the page where the details of the relevant content are shown.
       And Browser   closed

    Scenario: TC_007 The Overview page should display summary information about the procedures performed on the relevant patient.

      Then Let's verify that the Overview page displays summary information about the procedures performed on the respective patient.
      And Browser   closed

    Scenario: TC_008 The Visits page should display a list of Visits and allow for new Visits to be opened.

      Then  The Visits page should display a list of Visits and verify that new Visits are allowed to be opened
      And  Browser Closed

    Scenario: TC_009 The Lab Investigation page should display the relevant patient's laboratory history.

      Then Lab Investigation page, let's verify that it displays the laboratory history of the respective patient
      And Browser   closed

    Scenario: TC_010 The Treatment History page should display the relevant patient's treatment history.

      Then It should be verified that the Treatment History page shows the treatment history of the relevant patient.
      And Browser   closed

    Scenario: TC_011 The Timeline page should display timeline notifications that have been opened for the relevant patient and allow for new timelines to be created.

      Then Let's verify that the Timeline page displays the timeline notifications that have been opened for the relevant patient
      Then Let's verify that new timelines can be created on the Timeline page
      And Browser   closed

      Scenario: TC_012 There should be a redirection from the OPD page to the Add Patient window.

        Then Let's verify that there is a redirect from the OPD page to the Add Patient window
        And Browser   closed

      Scenario: TC_013 On the Add Patient window, a new patient record can be created or a new OPD record can be created for an existing patient.

        Then Verify that a new patient record can be created or a new OPD record can be created for an existing patient in the Add Patient window
        And  Browser   closed

      Scenario: TC_014  The newly created record on the Add Patient window should be displayed in the OPD Patient List.

        Then In the Add Patient window, verify that the newly created record is displayed in the OPD Patient List.
        And Browser Closed
