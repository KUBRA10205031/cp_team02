

Feature: Roles permissions RxDrugsHub



  Scenario: Kullanici Roles bolumunde olan permissions kismini goruntuleyebilmeli

    Given Kullanici sayfaya giderek login olur

    When Kullanici Businnes Owner simgesine daha sonra Account Management butonuna tıklar

    When Kullanici Roles bolumune giderek All Roles sayfasini goruntuler

    Then Kullanici tum rolleri tiklayarak permissions bolumunun goruntulediğini ve listelendigini dogrular

