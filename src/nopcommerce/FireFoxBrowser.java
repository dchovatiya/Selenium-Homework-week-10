package nopcommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FireFoxBrowser
{
    public static void main(String[] args)
    {
        String baseUrl="https://www.nopcommerce.com/en/demo";
        System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
        WebDriver webDriver=new FirefoxDriver();
        webDriver.get(baseUrl);
        webDriver.getTitle();
        webDriver.manage().window().maximize();
    }
}
