import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.PageFactory;
import pageObjects.LoginPage;

import java.time.Duration;

public class stam {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\yarin\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
         WebDriver driver=new ChromeDriver();
        String URL="https://magento.softwaretestingboard.com/customer/account/index/";
        driver.get(URL);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        driver.manage().window().maximize();
//        driver.findElement(By.id("search")).sendKeys("dsadsa");
//        driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
//        System.out.println(driver.getTitle())
        }
;


    }


