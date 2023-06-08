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

  static public ThreadLocal<WebDriver> threadLocal = new ThreadLocal<>();

    public static WebDriver browserBaseCode() throws IOException {
        String systemPath =System.getProperty("user.dir");
        FileInputStream fis = new FileInputStream(new File(systemPath+"\\src\\main\\resources\\configuration\\browserconfig.properties"));
        Properties prob = new Properties();
        prob.load(fis);

        switch (prob.getProperty("browser").toLowerCase()){
            case "chrome":
              threadLocal.set(new ChromeDriver());
                break;
            case "edge":
                threadLocal.set(new EdgeDriver());
                break;
            default:
                throw new InvalidArgumentException("Enter the valid browser name");

        }
        getDriver().get(prob.getProperty("url"));
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        return getDriver();
    }

    public static WebDriver getDriver(){


        return  threadLocal.get();
    }



}
