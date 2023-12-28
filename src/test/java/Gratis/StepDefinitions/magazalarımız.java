package Gratis.StepDefinitions;

import Gratis.Pages.Magazalarımız_Page;
import Gratis.Utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static Gratis.Utilities.ReusableMethods.waitFor;

public class magazalarımız {

    Magazalarımız_Page magazalarımız_page = new Magazalarımız_Page();
    @Then("Mağazalarımız butonuna tıkla")
    public void mağazalarımızButonunaTıkla() {
        magazalarımız_page.magazalarımızButonu.click();
        waitFor(3);
    }

    @And("Sayfayı aşağı kaydır")
    public void sayfayıAşağıKaydır() {
    }

    @Then("İzmir seçeneğine tıkla")
    public void izmirSeçeneğineTıkla() {
        magazalarımız_page.izmirSecenegi.click();
        waitFor(3);
    }

    @And("İzmir Mağazalarımız başlığını gördüğünü doğrula")
    public void izmirMağazalarımızBaşlığınıGördüğünüDoğrula() {
        magazalarımız_page.izmirMagazalarımızYazisi.isDisplayed();
        waitFor(3);
    }

    @Then("Konak seçeneğine tıkla")
    public void konakSeçeneğineTıkla() {
        ReusableMethods.scroll(magazalarımız_page.konakSecenegi);
        magazalarımız_page.konakSecenegi.click();
        waitFor(3);
    }

    @And("Konak Mağazalarımız başlığını gördüğünü doğrula")
    public void konakMağazalarımızBaşlığınıGördüğünüDoğrula() {
        magazalarımız_page.konakMagazalarımızYazısı.isDisplayed();
        waitFor(3);
    }

    @Then("Herhangi bir mağazanın adresine tıkla")
    public void herhangiBirMağazanınAdresineTıkla() {
        ReusableMethods.scroll(magazalarımız_page.herhangiMagaza);
        magazalarımız_page.herhangiMagaza.click();
        waitFor(3);
    }

    @And("Adresin görüldüğünü doğrula")
    public void adresinGörüldüğünüDoğrula() {
        magazalarımız_page.magazaAdresi.isDisplayed();
    }
}
