package home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ValidSignIn {

    @FindBy(id = "text")
    WebElement signIn;

    @FindBy(id = "identifierId")
    WebElement email;

    @FindBy(xpath = ".//*[@id='identifierNext']/content/span")
    WebElement nextButton;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(id = "passwordNext")
    WebElement passnextButtom;

    public void login() throws InterruptedException {
        signIn.click();
        email.sendKeys("ytest1278@gmail.com");
        nextButton.click();
        password.sendKeys("youtubeTestRunner");
        passnextButtom.click();
    }
//https://www.youtube.com/watch?v=cycUHgg0zzU&list=PL7E3dglH2Jf5maKNDP9JHBJJaGMFFfOFK&index=6
//https://listenonrepeat.com/?v=cycUHgg0zzU#Logic_-_1-800-273-8255_ft__Alessia_Cara_%26_Khalid_(Official_Audio)
}
