import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyOrdersPage extends BasePage {
    //oder History
    @FindBy(xpath = "//a[normalize-space()='View your order history']")
    public WebElement clickOrderHistory;

    @FindBy(xpath = "//h1[normalize-space()='Orders']")
    public WebElement afterOders;

    public MyOrdersPage(WebDriver driver)
    {
        super(driver);
    }

    //order history
    public void getOrderHistory(){
        clickOrderHistory.click();
    }
    public String getAfterOrders(){
        return afterOders.getText();
    }
}