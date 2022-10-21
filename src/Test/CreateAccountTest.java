package Test;

import Extentions.Verifications;
import Extentions.uiActions;
import Utilities.Base;
import Utilities.CommonOps;


import WorkFlow.WorkFlows;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Utilities.CommonOps;




public class CreateAccountTest extends CommonOps {


    @Test(description = "create an account and check if account and check if account is really created and name is correct")
    public void Test_01() {
        WorkFlows.CreatAccount("yarin", "hindi", "yyyyyyy@gmail.com", "1234!@#$a");
        Verifications.TitleOfPageAfterCreatAccount("My Account Magento Commerce - website to practice selenium " +
                "| demo website for automation testing | selenium practice sites");
        Verifications.textInElement(createAccount.myAccountTxt, "My Account");
        Verifications.textInElement(createAccount.accountName, "Welcome, yarin hindi!");

    }

    @Test(description = "Sign in with correct user and password and check if next page element show name of user")
    public void Test_02() throws InterruptedException {
        WorkFlows.SingIn("yarinhindi79@gmail.com", "1234!@#$a");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        Verifications.textInElement(loginPage.myNameAfterSignIn, "Welcome, DSA DD!");
    }

    @Test(description = "Purchase an Items ")
    public void Test_03() {
        WorkFlows.SingIn("yarinhindi79@gmail.com", "1234!@#$a");
        WorkFlows.PurchaseItem(homePage.secondItem);
        Verifications.textInElement(wait.until(ExpectedConditions.visibilityOf(itemOption.purchaseCompleteText)), "You added Argus All-Weather Tank to your shopping cart.");
        System.out.println(driver.getTitle());
        System.out.println(homePage.firstItem.getText());
        WorkFlows.PurchaseItem(homePage.firstItem);
        Verifications.textInElement(wait.until(ExpectedConditions.visibilityOf(itemOption.purchaseCompleteText)), "You added Hero Hoodie to your shopping cart.");
    }

    @Test(description = "Pay for product in cart")
        public void Test_04(){
        WorkFlows.PayForItems("yarinhindi79@gmail.com", "1234!@#$a");
        try {
            Thread.sleep(3000);
            Verifications.textInElement(reviewPaymentPage.massageAfterPayment,"Thank you for your purchase!" );
        }catch (InterruptedException e){

        }




        }
    }



