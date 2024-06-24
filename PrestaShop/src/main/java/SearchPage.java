import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{
    @FindBy(xpath = "(//input[@placeholder='Search'])[1]")
    public WebElement clickSearch;

    @FindBy(xpath = "(//input[@placeholder='Search'])[1]")
    public WebElement searchMacComputer;

    @FindBy(xpath = "//button[@class='btn btn-light btn-lg']")
    public WebElement clickSearchButton;

    @FindBy(xpath = "//h1[normalize-space()='Search - mac']")
    public WebElement afterSearchGettedText;

    public SearchPage(WebDriver driver) {
        super(driver);
    }
    public void setClickSearch() {
       clickSearch.click();
    }
    public void setSearchMacComputer(String txt) {
        searchMacComputer.sendKeys(txt);
    }
    public void setClickSearchButton() {
        clickSearchButton.click();
    }
    public String getAfterSearchGettedText(){
        return afterSearchGettedText.getText();
    }
}
