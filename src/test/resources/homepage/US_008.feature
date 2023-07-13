Feature:US_008 As a user, in order to use the in-page access more effectively, I would like to have links that lead to the most visited pages in the bottom bar of the home page.

  Scenario: TC_001 Verify that Home, Academics, Gallery, About, Event, Contact US page titles are visible in the home page bottom bar.
    Given Start browser, go to 'homepageURL'
    And The user scrolls down to the bottom of the page.
    And User verified that Home,Academics,Gallery,About,Event,Contact US titles in bottom bar are visible
    Then Browser closed

    Scenario: TC_002 When the Home, Academics, Gallery, About, Event, Contact US page titles are clicked on the home page,
    it should be verified that it redirects to the relevant pages.

      Given Start browser, go to 'homepageURL'
      And The user scrolls down to the bottom of the page.
      And It is verified that the user's Home,Academics,Gallery,About,Event,Contact US links are directed to the correct addresses
      Then Browser closed