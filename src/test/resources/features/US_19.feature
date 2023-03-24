

Feature: Roles clickable RxDrugsHub



  Scenario: Kullanici her bir kayitli rolu tiklayarak ayricaliklarini görüntüleyebilmeli

    Given Kullanici login olur

    When Kullanici Businnes Owner simgesine ve Account Management butonuna tıklar

    When Kullanici Roles bolumune tiklar

    Then Kullanici All Roles yazili sayfadaki tum rolleri tiklayarak ayricaliklarini görüntülediğini doğrular

