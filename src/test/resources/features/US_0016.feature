Feature: Kullanici Modulu Sureci


  Background: US_16
    Given Kullanici URL e gider
    When Kullanici sayfaya login olur ve G simgesine tıklar
    Then Kullanici açılan menüden Account Management bölümüne tıklar



  @TC_01
  Scenario: Kullanici Default rolunun silinemeyecegini dogrular

    When  Kullanici  default rolunu silinemeyecegini goruntuler.



  @TC_02
  Scenario: Kullanici meailinin degiştirilemeyecegini dogrular

    When  Kullanici  meailinin degiştirilemeyecegini goruntuler.


  @TC_03
  Scenario: Kullanici usurname i bos bırakamyacagını goruntuler

    When  Kullanici usurname i bos bırakamyacagını goruntuler


  @TC_04
  Scenario: Kullanici passwordunu resetleyebilecegini goruntuler

    When  Kullanici  user bolumune tıklar.
    Then  Kullanici search yerine emailini girer ve tıklar
    And  Kullanici Reset Password sekmesini tıklar
    And  Kullanici  confirme tıklar.
    And Kullanici paswordunu resetleyebilecegini goruntuler

  @TC_05
  Scenario: Kullanıcı farklı roller ekleyebilecegini goruntuler

    When Kullanıcı  user bolumune tıklar.
    Then  Kullanıcı search yerine emailini girer ve tıklar
    And  Kullanıcı + sekmesine tıklar.
    And  Kullanıcı acılan sekmede farkı bır role secer
    And Kullanıcı save butonuna tıklar.
    And Kullanıcı New role added for this user successfuly yazısını goruntuler.

