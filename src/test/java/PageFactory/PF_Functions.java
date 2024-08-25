package PageFactory;

import StepDefinition.ReadProperties;
import StepDefinition.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import static PageFactory.PageDriver.driver;

public class PF_Functions {

    public static void sendKeys(String data, String element, String page) {
        try {
            Utility.sendElementKey(data, element, page);
            waitForSec(1);


        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void clickOnElement(String element, String page){
        try {
            waitForSec(1);
            Utility.clickOnElement(element, page);


        }catch (Exception e){
            System.out.println(e);
        }

    }

    public static void waitForSec(int seconds) throws InterruptedException {
        try {
            TimeUnit.SECONDS.sleep(seconds);


        }catch (Exception e){
            System.out.println(e);
        }
    }


    public static void AssertText(String element, String expected, String page) {
        try {
            WebElement element1 = driver.findElement(By.xpath(ReadProperties.getXpathValue(page,element)));
            String actual = element1.getText();

            String expectedval = ReadProperties.getFileValue(page,expected);

            if (actual.equals(expectedval)){
                System.out.println("Verify Text: Test Pass!!!\n    Actual Data: "+ actual+"\n    Expected Data: "+ expectedval);
            }else {
                System.out.println("Verify Text: Test Failed!!!\n---> "+ actual+" is not equal to "+ expectedval);
            }

        }catch (Exception e ){
            System.out.println(e);
        }
    }

}
