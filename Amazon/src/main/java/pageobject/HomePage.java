package pageobject;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI{

    @FindBy(css = "#nav-logo > a.nav-logo-link > span.nav-logo-base.nav-sprite")
    WebElement logo;

    @FindBy(id = "twotabsearchtextbox")
    WebElement searchBox;

    @FindBy(xpath = "//*[@id=\"nav-search\"]/form/div[2]/div/input")
    WebElement  searchButton;

    @FindBy(css = "#nav-xshop > a:nth-child(3)")
    WebElement todaysDeals;

    @FindBy(css = "#nav-xshop > a:nth-child(4)")
    WebElement giftCards;

    @FindBy(css = "#nav-xshop > a:nth-child(5)")
    WebElement registry;

    @FindBy(css = "#nav-xshop > a:nth-child(6)")
    WebElement sell;

    @FindBy(css = "#nav-xshop > a:nth-child(7)")
    WebElement help;

    @FindBy(css = "#nav-orders > span.nav-line-2")
    WebElement orders;

    @FindBy(css = "#nav-link-prime > span.nav-line-2")
    WebElement linkPrime;

    @FindBy(css = "#nav-cart > span.nav-line-2")
    WebElement cart;

    @FindBy(xpath = "//*[@id=\"navSwmHoliday\"]/a")
    WebElement newYear;

    @FindBy(xpath = "//*[@id=\"image-shoveler-ns_1JM3G6MFMWFCPG3HMSNC_2273_\"]/div[2]/div/ul/li[3]/span/a/img")
    WebElement sports;

    @FindBy(css = "#navFooter > div.navFooterVerticalColumn.navAccessibility > div > div:nth-child(1) > ul > li.nav_first > a")
    WebElement careers;

    public void gotoHomepage(){
        logo.click();
    }

    public void searching(){
        searchBox.sendKeys("pents");
        searchButton.click();
    }
    public  void gotoTodaysDeals(){
        todaysDeals.click();
    }
    public void gotoGiftCards(){
        giftCards.click();
    }
    public void gotoRegistry(){
        registry.click();
    }
    public void gotoSell(){
        sell.click();
    }
    public void  gotoHelp(){
        help.click();
    }
    public void gotoOrders(){
        orders.click();
    }
    public void gotoLinkPrime(){
        linkPrime.click();
    }
    public void gotoCart(){
        cart.click();
    }
    public void gotoNewYear(){
        newYear.click();
    }
    public void gotoSports(){
        sports.click();
    }
    public void gotoCareers(){
        careers.click();
    }
}
