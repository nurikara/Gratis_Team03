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
}
