package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage
{
    public RegistrationPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Register']")
    private WebElement register;
    public void clickRegister()
    {
        register.click();
    }

    @FindBy(css = "#user_firstname")
    private WebElement firstname;
    public void enterFirstName()
    {
       firstname.sendKeys("bola");
    }

    @FindBy(css = "#user_lastname")
    private WebElement lastname;
    public void enterLastName()
    {
        lastname.sendKeys("ola");
    }

    @FindBy(css = "#user_email")
    private WebElement emailfield;
    public void enterEmailField()
    {
        emailfield.sendKeys("ola@yahoo.com");
    }

    @FindBy(css = "#user_password")
    private WebElement password;
    public void enterPassword()
    {
        password.sendKeys("LondonKent12345@");
    }

    @FindBy(css = "#privacy")
    private WebElement checkbox;
    public void clickCheckBox()
    {
        checkbox.click();
    }

    @FindBy(css = "input[value='Register']")
    private WebElement registerbtn;
    public void clickRegisterBtn()
    {
        registerbtn.click();
    }

    @FindBy(css = "img[alt='LongrichLogo']")
    private WebElement longrichlogo;
    public boolean longRichLogoDisplayed()
    {
        return longrichlogo.isDisplayed();
    }








}
