Feature:User Login RxDrugsHub


  Scenario: Kullanıcı sayfaya login olur
    Given Kullanici RxDrugsHub sayfasina gider
    When  Kullanıcı gecerli bir email ve password girer.
    And   Kullanıcı sign in butonuna tıklar.
    Then  All Products görüntüler.


