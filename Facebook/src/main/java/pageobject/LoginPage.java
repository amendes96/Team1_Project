package pageobject;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonAPI{

    @FindBy(id ="email")
    WebElement emailNo;

    @FindBy(name = "pass")
    WebElement passWd;

    @FindBy(id = "loginbutton")
    WebElement login;

    public void logIn() {
        PageFactory.initElements(driver,this);
        emailNo.sendKeys("kajol@gmail.com");
        passWd.sendKeys("12345678");
        login.click();
    }
}
