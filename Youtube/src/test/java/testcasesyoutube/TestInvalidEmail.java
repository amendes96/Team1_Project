package testcasesyoutube;

import base.CommonAPI;
import home.InvalidEmail;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestInvalidEmail extends CommonAPI{

    @Test
    public void invEmail() throws InterruptedException {
        InvalidEmail inve = PageFactory.initElements(driver,InvalidEmail.class);
        inve.invalidlogin();
    }
}
