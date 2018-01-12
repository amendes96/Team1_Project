package testcasesyoutube;

import base.CommonAPI;
import home.InvalidPassword;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestInvalidPass extends CommonAPI{

    @Test
    public void invalidPassword() throws InterruptedException {
        InvalidPassword invpass = PageFactory.initElements(driver, InvalidPassword.class);
        invpass.invalidpass();
    }
}
