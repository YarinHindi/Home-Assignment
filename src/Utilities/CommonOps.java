package Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CommonOps extends Base{
    public static void initBrowser(){
        if (browserType.equalsIgnoreCase("Chrome")){
            driver = initChromeDriver();
        }else if(browserType.equalsIgnoreCase("FF")){
            driver = initFFDriver();
        }else if (browserType.equalsIgnoreCase("IE")){
            driver = initIEDriver();
        }else{
            throw new RuntimeException("invalid browser name");
        }
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().timeouts().pageLoadTimeout( Duration.ofSeconds(60));
        wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // this  object  "wait" for elements to be visible in the page
        action = new Actions(driver);
    }
    public static WebDriver initChromeDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver;
    }

    public static WebDriver initFFDriver() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        return driver;
    }
    public static void setBrowserType(String browser){
        browserType = browser;
    }
    public static void setUrl(String otherUrl){
        url = otherUrl;
    }

    public static WebDriver initIEDriver() {
        WebDriverManager.iedriver().setup();
        driver = new InternetExplorerDriver();
        return driver;
    }

    @BeforeClass
    public void startSession(){
        initBrowser();
        managePages.init();

    }
    @AfterClass
    public static void close(){
        driver.quit();
    }


}
