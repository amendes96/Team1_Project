package home;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class SearchClass extends CommonAPI{

    @FindBy(id = "search")
    WebElement searchBar;

    @FindBy(id = "search-icon-legacy")
    WebElement clcksearch;

    public void searchFor(String value){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+" "+ value);
        searchBar.sendKeys(value);
    }
    public void submitSearch(){
        clcksearch.click();
    }

    public void searching() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchFor("Music");
        submitSearch();
        Thread.sleep(3000);
        searchBar.sendKeys(Keys.BACK_SPACE);
        searchBar.sendKeys(Keys.BACK_SPACE);
        searchBar.sendKeys("ic", Keys.ENTER);
        Thread.sleep(3000);
    }
}
