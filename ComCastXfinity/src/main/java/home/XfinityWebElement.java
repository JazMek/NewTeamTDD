package home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
<<<<<<< HEAD

public class XfinityWebElement {



    final static String homePage_logo_XP = "//a[@class='cms-logo']//img";
    @FindBy(how = How.XPATH,name = homePage_logo_XP)
    public static WebElement homePage_logo;

    final static String homePage_changePlanLink_XP = "//a[contains(text(),'Change Plan')]";
    @FindBy(how= How.XPATH,name= homePage_changePlanLink_XP)
    public static WebElement homePage_changePlanLink;



=======
>>>>>>> master

public class XfinityWebElement {
    static  final String homePage_windowPopUp_XP = "//button[@class='xc-toast--close']";
      @FindBy(how = How.XPATH,using = homePage_windowPopUp_XP)
    public static WebElement homePage_windowPopUp ;
    static final String homePage_CreatAccount_XP1="//a[@class='xc-header--signin-link']";
      @FindBy(how = How.XPATH,using = homePage_CreatAccount_XP1)
    public static WebElement homePage_CreatAccount_SignIn_Bt;
    static final String homePage_CreatAccount_XP2="//a[contains(text(),'Create one')]";
    @FindBy(how = How.XPATH,using = homePage_CreatAccount_XP2)
    public static WebElement homePage_CreatAccount_CreatOne;
    static final String homePage_CreatAccount_XP3="//div[@class='summary']";
    @FindBy(how = How.XPATH,using = homePage_CreatAccount_XP3)
    public static WebElement homePage_CreatAccount_SelectMobile;
    static final String homePage_CreatAccount_XP4="//button[@class='submit']";
    @FindBy(how = How.XPATH,using = homePage_CreatAccount_XP4)
    public static WebElement homePage_CreatAccount_Continue;//canvas[@title='null']
    static final String homePage_CreatAccount_XP5="//canvas[@title='null']";
    @FindBy(how = How.XPATH,using = homePage_CreatAccount_XP5)
    public static WebElement homePage_CreatAccount_GetText;
    static final String homePage_CreatAccount_XP6 = "//input[@id='nucaptcha-answer']";
    @FindBy(how = How.XPATH,using = homePage_CreatAccount_XP6)
    public static WebElement homePage_CreatAccount_CopyText;
    static final String homePage_CreatAccount_XP = "//a[@id='player-mode']";
    @FindBy(how = How.XPATH,using = homePage_CreatAccount_XP)
    public static WebElement homePage_CreatAccount_CopyText1;
}
