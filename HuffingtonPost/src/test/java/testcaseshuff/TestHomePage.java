package testcaseshuff;

import base.CommonAPI;
import pageobject.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI{

    @Test
    public void testMenu()throws InterruptedException{
        HomePage hmpg = PageFactory.initElements(driver, HomePage.class);
        hmpg.menu();
        hmpg.slctemail();
        navigateBack();
        hmpg.slcthuffFB();
        hmpg.slcthuffTwitter();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }
}
