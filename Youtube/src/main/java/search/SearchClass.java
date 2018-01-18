package search;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import java.io.IOException;

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

    public void searching() throws InterruptedException, IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();
        String [] value = itemsToBeSearched.getDataFromExcelFile();
        for(int i=0; i<value.length; i++) {
            sleepFor(1);
            searchFor(value[i]);
            Thread.sleep(2000);
            submitSearch();
            Thread.sleep(2000);
        }
//        searchFor("Music");
//        submitSearch();
//        Thread.sleep(3000);
//        searchBar.sendKeys(Keys.BACK_SPACE);
//        searchBar.sendKeys(Keys.BACK_SPACE);
//        searchBar.sendKeys("ic", Keys.ENTER);
//        Thread.sleep(3000);
    }
}
