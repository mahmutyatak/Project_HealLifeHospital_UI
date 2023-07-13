
Feature: As a doctor, I want to send post, email, or SMS to hospital employees from the Messaging page on the Dashboard Sidebar.

  Background:
        Given Start browser , go  to 'doctorLoginURL'
        And User fills  'doctorMahmut' and 'passwordMahmud' textBoxes
        And User clicks sign in  button
        And Massage butonuna tiklanir
        And 2 saniye beklenir.

    Scenario: When the Messaging link in the Dashboard Sidebar is clicked, it should redirect to the corresponding page.
        And Massage bolumune gidildigi dogrulanir.
        Then Browser Closed

    Scenario: On the Messaging page, post messages should be displayed on the Notice Board.
        And Message listesinde "Mauro Icardi" mesajinin oldugu dogrulanir
        Then Browser Closed

    Scenario: On the Messaging page, a new post message should be sent by selecting relevant departments.
        And Post New Message butonuna tiklanir
        And New Message "Mauro Icardi" bilgileri girilir
        And 2 saniye beklenir.
        And Message nin kaydedildigi dogrulanir
        #Then Browser Closed

    Scenario:On the Messaging page, a new SMS should be sent
      (either as a group to relevant departments or individually to specific persons).
        And Send Sms butonuna basilir
        And Group olarak "DoctorMahmut" baslikli mesaj bilgileri gonderilir.
        And 2 saniye beklenir.
        And "DoktorMahmut" baslikli mesajin iletildigi kontrol edilir.
        And 2 saniye beklenir.
        And Individual olarak "DoctorMahmut" baslikli mesaj bilgileri gonderilir.
        And "DoktorMahmut" baslikli individual mesajin iletildigi kontrol edilir.
        Then Browser Closed

    Scenario: On the Messaging page, a new email should be sent
      (either as a group to relevant departments or individually to specific persons).
        And Send Email butonuna basilir
        And Group olarak "DoctorMahmut" baslikli email bilgileri gonderilir.
        And 2 saniye beklenir.
        And "DoktorMahmut" baslikli mesajin iletildigi kontrol edilir.
        And 2 saniye beklenir.
        And Individual olarak "DoctorMahmut" baslikli email bilgileri gonderilir.
        And "DoktorMahmut" baslikli individual mesajin iletildigi kontrol edilir.
        Then Browser Closed