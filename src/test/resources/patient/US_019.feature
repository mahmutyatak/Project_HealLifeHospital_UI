
Feature: As a user (patient), I want to have a dashboard that belongs to me so that I can view my own information.

  Background:
    Given Start browser , go to 'userLoginURL'
@wip
  Scenario: The Login button should be visible at the top of the home page and when the Login button is clicked, it should redirect to the "user login" page.
    And  When   Verify that the page "userLoginURL" has been accessed
@wip
  Scenario: TC_02 The page should contain "User Login" and "Latest News" information.
    Given Visibility of userLogin is verified
    And   Visibility of Latest News information is verified
    When  Verify that Latest News information is accessible
@wip
  Scenario: TC_003 forgot password should redirect to the relevant page
    Given Click on the forgot password link on the page that opens
    And   Enter valid email into email textBox
    And   Click the Submit button
    And   sentToMailText text visibility is verified
    Then  Clicking on the User Login link will return to the login page again.

@wip
  Scenario Outline: TC_04 Cannot login when invalid information is entered on user login page
    Given  Enters "<username>" from examples as username
    And    Enters "<password>" from examples as password
    And    Presses the Sign In button
    And    Tests that login is not possible
    Examples:
      |username                        |password   |
      |                                |heallife123|
      |furkan.veliinal                |heallife123|
      |veli.inal.                    |heallife123|
      |furkan.veli.inal              |           |
      |                              |    h      |
      |furkan.veli.inal              |    1      |


@wip
  Scenario: It should be possible to login to the dashboard by entering the information on the User Login page (previously registered to the system).

    And User fills 'patientFurkan' and 'passwordFurkan' textBoxes
    And User clicks sign in button
