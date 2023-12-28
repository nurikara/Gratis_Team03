@gratis
Feature: US04_Magazalarımız Test

  Background:
    Given amazon sayfasina gidilir

  Scenario: TC_01
    Then Mağazalarımız butonuna tıkla
    And Sayfayı aşağı kaydır
    Then İzmir seçeneğine tıkla
    And İzmir Mağazalarımız başlığını gördüğünü doğrula
    Then Konak seçeneğine tıkla
    And  Konak Mağazalarımız başlığını gördüğünü doğrula
    Then Herhangi bir mağazanın adresine tıkla
    And Adresin görüldüğünü doğrula
    Then Sayfa kapatılır
