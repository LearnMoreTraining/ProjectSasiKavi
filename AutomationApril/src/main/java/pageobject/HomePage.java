package pageobject;

import org.openqa.selenium.By;
import resusable.BrowserBase;

public class HomePage extends BrowserBase {

    //---------Locators--------------
   static By productSearch = By.id("twotabsearchtextbox");
   static By signInButton = By.id("nav-link-accountList-nav-line-1");

   //--------methods---------
    public static void searchProduct(String searchInput){

        getDriver().findElement(productSearch).sendKeys(searchInput);

    }

    public static void naviagteToSignInPage(){

        getDriver().findElement(signInButton).click();
    }


}
