package Gratis.StepDefinitions;


import Gratis.Pages.SosyalMedyaPage;
import Gratis.Utilities.ConfigReader;
import Gratis.Utilities.Driver;
import Gratis.Utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static Gratis.Utilities.Driver.getDriver;


public class SosyalMedyaDefinition {

    SosyalMedyaPage sosyalMedyaPage = new SosyalMedyaPage();

    @Given("Kullanıcı Ana Sayfaya Gider")
    public void kullanıcı_ana_sayfaya_gider() {
        getDriver().get(ConfigReader.getProperty("manage_Url"));

    }

    @Then("Kullanıcı Sayfanı Alt Kısmına Gelir ve Sosyal hesabları Görür")
    public void kullanıcı_sayfanı_alt_kısmına_gelir_ve_sosyal_hesabları_görür() {
        ReusableMethods.bekle(5);
        ReusableMethods.scrollEnd();
        ReusableMethods.scroll(sosyalMedyaPage.biziTakipEdin);

    }

    @Then("Kullanıcı facebook Tıklayabilir ve Kullanabilir Oldugunu Görür")
    public void kullanıcı_facebook_tıklayabilir_ve_kullanabilir_oldugunu_görür() {
        sosyalMedyaPage.facebook.click();
        ReusableMethods.bekle(5);
        ReusableMethods.yeniSekmeAc();
        sosyalMedyaPage.facebookGratisIleBağlantıKur.isDisplayed();
        ReusableMethods.anaSekmeyeGeriDon();

    }

    @Then("Kullanıcı Instagram Tıklayabilir ve Kullanabilir Oldugunu Görür")
    public void kullanıcı_ınstagram_tıklayabilir_ve_kullanabilir_oldugunu_görür() {

        sosyalMedyaPage.instagram.click();

        ReusableMethods.yeniSekmeAc();
        sosyalMedyaPage.instagramDogrular.isDisplayed();

        ReusableMethods.anaSekmeyeGeriDon();
    }

    @Then("Kullanıcı Twitter Tıklayabilir ve Kullanabilir Oldugunu Görür")
    public void kullanıcı_twitter_tıklayabilir_ve_kullanabilir_oldugunu_görür() {
        sosyalMedyaPage.twitter.click();
        ReusableMethods.anaSekmeyeGeriDon();
    }

    @Then("Kullanıcı YouTube Tıklayabilir ve Kullanabilir Oldugunu Görür")
    public void kullanıcı_you_tube_tıklayabilir_ve_kullanabilir_oldugunu_görür() {
        sosyalMedyaPage.youtube.click();
        ReusableMethods.bekle(4);
    }

    @Then("Sayfayı Kapat")
    public void sayfayıKapat() {
        Driver.closeDriver();
    }
}
