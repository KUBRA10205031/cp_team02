Feature: Logo ve kenar cubugu calışması


  Scenario: Kullanici sayfaya login olur
    Given Kullanici RxDrugsHub sayfasina gider
    When  Kullanici gecerli bir email ve password girer.
    And   Kullanici sign in butonuna ve kenar çubuguna ve logoya tıklanır
    Then  Arama sayfası gorulur.