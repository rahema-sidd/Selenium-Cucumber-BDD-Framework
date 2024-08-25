package PageFactory;

import StepDefinition.ReadProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PageDriver {
    public static WebDriver driver;
    public static ChromeOptions options;


    public static void launchDriver(){
        
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origin=*");
        driver = new ChromeDriver(options);

        System.out.println("Chrome Driver is Launched Successfully");

    }

    public static void getURL(String url, String page){

        driver.get(ReadProperties.getFileValue(page, url));
        driver.manage().window().maximize();
        System.out.println("URL: "+ url+" is fetched");

    }

}