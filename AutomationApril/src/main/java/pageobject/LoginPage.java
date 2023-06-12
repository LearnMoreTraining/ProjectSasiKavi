package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.devtools.v85.browser.Browser;
import resusable.BrowserBase;

public class LoginPage extends BrowserBase {

    //locotors
    static By userNametextBox = By.id("ap_email");
    static By continueButton = By.id("continue");

    static By passwordTextBox = By.id("ap_password");
    static By signButton = By.id("signInSubmit");
    //methods
    public static void enterCredit(String username){

        getDriver().findElement(userNametextBox).sendKeys(username);
    }

    public static void clickContinue(){

        getDriver().findElement(continueButton).click();
    }

    public static void enterpassword(String password){

        getDriver().findElement(passwordTextBox).sendKeys(password);
    }

    public static void clickSignIn(){

        getDriver().findElement(signButton).click();
    }




}
