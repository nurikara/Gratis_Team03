package Gratis.StepDefinitions;

import Gratis.Pages.Favoriurunler_Page;
import Gratis.Pages.Home_Page;
import Gratis.Utilities.ReusableMethods;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US10 {
    Home_Page home = new Home_Page();
    Favoriurunler_Page favoriurunler=new Favoriurunler_Page();




    @Then("Arama kutusuna sampuan yazar ve cikan ilk urunu  favorilerim'e ekler")
    public void aramaKutusunaSampuanYazarVeCikanIlkUrunuFavorilerimEEkler() {
       ReusableMethods.click(home.aramaKutusu);
        home.aramaKutusu.sendKeys("sampuan", Keys.ENTER);
        ReusableMethods.bekle(2);
        favoriurunler.ilkfavoriurun.click();
    }

    @Then("Acilan ilk pencerede zorunlu olan istek listesi kismina sampuan yazar ve ekle butonuna tiklar")
    public void acilanIlkPenceredeZorunluOlanIstekListesiKisminaSampuanYazarVeEkleButonunaTiklar() {
        favoriurunler.istekListesiAdi.sendKeys("şampuan");
        ReusableMethods.bekle(2);
        favoriurunler.istekListesiEkle.click();
    }

    @Then("Hesabim butonuna tiklar")
    public void hesabimButonunaTiklar() {
        home.girisYapDropeDown.click();
    }

    @Then("Acilan pencereden Favorilerime tiklar")
    public void acilanPenceredenFavorilerimeTiklar() {
        ReusableMethods.click(favoriurunler.favorilerim);

    }

    @Then("Urunun listelendigini gorur")
    public void urununListelendiginiGorur() {
        Assert.assertTrue(favoriurunler.favoriurun.isDisplayed());
    }

    @Then("Kullanici Liste Adini Duzenle ye tiklar")
    public void kullaniciListeAdiniDuzenleYeTiklar() {
        favoriurunler.listeAdiDuzenle.click();
    }

    @Then("Acilan pencerede Liste adini degistirir")
    public void acilanPenceredeListeAdiniDegistirir() {
        favoriurunler.istekListesiAdi.clear();
        favoriurunler.istekListesiAdi.sendKeys("ŞAMPUANLAR");

    }

    @Then("Kaydet butonuna basar")
    public void kaydetButonunaBasar() {
        favoriurunler.istekListesiKaydet.click();
    }

    @Then("Kullanici Sil butonuna tiklar")
    public void kullaniciSilButonunaTiklar() {
        favoriurunler.sil.click();
    }

    @Then("Kullanici acilan pencereden sil butonuna tiklar")
    public void kullaniciAcilanPenceredenSilButonunaTiklar() {
        favoriurunler.istekListesiSil.click();
    }

    @Then("Olusturulan favori listesinin silindigini gorur")
    public void olusturulanFavoriListesininSilindiginiGorur() {
        Assert.assertTrue(favoriurunler.mesaj.isDisplayed());
    }
}
