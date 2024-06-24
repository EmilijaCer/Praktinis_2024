import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {
    //pamatyti visus produktus
    @FindBy(xpath = "//img[@title='Your Store']")
    public WebElement clickToSeeAllProducts;

//prideti i chart
    @FindBy(xpath = "//div[@id='content']//div[1]//div[1]//div[2]//form[1]//div[1]//button[1]")
    public WebElement clickToSetProductToChart;
    @FindBy(xpath = "//span[normalize-space()='Shopping Cart']")
    public WebElement clickToSeeShoppingCart;
    @FindBy(xpath = "(//a[@class='btn btn-primary'])[1]")
    public WebElement clickToCheckOut;
    //assertas??>

    //sort
    //sortByRaitings
    //sortByNameAZ
    //sortByNameZA
    //sortByPriceLH
    //sortByPriceHL
    //sortByModelAZ
    //sortByModelZA

    public ProductPage(WebDriver driver) {
        super(driver);
    }
    //pamatyti visus produktus
    public void setToSeeAllProducts() {
        clickToSeeAllProducts.click();
    }
    //prideti i chart
    public void setProductToChart() {
        clickToSetProductToChart.click();
    }
    public void setToSeeShopingCart() {
        clickToSeeShoppingCart.click();
    }
    public void setToCheckOut() {
        clickToCheckOut.click();
    }
    //assertas??>

    //sort
    //sortByRaitings
    //sortByNameAZ
    //sortByNameZA
   //sortByPriceLH
    //sortByPriceHL
    //sortByModelAZ
    //sortByModelZA
}

