package Gratis.Pages;


import Gratis.Utilities.Driver;
import Gratis.Utilities.ReusableMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Home_Page {



    public Home_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//a[@class=\"log-box dropper ng-star-inserted\"]")
    public WebElement girisYapDropeDown;
    @FindBy (xpath = "//a[text()=' Giriş Yap ']")
    public WebElement girisYap;
    @FindBy (xpath = "//span[@class=\"high-text\"]")
    public WebElement kullaniciAdi;
    @FindBy (xpath = "//a[@href=\"/logout\"]")
    public WebElement logout;
    @FindBy (xpath = "(//*[text()='Elektrikli Ürünler'])[2]")
    public WebElement elektrikliUrunler;
    @FindBy (xpath = "(//*[@class=\"search-input\"])[1]")
    public WebElement aramaKutusu;



}
