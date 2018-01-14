package testcases;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import theModel.Energy;

public class TestEnergy extends CommonAPI{

    @Test
    public void freeEstimate(){
        Energy en = PageFactory.initElements(driver, Energy.class);
        en.freeEstimate();
    }
}
