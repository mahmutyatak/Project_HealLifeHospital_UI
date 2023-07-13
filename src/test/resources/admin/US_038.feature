Feature: US_038 As an admin I would like to have a page in the dashboard sidebar to manage billing.

  Background:
    Given Start browser  go to 'adminLoginURL'
    And User fill 'adminHasan' and 'passwordHasan' textBoxes
    And User click sign in button
    Then wait 2 seconds

  @biling1
    Scenario: TC_001 Clicking on the Billing link on the Dashboard sidebar should lead to the relevant page.
    * Click on the Biling link on the Dashboard
    * The visibility of the knowing page is tested
    * Browser   closed

  @biling2
  Scenario: TC_002 The Billing page should have "Single Module Billing"
            and "OPD/IPD Billing Through Case Id" windows.
    * Click on the Biling link on the Dashboard
    * Visibility of Single Module Billing and OPDIPD Billing Through Case Id windows is tested
    * Browser   closed

  @biling3
  Scenario: TC_003 OPD Billing List (listed under Name, Patient Id, Guardian Name, Gender, Phone,
  Consultant, Last Visit, Total Recheckup) should be displayed on the page that opens when the OPD
  board in the Single Module Billing window is clicked.
    * Click on the Biling link on the Dashboard
    * Click on OPD button
    * OPD Billing List listed under "Name, Patient Id, Guardian Name, Gender, Phone, Consultant, Last Visit, Total Recheckup" is tested to see that the titles are listed
    * Browser   closed

  @biling4
  Scenario: TC_004 In order to search easily in the OPD Billing List, there must be a SearchTextBox.
    * Click on the Biling link on the Dashboard
    * Click on OPD button
    * TestTextBox is tested
    * Browser   closed

  @biling5
  Scenario: TC_005 A new patient should be able to be added in the OPD Billing List.
   * Click on the Biling link on the Dashboard
   * Click on OPD button
   * click the first Add Patient, then the new patient button
   * Click the Name field and enter the information
   * Age field is clicked and birth date year month day information is entered.
   * Save button is clickdd
   * It is tested that the new name information is saved
   * Browser   closed

  @biling6
  Scenario: TC_006 The number of patients to be displayed in the OPD Billing List (100 or all) should be selected.
  * Click on the Biling link on the Dashboard
  * Click on OPD button
  * Number of patients button is clicked
  * It is tested that the number of patients can be selected
  * Browser   closed

  @biling7
  Scenario: TC_007 The relevant patient (detail profile) information should be displayed
            under the Total Recheckup heading in the OPD Billing List.
   * Click on the Biling link on the Dashboard
   * Click on OPD button
   * Click the Total Recheckup icon
   * It is tested that Total Recheckup information is visible.
   * Browser   closed

  @biling8
  Scenario: TC_008 When the names under Name in the OPD Billing List are clicked, the information
            of the relevant patient (detail profile) should be displayed.
   * Click on the Biling link on the Dashboard
   * Click on OPD button
   * Name icon is clicked
   * It is tested that the name information is visible
   * Browser   closed

  @biling9
  Scenario: TC_009 When the Pathology board in the Single Module Billing window is clicked,
  it is listed under the headings Pathology Billing List "Bill No, Case ID/Patient ID, Reporting Date,
  Patient Name, Reference Doctor, Amount ($), Paid Amount ($), Balance Amount ($)" should be displayed.
    * Click on the Biling link on the Dashboard
    * Click on the Pathology link on the Dashboard
    * Pathology Billing List "Bill No, Case ID / Patient ID, Reporting Date, Patient Name, Reference Doctor, Amount ($), Paid Amount ($), Balance Amount ($)" test showing that the titles are listed
    * Browser   closed

  @biling10
  Scenario: TC_010 In order to search easily in the Pathology Billing List, there must be a SearchTextBox.
  * Click on the Biling link on the Dashboard
  * Click on the Pathology link on the Dashboard
  * TestTextBox is tested
  * Browser   closed

  @biling11
  Scenario: TC_011 A new patient should be able to be added to the Pathology Billing List.
  * Click on the Biling link on the Dashboard
  * Click on the Pathology link on the Dashboard
  * click the first Add Patient, then the new patient button
  * Click the Name field and enter the information
  * Age field is clicked and birth date year month day information is entered.
  * Save button is clicked
  * It is tested that the new name information is saved
  * Browser   closed

  @biling12
  Scenario: TC_012 The number of patients to be displayed in the Pathology Billing List (100 or all) should be selected.
  * Click on the Biling link on the Dashboard
  * Click on the Pathology link on the Dashboard
  * Number of patients buttonn is clicked
  * It is tested that the numberr of patients can be selected
  * Browser   closed

  @biling13
  Scenario: TC_013 Under the title Balance Amount ($) in the Pathology Billing List,
            the relevant patient's (detail invoice) information should be displayed.
  * Click on the Biling link on the Dashboard
  * Click on the Pathology link on the Dashboard
  * wait 2 seconds
  * Click the Balance Amount icon
  * wait 1 seconds
  * It is tested that the Balance Amount information is displayed.
  * Browser closed
  @biling14
  Scenario: TC_014 Under the heading Balance Amount ($) in the Pathology Billing List,
  additional payments should be made to the invoice of the relevant patient (in order to add a new payment,
  one must go to the Payments page and a new payment must be entered into the patient's account from the payments page).
  * Click on the Biling link on the Dashboard
  * Click on the Pathology link on the Dashboard
  * Click the Balance Amount icon
  * Date and amount are entered on the Balance Amount page.
    * wait 1 seconds
  * It is tested that additional payment is made to the invoice.
  * Browser   closed

    @biling16
  Scenario: TC_016 The Radiology Billing List ''Bill No, Case ID/Patient ID, Reporting Date,
  Patient Name, Reference Doctor, Note, Amount ($), Paid Amount ($), Balance Amount ($) headings"
  on the page that opens when the Radiology board in the Single Module Billing window is clicked.
  listed below) should be displayed.
   * Click on the Biling link on the Dashboard
   * In the Dashboard, click on the Radiology board
   * wait 2 seconds
   * Radiology Billing List is tested to see the titles listed "Bill No, Case ID / Patient ID, Reporting Date, Patient Name, Reference Doctor, Note, Amount ($), Paid Amount ($), Balance Amount ($)" test showing that the titles are listed
   * Browser   closed

  @biling17
  Scenario: TC_017 In order to search easily in the Radiology Billing List, there must be a SearchTextBox.
  * Click on the Biling link on the Dashboard
  * In the Dashboard, click on the Radiology board
  * TestTextBox is tested
  * Browser   closed

  @biling18
  Scenario: TC_018 A new patient should be able to be added to the Radiology Billing List.
  * Click on the Biling link on the Dashboard
  * In the Dashboard, click on the Radiology board
  * click the first Add Patient, then the new patient button
  * Click the Name field and enter the information
  * Age field is clicked and birth date year month day information is entered.
  * Save button is clicked
  * It is tested that the new name information is saved
  * Browser   closed

  @biling19
  Scenario: TC_019 The number of patients (100 or all) to be displayed in the Radiology Billing List should be able to be selected.
  * Click on the Biling link on the Dashboard
  * In the Dashboard, click on the Radiology board
  * Number of patients button is clicked
  * It is tested that the number of patients can be selected
  * Browser   closed

  @biling20
  Scenario: TC_020 Under the title Balance Amount ($) in the Radiology Billing List,
  the relevant patient's (detail invoice) information should be displayed.
  * Click on the Biling link on the Dashboard
  * In the Dashboard, click on the Radiology board
  * Click the Balance Amount icon
  * It is tested that the Balance Amount information is displayed.
  * Browser   closed

  @biling21
  Scenario: TC_021 Additional payment should be made to the invoice of the relevant
  patient under the heading Balance Amount ($) in the Radiology Billing List (in order
  to add a new payment, one must go to the Payments page and a new payment can be entered
  into the patient's account from the payments page).
  * Click on the Biling link on the Dashboard
  * In the Dashboard, click on the Radiology board
  * Click the Balance Amount icon
  * Date and amount are entered on the Balance Amount page.
  * It is tested that additional payment is made to the invoice.
  * Browser   closed

  @biling23
  Scenario: TC_023 Blood Issue Billing List (Bill No, Case ID/Patient ID, Issue Date, Received To, Blood Group,
  Gender, Donor Name, Bags, Amount($), Paid Amount($)) , Balance Amount($) listed under the headings) should be displayed.
  * Click on the Biling link on the Dashboard
  * Click on the Blood Issue board
  * Blood Issue Billing List "Bill No, Case ID/Patient ID, Issue Date, Received To, Blood Group, Gender, Donor Name, Bags, Amount ($), Paid Amount ($),Balance Amount ($)" is tested to see that the titles are listed
  * Browser   closed

  @biling24
  Scenario: TC_024 In order to search easily in the Blood Issue Billing List, there must be a SearchTextBox.
  * Click on the Biling link on the Dashboard
  * Click on the Blood Issue board
  * TestTextBox is tested
  * Browser   closed

  @biling25
  Scenario: TC_025 In the Blood Issue Billing List, there should be a transition to the page where a
  new Issue Blood can be added, and a new Blood Issue Bill should be added to the Blood Issue List by
  entering detailed data on the page that opens.
  * Click on the Biling link on the Dashboard
  * Click on the Blood Issue board
  * click the first Add Patient, then the new patient button
  * Click the Name field and enter the information
  * Age field is clicked and birth date year month day information is entered.
  * Save button is clicked
  * It is tested that the new name information is saved
  * Browser   closed

  @biling26
  Scenario: TC_026 The number of patients to be displayed in the Blood Issue Billing List (100 or all) should be selected.
  * Click on the Biling link on the Dashboard
  * Click on the Blood Issue board
  * Number of patients button is clicked
  * It is tested that the number of patients can be selected
  * Browser   closed

  @biling27
  Scenario: TC_027 Under the title Balance Amount ($) in the Blood Issue Billing List, the relevant billing
  information (Blood Issue Details) should be displayed. The relevant Bill data should be able to be deleted and
  edited from the Blood Issue Details window.
   * Click on the Biling link on the Dashboard
  * Click on the Blood Issue board
  * Visibility of billing (Blood Issue Details) information is tested
  * Erasability and editability of Blood Issue Details data are tested
  * Browser   closed

  @biling28
  Scenario: TC_028 Under the heading Balance Amount($) in the Blood Issue Billing List,
  an additional payment should be made to the relevant invoice (in order to add a new payment,
  one must go to the Payments page and a new payment can be entered into the patient's account from the payments page).

  * Click on the Biling link on the Dashboard
  * Click on the Blood Issue board
  * Click the Balance Amount Select
  * Date and amount are entered on the Balance Amount pagee.
  * It is tested that additional payment is made to the invoicee.
  * Browser   closed

  @biling29
  Scenario: TC_029 Relevant Bill data should be deleted under the title Balance Amount($) in the Blood Issue Billing List.
  * Click on the Biling link on the Dashboard
  * Click on the Blood Issue board
  * Delete button is clicked
  * It is tested that the Bild data has been deleted
  * Browser   closed

  @biling31
  Scenario: TC_031 On the page that opens when the Blood Component Issue board in the Single Module Billing window is clicked,
  Blood Component Issue Billing List (Bill No, Case ID/Patient ID, Issue Date, Received To, Blood Group, Component,
  Gender, Donor Name, Bags, Amount($), Paid (listed under the headings Amount($), Balance Amount($)) should be displayed.
  * Click on the Biling link on the Dashboard
  * Click on the Blood Component Issue board
  * Blood Component Issue Billing List is "Bill No, Case ID/Patient ID, Issue Date, Received To, Blood Group, Component, Gender, Donor Name, Bags, Amount ($), Paid Amount ($), Balance Amount ($)" tested to see that the titles are listed
  * Browser   closed

  @biling32
  Scenario: TC_032 In order to search easily in the Blood Component Issue List, there must be a Search TextBox.
    * Click on the Biling link on the Dashboard
    * Click on the Blood Component Issue board
    * TestTextBox is tested
    * Browser   closed

  @biling33
  Scenario: TC_033 In the Blood Component Issue List, there should be a transition to the page where a new
  Issue Blood can be added, and a new Bllod Issue Bill should be added to the Blood Component Issue List by entering
  detailed data on the page that opens.

  * Click on the Biling link on the Dashboard
  * Click on the Blood Component Issue board
  * click the first Add Patient, then the new patient button
  * Click the Name field and enter the information
  * Age field is clicked and birth date year month day information is entered.
  * Save button is clicked
  * It is tested that the new name information is saved
  * Browser   closed

  @biling34
  Scenario: TC_034 Dashboardaki Biling linkine tiklanir
  * Click on the Biling link on the Dashboard
  * Click on the Blood Component Issue board
  * Number of patients button is clicked
  * It is tested that the number of patients can be selected
  * Browser   closed

  @biling35
  Scenario: TC_035 Under the title Balance Amount ($) in the Blood Component Issue List, the relevant billing
  (Blood Issue Details) information should be displayed. The relevant Bill data should be able to be deleted and
  edited from the Blood Issue Details window.
  * Click on the Biling link on the Dashboard
  * Click on the Blood Component Issue board
  * Visibility of billing (Blood Issue Details) information is tested
  * Erasability and editability of Blood Issue Details data are tested
  * Browser   closed

  @biling36
  Scenario: TC_036 Additional payment to the invoice under the heading Balance Amount($)
  in the Blood Component Issue List (you must go to the Payments page in order to add a new payment and
  a new payment can be entered into the patient's account from the payments page).should be done.

  * Click on the Biling link on the Dashboard
  * Click on the Blood Component Issue board
  * Click the Balance Amount iconnn
  * Date and amount are entered on the Balance Amount pageee.
  * It is tested that additional payment is made to the invoiceee.
  * Browser   closed

  @biling37
  Scenario: TC_037 Relevant Bill data should be deleted under the title Balance Amount($) in the Blood Issue Billing List.
  * Click on the Biling link on the Dashboard
  * Click on the Blood Component Issue board
  * Click the delete button under the Balance Amount heading and test it for deletion.
  * It is tested that the Bild data has been deleted
  * Browser   closed

  @biling39
   Scenario: TC_039 Invoicing of the patient should be possible from the OPD/IPD Billing Through Case Id window.
  * Click on the Biling link on the Dashboard
  * Click the Search section and enter the patient Case ID and click the search button
  * The Generate Bill button is clicked on the page that opens and the Billing is tested.
  * Browser   closed

  @biling40
  Scenario: TC_040 Bill summary, Add Payment, View Payments, Generate Bill transactions (by entering the necessary
  data and using the necessary functions) must be done on the OPD/IPD Billing Through Case Id page.

  * Click on the Biling link on the Dashboard
  * Click the Search section and enter the patient Case ID and click the search button
  * The Bill Summary button is clicked and the invoice is tested.
  * Click the Add Payment button, enter the date and amount, click the save button
  * Click the View Payments button and test that the new amount has been added
  * Browser   closed

  @biling41
  Scenario: TC_041 On the OPD/IPD Billing Through Case Id page, the invoice (OPD, Pathology, Radiology, Bllod Issue,
  Blood Component Issue) information should be selected and access to the relevant page should be possible.

 * Click on the Biling link on the Dashboard
 * Click the Search section and enter the patient Case ID and click the search button
 * wait 2 seconds
 * Single Module Billing icon is clicked, it is tested to switch to OPD, Pathology, Radiology, Bllod Issue, Blood Component Issue page.
 * Browser   closed




