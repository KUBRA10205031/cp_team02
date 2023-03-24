
@FirstTest
Feature: Change Password , not change password ,can not be changed e mail.
  Background: My Profile sayfasina gelene kadar yapilan adimlar
    Given  Kullanici RxDrugsHub sayfasina gider
    When   Kullanici login butonuna tiklar ve gecerli bir email ve password girerek siteye giris yapar.
    And    Sagdaki Bussiness Owner butonuna tiklar.
    And    Acilan pencereden Account Management sekmesine tiklar.
    And    My Profile yazisini goruntuler.

  @notchangepassword

  Scenario Outline: not change password
    Given Change_ password butonuna tiklar
    And  Kurallara uymayan bir "<password1>" girisi yapar  .
    And  Dogrulamak icin Kurallara uymayan bir "<password2>" girisi_yapar
    And  Confirm_ butonuna tiklar .
    When Hata "<mesaj>" goruntuler.
    Then cancel_ butonuna tiklar.
    Examples:
      |password1 |               |password2|              | mesaj |
      | test123.|               |test123.|               |Password must|
      | TEST123.|               |TEST123.|               |Password must|
      |Test.test|               |Test.test|              |Password must|
      | Test1234|               |Test1234|               |Password must|
      | Test123 |               |Test123|                |Password must|
      | Test12. |               | Test12.|               |Password must|
      | Test1234567891234567.|  |Test1234567891234567.|  | Password must|


    # -->buyuk harf icermeyen varyasyon
    # -->kucuk harf icermeyen
    # -->rakam icermeyen
    # --> ozel karakter icermeyen
    # --> 8 karakterden kisa ve ozel karakter icermeyen password.
    # --> 8 karakterden kisa olan ozel karakter içeren password.
    # ---> 20 karakterden uzun password.

 # contain at least one uppercase.
 # contain at least one lowerc
 # contain at least one digit
 # contain special characters
 # be between 8 to 20 characte
 # be between 8 to 20 characte
 # be between 8 to 20 charact

         # --> yorum.
  @cannotbechangeemail
  Scenario: Go to RxDrugsHub website and Cannot Be Change E-Mail
    When   Sagdaki kalem ikonuna tiklar.
    When   E-mail butonuna tiklar.
    Then   E-Mail butonunun degisim icin aktif olmadigini goruntuler.

  @changepassword
  Scenario: Go to RxDrugsHub website and change password
    When   Change Password butonuna tiklar.
    And    Kurallara uyan yeni bir password olusturur.
    And    Confirm butonuna tiklar.
    When   My Profile_yazisini goruntuler.
