package Wcht;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser
{
    public static void main(String[] args)
    {
        String baseUrl="https://www.wcht.org.uk/";
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver webDriver=new ChromeDriver();
        webDriver.get(baseUrl);
        webDriver.getTitle();
        webDriver.manage().window().maximize();
        webDriver.manage().window().minimize();
        webDriver.close();
    }
}
