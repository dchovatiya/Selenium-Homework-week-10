package Wcht;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser
{
    public static void main(String[] args)
    {
        String baseUrl="https://www.wcht.org.uk/";
        System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
        WebDriver webDriver=new FirefoxDriver();
        webDriver.get(baseUrl);
        webDriver.getTitle();
        webDriver.manage().window().maximize();
        webDriver.manage().window().minimize();
        webDriver.close();
    }
}
