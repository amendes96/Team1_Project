package pageobject;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CreditCard extends CommonAPI{

//    @FindBy(id = "cA-cardsUseridMasked")
//    WebElement userID;
//    @FindBy(id = "PASSWORD")
//    WebElement password;
//    @FindBy(id = "logon")
//    WebElement signOn;
//    @FindBy(id = "cA-DD-cardCategory")
//    WebElement selectCardCategory;
//    @FindBy(xpath = "//a[contains(.,'Travel Cards')]")
//    WebElement cardType;
//
//    public void signIn() {
//        userID.sendKeys("abc");
//        password.sendKeys("123xyz");
//        signOn.click();
//    }
//    public void clickSelectCardCategory() {
//        selectCardCategory.click();
//        cardType.click();
//    }
//    public void clickSelectCardCategory1() throws InterruptedException {
//        selectCardCategory.click();
//        Thread.sleep(10000);
//        List<WebElement> cardLists =driver.findElements(
//                By.xpath(".//*[@id='cA-DD-tabbar-card-selector-extend']/ul"));
//        for(int i =0; i<cardLists.size();i++){
//            WebElement cardType = cardLists.get(i);
//            String innerhtml = cardType.getAttribute("innerHTML");
//            if(innerhtml.contentEquals("Travel Cards")){
//                cardType.click();
//                break;
//            }
//            System.out.println(innerhtml);
//        }
//    }
}
