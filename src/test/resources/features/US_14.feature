Feature: Teams modülünde Teamleri duzenleyebilmelidir

  Background: US_01_02_03

    Given Kullanici  URL ye  gider ve login olur
    And Kullanici Account Managment buttonunu tiklar
    And Kullanici Teams buttonunu tiklar
    And Kullanici Add New Team  buttonunu tiklar
    And Kullanici Team name girer
    And Kullanici Department Type secer
    And Save butonuna tiklar
    And Kullanici Sol Menudeki Teams buttonunu tiklar


  Scenario:US_14 Teams modülünde team leri düzenleyebilmeli
    When Kullanici ekledigi team e tiklar
    And Kullanici Edit team buttonuna tiklar
    And Kullanici yeni bir Team name girer ve Department Type secer
    And Save butonuna tiklar
    And Kullanici Teams buttonunu tiklar
    Then Kullanici duzenledigi Team i dogrular



  Scenario:US_14 Teams modülünde team name girmedikce team de degisiklik yapamaz
    When Kullanici ekledigi team e tiklar
    And Kullanici Edit team buttonuna tiklar
    And Kullanici  Team name kismini bos birakir
    And Save butonuna tiklar
    Then Kullanici Please enter a name for department hatasini goruntuler


  Scenario:US_14 Teams modülünde Department type secilmeden team de değisiklik yapilamaz
    When Kullanici ekledigi team e tiklar
    And Kullanici Edit team buttonuna tiklar
    And Kullanici yeni bir Team name girer
    And Kullanici Department Type kismini bos birakir
    And Save butonuna tiklar
    Then Kullanici Please Select a type for department hatasini goruntuler


  Scenario:US_14 Teams modülünde  Teamler Edit Team secenegiyle silinebilir
    When Kullanici ekledigi team e tiklar
    And Kullanici Edit team buttonuna tiklar
    And Kullanici Delete Department butonuna tiklar
    And Kullanici acilan onay penceresinde tamam i tiklar

   And Kullanici Sol Menudeki Teams buttonunu tiklar
   Then Kullanici silinen team in  goruntulenemedigini dogrular






