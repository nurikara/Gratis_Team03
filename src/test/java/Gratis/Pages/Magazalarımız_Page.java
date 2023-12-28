package Gratis.Pages;

import Gratis.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Magazalarımız_Page {

    public Magazalarımız_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[@href='/magazalarimiz'])[1]")
    public WebElement magazalarımızButonu;

    @FindBy(xpath = "(//*[@class='city-name'])[41]")
    public WebElement izmirSecenegi;

    @FindBy(xpath = "//h2")
    public WebElement izmirMagazalarımızYazisi;

    @FindBy(xpath = "(//*[@class='city-name'])[16]")
    public WebElement konakSecenegi;

    @FindBy(xpath = "//h2")
    public WebElement konakMagazalarımızYazısı;

    @FindBy(xpath = "(//*[@class='si-title'])[2]")
    public WebElement herhangiMagaza;

    @FindBy(xpath = "//address")
    public WebElement magazaAdresi;


}
