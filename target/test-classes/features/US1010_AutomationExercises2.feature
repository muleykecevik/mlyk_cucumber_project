Feature: US1010 Kullanici yanlis email ile sisteme giris yapamaz

  @ae
  Scenario: TC16 eksik e mail ile sisteme giris yapilamaz


    Given Kullanici "aeUrl" anasayfaya gider
    And   user sign up linkine tiklar
    And   Login to your account bolumunde e mail kutusuna @isareti olmayan email adresi yazar
    And   password kutusuna  sifre yazar ve enter’a tiklar
    Then  sisteme giris yapilamadigini test eder