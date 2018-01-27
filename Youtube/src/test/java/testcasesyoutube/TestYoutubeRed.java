package testcasesyoutube;

import base.CommonAPI;
import pageobject.YoutubeRed;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestYoutubeRed extends CommonAPI {

    @Test
    public void testfreetrail() throws InterruptedException {
        YoutubeRed ytred = PageFactory.initElements(driver, YoutubeRed.class);
        ytred.freeTrial();
    }
    @Test
    public void testfaq() throws InterruptedException {
        YoutubeRed faqytred = PageFactory.initElements(driver,YoutubeRed.class);
        faqytred.faq();
        ((JavascriptExecutor)driver).executeScript("scroll(0,4000)");
    }
    @Test
    public void testfamilymembership() throws InterruptedException{
        YoutubeRed fam = PageFactory.initElements(driver, YoutubeRed.class);
        fam.familyMembership();
    }
    @Test
    public void testrestrictions() throws InterruptedException{
        YoutubeRed rest = PageFactory.initElements(driver, YoutubeRed.class);
        rest.restrictions();
    }
}
