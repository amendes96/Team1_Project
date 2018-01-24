package testentertainment;

import base.CommonAPI;
import entertainment.Entertainment;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestingEntertainment extends CommonAPI{

    @Test
    public void testentertainment()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Entertainment en = PageFactory.initElements(driver,Entertainment.class);
        en.slctEntertainment();
        //Assert.assertTrue("true");
        Thread.sleep(2000);
    }
    @Test
    public void testculture()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Entertainment cn = PageFactory.initElements(driver,Entertainment.class);
        cn.slctCulture();
        //Assert.assertTrue("True");
        Thread.sleep(2000);
    }
    @Test
    public void testmedia()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Entertainment md = PageFactory.initElements(driver,Entertainment.class);
        md.slctMedia();
        Thread.sleep(2000);
    }
}
