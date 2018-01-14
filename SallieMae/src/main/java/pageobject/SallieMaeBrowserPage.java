package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SallieMaeBrowserPage {

    @FindBy(css = "#search > a")
    WebElement searchButton;

    @FindBy(css = "#nav > ul > li:nth-child(2) > a.tier1.rootHrefOverride.sameheight_handled")
    WebElement searchStudentloans;

    @FindBy(css = "#nav > ul > li:nth-child(3) > a.tier1.sameheight_handled")
    WebElement searchCollegePlanning;

    @FindBy(css = "#nav > ul > li:nth-child(4) > a.tier1.sameheight_handled")
    WebElement searchSaveforcollage;

    @FindBy(xpath = "//*[@id=\"nav\"]/ul/li[5]/a[2]")
    WebElement searchBanking;

//    @FindBy(id = "#logo")
//    WebElement logo;
//    public void gotoLogo(){
//      logo.click();
//    }
    public void gotoSearchButton() {
        searchButton.click();
    }
    public void gotoStudentloans(){
        searchStudentloans.click();
    }
    public void gotoCollegePlanning(){
        searchCollegePlanning.click();
    }
    public void gotoSaveforcollage(){
        searchSaveforcollage.click();
    }
    public void gotoBanking(){
        searchBanking.click();
    }
}
