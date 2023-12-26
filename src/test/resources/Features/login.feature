@gratis
Feature: US01_Login Test

  Background:
    Given Kullanici adres cubuguna url yazar
    Then Ana sayfanin ve giris yap buttonun gorunur oldugunu dogrular
    And Giris buttonuna tiklar ve giris yap sekmesinin gorunur oldugunu dogrular
    Then acilan dropdown menudeki giris yap sekmesine tiklar
    And acilan pencerede eposta ve sifre kutucuklarinin gorunur oldugunu dogrular

  Scenario: TC_01

    Then "5067752566" ve "sifre" bilgileri doldurulur
    And  login buttonuna basilir
    Then Acilan pencerede kullanici sekmesinde kendi isminin gorunur oldugunu dogrular
    And kullanici hesaptan cikis yapar

  Scenario: TC_02

    Then "nurikara@yahoo.com" ve "sifre" bilgileri doldurulur
    And login buttonuna basilir
    Then Acilan pencerede kullanici sekmesinde kendi isminin gorunur oldugunu dogrular
    And kullanici hesaptan cikis yapar