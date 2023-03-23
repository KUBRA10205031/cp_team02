Feature: Logo ve kenar cubugu calışması


  Scenario: Logo ve kenar cubugu
    Given Kullanici RxDrugsHub  gider
    When  Kullanici gecerli  email ve password girer.
    And   kenar çubuguna  tıklanır
    Then menu listesi kapanir
    And  logo tiklanir
    Then  Arama sayfası gorulur.