Feature:US-037 As an administrator (admin), I want to have a dashboard sidebar with menus in the Admin panel.

  Background:
  @wed
  Scenario: TC_001 User must go to dashboardURL

    Given Start browser  go to 'adminLoginURL'
    And User fill 'adminFerit' and 'passwordFerit' textBoxes
    And User click sign in button
    Given User must be verify go to dashboard
    And Browser closed
  @wed
  Scenario: TC_002 User must be dashboard site refreshed

    Given Start browser , go  to 'adminLoginURL'
    And User fill 'adminFerit' and 'passwordFerit' textBoxes
    And User click sign in button
    Given User must be verify go to dashboard
    And dashboard must be refreshed
    Given User must be verify go to dashboard
    And Browser closed