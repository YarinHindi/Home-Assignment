package PageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * In LoginPage class we define all Web element that we got in the LoginPage page
 * all the Object will be initialized by the manage page class.
 */

public class LoginPage {

    @FindBy(how = How.NAME,using = "login[username]")
    public WebElement loguser;

    @FindBy(how = How.NAME,using = "login[password]")
    public WebElement logpassword;

    @FindBy(how = How.XPATH,using = "//*[@id=\"send2\"]/span")
    public WebElement loginbutton;

    @FindBy(how = How.XPATH,using = "/html/body/div[2]/header/div[1]/div/ul/li[1]/span")
    public WebElement myNameAfterSignIn;

}
