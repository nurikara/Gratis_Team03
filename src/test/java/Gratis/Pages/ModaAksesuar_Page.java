package Gratis.Pages;

import Gratis.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModaAksesuar_Page {
    public ModaAksesuar_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[@href='/moda-aksesuar-c-509'])[2]")
    public WebElement modaAksesuarButonu;

    @FindBy(xpath = "(//*[@class='label ng-star-inserted'])[3]")
    public WebElement MAcantaButonu;

    @FindBy(xpath = "(//*[@class='value facet-value-link facet-value-link-for-multi-select ng-star-inserted'])[3]")
    public WebElement MAmarieClaireButonu;

    @FindBy(xpath = "(//*[@class='head ng-star-inserted'])[2]")
    public WebElement MAfiyatTablosu;

    @FindBy(xpath = "(//input)[4]")
    public WebElement MAenAzButonu;
     @FindBy(xpath = "(//input)[5]")
    public WebElement MAenCokButonu;

     @FindBy(xpath = "(//*[@class='apply'])[1]")
    public WebElement MAfiyatEnterButonu;

     @FindBy(xpath = "//*[@class='filter-clear']")
    public WebElement MAfiltreleriTemizleButonu;


}
