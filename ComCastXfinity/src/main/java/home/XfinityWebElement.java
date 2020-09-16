package home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class XfinityWebElement {
    static  final String homePage_windowPopop_XP = "//button[@class='xc-toast--close']";
@FindBy(how = How.XPATH,using = homePage_windowPopop_XP)
public static WebElement homePage_windowPopop ;

}
