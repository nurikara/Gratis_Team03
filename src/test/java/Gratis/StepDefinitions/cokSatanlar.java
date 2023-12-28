package Gratis.StepDefinitions;

import Gratis.Pages.CokSatanlar_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;

import static Gratis.Utilities.ReusableMethods.*;

public class cokSatanlar {
    CokSatanlar_Page cokSatanlar_page = new CokSatanlar_Page();
    JavascriptExecutor jsExecutor;
    @Then("Herhangi bir kategoriye tıkla")
    public void herhangiBirKategoriyeTıkla() {
        cokSatanlar_page.US03sacBakımButonu.click();
        waitFor(3);
    }

    @And("Akıllı sıralama ddm menüsüne tıkla")
    public void akıllıSıralamaDdmMenüsüneTıkla() {
        // JavaScriptExecutor'ı oluşturma
        // JavaScript kodunu çalıştırarak ng-select dropdown'u açma
        click(cokSatanlar_page.US03ddmMenusu);

    }

    @Then("En çok satanlar seçeneğine tıkla")
    public void enÇokSatanlarSeçeneğineTıkla() {
        click(cokSatanlar_page.US03enCokSatanlar);
    }

    @And("Kategorinin Çok Satanları başlığının görüldüğünü doğrula")
    public void kategorininÇokSatanlarıBaşlığınınGörüldüğünüDoğrula() {
        cokSatanlar_page.US03kategorininCokSatanlarıYazısı.isDisplayed();
        waitFor(3);
    }

    @Then("Alt kategoriden herhangi bir ürün seç")
    public void altKategoridenHerhangiBirÜrünSeç() {
        cokSatanlar_page.US03sacKremleriButonu.click();
        waitFor(3);
    }

    @And("Açılan seçeneklerde Kategorinin Çok Satanları başlığının görüldüğünü doğrula")
    public void açılanSeçeneklerdeKategorininÇokSatanlarıBaşlığınınGörüldüğünüDoğrula() {
        cokSatanlar_page.US03kategorininCokSatanlarıYazısı.isDisplayed();
        waitFor(3);
    }
}
