package PageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * In HomePage class we define all Web element that we got in the HomePage page
 * all the Object will be initialized by the manage page class.
 */

public class HomePage {


    @FindBy(how = How.XPATH,using = "/html/body/div[2]/header/div[2]/a/img")
    public  WebElement homePageBtn;

    @FindBy(how = How.CSS,using = "button[id='top-cart-btn-checkout']")
    public    WebElement proceedToCheckOutBtn;

    @FindBy(how = How.LINK_TEXT,using = "Sign In")
    public  WebElement signInBtn;

    @FindBy(how = How.LINK_TEXT,using = "Create an Account")
    public  WebElement creatAccountBtn;

    @FindBy(how = How.CSS,using = "a[title='Hero Hoodie']")
    public  WebElement firstItem;

    @FindBy(how = How.CSS,using = "span[class='counter-number']")
    public  WebElement cartBtn;

    @FindBy(how = How.XPATH,using = "//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[3]/div/div/strong/a")
    public  WebElement secondItem;





}
