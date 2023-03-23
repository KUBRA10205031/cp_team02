  Feature: Displays users in the Users module.

    Background:US_15 TC_01 ve TC_02
      Given Kullanici login butonuna tıklar ve login olur
      When  Kullanici   G butonuna tıklar
      Then  Kullanici acılan menüden Account Management simgesine tıklar
      And   Kullanici acılan sayfada  Users simgesine tıklar


    @positive
   Scenario: Kullanici eklenen kullanıcı rolunun green tick ile aktif oldugunu gorebilmeli
     When Kullanici acılan sayfada Search by username or email arama cubuguna "julie.baumbach" girer
     Then Kullanici acılan ekranda emailinde onayladıgı hesabında green tick gorur
     And  Kullanici sayfayı kapatır

     @negative
     Scenario:Kullanici eklenen kullanıcı rolunun red tick ile pasif oldugunu gorebilmeli
     When Kullanici acılan sayfada Search by username or email arama cubugun "sirus.48" girer
     Then Kullanici acılan ekranda emailinde onaylamadıgı hesabında red tick gorur
     And  Kullanici sayfayı kapatır








