package testcasesyoutube;

import base.CommonAPI;
import home.YoutubeSettings;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestYoutubeSettings extends CommonAPI{

    @Test
    public void testsettings()throws InterruptedException{
        YoutubeSettings ytsttgs = PageFactory.initElements(driver, YoutubeSettings.class);
        ytsttgs.sttgs();
    }
}
