
Feature: As a doctor, I want to view the data of babies born and patients who have passed away in the hospital from the Birth & Death Record menu.

  Background:
        Given Start browser , go  to 'doctorLoginURL'
        And User fills  'doctorMahmut' and 'passwordMahmud' textBoxes
        And User clicks sign in  button
        And Birth AND Death butonuna tiklanir
        And 2 saniye beklenir.

  Scenario: When the Birth & Death Record link in the Dashboard Sidebar is clicked,
  the Birth Record and Death Record links should be displayed.
        And Birth ve Death bölümlerinin oldugu dogrulanır.
        Then Browser Closed

  Scenario: When the Birth Record link is clicked, the Birth Record List (Reference No, Case ID / Patient ID, Child Name,
  Gender, Birth Date, Mother Name, Father Name, Report headings) should be displayed on the Birth Record page.
        And Birth bolumune tiklanir
        And 3 saniye beklenir.
        And "Reference No, Case ID / Patient ID, Child Name, Gender, Birth Date, Mother Name, Father Name, Report" basliklarinin oldugu dogrulanir
        Then Browser Closed

  Scenario: The content in the Birth Record List should be sortable by clicking on the column headings.
        And Birth bolumune tiklanir
        And 3 saniye beklenir.
        And Baslik sutunlarina gore siralama yapilabildigi dorulanmalidir.
        Then Browser Closed

  Scenario:There should be a searchBox for easy searching among the content in the Birth Record List.
        And Birth bolumune tiklanir
        And 3 saniye beklenir.
        And Search Box kutusuna "Ali" yazisi gonderilir.
        And 3 saniye beklenir.
        And "Ali" degerin listelendigi dogrulanir.
        Then Browser Closed

  Scenario: The number of content items displayed on one page in the Birth Record List can be selected as 100 or All.
        And Birth bolumune tiklanir
        And 3 saniye beklenir.
        And All sekmesinin secildigi dogrulanir
        And 3 saniye beklenir.
        And  100 sekmesinin secildigi dogrulanir.
        Then Browser Closed

  Scenario: When the Report heading under the Birth Record List is clicked,
    the details of the relevant content should be displayed. It should be possible to delete and update it.
        And Birth bolumune tiklanir
        And 3 saniye beklenir.
        And Search Box kutusuna "Veli" yazisi gonderilir.
        And Report bolumunde ozet bilgiler bolumune tiklanir.
        And Report bolumunde "Veli" bilgilerinin gorunurlugu test edilir.
        And Ozet bilgiler kapatilir.
        And Edit bolumune tiklanir.
        And Bebegin fotografi yuklenir.
        And Save tusuna basilir.
        And "Veli" isimli bebegin fotosunun yüklendigi test edilir.
        And "Veli" isimli bebegin silindigi kontrol edilir.
        Then Browser Closed
@wip
  Scenario: A new birth record (Add Birth Record) can be created on the Birth Record page.

        And Birth bolumune tiklanir
        And 3 saniye beklenir.
        And Add birth tusuna basilir.
        And 3 saniye beklenir.
        And "Veli" isimli bebegin bilgileri girilir.
        And BirthSave tusuna basilir.
        And 5 saniye beklenir.
        And "Veli" isimli bebegin kaydedildigi dogrulanir.
        Then Browser Closed

  Scenario: When the Death Record link is clicked, the Death Record List (Reference No,
      Case ID / Patient ID, Patient Name, Guardian Name, Death Date, Report headings)
      should be displayed on the Death Record page.
        And Death bolumune tiklanir
        And 3 saniye beklenir.
        And "Reference No, Case ID / Patient ID, Patient Name, Guardian Name, Death Date, Report" basliklarinin oldugu dogrulanir
        Then Browser Closed

  Scenario: The content in the Death Record List should be sortable by clicking on the column headings.
        And Death bolumune tiklanir
        And 3 saniye beklenir.
        And Death baslik sutunlarina gore siralama yapilabildigi dorulanmalidir.
        Then Browser Closed


  Scenario: There should be a searchBox for easy searching among the content in the Death Record List.
        And Death bolumune tiklanir
        And 3 saniye beklenir.
        And Search Box kutusuna "Annalo" yazisi gonderilir.
        And 3 saniye beklenir.
        And "Annalo" degerin listelendigi dogrulanir.
        Then Browser Closed

  Scenario: The number of content items displayed on one page in the Death Record List can be selected as 100 or All.
        And Death bolumune tiklanir
        And 3 saniye beklenir.
        And All sekmesinin secildigi dogrulanir
        And 3 saniye beklenir.
        And  100 sekmesinin secildigi dogrulanir.
        Then Browser Closed

  Scenario: The relevant content details should be displayed under the
    Report title in the Death Record List. can be deleted and updated.
        And Death bolumune tiklanir
        And 3 saniye beklenir.
        And Search Box kutusuna "Annalo" yazisi gonderilir.
        And Report bolumuDeath da ozet bilgiler bolumune tiklanir.
        And Report bolumuDeath da "Annalo" bilgilerinin gorunurlugu test edilir.
        And Ozet bilgiler kapatilir.
        And EditDeath bolumune tiklanir.
        And Olen kisinin fotografi yuklenir.
        And Save tusuna basilir.
        And "Annalo" isimli kisinin mezar fotosunun yüklendigi test edilir.
        And "Annalo" isimli kisinin silindigi kontrol edilir.
        Then Browser Closed

  Scenario: A new death record (Add Death Record) can be created on the Death Record page.
        And Death bolumune tiklanir
        And 3 saniye beklenir.
        And Add birth tusuna basilir.
        And 3 saniye beklenir.
        And "Annalo" isimli kisinin olum bilgileri girilir.
        And BirthSave tusuna basilir.
        And 5 saniye beklenir.
        And "Annalo" isimli kisinin listelendigi dogrulanir.
        Then Browser Closed



