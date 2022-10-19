package Utilities;
import pageObjects.*;
import org.openqa.selenium.support.PageFactory;
public class managePages extends Base {

    public static void init(){
        loginPage = PageFactory.initElements(driver,LoginPage.class);
        homePage = PageFactory.initElements(driver,HomePage.class);
        porceedToCheckOutPage = PageFactory.initElements(driver,PorceedToCheckOutPage.class);
        reviewPaymentPage = PageFactory.initElements(driver,ReviewPaymentPage.class);
        endPaymentPage = PageFactory.initElements(driver,EndPaymentPage.class);

    }
}
