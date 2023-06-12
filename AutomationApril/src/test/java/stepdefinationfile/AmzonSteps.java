package stepdefinationfile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.HomePage;
import pageobject.LoginPage;
import resusable.BrowserBase;
import resusable.ReadExcelData;

import java.io.IOException;

public class AmzonSteps {

    @Given("user enter the credi")
    public void enterCredit() throws IOException {

        HomePage.naviagteToSignInPage();
        LoginPage.enterCredit("an.aravinth22@gmail.com");
        LoginPage.clickContinue();
        LoginPage.enterpassword("123");
        LoginPage.clickSignIn();

    }

    @Given("User search the product")
    public void userSearchTheProduct() throws IOException {

        HomePage.searchProduct(ReadExcelData.fetchData("SearchInput",0,0));
        HomePage.clickSearchButton();
    }

    @When("user select the product")
    public void userSelectTheProduct() {
        
    }

    @Then("Validate the product added to the kart")
    public void validateTheProductAddedToTheKart() {
    }
}
