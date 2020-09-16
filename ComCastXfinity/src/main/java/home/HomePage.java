package home;

import common.WebAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

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

    public void homePage_windowPopop() throws InterruptedException {
        //sleepFor(2);
        homePage_windowPopop.click();
    }
}
