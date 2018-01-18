package testcaseshuff;

import base.CommonAPI;
import news.News;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestNews extends CommonAPI{

    @Test
    public void testUsNews() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        News nwus = PageFactory.initElements(driver, News.class);
        nwus.usNewsfun();
    }
    @Test
    public void testWorldnews() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        News nwworld = PageFactory.initElements(driver, News.class);
        nwworld.worldNewsfun();
    }
    @Test
    public void testHighline()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        News nwhigh = PageFactory.initElements(driver,News.class);
        nwhigh.highlinefun();
    }
    @Test
    public void testcrime()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        News nwcrime = PageFactory.initElements(driver,News.class);
        nwcrime.crimefun();
    }
    @Test
    public void testBusiness()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        News nwbuss = PageFactory.initElements(driver,News.class);
        nwbuss.businessfun();
    }
    @Test
    public void testtech()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        News nwtech = PageFactory.initElements(driver,News.class);
        nwtech.techfun();
    }
    @Test
    public void testWeirdNews()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        News nwweird = PageFactory.initElements(driver,News.class);
        nwweird.weirdfun();
    }
    @Test
    public void testscope()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        News nwscope = PageFactory.initElements(driver,News.class);
        nwscope.scopefun();
    }
}
