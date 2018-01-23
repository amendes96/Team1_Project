package datadriven;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

/**
 * Created by SharifRafiq on 1/19/2018.
 */
public class SearchItems extends CommonAPI {
    @FindBy(how = How.CSS, using ="#gh-search-input")
    public static WebElement searchInputWebElement;
    @FindBy(how = How.CSS, using =".search-input")
    public static WebElement submitButtonWebElement;

    public static WebElement getSearchInputWebElement() {
        return searchInputWebElement;
    }
    public static WebElement getSubmitButtonWebElement() {
        return submitButtonWebElement;
    }
    public void searchFor(String value){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+" "+ value);
        getSearchInputWebElement().sendKeys(value);
    }
    public void submitSearchButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSubmitButtonWebElement().click();
    }
    public void clearInput(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSearchInputWebElement().clear();
    }
//    public void searchItemsAndSubmitButton() throws IOException, InterruptedException {
//        TestLogger.log(getClass().getSimpleName() + ": " + (new Object(){}.getClass().getEnclosingMethod().getName()));
//        ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();
//        String [] value = itemsToBeSearched.getDataFromExcelFile();
//        for(int i=0; i<value.length; i++) {
//            sleepFor(1);
//            searchFor(value[i]);
//            sleepFor(1);
//            submitSearchButton();
//            sleepFor(1);
//            clearInput();
//        }
    }
