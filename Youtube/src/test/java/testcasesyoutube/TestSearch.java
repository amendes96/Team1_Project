package testcasesyoutube;

import base.CommonAPI;
import home.SearchClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSearch extends CommonAPI{

    @Test
    public void testSearch() throws InterruptedException {
        SearchClass search = PageFactory.initElements(driver, SearchClass.class);
        search.searching();
    }
}
