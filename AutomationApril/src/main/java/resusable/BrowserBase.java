package resusable;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BrowserBase {
    WebDriver driver; //driver property
    public WebDriver browserBaseCode() throws IOException {
        String systemPath =System.getProperty("user.dir");
        FileInputStream fis = new FileInputStream(new File(systemPath+"\\src\\main\\resources\\configuration\\browserconfig.properties"));
        Properties prob = new Properties();
        prob.load(fis);

        switch (prob.getProperty("browser")){
            case "chrome":
            case "CHROME":
                driver = new ChromeDriver();
                break;
            case "edge":
            case "EDGE":
                driver = new EdgeDriver();
                break;
            default:
                throw new InvalidArgumentException("Enter the valid browser name");

        }
        driver.get(prob.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        return driver;
    }




}
