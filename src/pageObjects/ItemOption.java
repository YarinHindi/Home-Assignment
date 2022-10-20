package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ItemOption {

    @FindBy(how = How.XPATH,using = "//*[@id=\"option-label-size-143-item-166\"]")
    public WebElement itemSize;

    @FindBy(how = How.XPATH,using = "//*[@id=\"option-label-color-93-item-52\"]")
    public WebElement itemColor;

    @FindBy(how = How.ID,using = "product-addtocart-button")
    public WebElement addToCartBtn;

    @FindBy(how = How.XPATH,using = "//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div")
    public WebElement purchaseCompleteText;




}
