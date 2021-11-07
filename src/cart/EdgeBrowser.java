package cart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser
{
    public static void main(String[] args)
    {
        String baseUrl="https://www.x-cart.com/";
        System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
        WebDriver webDriver=new EdgeDriver();
        webDriver.get(baseUrl);
        webDriver.getTitle();
        webDriver.manage().window().maximize();
        webDriver.quit();

    }
}
