Feature: US_007 As a user, I would like to have social media links on the main page in order to easily access the hospital's social media accounts.

  Scenario: TC_001 It should be verified that the social media link icons are visible in the home page bottom bar.
    Given Start browser, go to 'homepageURL'
    And The user scrolls down to the bottom of the page.
    And It must be true that the icons of the hospital's social media pages are visible
    Then Browser closed

    Scenario: TC_002 It should be verified that social media icons lead to relevant social media accounts
      Given Start browser, go to 'homepageURL'
      And The user scrolls down to the bottom of the page.
      And The user clicks on the facebook icon, confirms that the redirected page is the correct page
      And The user clicks on the twitter icon, confirms that the redirected page is the correct page
      And The user clicks on the youtube icon, confirms that the redirected page is the correct page
      And The user clicks on the google plus icon, confirms that the redirected page is the correct page
      And The user clicks on the Linkedin icon, confirms that the redirected page is the correct page
      And The user clicks on the instagram icon, confirms that the redirected page is the correct page
      And The user clicks on the printeres icon, confirms that the redirected page is the correct page
      Then Browser quit

