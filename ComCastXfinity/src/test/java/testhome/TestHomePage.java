package testhome;

import common.WebAPI;
import home.HomePage;
import home.XfinityWebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends WebAPI {
        public static HomePage homePage;
        public static XfinityWebElement xfinityWebElement;
        public static void init(){
        homePage = PageFactory.initElements(driver,HomePage.class);
        xfinityWebElement = PageFactory.initElements(driver,XfinityWebElement.class);
    }
    @Test(enabled = false)
    public static void homePage_get_Title_Test(){
        init();
        homePage.homePage_get_Title();
    }
     @Test(enabled = false)
    public static void homePage_Logo_display_Test(){
         init();
         homePage.homePage_Logo_display();
     }
     @Test
     public static void homePage_changePlanLink_Test(){
            init();
            homePage.changePlanLink();
     }

}
