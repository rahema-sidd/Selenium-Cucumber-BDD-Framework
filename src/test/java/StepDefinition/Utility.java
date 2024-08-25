package StepDefinition;

import PageFactory.WebElementFactory;
import org.openqa.selenium.WebElement;

public class Utility {

    public static WebElement fetchSendElementKey(String xpath){
        WebElement element = WebElementFactory.getElement(xpath);
        return element;
    }

    public static void sendElementKey(String data, String element, String page){
        data = ReadProperties.getFileValue(page, data);
        element = ReadProperties.getXpathValue(page, element);
        fetchSendElementKey(element).sendKeys(data);
    }

    public static void clickOnElement(String element, String page){
        element = ReadProperties.getXpathValue(page, element);
        WebElementFactory.getElement(element).click();
    }

}
