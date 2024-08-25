package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementFactory {

    public static WebElement getElement(String xpath){
        return PageDriver.driver.findElement(By.xpath(xpath));
    }
}
