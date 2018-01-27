package testcasesyoutube;

import base.CommonAPI;
import pageobject.ValidSignIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Testvalidsignin extends CommonAPI{

    @Test
    public void login() throws InterruptedException {
        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ValidSignIn vsn = PageFactory.initElements(driver, ValidSignIn.class);
        vsn.login();
        System.out.println(getCurrentPageUrl());
    }
}
