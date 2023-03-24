Feature: Roles Page RxDrugsHub


  Scenario: Kullanici Roles bolumundeki tum kayitli rolleri goruntuleyebilmeli ve listeleyebilmeli

    Given Kullanici  sayfaya gider ve url login olur

    When Kullanici G Businnes Owner simgesine ve Account Management butonuna tıklar

    When Kullanici Roles bolumune gider

    Then Kullanici All Roles yazan sayfada tüm kayitlari görüntüledigini ve listelediğini dogrular
