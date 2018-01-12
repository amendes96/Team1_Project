package testcasesyoutube;

import base.CommonAPI;
import home.Home;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestingHome extends CommonAPI{

    @Test
    public void testHistory() throws InterruptedException {
        Home hm = PageFactory.initElements(driver, Home.class);
        System.out.println("Above this is for testing the Youtube home page");
        System.out.println("Current URL: " + getCurrentPageUrl());
        hm.history();
        navigateBack();
        hm.trendingpage();
        navigateBack();
        hm.subs();
        navigateBack();
        Thread.sleep(2000);
        hm.youtubered();
        navigateBack();
        hm.movies();
        hm.youtubesettings();
        goBackToHomeWindow();
    }
}
