Feature: Departman ekleme

  Background:TC_01_02_03
    Given Kullanici URL ye gider
    When  Kullanici login butonuna tiklar
    And   Kullanici gecerli bir email ve password girer.
    And   Kullanici Sign in butonuna tiklar.
    And   Kullanici Bussiness Owner sekmesini tiklar
    And   Kullanici Account Managment sekmesini tiklar


  Scenario: US_08 Departman ekler
    Given Kullanici Department sekmesini tiklar
    When  Kullanici Add New Departman butonunu tiklar
    And   Kullanici departman name girer.
    And   Kullanici departman type girer.
    When  Kullanici save butonunu tiklar.
    Then  Kullanici departman eklendigini kontrol eder
    And   Kullanici sayfayi kapatir.

  Scenario: US_08 Departman type ın zorunlu olduğunu görüntüler
    Given Kulanici Department sekmesini tiklar
    When  Kullanici Add New Department butonuna tiklar
    And   Kullanici departman name girer.
    When  Kullanici save butonunu tiklar.
    Then  Kullanici Please select a type for department yazisini dogrular
    And   Kullanici sayfayi kapatir.

  Scenario: US_08 Departman name in zorunlu olduğunu görüntüler
    Given  Kullanici Department sekmesini tiklar
    When   Kullanici Add New Department butonuna tiklar
    And    Kullanici departman type girer.
    When   Kullanici save butonunu tiklar.
    Then   Kullanici Please enter a name for department yazısını dogrular
    And    Kullanici sayfayi kapatir.

