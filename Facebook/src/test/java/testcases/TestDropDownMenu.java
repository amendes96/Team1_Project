package testcases;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageobject.DropDownMenu;

public class TestDropDownMenu extends CommonAPI{

    @Test
    public void drop() throws InterruptedException {
        DropDownMenu dropDownMenu = PageFactory.initElements(driver, DropDownMenu.class);
        dropDownMenu.getMenus();
    }
}
