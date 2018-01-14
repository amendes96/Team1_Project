package testcases;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI{
//    @Test
//    public void testLogIn() {
//        LoginPage homePage = PageFactory.initElements(driver, LoginPage.class);
//        homePage.logIn();
//    }
//
//    @Test
//    public void testCreateAccount() throws InterruptedException {
//        CreateAccount createAccount=PageFactory.initElements(driver,CreateAccount.class);
//        createAccount.signUp();
//    }
//    @Test
//    public void testDropDownMenu(){
//        DropDownMenu dropDownMenu = PageFactory.initElements(driver, DropDownMenu.class);
//    }
    @Test
    public void testSignUp(){
//        CreateAccount acc = PageFactory.initElements(driver,CreateAccount.class);
//        acc.signUp();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("manon");

    }
}
