package googlesheetspage;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import search.SearchbyElement;

public class TestSearchByElement extends CommonAPI{

    @Test
    public void testingsearch()throws InterruptedException{
        SearchbyElement srch = PageFactory.initElements(driver,SearchbyElement.class);
        srch.searchforMusic();
    }
}
