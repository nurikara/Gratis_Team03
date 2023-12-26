package Gratis.Pages;

import Gratis.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elektrikliurunler_Page {
    public Elektrikliurunler_Page(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//*[@data-cx-focus='true'])[1]")
    public WebElement stoktaVar;
    @FindBy(xpath = "//*[@class='info']")
    public WebElement urunlistesiyazisi;



}
