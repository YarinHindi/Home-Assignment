package Extentions;

import Utilities.CommonOps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * This class responsible for checking if what we expected to see is what we acutely got
 */

public class Verifications extends CommonOps {
    //Verify the if the text in the element is correct
public static void textInElement(WebElement elem,String excepetedVal){
//    wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(elem, "Default welcome msg!")));
    wait.until(ExpectedConditions.textToBePresentInElement(elem,excepetedVal));
    Assert.assertEquals(elem.getText(),excepetedVal);
}
public static void TitleOfPageAfterCreatAccount(String excepetedVal){
    Assert.assertEquals(driver.getTitle(),excepetedVal);
}
}
