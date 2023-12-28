@gratis
Feature: US05_ModaAksesuar Test

  Background:
    Given amazon sayfasina gidilir

  Scenario: TC_01
    Then Moda Aksesuar kategorisine tıklanır
    And Moda Aksesuar kategorisinin açıldığı doğrulanır
    Then Alt Kategoriler filtresinden herhangi bir ürün seçilir
    And İstenen ürün seçeneklerinin listelendiği doğrulanır
    Then Markalar filtresinden herhangi bir marka seçilir
    And  Seçilen markanın listelendiği doğrulanır
    Then Fiyat filtresinde en az ve en çok yazılır
    And Filtreleri Temizle butonuna tıklanır
    And Filtrenin temizlendiği doğrulanır
    Then Sayfa kapatılır

