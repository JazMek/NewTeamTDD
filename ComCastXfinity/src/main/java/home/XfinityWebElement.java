package home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class XfinityWebElement {



    final static String homePage_logo_XP = "//a[@class='cms-logo']//img";
    @FindBy(how = How.XPATH,name = homePage_logo_XP)
    public static WebElement homePage_logo;

    final static String homePage_changePlanLink_XP = "//a[contains(text(),'Change Plan')]";
    @FindBy(how= How.XPATH,name= homePage_changePlanLink_XP)
    public static WebElement homePage_changePlanLink;




}
