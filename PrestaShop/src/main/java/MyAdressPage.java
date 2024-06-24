import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAdressPage extends BasePage {

    //ivesti adresa
    @FindBy(xpath = "//a[normalize-space()='Modify your address book entries']")
    public WebElement clickModifieAdress;

    @FindBy(xpath = "//a[normalize-space()='New Address']")
    public WebElement clickNewAddress;

    @FindBy(xpath = "//input[@id='input-firstname']")
    public WebElement setFirstName;
    @FindBy(xpath = "//input[@id='input-lastname']")
    public WebElement setLastName;
    @FindBy(xpath = "//input[@id='input-address-1']")
    public WebElement setAddress;
    @FindBy(xpath = "//input[@id='input-city']")
    public WebElement setCity;
    @FindBy(xpath = "//input[@id='input-postcode']")
    public WebElement setPostCode;
    @FindBy(xpath = "//select[@id='input-country']")
    public WebElement setCountry;
    @FindBy(xpath = "//select[@id='input-zone']")
    public WebElement setRegion;
    @FindBy(xpath = "//input[@id='input-default-yes']")
    public WebElement setDefaultAddress;
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    public WebElement clickContinueToSaveAddress;
    @FindBy(xpath = "//h1[normalize-space()='Address Book Entries']")
    public WebElement TextAfterInsertAdressInformation;

    public MyAdressPage(WebDriver driver)
    {
        super(driver);
    }

    // enter adress
    public void setModifiedAdress(){
        clickModifieAdress.click();
    }
    public void setNewAdress(){
        clickNewAddress.click();
    }
    public void insertFirstName(String name) {
        setFirstName.sendKeys(name);
    }
    public void insertLastName(String name) {
        setLastName.sendKeys(name);
    }
    public void insertAdress(String name) {
        setAddress.sendKeys(name);
    }
    public void insertCity(String name) {
        setCity.sendKeys(name);
    }
    public void insertPostCode(String name) {
        setPostCode.sendKeys(name);
    }
    public void chooseCountry(String name) {
        setCountry.sendKeys(name);
    }
    public void chooseRegion(String name) {
        setRegion.sendKeys(name);
    }
    public void chooseDefaultAddress(){
        setDefaultAddress.click();
    }
    public void setContinueToSaveAddress(){
        clickContinueToSaveAddress.click();
    }
    public String getTextAfterInsertAdressInformation(){
        return TextAfterInsertAdressInformation.getText();
    }

}