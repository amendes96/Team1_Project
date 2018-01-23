package testcaseshuff;

import base.CommonAPI;
import pageobject.SubscribeForNews;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSubscribeNews extends CommonAPI{

    @Test
    public void testSubscribeforAllNews() throws InterruptedException {
        SubscribeForNews scn = PageFactory.initElements(driver, SubscribeForNews.class);
        scn.subscribetoall();
    }
    @Test
    public void testmorningmail() throws InterruptedException {
        SubscribeForNews scnm = PageFactory.initElements(driver,SubscribeForNews.class);
        scnm.subtomorningemail();
    }
    @Test
    public void testgoodlife()throws InterruptedException{
        SubscribeForNews subgl = PageFactory.initElements(driver,SubscribeForNews.class);
        subgl.subtogoodlife();
    }
    @Test
    public void testentertainment() throws InterruptedException{
        SubscribeForNews subent = PageFactory.initElements(driver,SubscribeForNews.class);
        subent.subtoentertainment();
    }
    @Test
    public void testfunniesttweets()throws InterruptedException{
        SubscribeForNews subfun = PageFactory.initElements(driver,SubscribeForNews.class);
        subfun.subtofunniesttweets();
    }
    @Test
    public void testpolitics()throws InterruptedException{
        SubscribeForNews subpol = PageFactory.initElements(driver,SubscribeForNews.class);
        subpol.subtopolitics();
    }
    @Test
    public void testinfo()throws InterruptedException{
        SubscribeForNews subinfo = PageFactory.initElements(driver,SubscribeForNews.class);
        subinfo.subtoinformation();
    }
    @Test
    public void testnewworld()throws InterruptedException{
        SubscribeForNews subnew = PageFactory.initElements(driver,SubscribeForNews.class);
        subnew.subtonewworld();
    }
    @Test
    public void testroyalnews()throws InterruptedException{
        SubscribeForNews subroyal = PageFactory.initElements(driver,SubscribeForNews.class);
        subroyal.subtoroyalnews();
    }
}
