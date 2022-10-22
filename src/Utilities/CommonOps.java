package Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

/**
 * CommonOps class inheritance from the base class.
 * In that class we got all common operation such as init the driver by the browser type,close the driver,
 * starting the startSession and define the driver manage window and more.
 */

public class CommonOps extends Base{
    public static void initBrowser(){
        switch (browserType) {
            case "Chrome" -> driver = initChromeDriver();
            case "FF" -> driver = initFFDriver();
            case "IE" -> driver = initIEDriver();
            default -> throw new RuntimeException("invalid browser name");
        }
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout( Duration.ofSeconds(60));;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // This  object  "wait" for elements to be visible in the page
        action = new Actions(driver);
    }
    public static WebDriver initChromeDriver(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();

    }

    public static WebDriver initFFDriver() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }
    public static void setBrowserType(String browser){
        browserType = browser;
    }

    public static void setUrl(String otherUrl){
        url = otherUrl;
    }

    public static WebDriver initIEDriver() {
        WebDriverManager.iedriver().setup();
        return  new InternetExplorerDriver();

    }

    @BeforeClass
    public void startSession(){
        initBrowser();
        managePages.init();

    }
    @AfterClass
    public void close(){
        driver.quit();
    }


}
