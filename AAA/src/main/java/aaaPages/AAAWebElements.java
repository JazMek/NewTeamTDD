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
}
