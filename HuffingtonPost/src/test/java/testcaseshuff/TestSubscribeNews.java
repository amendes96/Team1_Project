package testcaseshuff;

import base.CommonAPI;
import home.SubscribeForNews;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSubscribeNews extends CommonAPI{

    @Test
    public void testSubscribeforNews() throws InterruptedException {
        SubscribeForNews scn = PageFactory.initElements(driver, SubscribeForNews.class);
        scn.subscribe();
    }
}
