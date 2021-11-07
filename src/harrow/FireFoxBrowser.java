package harrow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser
{
    public static void main(String[] args)
    {
        String baseUrl="https://www.harrow.gov.uk/";
        System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
        WebDriver webDriver=new FirefoxDriver();
        webDriver.get(baseUrl);
        webDriver.getTitle();
        webDriver.manage().window().maximize();
        webDriver.quit();
    }

}
