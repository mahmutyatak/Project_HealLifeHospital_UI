Feature: US_050 As an administrator I would like to have a page to manage third party relations

  Background:
    Given Start browser  go to 'adminLoginURL'
    And User fill 'adminHasan' and 'passwordHasan' textBoxes
    And User click sign in button
    Then wait 2 seconds

    @tpa1
    Scenario: TC_001 When you click on the TPA Management link on the Dashboard sidebar, it should redirect to the relevant page.
    * Click on the TPA Management link on the Dashboard
    * It is tested that it is directed to the relevant page
    * Browser   closed

   @tpa2
    Scenario: TC_002 The TPA Management List (Name, Code,Phone, Address, Contact Person Name, Contact Person Phone headings)
    should be displayed.
    * Click on the TPA Management link on the Dashboard
    * TPA Management List "Name, Code,Phone, Address, Contact Person Name, Contact Person Phone" headings is tested to be displayed
    * Browser   closed

  @tpa3
  Scenario: TC_003 In order to search in the TPA Management List, there must be a searchBox.
  * Click on the TPA Management link on the Dashboard
  * TestTextBox is tested
  * Browser   closed

  @tpa4
  Scenario: TC_004 The contents to be displayed in the TPA Management List (as 100 and All) should be able to be changed.
  * Click on the TPA Management link on the Dashboard
  * Number of patients button is clicked
  * wait 2 seconds
  * It is tested that the number of patients can be selected
  * Browser   closed

  @tpa5
 Scenario: TC_005 It should be possible to sort through the titles in the TPA Management List.
  * Click on the TPA Management link on the Dashboard
  * wait 3 seconds
  * It is tested that the titles in the TPA Management List are listed in the list.
  * Browser   closed

  @tpa6
 Scenario: TC_006 Organization, Delete and Edit can be done under the title of Contact Person Phone of TPA Management List contents.
  * Click on the TPA Management link on the Dashboard
  * Click the Delete Edit, Organization, icon one after the other.
  * It is tested that the Delete Edit, Oranization operations are done
  * Browser   closed

  @tpa7
  Scenario: TC_007 There must be access to the Add TPA window from the TPA Management List page.
  *  Click on the TPA Management link on the Dashboard
  *  Tests access to the Add TPA window
  * Browser   closed

  @tpa8
  Scenario: TC_008 In the Add TPA window, there should be Name, Code, Contact No, Address ,
  Contact Person Name, Contact Person Phone Boxes.
  * Click on the TPA Management link on the Dashboard
  * Name, Code, Contact No, Address , Contact Person Name, Contact Person Phone Boxes visibility is tested
  * Browser   closed

  @tpa9
  Scenario: TC_009 The new record saved by entering valid data should be displayed in the TPA Management List.
 * Click on the TPA Management link on the Dashboard
 * A new record is made and its visibility is tested in the new record list.
 * Browser   closed