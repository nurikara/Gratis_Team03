@gratis
Feature: US03_CokSatanlar Test

  Background:
    Given amazon sayfasina gidilir

  Scenario: TC_01
    Then Herhangi bir kategoriye tıkla
    And Akıllı sıralama ddm menüsüne tıkla
    Then En çok satanlar seçeneğine tıkla
    And Kategorinin Çok Satanları başlığının görüldüğünü doğrula
    Then Alt kategoriden herhangi bir ürün seç
    And  Açılan seçeneklerde Kategorinin Çok Satanları başlığının görüldüğünü doğrula
    Then Sayfa kapatılır

