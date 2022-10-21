package WorkFlow;

import Extentions.Verifications;
import Utilities.CommonOps;
import Extentions.uiActions;
import Utilities.managePages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

/**
 * In this class I did some workflows to late on to be able to test the flow of the web iam checking
 * by interact with the verification class
 * t
 */

public class WorkFlows extends CommonOps {

    public static void CreatAccount(String firstname,String lastname,String emailAd,String password){
        uiActions.click(homePage.creatAccountBtn);
//
        uiActions.click(createAccount.firstNameField);
        uiActions.updateText(createAccount.firstNameField,firstname);
        uiActions.updateText(createAccount.lastNameField,lastname);
        uiActions.updateText(createAccount.emailAddressField,emailAd);
        uiActions.updateText(createAccount.passwordField,password);
        uiActions.updateText(createAccount.passwordConfirmationFiled,password);
        uiActions.click(createAccount.createAccountBtn);
    }
    public static void SingIn(String user,String password){
        uiActions.click(homePage.signInBtn);
        uiActions.updateText(loginPage.loguser, user);
        uiActions.updateText(loginPage.logpassword, password);
        uiActions.click(loginPage.loginbutton);

    }
    public static void PurchaseItem(WebElement item){
        uiActions.click(homePage.homePageBtn);
        uiActions.click(item);
        uiActions.click(itemOption.itemSize);
        uiActions.click(itemOption.itemColor);
        uiActions.click(itemOption.addToCartBtn);
    }
    public static void PayForItems(String user,String password){
        SingIn(user,password);
        uiActions.click(homePage.homePageBtn);
        try{
            Thread.sleep(3000);
            uiActions.click(homePage.cartBtn);
            uiActions.click(homePage.proceedToCheckOutBtn);
            Thread.sleep(3000);
            Verifications.textInElement(shippingOrdersDetailsPage.ShippingAddressTitle,"Shipping Address");
            uiActions.click(shippingOrdersDetailsPage.selectShippingMethodBtn);
            uiActions.click(shippingOrdersDetailsPage.nextBtn);
            Thread.sleep(3000);
            Verifications.textInElement(reviewPaymentPage.paymentMethodTitle,"Payment Method");
            uiActions.click(reviewPaymentPage.placeOrderBtn);
        }catch (Exception e){
            System.out.println("Something went work user might not order items yet");
        }

    }

}
