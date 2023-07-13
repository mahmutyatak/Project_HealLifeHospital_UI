
Feature: As a user, I would like to have a page on the homepage where I can schedule appointments for hospital services.

  Background:
    Given Start browser, go to 'homepageURL'
 @newPatient
  Scenario: TC_001 There should be a redirect from the main page to the Appointment page.

    And The user clicks on the Appointment link at the top of the page,and it is verified that it forwards to the correct address

  @newPatient
  Scenario: TC_002 Specialist on the Appointment page,doctor,Shift and Date must be selectable.
    And The user clicks on the Appointment link at the top of the page,and it is verified that it forwards to the correct address
    And On the page entered by the user, it is verified that Specialist, Doctor, Shift, Date dropDowns are selectable.

  @newPatient
  Scenario: TC_003  Slots suitable for the selected information should be seen.
    And  The user clicks on the Appointment link at the top of the page,and it is verified that it forwards to the correct address
    And  On the page entered by the user, it is verified that Specialist, Doctor, Shift, Date dropDowns are selectable.
    And It is verified that the appropriate slot is seen in accordance with the information entered by the user.


  Scenario:TC_004  Message Box must be a required field.
    And  The user clicks on the Appointment link at the top of the page,and it is verified that it forwards to the correct address
    And Even if all appointment information is entered when the Message box is left blank by the user The Message field is required. the visibility of the text must be verified
  @newPatient
  Scenario: TC_005 When the desired slot is clicked, the desired time interval can be selected in the window that opens and patient information can be entered
    And The user clicks on the Appointment link at the top of the page,and it is verified that it forwards to the correct address
    And  After the user enters the necessary information for the appointment, selects the slot, and selects the desired time interval in the window that opens It should be verified that the patient can choose and patient information can be entered.

  Scenario: TC_006 If he is a registered patient, he should be able to make an appointment without having to enter his information.
    And The user clicks on the Appointment link at the top of the page,and it is verified that it forwards to the correct address
    And If the user is a former patient, she enters her information and makes an appointment

  @wip
  Scenario: TC_007  If it is a new patient, they should be able to enter their personal information and make an appointment.
    And The user clicks on the Appointment link at the top of the page,and it is verified that it forwards to the correct address
    #telefon numarasi yollanmali
    And appointments can be made by creating a new patient record



  Scenario: TC_008  When the appointment process is completed, there should be a redirect to the patient's dashboard page.
    And The user clicks on the Appointment link at the top of the page,and it is verified that it forwards to the correct address
    And The result of the patient who has a new appointment is confirmed to be directed to the dashboard.
    And t is verified that it redirects to its dashboard page