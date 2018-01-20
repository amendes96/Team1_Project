package testcasesyoutube;

import base.CommonAPI;
import com.gargoylesoftware.htmlunit.Page;
import home.Home;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestingHome extends CommonAPI{

    @Test
    public void testHistory() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Home hm = PageFactory.initElements(driver, Home.class);
        String expectedUrl = "www.youtube.com";
        hm.history();
        System.out.println("Current URL: " + getCurrentPageUrl());
        ((JavascriptExecutor)driver).executeScript("scroll(0,4000)");
    }
    @Test
    public void testTrendingpg()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Home tr = PageFactory.initElements(driver, Home.class);
        tr.trendingpage();
        ((JavascriptExecutor)driver).executeScript("scroll(0,4000)");
    }
    @Test
    public void red()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Home utubered = PageFactory.initElements(driver, Home.class);
        utubered.youtubered();
    }
    @Test
    public void youtubemovies() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Home mvs = PageFactory.initElements(driver,Home.class);
        mvs.movies();
        Thread.sleep(2000);
        ((JavascriptExecutor)driver).executeScript("scroll(0,4000)");
    }
    @Test
    public void settings()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Home sttgs = PageFactory.initElements(driver,Home.class);
        sttgs.youtubesettings();
        ((JavascriptExecutor)driver).executeScript("scroll(0,4000)");
    }
    @Test
    public void testaccount()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Home acc = PageFactory.initElements(driver,Home.class);
        acc.accountinfo();
        ((JavascriptExecutor)driver).executeScript("scroll(0,4000)");
    }
    @Test
    public void subscription()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Home subsc = PageFactory.initElements(driver,Home.class);
        subsc.subs();
        ((JavascriptExecutor)driver).executeScript("scroll(0,4000)");
    }
    @Test
    public void testHelp()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Home hlp = PageFactory.initElements(driver, Home.class);
        hlp.utubehlp();
    }
}