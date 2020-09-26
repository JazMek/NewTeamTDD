package aaaPages;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static aaaPages.AAAWebElements.*;

public class AAAHomePage extends WebAPI {
    public static AAAHomePage aaaHomePage;
    public static AAAWebElements aaaWebElements;


    public static void init() {
        aaaHomePage = PageFactory.initElements(driver, AAAHomePage.class);
        aaaWebElements = PageFactory.initElements(driver, AAAWebElements.class);
        setUpWindow(driver);
        // ImplicitWaitTime(3);
        keysInput(Popup_Window_Zip_Code_Field, Zip_Code);
    }


    public void HomePage_Get_Title() {
        getTitle("Home | AAA Northeast");
    }

    public void HomePage_Get_Url() {
        getUrl("https://northeast.aaa.com/");
    }

    public void HomePage_Get_Logo() {
        // isWebElementDisplayed(driver,AAALogo);
        Assert.assertTrue(isWebElementDisplayed(driver, AAALogo), "the logo is displayed ");
        if (isWebElementDisplayed(driver, AAALogo) == true) {
            System.out.println("the logo is displayed ");

        } else System.out.println("the logo is not displayed ");
    }

    public void HomePage_click_MyAccount_WebButton() {

        // clickByWebElement(AAAHomePageMyAcountclick);
        AAAHomePageMyAcountclick.click();
        String ActuelResult = getCurrentPageUrl();
        String ExpectedResult = "https://nm.northeast.aaa.com/logi";
        Assert.assertEquals(ActuelResult, ExpectedResult);

    }

    public void HomePage_Check_Return_To_Top_Button_After_ScrollDown_Is_Displayed() throws InterruptedException {

        keysInput(Popup_Window_Zip_Code_Field, Zip_Code);
        //scrollIntoView(Exclusive_Member_Discounts,driver);
        //scrollPageDown(driver);
//        sleepFor(15);
//        boolean Flag1=isWebElementDisplayed(driver, Return_to_Top);
//        Assert.assertTrue(Flag1,"The return to Top button is displayed");
    }

    public void HomePage_Travel_Mouse_Hover() throws InterruptedException {
        keysInput(Popup_Window_Zip_Code_Field, Zip_Code);
        sleepFor(5);
        HoverMouseAndClickt(driver, AAAHomePage_Travel_MouseHover);
    }


//**********************************************
//    public void HomePage_Is_RoundTrip_WebElement_Enabled() throws InterruptedException {
//
//       // clickByXpath(AAAHomePage_Flight_Element_Click);
//        isWebElementEnabled(driver, AAAHomePage_Flight_RoundTrip_box);
//        sleepFor(5);
//
//
//
//    }
    //*************************************************

    public void HomePage_search_box(String search_Words) throws InterruptedException {
        AAAHomePage_Search_box.click();
        AAAHomePage_Search_box.sendKeys(search_Words);
        sleepFor(3);
        AAAHomePage_Search_box.sendKeys(Keys.ENTER);
        sleepFor(3);
    }


    public void HomePage_selection_Flights(String from,String to,String departur_date,String return_date,String adult_number) throws InterruptedException {
        sleepFor(5);
        scrollIntoView(AAAHomePage_Fall_intoSaving, driver);
        AAAHomePage_Flight_button.click();
        //AAAHomePage_oneWay_Check_box.click();
        AAAHomePage_from.click();
        AAAHomePage_from.sendKeys(from);
        AAAHomePage_To.sendKeys(to);
        AAAHomePage_Departing.sendKeys(departur_date);
        AAAHomePage_Returning.sendKeys(return_date);
        AAAHomePage_adult.click();
        Select adulte = new Select(AAAHomePage_adult);
        adulte.selectByVisibleText(adult_number);
        AAAHomePage_adult.sendKeys(Keys.ENTER);
        AAAHomePage_search.click();

    }


}