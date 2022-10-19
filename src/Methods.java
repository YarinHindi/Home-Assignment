import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Methods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\yarin\\Downloads\\chromedriver_win32\\chromedriver.exe");
//
        WebDriver driver = new ChromeDriver();
//        System.out.println("aa");
        driver.get("https://www.selenium.dev/downloads/");
    }
}
