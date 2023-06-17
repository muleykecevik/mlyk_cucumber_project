Feature: US1008 Toplu kullanici listesi ile negatif login testi

  @qD
  Scenario Outline: TC14 Kullanici listedeki kullanici bilgileri
  ile giris yapilamadigini test eder.
    Given Kullanici "qdUrl" anasayfaya gider
    Then ilk login linkine click yapar
    And user email olarak "<email>" girer
    And password olarak "<password>" girer
    When login butonuna basar
    Then giris yapilamadigini test eder.
    Then Sayfayi kapatir
    Examples:
      | email         | password |
      | abc@gmail.com | 12345    |
      | asd@gmail.com | 23455    |
      | klm@gmail.com | 343454   |
      | zzz@gmail.com | 45546546 |
