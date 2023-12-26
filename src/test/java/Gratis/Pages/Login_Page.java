package Gratis.Pages;

import Gratis.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
    public Login_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@formcontrolname=\"userId\"]")
    public WebElement mail;
    @FindBy (xpath = "//input[@formcontrolname=\"password\"]")
    public WebElement password;
    @FindBy (xpath = "//button[text()=\"GİRİŞ YAP\"]")
    public WebElement girisYap;


}
