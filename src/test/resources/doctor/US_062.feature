Feature: As a doctor, I want to access the data of patients who have undergone Radiology tests and view their test results from the Radiology page on the Dashboard Sidebar.
  Background:
    Given Start browser , go  to 'doctorLoginURL'
    And User fills  'doctorTugbaFidan' and 'passwordTugbaFidan' textBoxes
    And User clicks sign in  button

  Scenario:TC_001 When the Radiology link in the Dashboard Sidebar is clicked, it should redirect to the relevant page.
    Then When the Radiology link is clicked on the relevant page, it is correct.
    Then Browser Closed

  Scenario: TC_002 On the Radiology page, the Radiology Bill List (Bill No, Case ID / Patient ID, Reporting Date, Patient Name, Reference Doctor, Note, Amount($), Paid Amount($), Balance Amount($)) should be displayed.
    Then Click on the radiology link
    Then Radiology page is displayed on Radiology Bill List"Bill No, Case ID / Patien ID, Reporting Date, Patient Name, Reference Doctor, Note, Amount ($), Paid Amount ($), Balance Amount ($)" titles
    And Browser Closed

  Scenario: TC_003 The contents in the Radiology Bill List can be sorted based on the column headers.
    Then Click on the radiology link
    Then In the Radiology Bill List, the list contents are ordered by column headings
    And Browser Closed

  Scenario: TC_004 A searchBox should be available on the Radiology Bill List to easily search through the contents.
    Then Click on the radiology link
    Then The search box is verified
    Then When the information entry to SearchBox is made, he confirmed his search
    And Browser Closed
  Scenario: TC_005 The number of contents to be displayed on a single page in the Radiology Bill List can be selected (100 or All).
    Then Click on the radiology link
    Then The number of items displayed per page must be selectable
    And Browser Closed

  Scenario: TC_006 When the View Reports icon under the Balance Amount($) header in the Radiology Bill List is clicked, it should redirect to the page that displays the details of the relevant content.
    Then Click on the radiology link
    Then Click the View Reports icon under the "Balance Amount($)"heading.
    Then It is verified that he went to the relevant page
    And Browser Closed

  Scenario: TC_007 When the Add / Edit Collection Person icon on the Bill Details window is clicked, the details of the person from whom the sample will be taken, when it will be taken, and where it will be taken for the relevant test can be edited.
    Then When the "Add /Edit" Collection person is clicked to the icon, the relevant test for the relevant test is made for the recording of the track.
    And Browser Closed


  Scenario: TC_008 There should be a redirect from the Radiology page to the Radiology Test page.
    Then Radiology is clicked
    Then Click on the Radiolgy Test link and confirmed that the relevant page is going
    And Browser Closed

  Scenario: TC_009 On the Radiology Test page, the Radiology Test List (Test Name, Short Name, Test Type, Category, Sub Category, Method, Report Days, Tax($), Charge($), Amount($)) should be displayed.
    Then Radiology is clicked
    Then Click on the Radiolgy Test link and confirmed that the relevant page is going
    Then Radiology test page is displayed on Radiology Test List "Test name, Short Name, Test Type, Category, Sub category, Method, Report Days, Tax ($), Charge ($), Amount ($)" headings
    And Browser Closed

  Scenario: TC_010 The contents in the Radiology Test List can be sorted based on the column headers.
    Then Radiology is clicked
    Then Click on the Radiolgy Test link and confirmed that the relevant page is going
    Then In the Radiology Test List, the list contents are ordered by the column headings.

  Scenario: TC_011 A searchBox should be available on the Radiology Test List to easily search through the contents.
    Then Radiology is clicked
    Then Click on the Radiolgy Test link and confirmed that the relevant page is going
    Then Radiology test is found among the content in LIST to easily search for Searchbox
    And Browser Closed
  Scenario: TC_012 The number of contents to be displayed on a single page in the Radiology Test List can be selected (100 or All).
    Then Radiology is clicked
    Then Click on the Radiolgy Test link and confirmed that the relevant page is going
    Then Radiology The number of items displayed per test page should be selected
    And Browser Closed

  Scenario: TC_013 When the Show icon under the Amount($) header in the Radiology Test List is clicked, it should redirect to the page that displays the details of the relevant content.
    Then Radiology is clicked
    Then Click on the Radiolgy Test link and confirmed that the relevant page is going
    Then Radiology directs the show icon under the "amount ($)" title in the test list.






