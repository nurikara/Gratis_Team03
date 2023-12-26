Feature: Kullanici favori ürünlerim kisminda listeleme/düzenleme ve silme islemleri yapabilmeli

  Scenario:
    Given Kullanici siteye gider
    Then Giris Yap butonuna tiklar
    Then Açilan menüden"Giris Yap" secenegine tiklar
    Then Kayitli oldugu eposta veya ceptelefonunu ve sifreyi girer
    Then Giriş Yap butonuna tiklar
    Then Arama kutusuna "şampuan" yazar ve cikan ilk urune tiklar
    Then Acilan sayfadaki favori butonuna tiklar ve urunu favorilerim'e ekler
    Then Acilan ilk pencerede zorunlu olan "istek listesi" kismina "sampuan" yazar ve ekle butonuna tiklar
    Then Hesabım butonuna tiklar
    Then Açılan pencereden Favorilerime tiklar
    Then Favori Listelerimden "sampuan" sekmesini secer
    Then Ürünlerin listelendigini görür
    Then Kullanici Liste Adini Düzenle ye tiklar
    Then Acilan pencerede Liste adini degistirir
    Then Kaydet butonuna basar
    Then Kullanici Sil butonuna tiklar
    Then Kullanici açılan pencereden sil butonuna tiklar
    Then Olusturulan favori listesinin silindiğini görür
