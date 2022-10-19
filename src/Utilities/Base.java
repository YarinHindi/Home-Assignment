package Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.*;
public class Base {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions action;
    public static String url;

    public static HomePage homePage;
    public static LoginPage loginPage;
    public static PorceedToCheckOutPage porceedToCheckOutPage;
    public static ReviewPaymentPage reviewPaymentPage;
    public static EndPaymentPage endPaymentPage;
}