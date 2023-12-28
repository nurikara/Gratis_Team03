Feature: Kullanici favori ürünlerim kisminda listeleme/düzenleme ve silme islemleri yapabilmeli

  Scenario:
    Given Kullanici adres cubuguna url yazar
    Then Giris buttonuna tiklar ve giris yap sekmesinin gorunur oldugunu dogrular
    Then acilan dropdown menudeki giris yap sekmesine tiklar
    Then "Telefon" ve "sifre" bilgileri doldurulur
    Then login buttonuna basilir
    Then Arama kutusuna sampuan yazar ve cikan ilk urunu  favorilerim'e ekler
    Then Acilan ilk pencerede zorunlu olan istek listesi kismina sampuan yazar ve ekle butonuna tiklar
    Then Hesabim butonuna tiklar
    Then Acilan pencereden Favorilerime tiklar
    Then Urunun listelendigini gorur
    Then Kullanici Liste Adini Duzenle ye tiklar
    Then Acilan pencerede Liste adini degistirir
    Then Kaydet butonuna basar
    Then Kullanici Sil butonuna tiklar
    Then Kullanici acilan pencereden sil butonuna tiklar
    Then Olusturulan favori listesinin silindigini gorur
