package Utilities;
import PageObjects.*;
import org.openqa.selenium.support.PageFactory;

/**
 * This class initialize all pages Objects using pageFactory.
 */
public class managePages extends Base {

    public static void init(){
        loginPage = PageFactory.initElements(driver,LoginPage.class);
        homePage = PageFactory.initElements(driver,HomePage.class);
        reviewPaymentPage = PageFactory.initElements(driver,ReviewPaymentPage.class);
        createAccount = PageFactory.initElements(driver,CreateAccount.class);
        itemOption = PageFactory.initElements(driver,ItemOption.class);
        shippingOrdersDetailsPage = PageFactory.initElements(driver,ShippingOrdersDetailsPage.class);


    }
}
