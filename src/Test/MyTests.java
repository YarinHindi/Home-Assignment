package Test;
import Extentions.Verifications;
import Utilities.CommonOps;
import WorkFlow.WorkFlows;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class MyTests extends CommonOps{

    @org.testng.annotations.Test(description = "Create an account and verify account creation and user name (must be new account)")
    public void Test_01() {
        WorkFlows.CreatAccount("yarin", "hindi", "123ddaaa!2!@gmail.com", "1234!@#$a");
        Verifications.TitleOfPageAfterCreatAccount("My Account Magento Commerce - website to practice selenium " +
                "| demo website for automation testing | selenium practice sites");
        Verifications.textInElement(createAccount.myAccountTxt, "My Account");
        Verifications.textInElement(createAccount.accountName, "Welcome, yarin hindi!");
        WorkFlows.SignOut();

    }
    @org.testng.annotations.Test(description = "Sign in with correct user and password and check if next page element show name of user")
    public void Test_02()  {
        WorkFlows.SingIn("yarinhindi79@gmail.com", "1234!@#$a");
        Verifications.textInElement(loginPage.myNameAfterSignIn, "Welcome, DSA DD!");
    }
    @org.testng.annotations.Test(description = "Purchase an Items ")
    public void Test_03() {
        WorkFlows.PurchaseItem(homePage.secondItem);
        Verifications.textInElement(wait.until(ExpectedConditions.visibilityOf(itemOption.purchaseCompleteText)), "You added Argus All-Weather Tank to your shopping cart.");
        WorkFlows.PurchaseItem(homePage.firstItem);
        Verifications.textInElement(itemOption.purchaseCompleteText, "You added Hero Hoodie to your shopping cart.");
    }

    @org.testng.annotations.Test(description = "Pay for product in cart")
        public void Test_04(){
        WorkFlows.SignOut();
        WorkFlows.PayForItems("yarinhindi79@gmail.com", "1234!@#$a");
        Verifications.textInElement(wait.until(ExpectedConditions.visibilityOf(reviewPaymentPage.massageAfterPayment)),"Thank you for your purchase!" );
        }

    }



