package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * In Create account class we define all Web element that we got in the Create account page
 * all the Object will be initialize by the manage page class.
 */

public class CreateAccount {

    @FindBy(how = How.ID,using = "firstname")
    public WebElement firstNameField;

    @FindBy(how = How.ID,using = "lastname")
    public WebElement lastNameField;

    @FindBy(how = How.ID,using = "email_address")
    public WebElement emailAddressField;

    @FindBy(how = How.ID,using = "password")
    public WebElement passwordField;

    @FindBy(how = How.ID,using = "password-confirmation")
    public WebElement passwordConfirmationFiled;

    @FindBy(how = How.XPATH,using = "//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div")
    public WebElement approveMassage;

    @FindBy(how = How.CSS,using = "button[title='Create an Account']")
    public WebElement createAccountBtn;

    @FindBy(how = How.CLASS_NAME,using = "base")
    public WebElement myAccountTxt;

    @FindBy(how = How.XPATH,using = "/html/body/div[2]/header/div[1]/div/ul/li[1]/span")
    public WebElement accountName;


}
