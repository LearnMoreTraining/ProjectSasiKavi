package automaionbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutomationBasics {

    public static void main(String[] args) {

      //  WebDriver driver = new ChromeDriver();
        WebDriver driver = new EdgeDriver();
        driver.get("https://login.salesforce.com/");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("learnmore");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234");

    }

}
