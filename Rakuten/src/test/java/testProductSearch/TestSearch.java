package testProductSearch;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import productSearch.Search;

public class TestSearch extends CommonAPI {

    @Test
    public void okSearch() {
        Search se = PageFactory.initElements(driver, Search.class);
        se.okSearch();
    }
}
