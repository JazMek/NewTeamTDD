package aaaTests;

import common.WebAPI;

import databases.AaaSearch;
import databases.ConnectToSqlDB;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.DataReader;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import static aaaPages.AAAHomePage.*;
import static aaaPages.AAAWebElements.*;

public class TestAAAHomePage extends WebAPI {


    @BeforeMethod
    public void browserSetup() {
        init();
    }

    /*
    Test Case ID 0001:
    AAA Home Page Title verification
    */
    @Test(enabled = false)
    public void HomePage_Get_Title_Test() {

        aaaHomePage.HomePage_Get_Title();
    }

    /*
     Test Case ID: 0002:
     AAA Home Page Url verification
    */
    @Test(enabled = false)
    public void HomePage_Get_Url_Test() {

        aaaHomePage.HomePage_Get_Url();
    }

    /*
     Test Case ID: 0003:
     AAA Home Page Logo verification
    */
    @Test(enabled = false)
    public void HomePage_Get_Logo_Test() {

        aaaHomePage.HomePage_Get_Logo();

    }

    /*
      Test Case ID: 0004:
      AAA Home Page Logo verification
     */
    @Test(enabled = false)
    public void HomePage_click_MyAccount_WebButton_Test() {

        aaaHomePage.HomePage_click_MyAccount_WebButton();


    }

    /*
    Test Case ID: 008
    AAA Home Page Return to Top verification after scroll down
    */
    @Test(enabled = false)
    public void HomePage_Check_Return_To_Top_Button_After_ScrollDown_Is_Displayed_Test() throws InterruptedException {

        aaaHomePage.HomePage_Check_Return_To_Top_Button_After_ScrollDown_Is_Displayed();
        sleepFor(5);
        //scrollPageDown(driver);
        scrollIntoView(Exclusive_Member_Discounts, driver);
        boolean Flag1 = isWebElementDisplayed(driver, Return_to_Top);
        Assert.assertTrue(Flag1, "The return to Top button is displayed");

    }

//@BeforeMethod

//keysInput(Popup_Window_Zip_Code_Field,Zip_Code){

//}
    /*
    Test Case ID: 007
    AAA Home Page mouse hover
    */

    // @Test(groups = {"Smoke"})
    @Test(enabled = false)
    public void HomePage_Mouse_Hover_test() throws InterruptedException {

        aaaHomePage.HomePage_Travel_Mouse_Hover();
        sleepFor(5);
        boolean Flag1 = isWebElementDisplayed(driver, AAAHomePage_Hotels_button);
        Assert.assertTrue(Flag1, "the Web Button is displayed");


    }

    /*
    Test Case ID: 009
    AAA Home Page mouse hover
    */
    //***************************************************
//    @Test
//    public void HomePage_Is_Roundtrip_WebElement_Enabled_Test() throws InterruptedException {
//     init();
//       aaaHomePage.HomePage_Is_RoundTrip_WebElement_Enabled();
//
//        boolean result =isWebElementEnabled(driver, AAAHomePage_Flight_RoundTrip_box);
//        Assert.assertTrue(result,"the web element is enabled ");
//        if (result ==true){
//            System.out.println("the web element is enabled");
//        }else {
//            System.out.println("the web element is not enabled");
//        }
//

    //  }
//************************************************************

    public static String path = "/Users/amardjebra/Desktop/New_team_Excel.xlsx";


    @DataProvider
    public Object[][] getTestData2() throws IOException, InvalidFormatException {

        Object data1[][] = DataReader.fileReader3("Sheet1", path);

        return data1;
    }

    @Test(enabled = false, dataProvider = "getTestData2")
    public void HomePage_search_box_test(String search_Words, String expectedsearchResult) throws InterruptedException {
        aaaHomePage.HomePage_search_box(search_Words);
        String actualResult = AAAHomePage_Atualresulsearcht.getText();
        Assert.assertEquals(expectedsearchResult, actualResult);
    }


    @DataProvider
    public Object[][] getTestData3() throws IOException, InvalidFormatException {

        Object data1[][] = DataReader.fileReader4(path, "Sheet2");

        return data1;
    }

    @Test(enabled = false, dataProvider = "getTestData3")
    public void HomePage_selection_Flights_Test(String from, String to, String departur_date, String return_date, String adult_number) throws InterruptedException {

        aaaHomePage.HomePage_selection_Flights(from, to, departur_date, return_date, adult_number);
    }

    @DataProvider
    public Object[] getTestdataBase() throws Exception {
        Object[] data2 = ConnectToSqlDB.readDataBase("AAAsearch", "search_Words").toArray();
        return data2;
    }


    @Test(enabled = false, dataProvider = "getTestdataBase")
    public void HomePage_SearchData_Base_Test(String search_Words) throws Exception {
        aaaHomePage.HomePage_SearchData_Base(search_Words);
    }

    @DataProvider
    public Object[][] getTestdataBase2D() throws Exception {
        List<AaaSearch> dataList = ConnectToSqlDB.getUnitedListFromSqlTableArryAAA();
        int columnNum = 2;
        Object[][] dataArray = new Object[dataList.size()][columnNum];
        for (int i = 0; i < dataList.size(); i++) {
            dataArray[i] = new Object[columnNum];
        }
        for (int i = 0; i < dataList.size(); i++) {
            for (int j = 0; j < columnNum; j++) {
                if (j == 0) dataArray[i][j] = dataList.get(i).getSearch_Words();
                if (j == 1) dataArray[i][j] = dataList.get(i).getExpectedsearchResult();

            }
        }

        return dataArray;
    }

    @Test(dataProvider = "getTestdataBase2D")
    public void HomePage_SearchData_Validate_Base_Test(String search_Words, String expectedsearchResult) throws Exception {
        aaaHomePage.HomePage_SearchData_Validation_Base(search_Words, expectedsearchResult);
        String actualResult = AAAHomePage_Atualresulsearcht.getText();
        Assert.assertEquals(expectedsearchResult, actualResult);
    }
}


