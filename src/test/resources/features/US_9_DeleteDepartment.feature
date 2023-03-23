Feature: Departman güncelleme ve silme


  Background:TC_01_02
    Given Kullanici URL ye gider
    When  Kullanici login butonuna tiklar
    And   Kullanici gecerli bir email ve password girer.
    And   Kullanici Sign in butonuna tiklar.
    And   Kullanici Bussiness Owner sekmesini tiklar
    And   Kullanici Account Managment sekmesini tiklar

  Scenario: US_09 Departman ismini ve type nı degiştirir
    Given Kullanici Department sekmesini tiklar
    When  Kullanici departman secer
    And   Kullanici Edit Departman butonunu tiklar
    And   Kullanici departman name girer.
    And   Kullanici departman type girer.
    When  Kullanici save butonunu tiklar.
    Then  Kullanici departman isminin ve type nin değistigini dogrular
    And   Kullanici sayfayi kapatir.


  Scenario: US_9 Departman siler
    Given   Kullanici Department sekmesini tiklar
    When    Kullanici departman secer
    And     Kullanici Edit Departman butonunu tiklar
    And     Kullanici delete butonuna tiklar
    When    Kullanici acilan onay penceresinden tamam butonunu tiklar
    Then    Kullanici departmanin silindigini dogrular
    And     Kullanici sayfayi kapatir.


