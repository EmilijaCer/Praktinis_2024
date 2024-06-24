import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage extends BasePage {
   //add To wish List
    @FindBy(xpath = "//div[@id='content']//div[1]//div[1]//div[2]//form[1]//div[1]//button[2]")
    public WebElement clickToAddToWishList;

    @FindBy(css = "//div[@class='alert alert-success alert-dismissible']")
    public WebElement afterToAddToWishListGetText;
//check wish List
    @FindBy(css = "(//span[normalize-space()='Wish List (1)'])[1]")
    public WebElement clickToCheckWishList;

    @FindBy(css = "//h1[normalize-space()='My Wishlist']")
    public WebElement afterclickToCheckWishListText;


    public WishListPage(WebDriver driver) {
        super(driver);

    }
    //add To wish List
    public void setToAddToWishList() {
        clickToAddToWishList.click();
    }
    public String getAfterToAddToWishListGetText(){
        return afterToAddToWishListGetText.getText();
    }
    //check wish List
    public void setToCheckWishList() {
       clickToCheckWishList.click();
    }
    public String getAafterclickToCheckWhisListText(){
        return afterclickToCheckWishListText.getText();
    }
}