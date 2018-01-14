package testcases;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageobject.SallieMaeBrowserPage;

public class TestSallieMaeBrowserPage extends CommonAPI{
    //SallieMaeBrowserPage
    @Test
    public void testSearchButton(){
        SallieMaeBrowserPage browserPage = PageFactory.initElements(driver,SallieMaeBrowserPage.class);
        browserPage.gotoSearchButton();
    }
    @Test
    public void testStudentloans(){
        SallieMaeBrowserPage browserPage = PageFactory.initElements(driver,SallieMaeBrowserPage.class);
        browserPage.gotoStudentloans();
    }
    @Test
    public void testCollegePlanning(){
        SallieMaeBrowserPage browserPage = PageFactory.initElements(driver,SallieMaeBrowserPage.class);
        browserPage.gotoCollegePlanning();
    }
    @Test
    public void testSaveforcollege(){
        SallieMaeBrowserPage browserPage = PageFactory.initElements(driver,SallieMaeBrowserPage.class);
        browserPage.gotoSaveforcollage();
    }
    @Test void testBanking(){
        SallieMaeBrowserPage browserPage = PageFactory.initElements(driver,SallieMaeBrowserPage.class);
        browserPage.gotoBanking();
    }
}
