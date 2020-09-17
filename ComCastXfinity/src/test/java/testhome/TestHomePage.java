package testhome;

import common.WebAPI;
import home.HomePage;
import home.XfinityWebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static home.HomePage.*;

public class TestHomePage extends WebAPI {
    @BeforeMethod
      public void Class_setup(){
          init();
      }

    @Test
    public static void homePage_get_Title_Test(){

        homePage.homePage_get_Title();

    }




}
