package testkeyworddriven;

import base.CommonAPI;
import keyworddriven.SignUp;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobject.HomePage;


import java.io.IOException;

public class SignUpTest extends CommonAPI {
    SignUp signUp;

    @BeforeMethod
    public void initializePageFactory() {
        signUp = PageFactory.initElements(driver, SignUp.class);
    }
    @Test(enabled = true)
    public void signUpTest() throws IOException {
        signUp.signUP();
        signUp.enterUser();


    }
}