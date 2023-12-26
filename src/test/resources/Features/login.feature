@amazon
Feature: Login Test

  Scenario: TC_01
    Given Kullanici adres cubuguna url yazar
    Then Ana sayfanin ve giris yap buttonun gorunur oldugunu dogrular
    And Giris buttonuna tiklar ve giris yap segmesinin gorunur oldugunu dogrular
    Then acilan dropdown menudeki giris yap segmesine tiklar
    And acilan pencerede eposta ve sifre kutucuklarinin gorunur oldugunu dogrular
    Then telefon numarasi ve sifre bilgileri doldurulur
    And  login buttonuna basilir
    Then Acilan pencerede kullanici segmesinde kendi isminin gorunur oldugunu dogrular