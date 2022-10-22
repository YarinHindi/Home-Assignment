package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
/**
 * In ReviewPaymentPage class we define all Web element that we got in the ReviewPaymentPage page
 * all the Object will be initialized by the manage page class.
 */
public class ReviewPaymentPage {


    @FindBy(how = How.XPATH,using = "//*[@id=\"checkout-payment-method-load\"]/div/div/div[1]")
    public WebElement paymentMethodTitle;

    @FindBy(how = How.XPATH,using = "//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button/span")
    public WebElement placeOrderBtn;

    @FindBy(how = How.XPATH,using = "//*[@id=\"maincontent\"]/div[1]/h1/span")
    public WebElement massageAfterPayment;



}
