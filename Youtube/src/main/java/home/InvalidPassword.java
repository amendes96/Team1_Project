package home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InvalidPassword {

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


    public void invalidpass() throws InterruptedException {
        signIn.click();
        email.sendKeys("ytest1278@gmail.com");
        nextButton.click();
        password.sendKeys("youtubeTestRunners");
        passnextButtom.click();
        Thread.sleep(3000);
        //System.out.println(driver.getPageSource());
    }
}
