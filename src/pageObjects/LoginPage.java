package pageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class LoginPage {

    @FindBy(how = How.NAME,using = "login[username]")
    public WebElement loguser;

    @FindBy(how = How.NAME,using = "login[password]")
    public WebElement logpassword;

    @FindBy(how = How.XPATH,using = "//*[@id=\"send2\"]/span")
    public WebElement loginbutton;
}
