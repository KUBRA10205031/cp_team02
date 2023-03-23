Feature:User Login RxDrugsHub


  Scenario: Kullanici sayfaya login olur
    Given Kullanici RxDrugsHub sayfasina gider
    When  Kullanici gecerli bir email ve password girer.
    And   Kullanici sign in butonuna tiklar.
    Then  All Products goruntuler.


