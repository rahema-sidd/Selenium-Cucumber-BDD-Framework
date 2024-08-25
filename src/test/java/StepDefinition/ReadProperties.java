package StepDefinition;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

    static Properties properties = new Properties();

    public static String getFileValue(String dataFilename, String key){
        try {
            
            String valFileURL = "src\\test\\resources\\TestData\\"+dataFilename+".properties";
            FileInputStream fileInpStr = new FileInputStream(valFileURL);
            properties.load(fileInpStr);

        }catch (IOException e){
            throw new RuntimeException(e);
        }
        return properties.getProperty(key);
    }

    public static String getXpathValue(String xpathFilename, String key){
        try {           

            String xpathFileURL = "src\\test\\resources\\Locators\\"+xpathFilename+".properties";
            FileInputStream fileInputStream = new FileInputStream(xpathFileURL);
            properties.load(fileInputStream);

        }catch (IOException e){
            throw new RuntimeException(e);
        }
        return properties.getProperty(key);
    }
}
