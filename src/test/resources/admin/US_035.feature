@wip
Feature: As a user (administor), I want to have a dashboard that belongs to me so that I can view my own information.

  Background:
    Given Start browser  go to 'adminLoginURL'

  Scenario: On the login page, on the right, the Admin Login window should have the Latest New information on the left.
    Given Visibility of adminLogin is verified
    And   Visibility of adminLogin page Latest News information is verified
    When  Verify that  adminLogin page Latest News information is accessible

  Scenario: TC_003 Admin login forgot password should redirect to the relevant page
    Given Admin Login Click on the forgot password link on the page that opens
    And   Admin Login Enter valid email into email textBox
    And   Admin Login  Click the Submit button
    And   Admin Login sentToMailText text visibility is verified
    Then  Clicking on the Admin Login link will return to the login page again.

  Scenario Outline: TC_04 Cannot login when invalid information is entered on admin login page
    Given  Enters "<username>" from examples as username for admin panel
    And    Enters "<password>" from examples as password for admin panel
    And    Presses the Sign In button for admin panel
    And    Tests that login is not possible for admin panel
    Examples:
    |username                                     | password |
    |furkan.veli.inal.adminheallifehospital.com  | heallife123|
    | furkanveliinaadmin@heallifehospital.com    |heallife123 |
    |furkan.veli.inal.admin@                     |heallife123 |
    |furkan.veli.inal.admin@heallifehospital.com | 123        |
    |furkan.veli.inal.admin@heallifehospital.com |   av       |
    |furkan.veli.inal.admin@heallifehospital.com |aaaaaaaaaa  |

  Scenario: It should be possible to login to the dashboard by entering the information on the User Login page (previously registered to the system).
    And User fill 'adminFurkan' and 'passwordFurkan' textBoxes
    And User click sign in button
    And  Browser closed
