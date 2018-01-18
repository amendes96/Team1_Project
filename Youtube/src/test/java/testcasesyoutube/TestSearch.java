package testcasesyoutube;

import base.CommonAPI;
import reporting.TestLogger;
import search.SearchClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestSearch extends CommonAPI{

    @Test
    public void testSearch() throws InterruptedException, IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchClass search = PageFactory.initElements(driver, SearchClass.class);
        search.searching();
    }
}
