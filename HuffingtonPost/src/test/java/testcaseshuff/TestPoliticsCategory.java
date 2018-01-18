package testcaseshuff;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import politics.PoltitcsCategory;
import reporting.TestLogger;

public class TestPoliticsCategory extends CommonAPI{

    @Test
    public void testPolitics() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        PoltitcsCategory pc = PageFactory.initElements(driver,PoltitcsCategory.class);
        pc.slctpolitic();
    }
    @Test
    public void testTrump()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        PoltitcsCategory pcdt = PageFactory.initElements(driver,PoltitcsCategory.class);
        pcdt.slctTrump();
    }
}
