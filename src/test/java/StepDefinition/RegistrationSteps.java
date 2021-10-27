package StepDefinition;

import PageObject.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RegistrationSteps
{
    public RegistrationPage registrationPage;
    public static WebDriver driver;

    public RegistrationSteps()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        registrationPage = new RegistrationPage(driver);
    }

    @Given("a user navigates to longrich website")
    public void aUserNavigatesToLongrichWebsite()
    {
        driver.get("https://develop1.reteicons.com/");
        driver.manage().window().maximize();
    }

    @When("a user click on Register")
    public void aUserClickOnRegister()
    {
        registrationPage.clickRegister();
    }

    @And("a user enter FirstName")
    public void aUserEnterFirstName()
    {
        registrationPage.enterFirstName();
    }

    @And("a user enter LastName")
    public void aUserEnterLastName()
    {
        registrationPage.enterLastName();
    }

    @And("a user enter Email")
    public void aUserEnterEmail()
    {
        registrationPage.enterEmailField();
    }

    @And("a user enter Password")
    public void aUserEnterPassword()
    {
        registrationPage.enterPassword();
    }

    @And("a user click on the checkbox")
    public void aUserClickOnTheCheckbox()
    {
        registrationPage.clickCheckBox();
    }


    @And("a user click on Register button")
    public void aUserClickOnRegisterButton()
    {
        registrationPage.clickRegisterBtn();
    }

    @Then("user should be logged into the site")
    public void userShouldBeLoggedIntoTheSite()
    {
        Assert.assertTrue(registrationPage.longRichLogoDisplayed());

    }

}
