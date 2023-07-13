
Feature: US_058 As a doctor, I want to view my patients' appointments from the Appointment page on the Dashboard Sidebar.


 Background:
   Given Start browser  go to "doctorLoginURL"
   Then User fill "doctorEmre" and "passwordEmre" textBoxes
   Then User click sign in button
   Then Click the Appointment link in the Dashboard Sidebar



  Scenario: TC_001 Clicking on the Appointment link in the Dashboard Sidebar should redirect to the relevant page.

     Then Click the Appointment link in the Dashboard Sidebar
    Then Verify that it goes to the Appointment link in the Dashboard Sidebar


  Scenario: TC_002 On the Appointment page, the Appointment Details List should be displayed with headers such as Patient Name, Appointment No, Appointment Date, Phone, Gender Doctor, Source, Priority, Live Consultant, Fees, and Status.

      Then It should be verified that the titles such as "Patient Name, Appointment No, Appointment Date, Phone, Gender, Doctor, Source, Priority, Live Consultant, Feed, Status", "Appointment Details" List are displayed on the appointment page.


  Scenario: TC_003 There should be a search box to search within the Appointment Details List.

      Then Verify the visibility of the appointment number entered in the search box in the list


  Scenario: TC_004 The number of items displayed per page in the Appointment Details List should be selectable (100 or All).

        Then Verify that the number of items displayed per page in the Appointment Details List is selectable.


  Scenario: TC_005 The list content should be sortable via the headers.

          Then Verify that list content is sortable via headings


  Scenario: TC_006 Information pertaining to the content under the Status column should be able to be shown and printed.

    Then Verify that information about the content under the status column is displayable and printable



  Scenario: TC_007 There should be a redirection from the Appointment page to the Doctor Wise page.

    Then It should be verified that there is a redirect from the appointment page to the Doctor Wise page



  Scenario: TC_008 On the Doctor Wise Appointment page, when Doctor and Date are selected, the appointments for the relevant doctor should be listed.

      Then when Doctor and Date are selected on the Doctor Wise Appointment page, it should be verified that the relevant doctor's appointments are listed.


  Scenario: TC_009 There should be a redirection from the Appointment page to the Queue page.

        Then Verify that there is a redirect link from the Appointment page to the Queue page


  Scenario: TC_010 On the Patient Queue page, after entering Doctor, Shift, Date, Slot information and searching, patients who have made an appointment should be listed.

      Then Let's verify that the patients who have made an appointment are listed after entering the Doctor, Shift, Date, Slot information on the Patient Queue page and searching.





