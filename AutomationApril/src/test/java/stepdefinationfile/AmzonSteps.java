package stepdefinationfile;

import io.cucumber.java.en.Given;
import pageobject.HomePage;
import pageobject.LoginPage;
import resusable.BrowserBase;

import java.io.IOException;

public class AmzonSteps {

    @Given("user enter the credi")
    public void enterCredit() throws IOException {

        BrowserBase.browserBaseCode();
        HomePage.naviagteToSignInPage();
        LoginPage.enterCredit("an.aravinth22@gmail.com");
        LoginPage.clickContinue();
        LoginPage.enterpassword("123");
        LoginPage.clickSignIn();

    }
}
