package testcases;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import theModel.Energy;
import theModel.TestDrive;

public class TestingtestDrive extends CommonAPI{

    @Test
    public void freeDriving(){
        TestDrive dr = PageFactory.initElements(driver, TestDrive.class);
        dr.freeDriving();
    }
}
