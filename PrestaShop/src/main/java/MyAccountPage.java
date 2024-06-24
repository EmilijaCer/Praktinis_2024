import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

    @FindBy(xpath = "//a[normalize-space()='Edit your account information']")
    public WebElement clickEditAccountInformation;
    //pakeisti varda
    @FindBy(xpath = "//input[@id='input-firstname']")
    public WebElement clickFirstNameToChange;

    @FindBy(xpath = "//input[@id='input-firstname']")
    public WebElement insertFirstNameToChange;

    @FindBy(xpath = "//input[@id='input-firstname']")
    public WebElement clearFirstName;

    @FindBy(xpath = "//button[normalize-space()='Continue']")
    public WebElement clickContinueToSaveChangeName;
    ////assertion name update
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    public WebElement afterChangeFirstName;

    public MyAccountPage(WebDriver driver)
    {
        super(driver);
    }

    public void setEditAccountInformation() {
        clickEditAccountInformation.click();
    }
    //change name
    public void setEditFirstName() {
        clickFirstNameToChange.click();
    }
    public void setClearFirstName(){
        clearFirstName.clear();
    }
    public void setEditedFirstName(String name) {
        insertFirstNameToChange.sendKeys(name);
    }
    public void setChangedFirstName(){
        clickContinueToSaveChangeName.click();
    }
    public String getAfterChangeFirtName(){
        return afterChangeFirstName.getText();
    }
}