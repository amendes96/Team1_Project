package testcasesyoutube;

import base.CommonAPI;
import pageobject.FeedbackYoutube;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestFeedback extends CommonAPI{

    @Test
    public void testFeedback()throws InterruptedException{
        FeedbackYoutube fdback = PageFactory.initElements(driver, FeedbackYoutube.class);
        fdback.sndfeedback();
    }
}
