package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * In ShippingOrdersDetailsPage class we define all Web element that we got in the ShippingOrdersDetailsPage page
 * all the Object will be initialized by the manage page class.
 */

public class ShippingOrdersDetailsPage {

    @FindBy(how = How.XPATH,using = "//*[@id=\"shipping\"]/div[1]")
    public WebElement ShippingAddressTitle;

    @FindBy(how = How.CSS,using = "input[name=street[0]']")
    public WebElement streetBox;

    @FindBy(how = How.CSS,using = "input[name=city")
    public WebElement cityBox;

    @FindBy(how = How.ID,using = "LRRECB7")
    public WebElement selectRegionBox;

    @FindBy(how = How.ID,using = "CAF33O0")
    public WebElement zipCodeBox;

    @FindBy(how = How.ID,using = "XVP0D3I")
    public WebElement phoneNumberBox;

    @FindBy(how = How.ID,using = "UNUJ614")
    public WebElement selectCountryBox;

    @FindBy(how = How.XPATH,using = "//*[@id=\"shipping-method-buttons-container\"]/div/button/span")
    public WebElement nextBtn;

    @FindBy(how = How.XPATH,using = "//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr[1]")
    public WebElement selectShippingMethodBtn;









//*[@id="checkout-step-shipping"]/div[1]/div/div/div/comment()[3]

}
