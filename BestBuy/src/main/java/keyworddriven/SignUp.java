package keyworddriven;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import util.DataReader;

import java.io.IOException;

public class SignUp extends CommonAPI {
    DataReader dr = new DataReader();

    public String[] createUsersFromExcel() throws IOException {
        String path = System.getProperty("user.dir") + "/data/createUsers.xls";
        String[] st = dr.fileReader(path);
        return st;
    }

    @FindBy(xpath = ".//*[@id='profileMenuWrap1']")
    WebElement account;
    @FindBy(xpath = "//a[contains(.,'Create one')]")
    WebElement createOne;
    @FindBy(xpath = ".//*[@id='fld-firstName']")
    WebElement firstName;
    @FindBy(xpath = ".//*[@id='fld-lastName']")
    WebElement lastName;
    @FindBy(xpath = ".//*[@id='fld-e']")
    WebElement emailId;
    @FindBy(xpath = ".//*[@id='fld-p1']")
    WebElement password;
    @FindBy(xpath = ".//*[@id='fld-p2']")
    WebElement confirmPassword;
    @FindBy(xpath = ".//*[@id='fld-phone']")
    WebElement phoneNumber;
    @FindBy(xpath = "//button[contains(.,'Create an Account')]")
    WebElement createAnAccount;

    public void signUP() {
        account.click();
        createOne.click();
    }
    public void enterFirstName(String value){
        firstName.sendKeys(value);
    }
    public void enterLastName(String value){
        lastName.sendKeys(value);
    }
    public void enterEmailId(String value){
        emailId.sendKeys(value);
    }
    public void enterPassword(String value){
        password.sendKeys(value);
    }
    public void confirmPassword(String value){
        confirmPassword.sendKeys(value);
    }
    public void enterPhoneNo(String value){
        phoneNumber.sendKeys(value);
    }
    public void clickCreateAnAccount(){
        createAnAccount.click();
    }
    public void enterUser() throws IOException {
        SignUp signUp = new SignUp();
        SignUp sign = PageFactory.initElements(driver, SignUp.class);
        String[] value = signUp.createUsersFromExcel();
        for (int i = 1; i<value.length; i++){
            sign.enterFirstName(value[i]);
            sign.enterLastName(value[i]);
            sign.enterEmailId(value[i]);
            sign.enterPassword(value[i]);
            sign.confirmPassword(value[i]);
            sign.enterPhoneNo(value[i]);
        }

    }

}
