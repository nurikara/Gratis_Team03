package Gratis.Hooks;

import Gratis.Utilities.Driver;
import io.cucumber.java.*;


import java.time.Duration;

public class Hooks {
    @Before()
    public void before_ui(){
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Driver.getDriver().manage().window().maximize();
    }

    @After()
    public void tearDown() {

        Driver.closeDriver();
    }
}
