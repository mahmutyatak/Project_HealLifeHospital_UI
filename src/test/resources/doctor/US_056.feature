Feature: US_056 As a doctor, I want quick access to some of the panel's internal operations (language, notification, chat, calendar, task, and bed status) in the navbar of the doctor panel.
  Background:
    Given Start browser , go  to 'doctorLoginURL'
    And User fills  'doctorTugbaFidan' and 'passwordTugbaFidan' textBoxes
    And User clicks sign in  button
  Scenario: TC_001 The doctor panel should have a navbar on the homepage.
    Then The doctor's panel is found on the home page.
    Then Browser Closed

  Scenario: TC_002 The navbar should display the text "Heal Life Hospital & Research Center.
    Then "Heal Life Hospital & Research Center" on Navbar is displayed.
    Then Browser Closed

  Scenario: TC_003 The navbar should have a searchTextBox that can search for patients by name within the panel.
    Then  Searchbox is found in the Navbar panel
    Then The information entered into Searchbox is true.
    And Browser Closed

  Scenario: TC_004 The navbar should have a language icon that can be used to change the language of the panel.
    Then Navbar is also found in the language icon.
    Then When the language icon is ticked, it is true that English and Turkish options are seen.
    Then the desired icon is ticked, the change of language is correct
    Then Browser Closed

  Scenario: TC_005 The navbar should have a notification icon that collects notifications for the doctor, and when clicked, should open the page with the notifications.
    Then It is confirmed that it is found in the navbar notification icon
    Then When the notification icon is clicked, he goes to the relevant page.
    Then Notification details are confirmed by the moment
    Then Browser Closed

  Scenario: TC_006  The navbar should have a chat icon that can be clicked to open the doctor's chat page.
    Then It is true that a chat icon is found in the navbar
    Then Browser Closed

  Scenario: TC_007 On the chat page that opens when the chat icon is clicked, a message can be sent to any employee, and previous messages can be viewed.
    Then When the chat iconuna is clogged, he goes to the relevant page.
    Then Add Contact icon is seen and the new Contact is added
    Then Old messages are displayed and click on it
    Then Incoming messages are answered
    And Browser Closed


  Scenario: TC_008 The navbar should have a Bed Status icon linked to a page that shows the hospital's bed capacity and status.
     Then There is an icon showing the bed condition in the navbar
     Then It is confirmed that the page showing the bed status is opened
      And Browser Closed

  Scenario: TC_009 The navbar should have a Calendar icon that opens the doctor's calendar page.
    Then It is found that there is a Calendar icon in Navbar that opens the Calendar page of the Calendar page.
    And Browser Closed

  Scenario: TC_010 On the calendar page, the doctor can create an event on any desired date, select the event status and color.
    Then Navbarda Calendar icon is clicked
    Then A required status and color is added to a desired date.
    And Browser Closed

  Scenario: TC_011 On the calendar page, events can be viewed daily, weekly, and monthly.
    Then Navbarda Calendar icon is clicked
    Then Events are displayed on Calendar page as days
    Then On Calendar page, the events are displayed as weeks.
    Then On the Calendar page, the events are displayed per month.
    And Browser Closed

 Scenario: TC_012 The calendar page should have a to-do list in the sidebar.
   Then Navbarda Calendar icon is clicked
   Then It is confirmed that there is a "to do list" on the side bar on the Calendar page
   And Browser Closed

 Scenario: TC_013 On the calendar page, tasks can be assigned, deleted, and marked as completed on the to-do list.
   Then Navbarda Calendar icon is clicked
   Then Click the "To Do List" button on the side bar on the Calendar page and the new list is added
   Then Added new task is made as a sign
   Then Added task can be deleted
   And Browser Closed




 Scenario: TC_0014  When the Task icon on the navbar is clicked, it should display the tasks assigned to the doctor on the calendar page.
   Then It is confirmed that the task icon is on the navar
   Then Task icon is clicked
   Then Click on the ViewAll link and confirms that the tasks assigned to the doctor are seen
   And Browser Closed

 Scenario:  TC_015 The navbar should have a profile icon where the doctor can view their profile information and perform password-related operations.
   Then The profile icon on the navar is confirmed and clicked
   Then In the opened menu, "Profile" and "Password" links are confirmed.
   Then When clicking on the Profile link, it is confirmed that it goes to the relevant page
   Then When clicking on the Password link, it is confirmed that he goes to the relevant page
   And Browser Closed

 Scenario: TC_016
   Then Click on profile icon
   Then Click the profile link
   Then It is confirmed that detailed information is seen on the profile page.
   Then It is confirmed that detailed information is seen on the Leavs page
   Then It is confirmed that detailed information is seen on the Documents page.
   Then It is confirmed that detailed information is seen on the Timeline page.
   And Browser Closed

 Scenario: TC_017 On the change password page that opens when the change password link is clicked, the password can be changed.
   Then Click on profile icon
   Then Password on profile icon
   Then Password change operations are performed
   And Browser Closed



  Scenario: TC_O18 When the logout link is clicked on the profile icon, the doctor should be logged out of the doctor panel.
   Then Click on profile icon
   Then The logout link is clicked and it is verified that the doctor has logged out of her page.
   And Browser Closed













