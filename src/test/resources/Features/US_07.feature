Feature: Kullanici Elektronik Urunler kategorisinde stokta olan tum urunleri listeyebilmeli

  Scenario:
    Given Kullanici siteye gider
    Then Giris Yap butonuna tiklar
    Then Açilan menüden"Giris Yap" secenegine tiklar
    Then Kayitli oldugu eposta veya ceptelefonunu ve sifreyi girer
    Then Giris Yap butonuna tiklar
    Then Kullanici "Elektrikli Ürünler" sekmesine tiklar
    Then Kullanici "Stokta Var" kutucuguna tiklar
    Then Kullanici stokta olan ürünlerin listelendigini dogrular
