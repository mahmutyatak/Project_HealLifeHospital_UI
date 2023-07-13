Feature: As an administrator (admin), I want a page to be able to perform operations and view details about company employees.
  Background:
  @wed
  Scenario: TC_001 User must be verify the Human Recource page

    Given Start browser  go to 'adminLoginURL'
    And User fill 'adminFerit' and 'passwordFerit' textBoxes
    And User clicks sign in  button
    Then User clicks on the Human Recource Link and verifies the relevant Page
    Then Browser Closed


  Scenario: TC_002 User must be verified registered in the system should be listed with Card

    Given Start browser  go to 'adminLoginURL'
    And User fill 'adminFerit' and 'passwordFerit' textBoxes
    And User clicks sign in  button
    And User clicks on the Human Recource Link
    Then User verifies the Employee as Card
    Then Browser Closed


  Scenario: TC_003 User must be verified registered in the system should be listed with List view.

    Given Start browser  go to 'adminLoginURL'
    And User fill 'adminFerit' and 'passwordFerit' textBoxes
    And User clicks sign in  button
    And User clicks on the Human Resource Link
    Then User verifies the Employee as List
    Then Browser Closed


  Scenario: TC_004 A board for each user (with profile picture, personnel name and title)<<<<<<<<<<<<>>>>>>>
    Given Start browser  go to 'adminLoginURL'
    And User fill 'adminFerit' and 'passwordFerit' textBoxes
    And User clicks sign in  button
    And User clicks on the Human Resource Link
    And User verifies the Employee as Card
    Then User displayes the Employee as Card view
    Then Browser Closed


  Scenario: TC_005 User must be employee edit and show as Card.

    Given Start browser  go to 'adminLoginURL'
    And User fill 'adminFerit' and 'passwordFerit' textBoxes
    And User clicks sign in  button
    And User clicks on the Human Resource Link
    Then User must be employee show and edit  as Card
    Then Browser Closed


    Scenario: TC_006 The personnel (with the titles Staff ID, Name, Role, Department, Designation,
    Mobile Number, Action) should be displayed in the list view.


      Given Start browser  go to 'adminLoginURL'
      And User fill 'adminFerit' and 'passwordFerit' textBoxes
      And User clicks sign in  button
      And User clicks on the Human Resource Link
      Then User verifies the Employee as List
      Then User must be verify the personel staff ID in the list
      Then User must be verify the personel Name in the list
      Then User must be verify the personel Role in the list
      Then User must be verify the personel Department in the list
      Then User must be verify the personel Designation in the list
      Then User must be verify the personel Mobile number in the list
      Then User must be verify the personel action in the list
      Then Browser Closed


  Scenario: TC_007 User must be employee edit and show as Card.

    Given Start browser  go to 'adminLoginURL'
    And User fill 'adminFerit' and 'passwordFerit' textBoxes
    And User clicks sign in  button
    And User clicks on the Human Resource Link
    Then User verifies the Employee in action show as List
    Then User must be employee in action edit  as Card
    And Browser Closed


    Scenario: TC_008 User must be a searchBox for easy searching in the list view.

      Given Start browser  go to 'adminLoginURL'
      And User fill 'adminFerit' and 'passwordFerit' textBoxes
      And User clicks sign in  button
      And User clicks on the Human Resource Link
      And User verifies the Employee as List
      And User verifies the searchbox is visible
      And Browser Closed


  Scenario: TC_009 User must be a searchBox for easy searching in the list view.

    Given Start browser  go to 'adminLoginURL'
    And User fill 'adminFerit' and 'passwordFerit' textBoxes
    And User clicks sign in  button
    And User clicks on the Human Resource Link
    And User verifies the Employee as List
    And User verifies the  role searchbox is visible
    And Browser Closed


  Scenario: TC_010 User must be a searchBox for easy searching in the list view.

    Given Start browser  go to 'adminLoginURL'
    And User fill 'adminFerit' and 'passwordFerit' textBoxes
    And User clicks sign in  button
    And User clicks on the Human Resource Link
    And User verifies the Employee as List
    And User verifies the add staff item
    And Browser Closed



    Scenario: TC_011 There should be a redirect from the Staff Directory page to the Disabled Staff page.

      Given Start browser  go to 'adminLoginURL'
      And User fill 'adminFerit' and 'passwordFerit' textBoxes
      And User clicks sign in  button
      And User clicks on the Human Resource Link
      And User verifies the Employee as List
      And User verifies the add staff item
      And User clicks on the disabled staff
      And Browser Closed



  Scenario: TC_012 There should be a redirect from the Staff Directory page to the Disabled Staff page.

    Given Start browser  go to 'adminLoginURL'
    And User fill 'adminFerit' and 'passwordFerit' textBoxes
    And User clicks sign in  button
    And User clicks on the Human Resource Link
    And User verifies the Employee as List
    And User verifies the add staff item
    And User clicks on the staff attandance
    And Browser Closed


  Scenario: TC_013 There should be a redirect from the Staff Directory page to the  Staff attandance search page.

    Given Start browser  go to 'adminLoginURL'
    And User fill 'adminFerit' and 'passwordFerit' textBoxes
    And User clicks sign in  button
    And User clicks on the Human Resource Link
    And User verifies the Employee as List
    And User verifies the add staff item
    And User clicks on the staff attandance
    And User verifies the attandance dropdown
    And Browser Closed


  Scenario: TC_014 There must be a redirect from the Staff Directory page to the Payroll page

    Given Start browser  go to 'adminLoginURL'
    And User fill 'adminFerit' and 'passwordFerit' textBoxes
    And User clicks sign in  button
    And User clicks on the Human Resource Link
    And User verifies the Employee as List
    And User verifies the add staff item
    And User clicks on the staff attandance
    And User verifies the payroll page
    And Browser Closed



  Scenario: TC_015 It should be possible to search (filter) according to the Role Month and Year information on the Payroll page.

    Given Start browser  go to 'adminLoginURL'
    And User fill 'adminFerit' and 'passwordFerit' textBoxes
    And User clicks sign in  button
    And User clicks on the Human Resource Link
    And User verifies the Employee as List
    And User verifies the add staff item
    And User clicks on the payroll page
    And user verifies Role, month and year information
    And Browser Closed


  Scenario: TC_016 There should be a redirect from the Staff Directory page to the My Leaves page
    Given Start browser  go to 'adminLoginURL'
    And User fill 'adminFerit' and 'passwordFerit' textBoxes
    And User clicks sign in  button
    And User clicks on the Human Resource Link
    And User verifies the Employee as List
    And User verifies the add staff item
    And User clicks on the payroll page
    And user verifies my leaves
    And Browser Closed


  Scenario: TC_016 There should be a redirect from the Staff Directory page to the My Leaves page
    Given Start browser  go to 'adminLoginURL'
    And User fill 'adminFerit' and 'passwordFerit' textBoxes
    And User clicks sign in  button
    And User clicks on the Human Resource Link
    And User verifies the Employee as List
    And user clicks my leaves
    And Browser Closed


  Scenario: TC_017 My Leaves List (Staff, Leave Type, Leave Date, Days, Apply Date, Status , Action titles) should be displayed.

    Given Start browser  go to 'adminLoginURL'
    And User fill 'adminFerit' and 'passwordFerit' textBoxes
    And User clicks sign in  button
    And User clicks on the Human Resource Link
    And User verifies the Employee as List
    And User verifies the add staff item
    And User verifies leaves list
    And User verifies leaves LeaveTpye
    And User verifies leaves days
    And User verifies leaves date
    And User verifies leaves apply date
    And Browser Closed



