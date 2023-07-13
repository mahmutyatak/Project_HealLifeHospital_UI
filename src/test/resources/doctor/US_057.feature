Feature: US_057  As a doctor, I want a dashboard sidebar where the menus (Billing, Appointment, OPD, IPD, Pathology, Radiology, Blood Bank, Ambulance, Birth & Death Record, Human Resource, TPA Management, Messaging, Live Consultation, and Setup) are gathered.

  Background:
    Given Start browser , go  to 'doctorLoginURL'
    And User fills  'doctorTugbaFidan' and 'passwordTugbaFidan' textBoxes
    And User clicks sign in  button

  Scenario: TC_001 The doctor panel should have a dashboard sidebar on the left.
    Given It is confirmed that a Dashboard Sidebar was found on the left side of the doctor panel.
    Then Browser Closed


  Scenario: TC_002 The dashboard sidebar should have page links for "Billing, Appointment, OPD, IPD, Pathology, Radiology, BloodBank, Ambulance, Human Resource, TPA Management, Messaging, Live Consultation, Setup".
    Given Dashboard Sidebar Billing, Appointment, OPD, IPD, Pathology, Radiology, Bloodbank, Ambulance, Humanresource, TPA Management, Messaging, Live Consultation, Setup should be found.
    Then Browser Closed


  Scenario: TC_003 When clicking on the Birth&DeathDay menu link in the dashboard sidebar, the Birth Record and Death Record page links should be displayed.
    Given When you click on the Bird & Deathday menu link in Dashboard Sidebar
    Then Browser Closed

  Scenario: TC_004 When clicking on the (Categories) icon in the navbar, the dashboard sidebar should be able to be closed and opened.
    Given When you click on the icon of the category (Categories), Dashboard may be closed and urgent
    Then Browser Closed

  Scenario:  TC_005 When the dashboard sidebar is closed, icons for (Billing, Appointment, OPD, IPD, Pathology, Radiology, BloodBank, Ambulance, Human Resource, TPA Management, Messaging, Live Consultation, Setup) should be visible on the left bar.
    Given When you close Dashboard Sidebar, the icons of the lists are seen in the left bar
    Then Browser Closed





