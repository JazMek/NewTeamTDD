package home;

import common.WebAPI;
<<<<<<< HEAD
import static home.XfinityWebElement.*;

=======
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
>>>>>>> master

import static home.XfinityWebElement.*;
public class HomePage extends WebAPI {

    public static HomePage homePage;
    public static XfinityWebElement xfinityWebElement;
    public static void init(){
        homePage = PageFactory.initElements(driver,HomePage.class);
        xfinityWebElement = PageFactory.initElements(driver,XfinityWebElement.class);
        setUpWindow(driver);
    }
    public void homePage_get_Title() {
        getTitle("Access My Account | Email | Online News | My Xfinity®");
    }

<<<<<<< HEAD
    /**
     * homePage_Logo
     */
    public void homePage_Logo_display() {
        boolean logo = homePage_logo.isDisplayed();
        System.out.println("the logo is displayed : "+logo);
    }

    public void changePlanLink() {
        clickOnElement(homePage_changePlanLink_XP,driver);
=======
    public void homePage_windowPopUp() throws InterruptedException {
        //sleepFor(2);
        homePage_windowPopUp.click();
    }

    public void homePage_CreatAccount() throws InterruptedException {
        homePage_CreatAccount_SignIn_Bt.click();
        homePage_CreatAccount_CreatOne.click();
        homePage_CreatAccount_SelectMobile.click();
        homePage_CreatAccount_Continue.click();
//       String txet = homePage.getTextByWebElement(homePage_CreatAccount_GetText);
//        sleepFor(3);
//       homePage_CreatAccount_CopyText.sendKeys((getTextByXpath(homePage_CreatAccount_XP5)));
        sleepFor(5);
//       String str = homePage_CreatAccount_GetText.getScreenshotAs();
//        System.out.println(str);
>>>>>>> master
    }
}
