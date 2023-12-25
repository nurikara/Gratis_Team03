package Gratis.StepDefinitions;

import Gratis.Pages.Home_Page;
import Gratis.Utilities.ConfigReader;
import Gratis.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class login {

    Home_Page home = new Home_Page();


    @Given("Kullanici adres cubuguna url yazar")
    public void kullanici_adres_cubuguna_url_yazar() {
        Driver.getDriver().get(ConfigReader.getProperty("manage_Url"));
    }
    @Then("Ana sayfanin ve giris yap buttonun gorunur oldugunu dogrular")
    public void ana_sayfanin_ve_giris_yap_buttonun_gorunur_oldugunu_dogrular() {
       Assert.assertTrue(home.girisYapDropeDown.isDisplayed());
    }
    @Then("Giris buttonuna tiklar ve giris yap segmesinin gorunur oldugunu dogrular")
    public void giris_buttonuna_tiklar_ve_giris_yap_segmesinin_gorunur_oldugunu_dogrular() {
       home.girisYapDropeDown.click();
    }
    @Then("acilan dropdown menudeki giris yap segmesine tiklar")
    public void acilan_dropdown_menudeki_giris_yap_segmesine_tiklar() {
        home.girisYap.click();

    }
    @Then("acilan pencerede eposta ve sifre kutucuklarinin gorunur oldugunu dogrular")
    public void acilan_pencerede_eposta_ve_sifre_kutucuklarinin_gorunur_oldugunu_dogrular() {
        System.out.println("Bos");
    }
    @Then("telefon numarasi ve sifre bilgileri doldurulur")
    public void telefon_numarasi_ve_sifre_bilgileri_doldurulur() {
        System.out.println("Bos");
    }
    @Then("login buttonuna basilir")
    public void login_buttonuna_basilir() {
        System.out.println("Bos");
}
    @Then("Acilan pencerede kullanici segmesinde kendi isminin gorunur oldugunu dogrular")
    public void acilan_pencerede_kullanici_segmesinde_kendi_isminin_gorunur_oldugunu_dogrular() {
        System.out.println("Bos");
    }
}
