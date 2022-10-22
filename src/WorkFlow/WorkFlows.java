package WorkFlow;

import Extentions.Verifications;
import Utilities.CommonOps;
import Extentions.uiActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * In this class I did some workflows actions to be able to test the flow of the web iam checking.
 */

public class WorkFlows extends CommonOps {

    public static void CreatAccount(String firstname, String lastname, String emailAd, String password) {
        uiActions.click(homePage.creatAccountBtn);
//
        uiActions.click(createAccount.firstNameField);
        uiActions.updateText(createAccount.firstNameField, firstname);
        uiActions.updateText(createAccount.lastNameField, lastname);
        uiActions.updateText(createAccount.emailAddressField, emailAd);
        uiActions.updateText(createAccount.passwordField, password);
        uiActions.updateText(createAccount.passwordConfirmationFiled, password);
        uiActions.click(createAccount.createAccountBtn);
    }

    public static void SingIn(String user, String password) {
        uiActions.click(wait.until(ExpectedConditions.visibilityOf(homePage.signInBtn)));
        uiActions.updateText(loginPage.loguser, user);
        uiActions.updateText(loginPage.logpassword, password);
        uiActions.click(loginPage.loginbutton);

    }

    public static void SignOut() {
        uiActions.click(createAccount.signOutBtn);
        uiActions.click(createAccount.selectSignOutBtn);
    }

    public static void PurchaseItem(WebElement item) {
        uiActions.click(homePage.homePageBtn);
        uiActions.click(item);
        uiActions.click(itemOption.itemSize);
        uiActions.click(itemOption.itemColor);
        uiActions.click(itemOption.addToCartBtn);
    }

    public static void PayForItems(String user, String password) {
        SingIn(user, password);
        uiActions.click(homePage.homePageBtn);
        uiActions.click(wait.until(ExpectedConditions.visibilityOf(homePage.cartBtn)));
        uiActions.click(homePage.proceedToCheckOutBtn);
        Verifications.textInElement(wait.until(ExpectedConditions.visibilityOf(shippingOrdersDetailsPage.ShippingAddressTitle)), "Shipping Address");
        uiActions.click(wait.until(ExpectedConditions.visibilityOf(shippingOrdersDetailsPage.selectShippingMethodBtn)));
        uiActions.click(wait.until(ExpectedConditions.visibilityOf(shippingOrdersDetailsPage.nextBtn)));
        Verifications.textInElement(wait.until(ExpectedConditions.visibilityOf(reviewPaymentPage.paymentMethodTitle)), "Payment Method");
        //Should do something else than Thread sleep.
        try{
            Thread.sleep(2000);
        }catch (Exception e){

        }
        uiActions.click(wait.until(ExpectedConditions.visibilityOf(reviewPaymentPage.placeOrderBtn)));


    }

}
