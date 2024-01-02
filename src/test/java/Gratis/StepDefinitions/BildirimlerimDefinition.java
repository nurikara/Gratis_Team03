package Gratis.StepDefinitions;

import Gratis.Pages.BildirimlerimPage;
import Gratis.Utilities.ConfigReader;
import Gratis.Utilities.Driver;
import Gratis.Utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class BildirimlerimDefinition {

    BildirimlerimPage bildirimlerimPage = new BildirimlerimPage();

    @Given("Kullanıcı Url ile Ana Sayfaya  Gider")
    public void kullanıcıUrlIleAnaSayfayaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("manage_Url"));
    }

    @Then("Kullanıcı Giriş Yap Butonu Tıklar")
    public void kullanıcı_giriş_yap_butonu_tıklar() {
        bildirimlerimPage.gırısYap.click();
        ReusableMethods.bekle(3);


    }

    @And("Kullanıcı Giriş yap Butonuna Tekrar Tıklar")
    public void kullanıcıGirisYapButonunaTekrarTıklar() {
        bildirimlerimPage.girişYap.click();
    }

    @Then("Kullanıcı Email Bilgisini Girer")
    public void kullanıcı_email_bilgisini_girer() {
        bildirimlerimPage.emailGir.sendKeys(ConfigReader.getProperty("mail"), Keys.ENTER);
    }

    @Then("Kullanıcı Password Bilgisini Girer")
    public void kullanıcı_password_bilgisini_girer() {
        bildirimlerimPage.passwordGir.sendKeys(ConfigReader.getProperty("password"), Keys.ENTER);
        ReusableMethods.bekle(3);

    }

    @And("Kullanıcı Hesabım Tıklar")
    public void kullanıcıHesabımTıklar() {
        bildirimlerimPage.hesabımaTıkla.click();
        ReusableMethods.bekle(3);

        Driver.getDriver().manage().window().fullscreen();
    }

    @Then("Kullanıcı Açılan Sayfada Bildirimler Tıklar ve Bildirimleri Görüntüler")
    public void kullanıcı_açılan_sayfada_bildirimler_tıklar_ve_bildirimleri_görüntüler() {

        bildirimlerimPage.bildirimlerTıkla.click();
        ReusableMethods.bekle(3);

        Assert.assertTrue("Bildirimler", bildirimlerimPage.bildirimlerGoruldu.isDisplayed());
    }


    @Then("sayfayı closed")
    public void sayfayıClosed() {
        Driver.closeDriver();
    }
}
