Feature: Kullanici Elektronik Urunler kategorisinde stokta olan tum urunleri listeyebilmeli

  Scenario:
    Given Kullanici adres cubuguna url yazar
    Then Giris buttonuna tiklar ve giris yap sekmesinin gorunur oldugunu dogrular
    Then acilan dropdown menudeki giris yap sekmesine tiklar
    Then "mail" ve "sifre" bilgileri doldurulur
    Then login buttonuna basilir
    Then Kullanici "Elektrikli Ürünler" sekmesine tiklar
    Then Kullanici "Stokta Var" kutucuguna tiklar
    Then Kullanici stokta olan ürünlerin listelendigini dogrular
    And iaeieaiaiea

