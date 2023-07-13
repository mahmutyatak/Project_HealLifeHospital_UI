Feature: As a doctor, I want to list and manage IPD patients' data from the IPD page on the Dashboard Sidebar.

  Background:

    Given Start browser , go to "doctorLoginURL"
    Then User fill "doctorAhmet" and "passwordAhmet" textBoxes
    And User click sign in button
    And Click the page of IPD


    Scenario: TC_001 Doctors should be able to log in to the doctor panel by entering their (previously registered) information on the login page.
      Then Browser  closed

    Scenario: TC_002 The IPD Patient List should be displayed with columns

      And Verify that "IPD No, Case ID / Patient ID, Name, Gender, Phone, Consultant, Bed, Credit Limit($)" are visible
      Then Browser  closed

    Scenario: TC_003 The contents of the IPD Patient List are sortable based on column headers.

      And Verify that the contents of the IPD Patient List are sortable
      Then Browser closed

    Scenario: TC_004 There should be a search box in the IPD Patient List to easily search through the contents.

      And User verify that there should be a search box in the IPD Patient List to easily search through the contents.
      Then Browser closed

    Scenario: TC_005 The number of contents to be displayed on one page (100 or All) should be selectable in the IPD Patient List.

      And Verify that the number of items displayed per page in the Appointment Details List is selectable.
      Then Browser closed

    Scenario: TC_006 When the show button under the Credit Limit($) column in the IPD Patient List is clicked,
    it should redirect to a page showing the details of the relevant content.

      And User verify that Limit column in the IPD Patient List redirect the details of the relevant content
      Then Browser closed

    Scenario: TC_007 When clicked, the IPD No information should redirect to a page showing the details of the relevant content

        And User verify that the IPD No redirect to a page which shows the details of the relevant content
        Then Browser closed

      Scenario: TC_008 The Overview page should display summary information about the procedures performed on the relevant patient.

        And User verify that The Overview page display information about the procedures performed on the relevant patient.
        Then Browser closed

     Scenario: TC_009 The Nurse Notes page should display the nurse note opened for the patient.

       And User verify that The Nurse Notes page should display the nurse note
       Then Browser closed

     Scenario: TC_010 The Medication page should display the medication treatment history for the patient.

       And User verify that The Medication page should display the medication treatment history for the patient.
       Then Browser closed

    Scenario: TC_011 A new medication treatment should be able to be added for the patient on the Medication page.

      And User verify that  A new medication treatment should be able to be added for the patient on the Medication page.
      Then Browser closed

    Scenario: TC_012 The Prescription page should display the prescriptions written for the patient.

      And User verify that The Prescription page should display the prescriptions written for the patient.

    Scenario: TC_013 A new prescription should be able to be written for the patient on the Prescription page.

      And User verify that a new prescription should be able to be written for the patient on the Prescription page.

    Scenario: TC_014 The Consultant Register page should list the consultant records.

      And Verify that the Consultant Register page should list the consultant records.

    Scenario: TC_015 A new consultant record should be able to be created on the Consultant Register page.

      And Verify that A new consultant record should be able to be created on the Consultant Register page.


    Scenario: TC_016 The Lab Investigation page should list the laboratory history for the relevant patient.

      And User verify The Lab Investigation page should list the laboratory history for the relevant patient.


    Scenario: TC_017 The Operations page should list the operations undergone by the patient.
      And User verify The Operations page should list the operations undergone by the patient.

    Scenario: TC_018 A new operation record should be able to be created from the Operations page.
      And User verify that A new operation record should be able to be created from the Operations page.

    Scenario: TC_019 The Charges page should display the expenses of the patient.
      And User verify that The Charges page should display the expenses of the patient.

    Scenario: TC_020 A new expense record should be able to be created for the relevant patient on the Charges page.
      And User verify that A new expense record should be able to be created for the relevant patient on the Charges page.

    Scenario: TC_021 The Payment page should display the invoice payments made by the patient.
      And User verify that The Payment page should display the invoice payments made by the patient.

    Scenario: TC_022 A new payment record should be able to be created on the Payment page.
      And User verify that A new payment record should be able to be created on the Payment page

    Scenario: TC_023 The Bed History page should list the bed information for the IPD patient.
      And User verify that The Bed History page should list the bed information for the IPD patient.

    Scenario: TC_024 The Timeline page should display notes on the patient's future treatment.
      And User verify that The Timeline page should display notes on the patient's future treatment.

    Scenario: TC_025 A new timeline note should be able to be created on the Timeline page.
      And User verify that A new timeline note should be able to be created on the Timeline page.

    Scenario: TC_026 The Treatment History page should list the treatment history of the relevant patient.
      And User verify that The Treatment History page should list the treatment history of the relevant patient.

    Scenario: TC_027 There should be a redirection to the page displaying the information of discharged patients when clicked on from the IPD page.
      And User verify that There should be a redirection to the page displaying the information of discharged patients when clicked on from the IPD page.

    Scenario: TC_028 On the IPD Discharged Patient List, columns titled Name, Patient ID, Case ID / Patient ID, Gender, Phone,
    Consultant, Admission Date, Discharged Date, Tax($), Net Amount($), Total($) should be displayed.
      And On the IPD Discharged Patient List, columns titled "Name, Patient Id, Case ID / Patient ID, Gender, Phone, Consultant, Admission Date, Discharged Date, Tax ($), Net Amount ($), Total ($)" should be displayed.

    Scenario: TC_029 The contents of the IPD Discharged Patient List should be sortable based on column headers.
      And User verify that The contents of the IPD Discharged Patient List should be sortable based on column headers.

    Scenario: TC_030 There should be a search box in the IPD Discharged Patient List to easily search through the contents.
      And User verify that There should be a search box in the IPD Discharged Patient List to easily search through the contents.

    Scenario: TC_031 The number of contents to be displayed on one page (100 or All) should be selectable in the IPD Discharged Patient List.
      And User verify that The number of contents to be displayed on one page  should be selectable in the IPD Discharged Patient List.

    Scenario: TC_032 When the show button under the Total($) column in the IPD Discharged Patient List is clicked,
              it should redirect to a page showing the details of the relevant content.
      And User verify that When the show button under the Total column clicked, a page showing the details of the relevant content.

    Scenario: TC_033 When the Name information in the Name column of the IPD Discharged Patient List is clicked,
    it should redirect to a page showing the details of the relevant content.

      And User verify that When the Name information in IPD Discharged Patient List clicked, a page showing the details of the relevant content.

