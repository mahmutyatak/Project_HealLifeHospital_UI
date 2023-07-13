@wip
Feature: US_055 On the doctor panel home page as a doctor,I want to have summary information about the transactions that will take
  Background:
    Given Start browser , go  to 'doctorLoginURL'
    And User fills  'doctorTugbaFidan' and 'passwordTugbaFidan' textBoxes
    And User clicks sign in  button

  Scenario: TC_001 On the home page on the Doctor panel, post messages sent to doctors under navar should be displayed.
    Then Post messages sent to doctors under the navar
    Then Browser Closed


  Scenario: TC_002 On the main page of the doctor panel, the doctor's calendar should be displayed and operations should be able to be performed on the calendar.
    Then Calendar of the doctor should be displayed on the home page on the doctor panel
    Then In the Calender section, there is a change in history when it is clicked on the forward, back, Today, Month, Week, Day button.
    Then  New event should be added when the desired date selects
    Then Browser Closed




  Scenario: TC_003 The number of registered employes in the system (Accountant, Doctor, Pharmacist, Pathologist, Radiologist, Super Admin, Receptionist, Nurse) should be displayed on the doctor panel's main page.
    Then The number of registered employees in the system "Accountant, Doctor, Pharmacist, Pathologist, Radiologist, Super Admin, Receptionist, Nurse" should be displayed on the doctor panel's main page.
    Then Browser Closed

  Scenario: TC_004 In the Doctor Panel home page, it should be referred to the Human Resources page when you click on the boards showing the number of registered work information.
    Then It should be accurate that the registered person goes to the Human Resources Page
    Then Browser Closed





