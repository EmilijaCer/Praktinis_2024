import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BasePage{
    //login
    @FindBy(xpath = "//span[normalize-space()='My Account']")
    public WebElement clickMyAccount;

    @FindBy(xpath = "//a[@class='dropdown-item'][normalize-space()='Login']")
    public WebElement clickLogin;

    @FindBy(xpath = "//input[@id='input-email']")
    public WebElement enterEmail;

    @FindBy(xpath = "//input[@id='input-password']")
    public WebElement enterPassword;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    public WebElement clickToLogin;

    @FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='My Account']")
    private WebElement clickAccount;
    //logout
    @FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='Logout']")
    private WebElement clickLogOut;

    @FindBy(xpath = "//h1[normalize-space()='Account Logout']")
    private WebElement afterLogoutGettedText;

    //    //After Logout continue
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    private WebElement afterLogoutContinueButton;

    public LoginPage (WebDriver driver){
        super(driver);
    }
    public void setClickMyAccount() {
        clickMyAccount.click(); }
    public void setClickLogin() {
        clickLogin.click(); }
    public void inputFirstName(String name) {
        enterEmail.sendKeys(name);
    }
    public void inputPassword(String name) {
        enterPassword.sendKeys(name);
    }
    public void clickLogin() {
        clickToLogin.click();
    }
    public void setClickAccount() {
        clickAccount.click(); }
    public void setClickLogOut() {
        clickLogOut.click(); }
    public String getAfterLogoutGettedText(){
        return afterLogoutGettedText.getText();
    }
//    After Logout continue
    public void setAfterLogoutContinueButton(){
        afterLogoutContinueButton.click();
    }
}
