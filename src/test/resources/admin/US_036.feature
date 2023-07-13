@navbar
Feature: US_036 As an administrator (admin), I want to have a navbar in the admin panel to manage the admin panel more easily.

     Background:
    Given Start browser  go to 'adminLoginURL'
    And User fill 'adminHasan' and 'passwordHasan' textBoxes
    And User click sign in button
    Then wait 2 seconds


  Scenario: TC_001 There should be a site logo in the navbar of the admin panel and when clicked,
  the admin panel should refresh its home page.

    When Visibility of site log is tested in navbar
    And  Site logo clicked
    And  It is tested that the admin panel page is renewed
    Then Browser   closed



  Scenario:TC_002 There should be a menu icon in the navbar and when you click it,
  the dashboard menu should open and close.

    When The visibility of the menu icon in the navbar is tested
    And  Menu icon is clicked
    Then Heallife image clicked
    And  It is tested whether the Dashboard menu is opened and closed.
    Then Browser   closed


  Scenario: TC_003 There should be the text "Heal Life Hospital & Research Center" in the navbar.

    When Visibility of text Heal Life Hospital & Research Center is tested in Navbar
    And Browser Closed


  Scenario: TC_004 In order to easily access patient information within the panel,
  there should be a "Search By Patient Name" search box in the navbar.

    Then The visibility of the Search By Patient Name search box is tested
    And  Browser Closed
    Then wait 2 seconds

  Scenario: TC_005 There must be an icon in the navbar to change the language of the panel.
    * Click the flag icon in the navbar
    * Turkish flag is clicked
    * Testing that the page language has changed
    * Browser Closed


  Scenario:TC_006 There should be a notification icon link (incoming to the administrator) in the Navbar.
    * Click the notification icon in the navbar
    * Visibility of the Notifications header is tested
    * Browser Closed


  Scenario: TC007 When there is an unread notification, it should be indicated with a number on this icon.
    * Click the notification icon in the navbar
    * Visibility of unread notification count is tested
    * Browser Closed


  Scenario: TC008:When you click on the notification icon on the Navbar, there should be a Notifications List
  listed according to their headings (Type, Subject, Date) on the page that opens.
    * Click the notification icon in the navbar
    * Visibility of (Type, Subject, Date) titles are tested
    * Browser Closed


  Scenario: TC009 When you click on the notification message, the detail should be displayed.
    * Click the notification icon in the navbar
    * Click the first Type logo in the notification
    * The visibility of the message detail is tested
    * Browser Closed


  Scenario: TC_010 A distinction should be made between read and unread notifications.
    * Click the notification icon in the navbar
    * Click the first Type logo in the notification
    * Click the number icon in the notification in the navbar
    * wait 3 seconds
    * It is tested that the message has been read
    * Browser Closed


  Scenario:TC_011 A button that can delete all notifications at once
  should be.
    * Click the notification icon in the navbar
    * Messages are tested to be deleted
    * Browser Closed


  Scenario:TC_012 There should be a message icon link (incoming to the admin) in the Navbar.
    * The visibility of the message icon is tested
    * Browser Closed


  Scenario: TC_013 When there is an unread message, it should be indicated with a number on this icon.
    * Visibility of unread message count is tested
    * Browser Closed


  Scenario: TC_014 When you click on the message icon link in Navbar,
            there should be a Chat System window on the page that opens.
    * Click the message icon in the navbar
    * The Chat System window is tested to open
    * Browser Closed

  Scenario:TC_015 Users who have sent messages before should be displayed.
   * Click the message icon in the navbar
   * Visibility is tested for those who have sent messages before
    * Browser Closed

  Scenario:TC_016 A new contact must be added.
  * Click the message icon in the navbar
  * Click the Chat System icon
  * Click on Add Contact search section
  * In the Add Contact section, the desired name is written
  * Click on the desired name
  * Click the Add icon
  * It is confirmed that a contact has been added to the Chat System.
  * Browser Closed


    Scenario: TC_17 There should be a chat section where the message
              can be written and sent and the incoming message can be read.

  * Click the message icon in the navbar
  * The accuracy of the section where the messages are displayed is tested
  * Write Your Message visibility is tested
  * Browser Closed


  Scenario: TC_018 There should be a calendar icon link in the Navbar.
  * Visibility of Calender icon in Navbar is tested
  * Browser Closed


  Scenario: TC_019 When you click the calendar link in the navbar,
            a calendar and a To Do List should appear on the page that opens.

  * Click the Calender icon in the navbar
  * The visibility of the To Do List is tested on the page that opens.
  * On the page that opens, the visibility of the calendar is tested
  * Browser Closed


  Scenario: TC_020 It should be possible to add events colored with different colors to
            the desired day (Public, Protected, Private, All Admin) in the calendar.
  * Click the Calender icon in the navbar
  * Click on any day in the calendar on the page that opens.
  * From the Add New Event page, click the Event Title section and enter the title
  * Click on the desired color from the Event Color section.
  * Click on the desired type from the Event Type section.
  * Save button is clicked
  * It is tested that the desired information is recorded.
  * Browser Closed


  Scenario: TC_021 The added event can be filtered on the calendar (by selecting the day, week and month).
  * Click the Calender icon in the navbar
  * On the page that opens, the week icon is clicked.
  * On the page that opens, it is verified that the event is filtered.
  * Browser Closed


  Scenario: TC_022 It should be able to add a new task to To Do LIst and update and delete the added tasks.
  * Click the CalenderTask icon in the navbar
  * Click the View All icon
  * On the page that opens, the Add To Do List icon is clicked.
  * Enter the relevant title from the Add Task section to the title section.
  * Click on the Date section
  * In the Date section, the relevant date is clicked.
  * Save button is clickedd
  * Title icon is clicked from the window that opens.
  * wait 1 seconds
  * Update icon is clicked
  * The title is changed from the Edit Task page
  * It is tested that the desired information is recorded.
  * Browser Closed


  Scenario: TC_023 To see the assigned tasks on the navbar, there must be a task icon link
  * The visibility of the task icon in the navbar is tested
  * Browser Closed


  Scenario: TC_024 In Navbar, there should be a Bed Status link that shows the bed status and inpatients.
  * Visibility of Bed Status link in navbar is tested
  * Browser Closed


  Scenario: TC_025 When the Bed Status link in the Navbar is clicked,the hospitalized patients
             (with the floor and room information) should be displayed on the page that opens.
  * Click the Bed Status link in the navbar
  * The visibility of the Bed Status floor and room information in the navbar is tested
  * Browser Closed


  Scenario: TC_026 There should be a profile icon in the navbar where profile
            and password information can be seen and logout can be made.
  * Click the profile link in the navbar
  * Visibility of profile,password,loqout icons is tested
  * Loqout icon is clicked
  * Loqout is tested
  * Browser Closed


  Scenario: TC_027 When the Profile icon is clicked on the profile picture in the Navbar,
            the details of the manager (Profile, Payroll, Leaves, Staff Attendance, Documents, Timeline,
            Address, Bank Account Details, Social Media Link) should be displayed.
  * Click the profile link in the navbar
  * wait 1 seconds
  * My profile link is clicked
  * wait 1 seconds
  * On the page that opens, the visibility of the profile titles is tested.
  * The visibility of Address, Bank Account Details, Social Media Link information on the profile page is tested.
  * Browser Closed


  Scenario: TC_028 Change password and profile edit operations of the administrator profile should be possible.
  * Click the profile link in the navbar
  * Click the passwordl button on the profile link
  * wait 2 seconds
  * Current Password is entered
  * New Password is entered
  * Confirm Password is entered
  * Click the Change Password button
  * wait 2 seconds
  * It is verified that the password information is updated
  * wait 2 seconds
  * Browser Closed













