
Feature: US_061 As a doctor, I want to access the data of patients who have undergone Pathology tests
  and view their test results from the Pathology page on the Dashboard Sidebar.

  Background:

    Given Start browser , go to "doctorLoginURL"
    Then User fill "doctorAhmet" and "passwordAhmet" textBoxes
    And User click sign in button
    And User verify that when the Pathology link in the Dashboard Sidebar clicked, it goes to the relevant page

  Scenario: TC_001 When the Pathology link in the Dashboard Sidebar is clicked, it should direct the user to the relevant page.

    And Browser   closed

  Scenario: TC_002 On the Pathology page, a Pathology Bill List (with the headers "Bill No, Case ID / Patient ID, Reporting Date, Patient Name, Reference Doctor, Amount ($),
  Paid Amount ($), Balance Amount ($)") should be displayed.

    Then On the Pathology page, a Pathology Bill List with the headers "Bill No, Case ID / Patient ID, Reporting Date, Patient Name, Reference Doctor, Amount ($),Paid Amount ($), Balance Amount ($)" should be displayed.

  Scenario: TC_003 The content in the Pathology Bill List should be sortable based on the column headers.
    Then User verify that The content in the Pathology Bill List should be sortable based on the column headers.

  Scenario: TC_004 There should be a search box in the Pathology Bill List to easily search through the content.
    Then User verify that There should be a search box in the Pathology Bill List to easily search through the content.

  Scenario: TC_005 The number of items to be displayed on a single page (either 100 or All) in the Pathology Bill List should be selectable.
    Then User verify that The number of items on a single page in the Pathology Bill List should be selectable.

  Scenario: TC_006 When the View Reports icon under the Balance Amount($) header in the Pathology Bill List is clicked,
  it should direct the user to the page showing the details of the relevant content.
    Then User verify that When the View Reports icon under the Balance Amount header in the Pathology Bill List is clicked, the page showing the details of the relevant content.

  Scenario: TC_007  When the Add / Edit Collection Person icon in the Bill Details window is clicked, the window that opens should allow for the editing of the details of who the sample will be collected from,
  when it will be collected, and which laboratory it will be collected at.
    Then User verify that it should be editied of details of sample collected from where,when colected and which laboratory collected at.

  Scenario: TC_008 There should be a link from the Pathology page to the Pathology Test page.
    Then User verify that there should be a link from the Pathology page to the Pathology Test page.

  Scenario: TC_009 On the Pathology Test page, a Pathology Test List
  (with the headers Test Name, Short Name, Test Type, Category, Sub Category, Method, Report Days, Tax($), Charge($), Amount($)) should be displayed.
    Then user verify that there should be a Pathology Test List with the headers "Test Name, Short Name, Test Type, Category, Sub Category, Method, Report Days, Tax($), Charge($), Amount($)"

  Scenario: TC_010 The content in the Pathology Test List should be sortable based on the column headers.
    Then user verify that the content in the Pathology Test List should be sortable based on the column headers.

  Scenario: TC_011 There should be a search box in the Pathology Test List to easily search through the content.
    Then user verify that there should be a search box in the Pathology Test List to easily search through the content.

   Scenario: TC_012 The number of items to be displayed on a single page (either 100 or All) in the Pathology Test List should be selectable.
     Then User verify that the number of items to be displayed on a single page (either 100 or All) in the Pathology Test List should be selectable.

   Scenario: TC_013  When the Show icon under the Amount($) header in the Pathology Test List is clicked,
   it should direct the user to the page showing the details of the relevant content.
     Then User verify that when the Show icon under the Amount header in the Pathology Test List is clicked, to the pageshowing the details of the relevant content.
     
