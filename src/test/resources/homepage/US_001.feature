
Feature: US_001 As a user, I must be able to access the website in order to use the site.
Background:
  Given Start browser, go to "homepageURL"

  Scenario: TC_001 The website must be accessible from the browser by the user (the given URL)

    And It is verified that the URL of the page the user went to contains 'heallifehospital'


  Scenario: TC_002  The home page must be visible when accessing the website

    And Verify that the Site logo is visible at the URL to go



