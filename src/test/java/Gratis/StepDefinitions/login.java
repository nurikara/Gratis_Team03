package Gratis.StepDefinitions;

import Gratis.Utilities.ConfigReader;
import Gratis.Utilities.Driver;
import io.cucumber.java.en.Given;

public class login {

    @Given("amazon sayfasina gidilir")
    public void amazon_sayfasina_gidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("manage_Url"));

    }
}
