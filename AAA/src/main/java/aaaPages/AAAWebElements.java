package aaaPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AAAWebElements {

    public static final String AAALogoXP="//*[@id=\"page-header\"]/div/div/div[2]/div/a/img";
    @FindBy(how= How.XPATH, using=AAALogoXP)
    public static WebElement AAALogo;



    public static final String AAAHomePageMyAcountclickXP="//*[@id='page-header']/div/div/div[2]/div/div[3]/a[1]";
    @FindBy(how= How.XPATH, using=AAAHomePageMyAcountclickXP)
    public static WebElement AAAHomePageMyAcountclick;

//************************karim*********************************************
    public static final String HomePage_Popup_Window_Zip_Code_Field_ID ="zipcodeInput";
    @FindBy(how= How.ID ,using=HomePage_Popup_Window_Zip_Code_Field_ID )
    public static WebElement Popup_Window_Zip_Code_Field;
    public static final String HomePage_Popup_Window_Zip_Code_Submission_ID ="zipcodeSubmit";
    @FindBy(how= How.ID ,using=HomePage_Popup_Window_Zip_Code_Submission_ID )
    public static WebElement Popup_Window_Zip_Code_Submission;
    public static final String HomePage_Exclusive_Member_Discounts_XP ="//h2[contains(text(),'Exclusive Member Discounts')]";
    @FindBy(how= How.XPATH,using=HomePage_Exclusive_Member_Discounts_XP )
    public static WebElement Exclusive_Member_Discounts;
    public static final String HomePage_Return_to_Top_XP ="//html//body//div//span//a";
    @FindBy(how= How.XPATH ,using=HomePage_Return_to_Top_XP )
    public static WebElement Return_to_Top;
    public static String Zip_Code ="11228";

    public static final String AAAHomePage_Travel_MouseHoverXP="//*[@id='nav-travel-parent']/a";
    @FindBy(how= How.XPATH, using=AAAHomePage_Travel_MouseHoverXP)
    public static WebElement AAAHomePage_Travel_MouseHover;


    public static final String AAAHomePage_Hotels_buttonXP="//*[@id='nav-travel-col1']/ul/li[1]/a";
    @FindBy(how= How.XPATH, using=AAAHomePage_Hotels_buttonXP)
    public static WebElement AAAHomePage_Hotels_button;

    public static final String AAAHomePage_Flight_Element_ClickXP="//*[@id=\"tabAir\"]/p";
    @FindBy(how= How.XPATH, using=AAAHomePage_Flight_Element_ClickXP)
    public static WebElement AAAHomePage_Flight_Element_Click;

    public static final String AAAHomePage_Flight_RoundTrip_boxXP="//*[@id=\"rs_multi\"]/div/form[2]/div[1]/label[1]";
   // public static final String AAAHomePage_Flight_RoundTrip_boxXP="//*[@id='rs_multi']/div/form[2]/div[1]/label[2]";
    @FindBy(how= How.XPATH, using=AAAHomePage_Flight_RoundTrip_boxXP)
    public static WebElement AAAHomePage_Flight_RoundTrip_box;

    public static final String AAAHomePage_Search_boxXP="//input[@placeholder='Search AAA.com']";
    @FindBy(how= How.XPATH, using=AAAHomePage_Search_boxXP)
    public static WebElement AAAHomePage_Search_box;


    public static final String AAAHomePage_Fall_intoSavingXP="//span[@class='offer-text']";
    @FindBy(how= How.XPATH, using=AAAHomePage_Fall_intoSavingXP)
    public static WebElement AAAHomePage_Fall_intoSaving;

    public static final String AAAHomePage_Flight_buttonXP="//span[contains(text(),'Flights')]";
    @FindBy(how= How.XPATH, using=AAAHomePage_Flight_buttonXP)
    public static WebElement AAAHomePage_Flight_button;

//    public static final String AAAHomePage_currant_dateXP="//a[@class='ui-state-default ui-state-highlight ui-state-active']";
//    @FindBy(how= How.XPATH, using=AAAHomePage_currant_dateXP)
//    public static WebElement AAAHomePage_currant_date;


    public static final String AAAHomePage_fromXP="//input[contains(@class,'departure-from ui-autocomplete-input')]";
    @FindBy(how= How.XPATH, using= AAAHomePage_fromXP)
    public static WebElement AAAHomePage_from;

    public static final String AAAHomePage_ToXP="//input[contains(@class,'departure-to ui-autocomplete-input')]";
    @FindBy(how= How.XPATH, using=AAAHomePage_ToXP)
    public static WebElement AAAHomePage_To;
    public static final String AAAHomePage_DepartingXP="//input[contains(@class,'departure-from tst-start-date hasDatepicker')]";
    @FindBy(how= How.XPATH, using=AAAHomePage_DepartingXP)
    public static WebElement AAAHomePage_Departing;
    public static final String AAAHomePage_ReturningXP="//input[contains(@class,'departure-to tst-end-date hasDatepicker')]";
    @FindBy(how= How.XPATH, using=AAAHomePage_ReturningXP)
    public static WebElement AAAHomePage_Returning;
    public static final String AAAHomePage_adultXP="//select[@name='a']";
    @FindBy(how= How.XPATH, using=AAAHomePage_adultXP)
    public static WebElement AAAHomePage_adult;
    public static final String AAAHomePage_searchXP="//div[6]//div[1]//button[1]";
    @FindBy(how= How.XPATH, using=AAAHomePage_searchXP)
    public static WebElement AAAHomePage_search;
    public static final String AAAHomePage_AtualresulsearchtXP="//span[@class='st-ui-search-summary-query']";
    @FindBy(how= How.XPATH, using= AAAHomePage_AtualresulsearchtXP)
    public static WebElement AAAHomePage_Atualresulsearcht;
}
