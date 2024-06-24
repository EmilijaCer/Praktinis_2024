import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BasePage{
    @FindBy(xpath = "//span[normalize-space()='My Account']")
    public WebElement clickMyAccount;

    @FindBy(xpath = "//a[@class='dropdown-item'][normalize-space()='Register']")
    public WebElement clickRegister;

    @FindBy(xpath = "//input[@id='input-firstname']")
    public WebElement enterFirstName;

    @FindBy(xpath = "//input[@id='input-lastname']")
    public WebElement enterLastName;

    @FindBy(xpath = "//input[@id='input-email']")
    public WebElement enterEmail;

    @FindBy(xpath = "//input[@id='input-password']")
    public WebElement enterPassword;

    @FindBy(css = "input[value='1'][name='agree']")
    public WebElement clickPrivacyPolicy;

    @FindBy(xpath = "//button[normalize-space()='Continue']")
    public WebElement clickContinue;

    //Assertions
    @FindBy(xpath = "//p[contains(text(),'Congratulations! Your new account has been success')]")
    private WebElement afterCreatedUserGettedText;

    public RegisterPage (WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void setClickMyAccount() {
        clickMyAccount.click(); }
    public void setClickRegister() {
        clickRegister.click(); }
    public void inputFirstName(String name) {
        enterFirstName.sendKeys(name);
    }
    public void inputLastName(String name) {
        enterLastName.sendKeys(name);
    }
    public void inputEmail(String name) {
        enterEmail.sendKeys(name);
    }
    public void inputPassword(String name) {
        enterPassword.sendKeys(name);
    }
    public void setPrivatePolicy() {
       clickPrivacyPolicy.click();
    }
    public void setContinue() {
        clickContinue.click(); }
    public String getAfterCreatedUserGettedText(){
        return afterCreatedUserGettedText.getText();
    }
    }

