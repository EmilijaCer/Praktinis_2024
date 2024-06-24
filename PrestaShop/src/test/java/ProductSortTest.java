import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductSortTest extends BaseTest{
    LoginPage loginPage;
    SearchPage searchPage;
    ProductPage productPage;


    @Test
    void sortByRaitings() {
        loginPage = new LoginPage(driver);
        productPage = new ProductPage(driver);
        searchPage = new SearchPage(driver);

        loginPage.setClickMyAccount();
        loginPage.setClickLogin();
        loginPage.inputFirstName("useris@gmail.com");
        loginPage.inputPassword("useris123");
        loginPage.clickLogin();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        productPage.setToSeeAllProducts();

        String expectedMessage = "Success: You have added MacBook to your wish list!";
        String actualMessage = productPage.getAfterToAddToWishListGetText();
        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");
        System.out.println("Succesfuly Updated order list!!!");
    }
    @Test
    void sortByNameAZ() {
        loginPage = new LoginPage(driver);
        productPage = new ProductPage(driver);
        searchPage = new SearchPage(driver);
        loginPage = new LoginPage(driver);
        productPage = new ProductPage(driver);
        searchPage = new SearchPage(driver);

        loginPage.setClickMyAccount();
        loginPage.setClickLogin();
        loginPage.inputFirstName("useris@gmail.com");
        loginPage.inputPassword("useris123");
        loginPage.clickLogin();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        productPage.setToSeeAllProducts();
    }
    @Test
    void sortByNameZA() {
        loginPage = new LoginPage(driver);
        productPage = new ProductPage(driver);
        searchPage = new SearchPage(driver);
        loginPage = new LoginPage(driver);
        productPage = new ProductPage(driver);
        searchPage = new SearchPage(driver);

        loginPage.setClickMyAccount();
        loginPage.setClickLogin();
        loginPage.inputFirstName("useris@gmail.com");
        loginPage.inputPassword("useris123");
        loginPage.clickLogin();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        productPage.setToSeeAllProducts();
    }
    @Test
    void sortByPriceLH() {
        loginPage = new LoginPage(driver);
        productPage = new ProductPage(driver);
        searchPage = new SearchPage(driver);
        loginPage = new LoginPage(driver);
        productPage = new ProductPage(driver);
        searchPage = new SearchPage(driver);

        loginPage.setClickMyAccount();
        loginPage.setClickLogin();
        loginPage.inputFirstName("useris@gmail.com");
        loginPage.inputPassword("useris123");
        loginPage.clickLogin();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        productPage.setToSeeAllProducts();
    }
    @Test
    void sortByPriceHL() {
        loginPage = new LoginPage(driver);
        productPage = new ProductPage(driver);
        searchPage = new SearchPage(driver);
        loginPage = new LoginPage(driver);
        productPage = new ProductPage(driver);
        searchPage = new SearchPage(driver);

        loginPage.setClickMyAccount();
        loginPage.setClickLogin();
        loginPage.inputFirstName("useris@gmail.com");
        loginPage.inputPassword("useris123");
        loginPage.clickLogin();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        productPage.setToSeeAllProducts();
    }
    @Test
    void sortByModelAZ() {
        loginPage = new LoginPage(driver);
        productPage = new ProductPage(driver);
        searchPage = new SearchPage(driver);
        loginPage = new LoginPage(driver);
        productPage = new ProductPage(driver);
        searchPage = new SearchPage(driver);

        loginPage.setClickMyAccount();
        loginPage.setClickLogin();
        loginPage.inputFirstName("useris@gmail.com");
        loginPage.inputPassword("useris123");
        loginPage.clickLogin();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        productPage.setToSeeAllProducts();
    }
    @Test
    void sortByModelZA() {
        loginPage = new LoginPage(driver);
        productPage = new ProductPage(driver);
        searchPage = new SearchPage(driver);
        loginPage = new LoginPage(driver);
        productPage = new ProductPage(driver);
        searchPage = new SearchPage(driver);

        loginPage.setClickMyAccount();
        loginPage.setClickLogin();
        loginPage.inputFirstName("useris@gmail.com");
        loginPage.inputPassword("useris123");
        loginPage.clickLogin();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        productPage.setToSeeAllProducts();
    }
}
