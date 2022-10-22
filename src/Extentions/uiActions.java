package Extentions;
import Utilities.CommonOps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

/**
 * uiActions class inherit from CommonOps.
 * this class does the user action in the web such as click and write to a box.
 */

public class uiActions extends CommonOps {

    public static void click(WebElement elem) {
        if (elem.isDisplayed()) {
            wait.until(ExpectedConditions.elementToBeClickable(elem)); // this action will wait befor the click until the element will appears in the page
            elem.click();
        }

    }
    public static void updateText(WebElement elem, String value)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(value);
    }
    public static void clearfield(WebElement elem)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.clear();
    }


}
