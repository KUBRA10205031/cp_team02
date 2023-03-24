Feature: US_17 NEW USER

  Background: US_17 Test Caseleri
    Given Kullanici url gıder ve kullanici login olur.
    When  Kullanici G butonuna tıklar ve Account Managenent bolumune tıklar
    Then  Kullanici acılan sayfada  Users sayfada Users bolumune tıklar

   @tc_01
  Scenario:New User Registion bolumune ekleme yapabilmelidir
    When Kullanici New User Registion sekmesine tıklar ve role bolumunden secim yapar
    And  Kullanici email kısmına gecerli email girer ve Register butonuna basar
    Then Kullanici Succesful mesajını dogrular
    And  Kullanici sayfasını kapatır

   @tc_02
  Scenario: New User Invitation bolumune ekleme yapabilmedir.
    When Kullanici New User Invitation sekmesine tıklar ve roles bolumunden secim yapar
    And  Kullanici email kısmına gecerli email girer ve Send Invitation butonuna basar
    Then Kullanici green renklteki dogrulama mesajını gorur
    And  Kullanici sayfasını kapatır

   @tc_03
  Scenario: New User Invitation bolumu gecersiz email girmek
    When  Kullanici New User Invitation sekmesine tıklar ve roles bolumunden secim yapar
    And   Kullanici email kısmına gecersiz bir email girer ve Send Invitation butonuna tıklar
    Then  Kullanici acılan sayfada bilgilendirme mesajını gorur ve kayıt olamaz
    And   Kullanici sayfasını kapatır

    @tc_04
  Scenario: New User Invitation bolumunde role kısmından secim yapmamak
    When Kullanici New User Invitation sekmesine tıklar ve roles bolumunden secim yapmaz
    And  Kullanici gecerli email adress girer ve Send Invitation butonuna tıklar
    Then Kullanici bilgilendirme mesajını gorur ve kayıt olamaz
    And  Kullanici sayfasını kapatır
