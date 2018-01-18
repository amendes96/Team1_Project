package news;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class News extends CommonAPI{

    @FindBy(xpath = "//div[@data-ylk='slk:hamburger-open']")
    WebElement openMenu;

    @FindBy(xpath = "//a[@href='/section/us-news']")
    WebElement usNews;

    @FindBy(xpath = "//a[@href='/section/world-news']")
    WebElement worldNews;

    @FindBy(xpath = "//a[@href='http://highline.huffingtonpost.com/']")
    WebElement highline;

    @FindBy(xpath = "//a[@href='/section/crime']")
    WebElement crime;

    @FindBy(xpath = "//a[@href='/section/business']")
    WebElement business;

    @FindBy(xpath = "//a[@href='/section/technology']")
    WebElement tech;

    @FindBy(xpath = "//a[@href='/section/green']")
    WebElement green;

    @FindBy(xpath = "//a[@href='/section/weird-news']")
    WebElement weirdNews;

    @FindBy(xpath = "//a[@href='/topic/the-scope']")
    WebElement theScope;

    public void slctUSNews() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        openMenu.click();
        usNews.getLocation();
        usNews.click();
    }
    public void slctWorldNews(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        openMenu.click();
        worldNews.click();
    }
    public void slctHighline(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        openMenu.click();
        highline.click();
    }
    public void slctCrime(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        openMenu.click();
        crime.click();
    }
    public void slctBusiness(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        openMenu.click();
        business.click();
    }
    public void slctTech(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        openMenu.click();
        tech.click();
    }
    public void slctgreen(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        openMenu.click();
        green.click();
    }
    public void slctweirdnews(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        openMenu.click();
        weirdNews.click();
    }
    public void slctscope(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        openMenu.click();
        theScope.click();
    }
    public void usNewsfun() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        slctUSNews();
        Thread.sleep(2000);
    }
    public void worldNewsfun() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        slctWorldNews();
        Thread.sleep(2000);
    }
    public void highlinefun()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        slctHighline();
        Thread.sleep(2000);
    }
    public void crimefun()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        slctCrime();
        Thread.sleep(2000);
    }
    public void businessfun()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        slctBusiness();
        Thread.sleep(2000);
    }
    public void techfun()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        slctTech();
        Thread.sleep(2000);
    }
    public void greenfun()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        slctgreen();
        Thread.sleep(2000);
    }
    public void weirdfun()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        slctweirdnews();
        Thread.sleep(2000);
    }
    public void scopefun()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        slctscope();
        Thread.sleep(2000);
    }
}
