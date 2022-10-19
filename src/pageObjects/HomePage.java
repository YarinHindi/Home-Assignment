package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class HomePage {
    @FindBy(how = How.LINK_TEXT,using = "Sign In")
    public  WebElement signInBtn;

    @FindBy(how = How.LINK_TEXT,using = "Create an Account")
    public  WebElement creatAccountBtn;

    @FindBy(how = How.CSS,using = "div[class='swatch-option text'][index='0'")
    public  WebElement firstItemSize;

    @FindBy(how = How.CSS,using = "a[title='Radiant Tee']")
    public  WebElement secondItem;





}
