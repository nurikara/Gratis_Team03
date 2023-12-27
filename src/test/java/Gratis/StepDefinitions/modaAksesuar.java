package Gratis.StepDefinitions;

import Gratis.Pages.ModaAksesuar_Page;
import Gratis.Utilities.Driver;
import Gratis.Utilities.MediaUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.io.IOException;

import static Gratis.Utilities.ReusableMethods.*;

public class modaAksesuar {

    ModaAksesuar_Page modaAksesuar_page = new ModaAksesuar_Page();
    @Then("Moda Aksesuar kategorisine tıklanır")
    public void modaAksesuarKategorisineTıklanır() {
     modaAksesuar_page.modaAksesuarButonu.click();
     waitFor(4);
    }

    @And("Moda Aksesuar kategorisinin açıldığı doğrulanır")
    public void modaAksesuarKategorisininAçıldığıDoğrulanır() {
        try {
            MediaUtils.takeScreenshotOfTheEntirePage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        waitFor(4);
    }

    @Then("Alt Kategoriler filtresinden herhangi bir ürün seçilir")
    public void altKategorilerFiltresindenHerhangiBirÜrünSeçilir() {
        modaAksesuar_page.MAcantaButonu.click();
        waitFor(4);
    }

    @And("İstenen ürün seçeneklerinin listelendiği doğrulanır")
    public void istenenÜrünSeçeneklerininListelendiğiDoğrulanır() {
        try {
            MediaUtils.takeScreenshotOfTheEntirePage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        waitFor(4);
    }

    @Then("Markalar filtresinden herhangi bir marka seçilir")
    public void markalarFiltresindenHerhangiBirMarkaSeçilir() {
     modaAksesuar_page.MAmarieClaireButonu.click();
     waitFor(4);
    }

    @And("Seçilen markanın listelendiği doğrulanır")
    public void seçilenMarkanınListelendiğiDoğrulanır() {
        try {
            MediaUtils.takeScreenshotOfTheEntirePage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        waitFor(4);
    }

    @Then("Fiyat filtresinde en az ve en çok yazılır")
    public void fiyatFiltresindeEnAzVeEnÇokYazılır() {
        scroll(modaAksesuar_page.MAfiyatTablosu);
        waitFor(2);
        sendKeysJS(modaAksesuar_page.MAenAzButonu,"400");
        waitFor(2);
        sendKeysJS(modaAksesuar_page.MAenCokButonu,"500");
        waitFor(2);
        clickElementByJS(modaAksesuar_page.MAfiyatEnterButonu);
        waitFor(4);
    }

    @And("Filtreleri Temizle butonuna tıklanır")
    public void butonunaTıklanır() {
        modaAksesuar_page.MAfiltreleriTemizleButonu.click();
        waitFor(4);
    }

    @And("Filtrenin temizlendiği doğrulanır")
    public void filtreninTemizlendiğiDoğrulanır() {
        try {
            MediaUtils.takeScreenshotOfTheEntirePage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        waitFor(4);
    }

    @Then("Sayfa kapatılır")
    public void sayfaKapatılır() {
        Driver.closeDriver();
    }
}
