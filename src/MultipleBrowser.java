
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MultipleBrowser
{
    static String browser="firefox";
    static String Url="https://www.amazon.co.uk";
    static WebDriver driver;
    public static void main(String[] args)
    {
        if(browser.equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
            driver=new FirefoxDriver();
        }else if(browser.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","src/barclays/ChromeBrowser.java");
            driver=new ChromeDriver();
        }else if(browser.equalsIgnoreCase("edge"))
        {
            System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
            driver=new EdgeDriver();
        }else
        {
            System.out.println("Wrong browser");
        }
        driver.get(Url);
        driver.getTitle();
        driver.manage().window().maximize();
        driver.quit();
    }
}
