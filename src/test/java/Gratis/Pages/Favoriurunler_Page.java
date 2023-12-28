package Gratis.Pages;

import Gratis.Utilities.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Favoriurunler_Page {
    public Favoriurunler_Page(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[@class='add-btns add-to-fav cx-action-link category-page-add-button ng-star-inserted'])[1]")
    public WebElement ilkfavoriurun;
    @FindBy(xpath = " //*[@placeholder='Adı']")
    public WebElement istekListesiAdi;
    @FindBy(xpath = "//*[@class='round-btns ng-star-inserted']")
    public WebElement istekListesiEkle;
    @FindBy(xpath = " //a[text()=' Favorilerim ']")
    public WebElement favorilerim;
    @FindBy(xpath = "//*[@class='cx-product-image is-initialized']")
    public WebElement favoriurun;
    @FindBy(xpath = "//*[@class='edit']")
    public WebElement listeAdiDuzenle;

    @FindBy(xpath = "//*[@class='round-btns ng-star-inserted']")
    public WebElement istekListesiKaydet;

    @FindBy(xpath = "//*[@class='delete']")
    public WebElement sil;

    @FindBy(xpath = "//*[@class='btn cc-button cc-button-primary']")
    public WebElement istekListesiSil;
    @FindBy(xpath = "(//*[@class='highlighted'])[2]")
    public WebElement mesaj;















}
