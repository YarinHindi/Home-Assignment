package Extentions;
import Utilities.CommonOps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * uiActions class inherit from CommonOps.
 * this class does the user action in the web such as click and write to a box.
 */

public class uiActions extends CommonOps {

    public static void click(WebElement elem) {
        if (elem.isDisplayed()) {
            wait.until(ExpectedConditions.elementToBeClickable(elem)); // This action will wait before the click until the element will appear in the page
            elem.click();
        }

    }
    public static void updateText(WebElement elem, String value)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(value);
    }


}
