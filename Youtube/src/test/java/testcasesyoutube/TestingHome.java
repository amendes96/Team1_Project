package testcasesyoutube;

import base.CommonAPI;
import com.gargoylesoftware.htmlunit.Page;
import home.Home;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestingHome extends CommonAPI{

//    @Test
//    public void testHistory() throws InterruptedException {
//        Home hm = PageFactory.initElements(driver, Home.class);
//        System.out.println("Current URL: " + getCurrentPageUrl());
//        hm.history();
//    }
//    @Test
//    public void testTrendingpg()throws InterruptedException{
//        Home tr = PageFactory.initElements(driver, Home.class);
//        tr.trendingpage();
//    }
//    @Test
//    public void subscription()throws InterruptedException{
//        Home subsc = PageFactory.initElements(driver,Home.class);
//        subsc.subs();
//    }
//    @Test
//    public void red()throws InterruptedException{
//        Home utubered = PageFactory.initElements(driver, Home.class);
//        utubered.youtubered();
//    }
    @Test
    public void youtubemovies() throws InterruptedException{
        Home mvs = PageFactory.initElements(driver,Home.class);
        mvs.movies();
        Thread.sleep(2000);
        ((JavascriptExecutor)driver).executeScript("scroll(0,4000)");
    }
//    @Test
//    public void settings()throws InterruptedException{
//        Home sttgs = PageFactory.initElements(driver,Home.class);
//        sttgs.youtubesettings();
//        System.out.println("Above this is for testing the Youtube home page");
//    }
}
