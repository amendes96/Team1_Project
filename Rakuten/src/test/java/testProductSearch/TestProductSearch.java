package testProductSearch;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import productSearch.Category;

public class TestProductSearch extends CommonAPI{

    @Test
    public void allCategory() {
        Category ac = PageFactory.initElements(driver, Category.class);
        ac.allCategory();
        ((JavascriptExecutor)driver).executeScript("scroll(0,4000");
    }

    @Test
    public void testClothes() throws InterruptedException {
        Category cl = PageFactory.initElements(driver, Category.class);
        cl.clothes();
        ((JavascriptExecutor)driver).executeScript("scroll(0,4000");
    }
    @Test
    public void testhomeItems()throws InterruptedException{
        Category hm = PageFactory.initElements(driver, Category.class);
        hm.homeItems();
    }
    @Test
    public void testbeautyItems()throws InterruptedException{
        Category beauty = PageFactory.initElements(driver, Category.class);
        beauty.beatyItems();
    }
    @Test
    public void testHealth()throws InterruptedException{
        Category hlth = PageFactory.initElements(driver, Category.class);
        hlth.healthItems();
    }
}