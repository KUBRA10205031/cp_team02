Feature: Subcription Process

  Scenario: Subscriptions modulü görüntülenir ve Subscription bilgilerine erisilebilir

    Given Kullanici  sayfaya gider ve login olur
    When  Kullanici Account Management ve Subscriptions butonuna tiklar
    Then Subscriptions listesi görüntülenir
    And Kullanici bir subscriptiona tiklar
    Then Subscription bilgileri görüntülenir








