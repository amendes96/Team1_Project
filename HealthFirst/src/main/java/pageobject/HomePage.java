package pageobject;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI{

    Actions actions = new Actions(driver);

    @FindBy(css = "#header .logo")
    WebElement logo;

    @FindBy(xpath = "//*[@id=\"header\"]//div[6]/a[1]/span")
    WebElement memberLogin;

    @FindBy(xpath = "//*[@id=\"header\"]//div[6]/a[2]/span")
    WebElement providerLogIn;

    @FindBy(css = "#hf_langs_selector > div:nth-child(1) > ul:nth-child(1) > li:nth-child(1)")
    WebElement langChange;

    @FindBy(css = "#hf_langs_selector > div:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1) > span:nth-child(1)")
    WebElement langSanish;

    @FindBy(css = "#hf_langs_selector > div:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1) > span:nth-child(1)")
    WebElement langChinese;

    @FindBy(css = "input.display.search_box_upd")
    WebElement searchBox;

    @FindBy(xpath = "//input[@name = 'sa']")
    WebElement goBtn;

    @FindBy(xpath = "//a[text() =\"Info for Brokers\"]")
    WebElement infoForBroker;

    @FindBy(xpath = "//li[@id = \"menu-item-13283\"]/a[text() = \"Info For Employers\"]")
    WebElement infoForEmployers;

    @FindBy(xpath = "//a[@class = \"view_all_plans\"]")
    WebElement viewAllPlans;

    @FindBy(xpath = "//div[@class = \"box_content\"]/ul/li/a[text() = \"Become a Member\"]")
    WebElement becomeaMember;

    @FindBy(xpath = "//div[@class = \"box_content\"]/ul/li/a[text() = \"Find a Doctor or Hospital\"]")
    WebElement findDoctor;

    @FindBy(xpath = "//div[@class = \"box_content\"]/ul/li/a[text() = \"Pay My Bill\"]")
    WebElement payToBill;

    @FindBy(css = "#container > div.wrapper > div.widget > div.border_box.doctors > div > a")
    WebElement reviewPlan;

    @FindBy(xpath = "//*[@id=\"container\"]/div[1]/div[3]/div[2]/div/a")
    WebElement healtyLiving;

    @FindBy(xpath = "//*[@id=\"container\"]/div[1]/div[5]/div[1]//div/a")
    WebElement hFirstCommunity;

    @FindBy(xpath = "//*[@id=\"container\"]/div[1]/div[5]/div[2]//div/a")
    WebElement findHealthPlan;

    @FindBy(id = "#hf_contact_us_btn")
    WebElement contuctUsNY;
    //* SubFooter Element Locators *
    //Get health Insurance

    @FindBy(xpath = "//*[@id=\"menu-item-4448\"]/a")
    WebElement leafPlan;

    @FindBy(id = "//*[@id=\"menu-item-1695\"]/a")
    WebElement madicaidManageCare;

    @FindBy(xpath = "//*[@id=\"menu-item-1697\"]/a")
    WebElement childHealthPlus;

    @FindBy(xpath = "//*[@id=\"menu-item-4923\"]/a")
    WebElement madicarePlans;

    @FindBy(xpath = "//*[@id=\"menu-item-4924\"]/a")
    WebElement madicareMadicaidPlans;

    @FindBy(xpath = "//*[@id=\"menu-item-7361\"]/a")
    WebElement personalWillnessPlan;

    @FindBy(xpath = "//*[@id=\"menu-item-8904\"]/a")
    WebElement managedLongTerm;

    @FindBy(xpath = "//*[@id=\"menu-item-7584\"]/a")
    WebElement essentialPlan;

    @FindBy(xpath = "//*[@id=\"menu-item-13213\"]/a")
    WebElement proAndProPlusPlan;

    @FindBy(xpath = "//*[@id=\"menu-item-14763\"]/a")
    WebElement totalEPOplan;

    @FindBy(xpath = "//*[@id=\"menu-item-7586\"]/a")
    WebElement healthyNYsmallGroup;

    @FindBy(xpath = "//*[@id=\"menu-item-387\"]/a")
    WebElement memberServices;

    @FindBy(xpath = "//*[@id=\"menu-item-385\"]/a")
    WebElement contactUs;

    @FindBy(xpath = "//*[@id=\"menu-item-31113\"]/a")
    WebElement planRenewals;

    @FindBy(xpath = "//*[@id=\"menu-item-2212\"]/a")
    WebElement planMaterials;

    @FindBy(xpath = "//*[@id=\"menu-item-3314\"]/a")
    WebElement reportFraud;

    @FindBy(xpath = "//*[@id=\"menu-item-437\"]/a")
    WebElement fAQs;

    @FindBy(xpath = "//*[@id=\"menu-item-3313\"]/a")
    WebElement provoderServices;

    @FindBy(xpath = "//*[@id=\"menu-item-3312\"]/a")
    WebElement claimsAndBilling;

    @FindBy(xpath = "//*[@id=\"menu-item-391\"]/a")
    WebElement providersManuals;

    @FindBy(xpath = "//*[@id=\"menu-item-4361\"]/a")
    WebElement providerResources;

    @FindBy(xpath = "//*[@id=\"menu-item-3311\"]/a")
    WebElement compliance;

    @FindBy(xpath = "//*[@id=\"menu-item-4843\"]/a")
    WebElement clinicalPartnership;

    @FindBy(xpath = "//*[@id=\"menu-item-3994\"]/a")
    WebElement glossery;

    @FindBy(xpath = "//*[@id=\"menu-item-6686\"]/a")
    WebElement careers;

    @FindBy(xpath = "//*[@id=\"menu-item-2182\"]/a")
    WebElement aboutUp;

    @FindBy(xpath = "//*[@id=\"menu-item-397\"]/a")
    WebElement pressRoom;

    @FindBy(xpath = "//*[@id=\"menu-item-436\"]/a")
    WebElement mediaContact;

    @FindBy(xpath = "//*[@id=\"menu-item-19893\"]/a")
    WebElement noticeofNonDiscri;

    @FindBy(xpath = "//li[@id = \"menu-item-3782\"]/a[text() = \"Web Privacy\"]")
    WebElement webPrivacy;

    @FindBy(xpath = "//li[@id = \"menu-item-3782\"]/a[text() = \"Privacy Notices\"]")
    WebElement privacyNotices;

    @FindBy(xpath = "//*[@id=\"menu-item-401\"]/a")
    WebElement siteMap;

    @FindBy(xpath = "//a[@href = \"https://www.facebook.com/HealthfirstNY\"]/img")
    WebElement facebook;

    @FindBy(xpath = "//a[@href = \"https://twitter.com/healthfirstny\"]/img")
    WebElement twitter;

    @FindBy(xpath = "//a[@href = \"https://www.youtube.com/healthfirstny\"]/img")
    WebElement youtube;

    @FindBy(xpath = "//a[@href = \"https://www.pinterest.com/healthfirstny/\"]/img")
    WebElement pinterest;

    @FindBy(xpath = "//a[@href = \"https://www.instagram.com/healthfirstny/\"]/img")
    WebElement instagram;

    public void search(){
        searchBox.sendKeys("doctor");
        goBtn.click();
    }

    public void langChangeEnglishToChinese(){
        actions.moveToElement(langChange).moveToElement(langChinese).click().build().perform();
    }
    public void goToMemberLogin(){
        memberLogin.click();
    }

    public void gotoProviderLogin(){
        providerLogIn.click();
    }

    public void gotoInfoForBrokers(){
        infoForBroker.click();
    }

    public void gotoInfoForEmployers(){
        infoForEmployers.click();
    }

    public void gotoViewallPlans(){
        viewAllPlans.click();
    }
    public void gotoBecomeaMember() {
        becomeaMember.click();
    }

    public void gotoFindDoctor(){
        findDoctor.click();
    }

    public void gotoPayBill(){
        payToBill.click();
    }

    public void gotoReviewPlan(){
            reviewPlan.click();
    }

    public void gotoHealtyLiving(){
        healtyLiving.click();
    }

    public void gotoHFcommunity(){
            hFirstCommunity.click();
        }

        public void gotoFindHealthPlan(){
            findHealthPlan.click();
        }

        public void gotoContactUs(){
            contuctUsNY.click();
        }

        public void gotoleafPlan(){
            leafPlan.click();
        }

        public void gotomadicaidManageCare(){
            madicaidManageCare.click();
        }

        public void gotomadicarePlans(){
            madicarePlans.click();
        }

        public void gotomadicareMadicaidPlans(){
            madicareMadicaidPlans.click();
        }

        public void gotopersonalWillnessPlan(){
            personalWillnessPlan.click();
        }

        public void gotomanagedLongTerm(){
            managedLongTerm.click();
        }

        public void gotoessentialPlan(){
            essentialPlan.click();
        }

        public void gotoproAndProPlusPlan(){
            proAndProPlusPlan.click();
        }

        public void gotototalEPOplan(){
            totalEPOplan.click();
        }

        public void gotochildHealthPlus(){
            childHealthPlus.click();
        }

        public void gotohealthyNYsmallGroup(){
            healthyNYsmallGroup.click();
        }

        public void gotomemberServices(){
            memberServices.click();
        }

        public void gotocontactUs(){
            contactUs.click();
        }

        public void gotoplanRenewals(){
            planRenewals.click();
        }

        public void gotoplanMaterials(){
            planMaterials.click();
        }

        public void gotoreportFraud(){
            reportFraud.click();
        }

        public void gotofAQs(){
            fAQs.click();
        }

        public void gotoprovoderServices(){
            provoderServices.click();
        }

        public void gotoclaimsAndBilling(){
            claimsAndBilling.click();
        }

        public void gotoprovidersManuals(){
            providersManuals.click();
        }

        public void gotoproviderResources(){
            providerResources.click();
        }

        public void gotocompliance(){
            compliance.click();
        }

        public void gotoclinicalPartnership(){
            clinicalPartnership.click();
        }


        public void gotoglossery(){
            glossery.click();
        }

        public void gotocareers(){
            careers.click();
        }

        public void gotoaboutUp(){
            aboutUp.click();
        }

        public void gotopressRoom(){
            pressRoom.click();
        }

        public void gotomediaContact(){
            mediaContact.click();
        }

        public void gotonoticeofNonDiscri(){
            noticeofNonDiscri.click();
        }

        public void gotowebPrivacy(){
            webPrivacy.click();
        }

        public void gotoprivacyNotices(){
            privacyNotices.click();
        }

        public void gotositeMap(){
            siteMap.click();
        }

        public void gotofacebook(){
            facebook.click();
        }

        public void gototwitter(){
            twitter.click();
        }

        public void gotoyoutube(){
            youtube.click();
        }

        public void gotopinterest(){
            pinterest.click();
        }

        public void gotoinstagram(){
            instagram.click();
        }

}
