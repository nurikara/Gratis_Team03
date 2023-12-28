package Gratis.Pages;

import Gratis.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CokSatanlar_Page {

    public CokSatanlar_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[@href='/sac-bakim-c-503'])[2]")
    public WebElement US03sacBakımButonu;

    @FindBy(id = "ad57c5e7e0fb")
    public WebElement US03ddmMenusu;

    @FindBy(xpath = "//*[@id='a0749d2c3a28-4']")
    public WebElement US03enCokSatanlar;

    @FindBy(xpath = "//h2")
    public WebElement US03kategorininCokSatanlarıYazısı;

    @FindBy(xpath = "(//*[@class='label ng-star-inserted'])[2]")
    public WebElement US03sacKremleriButonu;




}
