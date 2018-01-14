package testcases;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageobject.DropDownMenu;

public class TestDropDownMenu extends CommonAPI{

    @Test
    public void testDropDownMenu(){
        DropDownMenu dropDownMenu = PageFactory.initElements(driver, DropDownMenu.class);
        dropDownMenu.dropDown();
    }
    @Test
    public void testMouseHover(){
        DropDownMenu dropDownMenu = PageFactory.initElements(driver, DropDownMenu.class);
        dropDownMenu.mouseHover();
    }
}
