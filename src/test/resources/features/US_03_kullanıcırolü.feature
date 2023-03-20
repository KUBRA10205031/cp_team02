Feature: Kullanıcı adı ve rolü

  Scenario: Kullanici adı ve rolu sayfada gorulmesi.
    Given Kullanici RxDrugsHub sayfasina gider.
    When Kullanici RxDrugsHub sayfasina gider.
    And Kullanici sign in butonuna tıklar.
    Then Kullanici adı ve rolü görülür.

