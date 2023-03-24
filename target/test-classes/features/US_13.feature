Feature: Teams modülünde yeni bir team eklenebilir

  Background: US_01_02_03

    Given Kullanici  URL ye  gider ve login olur
    And Kullanici Account Managment buttonunu tiklar


  Scenario:US_13 Bir Team Ekler
    And Kullanici Teams buttonunu tiklar
    And Kullanici Add New Team  buttonunu tiklar
    And Kullanici Team name girer
    And Kullanici Department Type secer
   And Save butonuna tiklar
   And Kullanici Sol Menudeki Teams buttonunu tiklar
   Then Kullanici yeni eklenen Team i dogrular


  Scenario:US_13 Team Eklemek icin Team Name zorunludur
    And Kullanici Teams buttonunu tiklar
   And Kullanici Add New Team  buttonunu tiklar
   And Kullanici Department Type secer
  And Save butonuna tiklar
  Then Kullanici Please enter a name for department hatasini goruntuler


  Scenario:US_13 Team Eklemek icin Department Type zorunludur
    And Kullanici Teams buttonunu tiklar
    And Kullanici Add New Team  buttonunu tiklar
    And Kullanici Team name girer
    And Save butonuna tiklar
    Then Kullanici Please Select a type for department hatasini goruntuler


  Scenario:US_13 Gecerli bir Team Name eklenmedikce team eklenemez
    And Kullanici Teams buttonunu tiklar
    And Kullanici mevcut team sayisini gorur
    And Kullanici Add New Team  buttonunu tiklar
    And Kullanici  gecersiz bir Team name girer
    And Kullanici Department Type secer
    And Save butonuna tiklar
    And Kullanici Teams buttonunu tiklar
    Then Kullanici Hatali oldugu halde yeni bir team eklendigini dogrular









