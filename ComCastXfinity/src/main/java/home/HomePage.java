package home;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends WebAPI {
    public static HomePage homePage;
    public static XfinityWebElement xfinityWebElement;
    public static void init(){
        homePage = PageFactory.initElements(driver,HomePage.class);
        xfinityWebElement = PageFactory.initElements(driver,XfinityWebElement.class);
    }


    public void homePage_get_Title() {
        getTitle("Access My Account | Email | Online News | My Xfinity®");
    }
}
