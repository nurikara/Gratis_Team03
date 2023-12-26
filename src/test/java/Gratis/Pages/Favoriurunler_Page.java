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



}
