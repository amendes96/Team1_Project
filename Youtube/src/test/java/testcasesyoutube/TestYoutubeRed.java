package testcasesyoutube;

import base.CommonAPI;
import home.YoutubeRed;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestYoutubeRed extends CommonAPI {

    @Test(priority = 1)
    public void testfreetrail() throws InterruptedException {
        YoutubeRed ytred = PageFactory.initElements(driver, YoutubeRed.class);
        ytred.freeTrial();
    }
    @Test(priority = 2)
    public void testfaq() throws InterruptedException {
        YoutubeRed faqytred = PageFactory.initElements(driver,YoutubeRed.class);
        faqytred.faq();
        ((JavascriptExecutor)driver).executeScript("scroll(0,4000)");
    }
}
