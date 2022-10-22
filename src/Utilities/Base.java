package Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import PageObjects.*;
public class Base {
    /**
     * Base class is the class that define the varible that used in all the testing system.
     * keeps the pages objects Webriver url to the website and browser type.
     */
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions action;
    public static String url="https://magento.softwaretestingboard.com/";
    public static String browserType = "Chrome";

    public static HomePage homePage;
    public static LoginPage loginPage;
    public static CreateAccount createAccount;
    public static ShippingOrdersDetailsPage shippingOrdersDetailsPage;
    public static ReviewPaymentPage reviewPaymentPage;
    public static ItemOption itemOption;
}
