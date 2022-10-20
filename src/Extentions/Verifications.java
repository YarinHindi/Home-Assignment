package Extentions;

import Utilities.CommonOps;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import static org.testng.Assert.*;

public class Verifications extends CommonOps {
    //Verify the if the text in the element is correct
public static void textInElement(WebElement elem,String excepetedVal){
    Assert.assertEquals(elem.getText(),excepetedVal);

}
public static void TitleOfPageAfterCreatAccount(String excepetedVal){
    Assert.assertEquals(driver.getTitle(),excepetedVal);
}
}
