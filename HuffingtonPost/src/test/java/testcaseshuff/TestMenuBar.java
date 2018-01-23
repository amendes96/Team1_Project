package testcaseshuff;

import base.CommonAPI;
import pageobject.MenuBar;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestMenuBar extends CommonAPI{

    @Test
    public void testMenuBar() throws InterruptedException {
        MenuBar mnbr = PageFactory.initElements(driver, MenuBar.class);
        System.out.println(driver.getTitle() + " " + driver.getCurrentUrl());
        mnbr.menuBar();
    }
}
