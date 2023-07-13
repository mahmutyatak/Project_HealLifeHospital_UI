Feature: As a user, I would like there to be an 'About Us' menu to access information about the hospital.
  Background:
    Given Start browser, go to 'homepageURL'

  Scenario: TC_001  There should be a redirect from the main page to About Us pages.
    And User verifies that the About Us dropDown is visible in the upper abdomen of the homepage
    And It is verified that the link links appear when you mouse over About Us

  Scenario:TC_002 Some Words About Us on the About Hospital page,There should be "Our Mission" titles and "OPENIN HOURS" information.
    And User verified that doctors are visible under Our Doctors section
    And Confirmed that About Hospital linkedin under About us redirected to the correct page
    And Verifies that the text Some words About US is visible on the page navigated to
    And Verifies that the text Some words Our Mission is visible on the page that is navigated to
    And Verifies that the Opening Hours text is visible on the entered page


  Scenario: TC_003 Doctors under the title Our Specialist on the About Hospital page (Heidi Prather,Alexander M.simotas,Jesse N.Charnoff,George Cyril) should be displayed with their names and titles.
    And User verified that doctors are visible under Our Doctors section
    And Confirmed that About Hospital linkedin under About us redirected to the correct page
    And The user scrolls down to the bottom of the page.
    And Verify that our specialist is visible

  Scenario: TC_004 Units and doctors working in those units (with their names, pictures and titles) should be displayed on the Meet Our Doctor page.
    And The user clicks the Meet Our Doctors link from the About Us dropdown in the homepage top bar
    And The user confirms that the information (name, picture, title) of the units and the doctors working in those units are visible on the Meet Our Doctors page.

  Scenario: TC_005  On the FAQ's page, there should be two windows named "What Our Clients Say" and "What Our Doctor Say".
    And The user clicks the FAQ's link from the About Us dropdown in the homepage top bar
    And Verifies that the What Our Clients Say and What Our Doctor Say headers are visible
    And Clicking on any question title displayed the answer

  Scenario: TC_006 On the Departments page, the departments in our hospital (with the title image and small description text) should be displayed.
    And The user clicks the Departments link from the About Us dropdown in the homepage top bar
    And The user confirms that the information about the hospital departments is visible on the page.

  Scenario: TC_007  On the Testimonials page, people who have been treated in our hospital (Norman,Jessica,nyisha,Robert,Ganesh,James) comments (with pictures) should be displayed.
    And The user clicks the Testimonials link from the About Us dropdown in the homepage top bar
    And The patient comments about the hospital that have been treated are displayed.