Feature: Kullanici favori ürünlerim kisminda listeleme/düzenleme ve silme islemleri yapabilmeli

  Scenario:
    Given Kullanici adres cubuguna url yazar
    Then Giris buttonuna tiklar ve giris yap sekmesinin gorunur oldugunu dogrular
    Then acilan dropdown menudeki giris yap sekmesine tiklar
    Then "Telefon" ve "sifre" bilgileri doldurulur
    Then login buttonuna basilir
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
