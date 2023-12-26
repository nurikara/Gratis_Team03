package Gratis.StepDefinitions;

import Gratis.Pages.Elektrikliurunler_Page;
import Gratis.Pages.Home_Page;
import Gratis.Utilities.ReusableMethods;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US07 {
    Home_Page home = new Home_Page();
    Elektrikliurunler_Page elektriktrikliurunler=new Elektrikliurunler_Page();

    @Then("Kullanici Elektrikli urunler  sekmesine tiklar")
    public void kullaniciElektrikliUrunlerSekmesineTiklar() {

        ReusableMethods.click(home.elektrikliUrunler);
        ReusableMethods.bekle(3);
    }

    @Then("Kullanici Stokta Var kutucuguna tiklar")
    public void kullaniciStoktaVarKutucugunaTiklar() {
        ReusableMethods.click(elektriktrikliurunler.stoktaVar);
        ReusableMethods.bekle(3);
    }

    @Then("Kullanici stokta olan urunlerin listelendigini dogrular")
    public void kullaniciStoktaOlanUrunlerinListelendiginiDogrular() {
        Assert.assertEquals("listeleniyor",elektriktrikliurunler.urunlistesiyazisi);
    }

}
