package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MemberLoginPage {

    @FindBy(xpath = "//*[@id=\"header-main\"]//div/a/img")
    WebElement loginPageTitle;

    @FindBy(id = "username")
    WebElement userNamefield;

    @FindBy(id = "password")
    WebElement passwordfield;

    @FindBy(xpath = "//*[@id=\"ContentItem0_0\"]/div/fieldset/a[1]")
    WebElement forgetpassword;

    @FindBy(id = "loginButton")
    WebElement loginBtn;

    @FindBy(xpath = "//*[@id=\"ContentItem0_0\"]/div/fieldset/a[2]")
    WebElement signUpBtn;

    @FindBy(xpath = "//*[@id=\"basicShell\"]/div[1]/div/ul/li[2]/a")
    WebElement langSpanish;

    @FindBy(xpath = "//*[@id=\"basicShell\"]/div[1]/div/ul/li[3]/a")
    WebElement langChinese;

    //    Mathods
    public void loginPageTitle(){
        loginPageTitle.click();
    }

    public void memberLogin(){
        userNamefield.sendKeys("abc@yahoo.com");
        passwordfield.sendKeys("abc123");
        loginBtn.click();
    }

    public void forgetPassword(){
        forgetpassword.click();
    }

    public void newMemberSignUp(){
        signUpBtn.click();
    }

    public void gotoSpanishlang(){
        langSpanish.click();
    }

    public void gotoChineselang(){
        langChinese.click();
    }
}
