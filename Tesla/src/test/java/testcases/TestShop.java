package testcases;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import theModel.Shop;

public class TestShop extends CommonAPI{

    @Test
    public void shopping() {
        Shop sp = PageFactory.initElements(driver, Shop.class);
        sp.shopping();
    }
}
