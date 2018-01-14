package testcases;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageobject.HomePage;

public class TestHomePage extends CommonAPI{

    @Test
    public void testlogo(){
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.gotoHomepage();
    }
    @Test
    public void testsearching(){
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.searching();
    }
    @Test
    public void testtodaysdeals(){
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.gotoTodaysDeals();

    }
    @Test
    public void testgiftCards(){
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.gotoGiftCards();
    }
    @Test
    public void testRegistry(){
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.gotoRegistry();
    }
    @Test
    public void testSell(){
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.gotoSell();
    }
    @Test
    public void testHelp(){
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.gotoHelp();
    }
    @Test
    public void testOrders() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.gotoOrders();
    }
    @Test
    public void testLinkPrime() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.gotoLinkPrime();
    }
    @Test
    public void testCart() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.gotoCart();
    }
    @Test
    public void testNewYear() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.gotoNewYear();
    }
    @Test
    public void testSports() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.gotoSports();
    }
    @Test
    public void testCareers() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.gotoCareers();
    }
}
