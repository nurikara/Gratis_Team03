package Gratis.Pages;


import Gratis.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Login_Page {

    public Login_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "ddgdsfg")
    public WebElement locate;
    @FindBy (xpath = "ddgdsfg")
    public List<WebElement> locate2;
}
