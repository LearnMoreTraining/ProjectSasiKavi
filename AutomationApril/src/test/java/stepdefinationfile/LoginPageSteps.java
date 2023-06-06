package stepdefinationfile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import resusable.BrowserBase;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class LoginPageSteps {

  int a  ; // Global Variable //null
  WebDriver driver; //null

  WebElement currencyElement;


  @When("user enter the username {string} and password {string}")
  public void enterUserNamePassword(String username , String password){

    driver.findElement(By.cssSelector("input[id='password']"));
    driver.findElement(By.cssSelector("#password"));
    driver.findElement(By.cssSelector(".input.r4.wide.mb16.mt8.username"));
    driver.findElement(By.id("username")).sendKeys(username + Keys.ENTER);
    driver.findElement(By.id("password")).sendKeys(password);

    System.out.println(username);
    System.out.println(password);

  }

  @Given("user navigates to salesforce application")
  public void urlNavigation() throws IOException {

    a =1 ;  //local variable
    BrowserBase base = new BrowserBase();
   driver= base.browserBaseCode();

  }

  @And("user clicks the login button")
    public void clickLoginButton() {
    driver.findElement(By.name("Login")).click();
    }

    @Then("validate the error message")
    public void validateTheErrorMessage() {
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    wait.pollingEvery(Duration.ofSeconds(5));
    wait.ignoring(NoSuchElementException.class);
    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("error")));
    String actualResult = driver.findElement(By.id("error")).getText(); //string
    String expectedResult = "check your username and password. If you still can't log in, contact your Salesforce administrator.";

    Assert.assertEquals(actualResult,expectedResult);

    }
    @Then("user navigate to home page")
    public void userNavigateToHomePage() {
    }

    @Then("validate the label name")
    public void validateTheLabelName() {
    }


  @Given("user navigates to URL")
  public void userNavigatesToURL() throws IOException {
    BrowserBase base = new BrowserBase();
    driver= base.browserBaseCode();

  }

  @When("Iterate the static dropdown values")
  public void iterateTheStaticDropdownValues() {

  currencyElement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));

  List<WebElement> currency = currencyElement.findElements(By.tagName("option"));

  List<String> currencyVal = new ArrayList<>();
  for (WebElement e:currency){
    currencyVal.add(e.getText());
  }
    System.out.println(currencyVal);

  for(String q:currencyVal){
    System.out.println(q);
  }

//  int currencySize = currencyElement.findElements(By.tagName("option")).size();
//
//    for(int i=0; i<currencySize;i++){
//
//      String value =currencyElement.findElements(By.tagName("option")).get(i).getText();
//      System.out.println(value);
//    }


  }

  @And("Handle the static dropdown")
  public void handleTheStaticDropdown() {

    Select selectCurrency = new Select(currencyElement);
    //selectCurrency.selectByIndex(5);
    //selectCurrency.selectByVisibleText("EUR");
    selectCurrency.selectByValue("OMR");

    WebElement adultElement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT"));
    Select selectAdult = new Select(adultElement);


  }

  @When("Handle the dynamic dropdown")
  public void handleTheDynamicDropdown() {

    driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
    driver.findElement(By.xpath("//a[@value='BLR']")).click();
   // WebElement toElement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR"));
   // toElement.findElement(By.xpath("//a[@value='MAA']")).click();
    driver.findElement(By.xpath("//div[@id='ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR']//a[@value='MAA']")).click();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    wait.pollingEvery(Duration.ofSeconds(5));
    wait.ignoring(NoSuchElementException.class);
    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("popUpConverter")));

    driver.findElement(By.id("popUpConverter")).click();
  }

  @When("handle Auto suggestive")
  public void handleAutoSuggestive() throws InterruptedException {

    driver.findElement(By.name("flying_from_N")).click();
    WebElement from =driver.findElement(By.name("flying_from"));
    from.sendKeys("che");
    Thread.sleep(2000);
    int i=0;
    while(i<4){  //0<4
      from.sendKeys(Keys.ARROW_DOWN);
      i++;
    }

    for(int j=0;j<4;j++){
      from.sendKeys(Keys.ARROW_DOWN);
      if(from.getText().contains("Russia")){
        from.sendKeys(Keys.ENTER);
        break;
      }
    }

    from.sendKeys(Keys.ENTER);

  }

  @When("handle Table")
  public void handleTable() {

    WebElement ctsTable = driver.findElement(By.xpath("//table[@class='infobox vcard']"));

    int colunmOneType=ctsTable.findElements(By.tagName("th")).size();

            for(int i=0;i<colunmOneType;i++){

              String val=ctsTable.findElements(By.tagName("th")).get(i).getText();
              System.out.println(val);
            }
    int colunmTwoType=ctsTable.findElements(By.tagName("td")).size();

    for(int i=0;i<colunmTwoType;i++){

      String val=ctsTable.findElements(By.tagName("td")).get(i).getText();
      System.out.println(val);
    }

    WebElement tab= driver.findElement(By.cssSelector(".wikitable.sortable.jquery-tablesorter"));

    int count =tab.findElements(By.xpath("//tbody/tr/td[4]")).size();
    for (int i=0;i<count;i++){

      String valuu=tab.findElements(By.xpath("//tbody/tr/td[4]")).get(i).getText();
      System.out.println(valuu);
    }


  }

  @When("handle the mouse action")
  public void handleTheMouseAction() {

    WebElement loginHower = driver.findElement(By.id("nav-link-accountList"));
    Actions action = new Actions(driver);
    action.clickAndHold(loginHower).build().perform();
    driver.findElement(By.linkText("Baby Wishlist")).click();



  }

  @When("User handles the frame")
  public void userHandlesTheFrame() {

    WebElement framee= driver.findElement(By.className("demo-frame"));
    driver.switchTo().frame(framee);
    Actions a = new Actions(driver);

    WebElement drag = driver.findElement(By.cssSelector(".ui-widget-content.ui-draggable.ui-draggable-handle"));
    WebElement drop = driver.findElement(By.cssSelector("div[class='ui-widget-header ui-droppable']"));
    a.dragAndDrop(drag,drop).build().perform();

    driver.switchTo().defaultContent();


    driver.switchTo().alert().getText();






  }

  @When("Handle Calender")
  public void handleCalender() {

    driver.findElement(By.className("ui-datepicker-trigger")).click();
    //driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover")).click();



    while(!driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/div/div")).getText().contains("September")){

      driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
    }

    WebElement firstGroup = driver.findElement(By.cssSelector(".ui-datepicker-group.ui-datepicker-group-first"));
    int enabledDaysCount = firstGroup.findElements(By.className("ui-state-default")).size();
    for(int i=0; i< enabledDaysCount;i++){
      String date =firstGroup.findElements(By.className("ui-state-default")).get(i).getText();
      if(date.equals("24")){
        firstGroup.findElements(By.className("ui-state-default")).get(i).click();
        break;
      }
    }

    driver.findElement(By.id("custom_date_picker_id_2")).isSelected();
  }


}
