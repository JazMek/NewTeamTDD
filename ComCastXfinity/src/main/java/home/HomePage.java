package home;

import common.WebAPI;
import static home.XfinityWebElement.*;


public class HomePage extends WebAPI {


    public void homePage_get_Title() {
        getTitle("Access My Account | Email | Online News | My Xfinity®");
    }

    /**
     * homePage_Logo
     */
    public void homePage_Logo_display() {
        boolean logo = homePage_logo.isDisplayed();
        System.out.println("the logo is displayed : "+logo);
    }

    public void changePlanLink() {
        clickOnElement(homePage_changePlanLink_XP,driver);
    }
}
