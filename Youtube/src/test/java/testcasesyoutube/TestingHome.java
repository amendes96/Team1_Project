package testcasesyoutube;

import base.CommonAPI;
import com.gargoylesoftware.htmlunit.Page;
import home.Home;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestingHome extends CommonAPI{

    @Test(priority = 1)
    public void testHistory() throws InterruptedException {
        Home hm = PageFactory.initElements(driver, Home.class);
        String expectedUrl = "www.youtube.com";
        hm.history();
        //Assert.assertTrue(isCorrectUrl().contains(expectedUrl));
        System.out.println("Current URL: " + getCurrentPageUrl());
    }
    @Test(priority = 2)
    public void testTrendingpg()throws InterruptedException{
        Home tr = PageFactory.initElements(driver, Home.class);
        tr.trendingpage();
    }
    @Test(priority = 3)
    public void subscription()throws InterruptedException{
        Home subsc = PageFactory.initElements(driver,Home.class);
        subsc.subs();
    }
    @Test(priority = 4)
    public void red()throws InterruptedException{
        Home utubered = PageFactory.initElements(driver, Home.class);
        utubered.youtubered();
    }
    @Test(priority = 5)
    public void youtubemovies() throws InterruptedException{
        Home mvs = PageFactory.initElements(driver,Home.class);
        mvs.movies();
        Thread.sleep(2000);
        ((JavascriptExecutor)driver).executeScript("scroll(0,4000)");
    }
    @Test(priority = 6)
    public void settings()throws InterruptedException{
        Home sttgs = PageFactory.initElements(driver,Home.class);
        sttgs.youtubesettings();
        System.out.println("Above this is for testing the Youtube home page");
    }
    @Test(priority = 7)
    public void testaccount()throws InterruptedException{
        Home acc = PageFactory.initElements(driver,Home.class);
        acc.accountinfo();
    }
    @Test(priority = 8)
    public void testHelp()throws InterruptedException{
        Home hlp = PageFactory.initElements(driver,Home.class);
        hlp.utubehlp();
    }
}
