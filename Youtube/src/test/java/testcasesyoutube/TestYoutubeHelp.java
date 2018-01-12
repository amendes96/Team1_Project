package testcasesyoutube;

import base.CommonAPI;
import home.YoutubeHelp;
import home.YoutubeSettings;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestYoutubeHelp extends CommonAPI{

    @Test
    public void helpbutton()throws InterruptedException{
        YoutubeHelp hlp = PageFactory.initElements(driver, YoutubeHelp.class);
        hlp.help();
    }
}
