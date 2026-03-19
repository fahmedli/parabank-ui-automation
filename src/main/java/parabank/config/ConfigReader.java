package parabank.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties prop = new Properties();

    static {
        try {
            FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
            prop.load(fis);
        } catch (IOException e) {
            System.out.println("config.properties faylı tapılmadı. Default URL istifadə olunur.");
            prop.setProperty("url", "https://parabank.parasoft.com/parabank/index.htm");
        }
    }

    public static String getProperty(String key) {
        return prop.getProperty(key);
    }
}