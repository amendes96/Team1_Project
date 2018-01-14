package testcases;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageobject.HomePage;

public class TestHomePage extends CommonAPI{

    @Test
    public void testSearch() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.search();
    }
    @Test
    public void testLangChangeEnglishToChinese() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.langChangeEnglishToChinese();
    }
}
