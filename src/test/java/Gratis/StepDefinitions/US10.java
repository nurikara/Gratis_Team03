package Gratis.StepDefinitions;

import Gratis.Pages.Favoriurunler_Page;
import Gratis.Pages.Home_Page;
import Gratis.Utilities.ReusableMethods;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;

public class US10 {
    Home_Page home = new Home_Page();
    Favoriurunler_Page favoriurunler=new Favoriurunler_Page();




    @Then("Arama kutusuna sampuan yazar ve cikan ilk urunu  favorilerim'e ekler")
    public void aramaKutusunaSampuanYazarVeCikanIlkUrunuFavorilerimEEkler() {
        home.aramaKutusu.sendKeys("sampuan", Keys.ENTER);
        favoriurunler.ilkfavoriurun.click();
    }
}
