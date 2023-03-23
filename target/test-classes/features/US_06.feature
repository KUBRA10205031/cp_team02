##2- User should be logged in.
#3- User should click account button.
#4- Click "Account Management"
#5- Click "Company"
#6- Click "Edit"
#7- Name and e-mail are entered
#8- Name is not entered
#9- Email is not entered
#10- Click "Save"
#11- Verify name is up to date

Feature: Company modulunde duzenleme islemleri

  Background:
    Given Kullanici web sitesine gider ve login olur
    When Account management'a tiklanir
    And Company ve Edit'e tiklanir

  Scenario: Kullanici company modulunu  isim  ve mail girerek duzenler
    And isim "team 2" ve email  "team2@hotmail.com" girilir

    Then Degisiklik kaydedilir

  Scenario: Sadece mail girilerek duzenleme
    And Isim bos " " birakilir mail "team2@hotmail.com" girilir

    Then Uyari alinir

  Scenario: Sadece isim girerek duzenleme
    And isim girilir "team 2" mail bos " " biraklilir

    Then Kayit yapilamaz

